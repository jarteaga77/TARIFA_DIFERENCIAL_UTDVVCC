/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.utdvvvcc.entidades;


import com.utdvvcc.conexion.ConexionBD;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Jonathan
 */
public class LlenarCombo 
{
    
    //Lista de marca
    
    public ArrayList ListaMarca()
    {
        ConexionBD conexion=new ConexionBD();
        ArrayList listaMarca=new ArrayList();
        
        ResultSet obj=conexion.executeQuery("SELECT id_marca,nombre_marca FROM tb_marca order by  nombre_marca ASC ");
        
     
        try {
            while(obj.next())
            {
                Marca m=new Marca();
                
                m.setId(obj.getInt("id_marca"));
                m.setMarca(obj.getString("nombre_marca"));
                listaMarca.add(m);
                
                // conexion.desconectar();
            }
        } catch (SQLException ex) {
            Logger.getLogger(LlenarCombo.class.getName()).log(Level.SEVERE, null, ex);
        }
            conexion.desconectar();
            return listaMarca;
         
    }
    
    
         public ArrayList Categoria()
    {
        ConexionBD conexion=new ConexionBD();
        ArrayList listaCategoria=new ArrayList();
        
        ResultSet obj=conexion.executeQuery("SELECT id_categoria,categoria FROM tb_categoria order by  categoria ASC ");
        
     
        try {
            while(obj.next())
            {
                Categoria c=new Categoria();
                
               c.setIdcategoria(obj.getInt("id_categoria"));
               c.setCategoria(obj.getString("categoria"));
                listaCategoria.add(c);
                
                // conexion.desconectar();
            }
        } catch (SQLException ex) {
            Logger.getLogger(LlenarCombo.class.getName()).log(Level.SEVERE, null, ex);
        }
            conexion.desconectar();
            return listaCategoria;
         
    }
    
      public ArrayList TipoVehiculo()
    {
        ConexionBD conexion=new ConexionBD();
        ArrayList listaTipo=new ArrayList();
        
        ResultSet obj=conexion.executeQuery("SELECT id_tipo_vehiculo,descripcion FROM tb_tipo_vehiculo order by descripcion ASC ");
        
     
        try {
            while(obj.next())
            {
                TipoVehiculo t=new TipoVehiculo();
                
               t.setId(obj.getInt("id_tipo_vehiculo"));
               t.setDes(obj.getString("descripcion"));
                listaTipo.add(t);
                
                // conexion.desconectar();
            }
        } catch (SQLException ex) {
            Logger.getLogger(LlenarCombo.class.getName()).log(Level.SEVERE, null, ex);
        }
            conexion.desconectar();
            return listaTipo;
         
    }   
      
        public ArrayList Linea()
    {
        ConexionBD conexion=new ConexionBD();
        ArrayList listaLinea=new ArrayList();
        
        ResultSet obj=conexion.executeQuery("SELECT l.id_linea_marca as id,(m.nombre_marca ||' '|| l.descripcion)AS linea FROM tb_linea_marca l JOIN tb_marca m ON l.id_marca=m.id_marca ORDER BY linea ASC");
        
     
        try {
            while(obj.next())
            {
                LineaVehiculo l=new LineaVehiculo();
                
               l.setId(obj.getInt("id"));
               l.setDescripcion(obj.getString("linea"));
                listaLinea.add(l);
                
                // conexion.desconectar();
            }
        } catch (SQLException ex) {
            Logger.getLogger(LlenarCombo.class.getName()).log(Level.SEVERE, null, ex);
        }
            conexion.desconectar();
            return listaLinea;
         
    }   
      
               
}
