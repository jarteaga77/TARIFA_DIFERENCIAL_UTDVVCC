/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.utdvvcc.presentacion;


import com.utdvvcc.conexion.ConexionBD;
import com.utdvvcc.daos.DaoLineVehiculo;
import com.utdvvvcc.entidades.ControllerItemList;
import com.utdvvvcc.entidades.LineaVehiculo;
import com.utdvvvcc.entidades.Marca;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

/**
 *
 * @author Jonathan
 */
public final class JIFLineaVehiculo extends javax.swing.JInternalFrame {

    private int idmarca=0;
    private ConexionBD conexion=new ConexionBD();
    private DefaultTableModel modelo;

    private LineaVehiculo linea;
    private DaoLineVehiculo daoLinea;
    
    public JIFLineaVehiculo() throws SQLException {
        initComponents();
        
         modelo=new DefaultTableModel();
      
        modelo.addColumn("ID");
        modelo.addColumn("Descripción");
        modelo.addColumn("Marca");
        
        cargarCombo();
        consultarTodos();
        

      
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JD_guardar = new javax.swing.JDialog();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txt_id = new javax.swing.JTextField();
        Descripción = new javax.swing.JLabel();
        txt_des = new javax.swing.JTextField();
        btn_guardar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        cb_marca = new javax.swing.JComboBox();
        JD_Modificar = new javax.swing.JDialog();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txt_id1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txt_descrep1 = new javax.swing.JTextField();
        btn_guardar1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        cb_marca1 = new javax.swing.JComboBox();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_consultar = new javax.swing.JTable();
        btn_nuevo = new javax.swing.JButton();
        btn_mod = new javax.swing.JButton();

        JD_guardar.setTitle("Registro Linea de Vehiculo");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Registrar Linea Vehiculo / Equpo"));

        jLabel1.setText("ID");

        txt_id.setEditable(false);
        txt_id.setForeground(new java.awt.Color(204, 255, 255));
        txt_id.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_id.setText("Sin Asignar");

        Descripción.setText("Descripción");

        btn_guardar.setText("Guardar");
        btn_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardarActionPerformed(evt);
            }
        });

        jLabel5.setText("Marca");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_id, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Descripción)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_des)
                            .addComponent(cb_marca, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btn_guardar)
                .addGap(67, 67, 67))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Descripción)
                    .addComponent(txt_des, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cb_marca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(btn_guardar)
                .addContainerGap())
        );

        javax.swing.GroupLayout JD_guardarLayout = new javax.swing.GroupLayout(JD_guardar.getContentPane());
        JD_guardar.getContentPane().setLayout(JD_guardarLayout);
        JD_guardarLayout.setHorizontalGroup(
            JD_guardarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        JD_guardarLayout.setVerticalGroup(
            JD_guardarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        JD_Modificar.setTitle("Modificar Linea Vehiculo / Equipo");

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Modificar Linea Vehiculo / Equpo"));

        jLabel3.setText("ID");

        txt_id1.setEditable(false);
        txt_id1.setForeground(new java.awt.Color(204, 255, 255));
        txt_id1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_id1.setText("Sin Asignar");

        jLabel4.setText("Descripción");

        btn_guardar1.setText("Guardar");
        btn_guardar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardar1ActionPerformed(evt);
            }
        });

        jLabel2.setText("Marca");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_id1))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_descrep1)
                            .addComponent(cb_marca1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 89, Short.MAX_VALUE)
                .addComponent(btn_guardar1)
                .addGap(65, 65, 65))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_id1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txt_descrep1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cb_marca1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(btn_guardar1)
                .addContainerGap())
        );

        javax.swing.GroupLayout JD_ModificarLayout = new javax.swing.GroupLayout(JD_Modificar.getContentPane());
        JD_Modificar.getContentPane().setLayout(JD_ModificarLayout);
        JD_ModificarLayout.setHorizontalGroup(
            JD_ModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JD_ModificarLayout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        JD_ModificarLayout.setVerticalGroup(
            JD_ModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setClosable(true);
        setIconifiable(true);
        setTitle("Linea Vehiculo  -Tarifa Diferencial V 1.0- UTDVVCC");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Linea Vehiculo"));

        tb_consultar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tb_consultar);

        btn_nuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/utdvvcc/recursos/add.png"))); // NOI18N
        btn_nuevo.setToolTipText("Registrar");
        btn_nuevo.setBorderPainted(false);
        btn_nuevo.setContentAreaFilled(false);
        btn_nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_nuevoActionPerformed(evt);
            }
        });

        btn_mod.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/utdvvcc/recursos/mod_detalle.png"))); // NOI18N
        btn_mod.setToolTipText("Modificar");
        btn_mod.setBorderPainted(false);
        btn_mod.setContentAreaFilled(false);
        btn_mod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_modActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 325, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_nuevo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_mod, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(4, 4, 4))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_nuevo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_mod)))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardarActionPerformed
      
    try
      {
        
        String des=txt_des.getText().toUpperCase();
       
        linea=new LineaVehiculo();
        daoLinea=new DaoLineVehiculo();
        
      
        Marca m=(Marca) cb_marca.getSelectedItem();
        idmarca=m.getId();
        
        System.out.println(idmarca);
        
             linea.setDescripcion(des);
             linea.setIdmarca(idmarca);
             
             daoLinea.guardar(linea);
             
             JOptionPane.showMessageDialog(this, "Se registro con exito la Linea");
             LimpiarTabla();
             consultarTodos();
             JD_guardar.dispose();
                  
                  
        
        }catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_btn_guardarActionPerformed

    private void btn_nuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_nuevoActionPerformed
       JD_guardar.pack();
       JD_guardar.setLocationRelativeTo(null);
       JD_guardar.setVisible(true);
       JD_guardar.setResizable(false);
    }//GEN-LAST:event_btn_nuevoActionPerformed

    private void btn_guardar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardar1ActionPerformed
    try {
           
         
        Marca m=(Marca) cb_marca1.getSelectedItem();
        idmarca=m.getId();
        
        
            conexion.executeUpdateQuery("UPDATE tb_linea_marca SET descripcion='"+txt_descrep1.getText()+"', id_marca="+idmarca+" WHERE id_linea_marca="+txt_id1.getText()+"");
            JOptionPane.showMessageDialog(this, "Se actualizo la Linea");
            conexion.desconectar();
            LimpiarTabla();
            consultarTodos();
            JD_Modificar.dispose(); 
        
            
           
        } catch (SQLException ex) {
            Logger.getLogger(JIFLineaVehiculo.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }//GEN-LAST:event_btn_guardar1ActionPerformed

    private void btn_modActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_modActionPerformed
         int id;
          String des, marca;
         conexion=new ConexionBD();
        
        if(tb_consultar.isRowSelected(tb_consultar.getSelectedRow()))
            {
                id = (Integer) tb_consultar.getValueAt(tb_consultar.getSelectedRow(), 0);    
                des=(String) tb_consultar.getValueAt(tb_consultar.getSelectedRow(), 1);
                marca=(String) tb_consultar.getValueAt(tb_consultar.getSelectedRow(), 2);
                txt_id1.setText(String.valueOf(id));
                txt_descrep1.setText(des);
               
                
          
       
                 JD_Modificar.pack();
                 JD_Modificar.setLocationRelativeTo(null);
                 JD_Modificar.setVisible(true);
                 JD_Modificar.setResizable(false);
     
            }else
            {
                JOptionPane.showMessageDialog(null, "Debe seleccionar una fila de la tabla!", "Alerta!", JOptionPane.WARNING_MESSAGE);
            }
    }//GEN-LAST:event_btn_modActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Descripción;
    private javax.swing.JDialog JD_Modificar;
    private javax.swing.JDialog JD_guardar;
    private javax.swing.JButton btn_guardar;
    private javax.swing.JButton btn_guardar1;
    private javax.swing.JButton btn_mod;
    private javax.swing.JButton btn_nuevo;
    private javax.swing.JComboBox cb_marca;
    private javax.swing.JComboBox cb_marca1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tb_consultar;
    private javax.swing.JTextField txt_des;
    private javax.swing.JTextField txt_descrep1;
    private javax.swing.JTextField txt_id;
    private javax.swing.JTextField txt_id1;
    // End of variables declaration//GEN-END:variables

    public void consultarTodos() throws SQLException
{
    
    conexion=new ConexionBD();
    
    ResultSet obj=conexion.executeQuery("SELECT li.id_linea_marca,li.descripcion,m.nombre_marca AS marca FROM tb_linea_marca li JOIN tb_marca m ON m.id_marca=li.id_marca ORDER BY descripcion ASC");
    
    
        while (obj.next()) 
          {
          
          Object [] datos = new Object[3];
       
          for (int i=0;i<3;i++)
          {
              datos[i] =obj.getObject(i+1);
          }

           modelo.addRow(datos);
         
          }
        tb_consultar.setModel(modelo);
        setCellRender(tb_consultar);
        conexion.desconectar();
    
}
    
    public void LimpiarTabla()
    {
  
        for(int i=modelo.getRowCount()-1;i>=0;i--)
        {
            modelo.removeRow(i);
            
        }
    }
   
        public void setCellRender(JTable table) {
        Enumeration<TableColumn> en = table.getColumnModel().getColumns();
        while (en.hasMoreElements()) {
            TableColumn tc = en.nextElement();
            tc.setCellRenderer(new CellRenderer());
        }
    }
        
        
            public void cargarCombo()
    {
        ControllerItemList control=new ControllerItemList();
        
        ArrayList lista=control.ListarMarca();
        
        if (lista!=null)
        {
            int size=lista.size();
            
            for(int i=0; i<size; i++)
            {
                cb_marca.addItem(lista.get(i));
                cb_marca1.addItem(lista.get(i));
               
            }
        }
    }

}
