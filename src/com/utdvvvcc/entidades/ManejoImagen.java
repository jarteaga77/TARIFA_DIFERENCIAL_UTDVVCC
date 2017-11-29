package com.utdvvvcc.entidades;
import java.awt.Image;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
    
import java.util.Iterator;
import javax.imageio.ImageIO;
import javax.imageio.ImageReadParam;
import javax.imageio.ImageReader;
import javax.imageio.stream.ImageInputStream;
import javax.swing.DefaultListModel;
/**
 * 
 * @author Jonathan
 * CLASE PARA CONECTARSE A UNA BASE DE DATOS POSTEGRES, INSERTAR Y RECUPERAR IMAGENES JPG
 */
public class ManejoImagen {

   //DATOS PARA LA CONEXION
   private String bd = "TarifaDiferencial";
   private String user = "postgres";
   private String password = "postgres";
   //private String url = "jdbc:postgresql://localhost:5432/"+bd;
   private String url = "jdbc:postgresql://192.168.1.128:5432/"+bd;

   private Connection connection = null;
   private ResultSet resultSet = null;
   private Statement statement = null;
    
    //Constructor de clase que se conecta a la base de datoS
    public ManejoImagen()
    {
      try{
         Class.forName("org.postgresql.Driver");         
         connection = DriverManager.getConnection(url, user , password);
         System.out.println("Conectado a la base de datos [ " + this.bd + "]");
         
         
         
      }catch(Exception e){
         System.err.println(e.getMessage());
      }
    }

    /* metodo que guarda una imagen JPG en la base de datos
     * input: ID : identificador unico para el registro, osea primary key
     * name: nombre de la imagen para reconocerlo mas adelante
     * ruta: direccion absoluta de la imagen JPG
    */
    public boolean guardarfoto(String id, String name, String ruta, int idvehiculo) throws Exception {
        FileInputStream fis = null;
        int tamanofile=0;
       
             File file = new File(ruta);
             tamanofile=(int) file.length();
             if(tamanofile > 100000)
             { 
                 throw new Exception("El tamaño de la foto es superior a 100 Kb");
             }
              try {
             System.out.println(file.length());
             fis = new FileInputStream(file);
             PreparedStatement pstm = connection.prepareStatement("INSERT INTO tb_foto_vehiculos(id, nombre, foto_archivo,id_te) " + " VALUES(?,?,?,?)");
             pstm.setString(1, id);
             pstm.setString(2, name);
             pstm.setBinaryStream(3, fis,(int) file.length());
             pstm.setInt(4, idvehiculo);
             pstm.execute();
             pstm.close();
             return true;
        } catch (FileNotFoundException e) {
             System.out.println(e.getMessage());
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
               fis.close();
             } catch (IOException e) {
               System.out.println(e.getMessage());
             }
        }
        return false;
   }

    /* Metodo que convierte una cadena de bytes en una imagen JPG
     * input:
     *       bytes: array que contiene los binarios de la imagen
     * Output: la foto JPG en formato IMAGE
     */
 public Image ConvertirImagen(byte[] bytes) throws IOException {
    ByteArrayInputStream bis = new ByteArrayInputStream(bytes);
    Iterator readers = ImageIO.getImageReadersByFormatName("jpeg");    
    ImageReader reader = (ImageReader) readers.next();
    Object source = bis;
    ImageInputStream iis = ImageIO.createImageInputStream(source);
    reader.setInput(iis, true);
    ImageReadParam param = reader.getDefaultReadParam();
    return reader.read(0, param);
 }

 /* Metodo que extrae los registros de la tabla IMAGEN de la base de datos
  * crea instancia nueva de la clase imagen.java y añade los datos
  * agrega estos datos a un DefaultListModel
  * output:
  *         dml: Es un DefaultListModel que contiene instancia de la clase imagen.java
  */
    public DefaultListModel Lista_Imagenes()
    {
        DefaultListModel dml = new DefaultListModel();
        try {
            statement = connection.createStatement();
            resultSet = statement.executeQuery("SELECT id_foto,id,nombre,foto_archivo,id_te FROM tb_foto_vehiculos ");
          while (resultSet.next())
          {  //se crea un objeto CITA y se le van agregando los datos
             imagen img = new imagen();
             img.setId( resultSet.getString("id") ) ;
             img.setName( resultSet.getString("nombre") ) ;
             try { //antes de agregar el campo imagen, realiza la conversion de bytes a JPG
                 img.setArchivo(ConvertirImagen(resultSet.getBytes("foto_archivo")));
             } catch (IOException ex) {
                System.err.println(ex.getMessage());
             }
             //por ultimo añade el objeto imagen:img al DefaultListModel
            dml.addElement(img);
          }
       }
       catch (SQLException ex) {
          System.err.println(ex.getMessage());
       }
       return dml;
    }
    
    
    

     
    
}
