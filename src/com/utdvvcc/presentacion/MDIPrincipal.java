/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.utdvvcc.presentacion;

import com.utdvvcc.conexion.*;
import com.utdvvcc.recursos.Imagenfondo;
import java.awt.Image;
import java.awt.Toolkit;
import java.text.ParseException;
import javax.swing.JInternalFrame;
import javax.swing.UIManager;

import java.awt.Color;
import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import com.utdvvcc.recursos.JPColor;
import de.javasoft.plaf.synthetica.SyntheticaBlueIceLookAndFeel;
import java.awt.Dimension;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;


/**
 *
 * @author Jonathan
 */
public class MDIPrincipal extends javax.swing.JFrame implements Runnable{

    private final ConexionBD conexion;
    private static int vSeccion;
    private static String vSeccionNom;
    
    
    //Ventanas
    
    private JIFMarcaVehiculo marca;
    private JIFLineaVehiculo linea;
    private JIFCategoria categoria;
    private JIFPerfilUsuario perfil;
    private JIFSubirPlacas placas;
    private JIFConsultarTE consultar;
    private JIFTipoBloq t_bloq;
    private JIFTipoVehiculo tipo;
    private JIFDataVehiculos data;

 //Reloj
 
private String hora,minutos,segundos,ampm;

private Calendar calendario;    

private Thread h1;
 
    public MDIPrincipal() {
        initComponents();
        
        h1 = new Thread(this);

        h1.start();
    escritorio.setBorder(new Imagenfondo());
    
        conexion=new ConexionBD();
        
        
        Color c1=new Color(66,111,166);
        Color c2=new Color(102,174,118);
        JPColor miColor=new JPColor(c1,c2);
        miColor.setSize(this.getSize());
        panel.add(miColor);
    
    }
    
      @SuppressWarnings("unchecked")
    @Override
    public Image getIconImage() 
      {
        Image retValue = Toolkit.getDefaultToolkit().
                getImage(ClassLoader.getSystemResource("com/utdvvcc/recursos/icono_1.png"));
        return retValue;
    }

    public static int getvSeccion() {
        return vSeccion;
    }

    public static void setvSeccion(int vSeccion) {
        MDIPrincipal.vSeccion = vSeccion;
    }

    public static String getvSeccionNom() {
        return vSeccionNom;
    }

    public static void setvSeccionNom(String vSeccionNom) {
        MDIPrincipal.vSeccionNom = vSeccionNom;
    }

    
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        JDInicio = new javax.swing.JDialog();
        panel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txt_usuario = new javax.swing.JTextField();
        pf_contra = new javax.swing.JPasswordField();
        btn_ingresar = new javax.swing.JButton();
        btn_salir = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        escritorio = new javax.swing.JDesktopPane();
        jToolBar1 = new javax.swing.JToolBar();
        jLabel7 = new javax.swing.JLabel();
        lb_usuario = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JToolBar.Separator();
        btn_consultar = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JToolBar.Separator();
        lb_reloj = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        m_subir_placas = new javax.swing.JMenu();
        itm_consulta = new javax.swing.JMenuItem();
        itm_subir = new javax.swing.JMenuItem();
        itm_doc = new javax.swing.JMenuItem();
        itm_activacion = new javax.swing.JMenuItem();
        itm_bloqueo = new javax.swing.JMenuItem();
        itm_renovacion = new javax.swing.JMenuItem();
        m_utilidades = new javax.swing.JMenu();
        menu_usuarios = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        menu_vehiculo = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        itm_marca = new javax.swing.JMenuItem();
        itm_linea = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu9 = new javax.swing.JMenu();
        jMenuItem12 = new javax.swing.JMenuItem();

        jMenu2.setText("File");
        jMenuBar2.add(jMenu2);

        jMenu3.setText("Edit");
        jMenuBar2.add(jMenu3);

        JDInicio.setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        JDInicio.setUndecorated(true);
        JDInicio.setResizable(false);

        panel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 153, 0));
        jLabel1.setText("ENTRADA AL SISTEMA");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/utdvvcc/recursos/Logo.png"))); // NOI18N

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(82, 82, 82))
            .addGroup(panelLayout.createSequentialGroup()
                .addComponent(jLabel4)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel5.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel5.setText("Usuario *");

        jLabel6.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel6.setText("Contraseña *");

        pf_contra.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                pf_contraKeyPressed(evt);
            }
        });

        btn_ingresar.setText("Ingresar");
        btn_ingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ingresarActionPerformed(evt);
            }
        });

        btn_salir.setText("Salir");
        btn_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salirActionPerformed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/utdvvcc/recursos/usuario.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(31, 31, 31)
                        .addComponent(txt_usuario))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btn_ingresar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                                .addComponent(btn_salir))
                            .addComponent(pf_contra))))
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txt_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(pf_contra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_ingresar)
                            .addComponent(btn_salir))))
                .addContainerGap())
        );

        javax.swing.GroupLayout JDInicioLayout = new javax.swing.GroupLayout(JDInicio.getContentPane());
        JDInicio.getContentPane().setLayout(JDInicioLayout);
        JDInicioLayout.setHorizontalGroup(
            JDInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        JDInicioLayout.setVerticalGroup(
            JDInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JDInicioLayout.createSequentialGroup()
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tarifa DIferencial - UTDVVCC versión (1.0)");
        setIconImage(getIconImage());

        escritorio.setBackground(new java.awt.Color(204, 204, 204));

        jToolBar1.setRollover(true);

        jLabel7.setText("Usuario:");
        jToolBar1.add(jLabel7);

        lb_usuario.setText("no hay usuario");
        jToolBar1.add(lb_usuario);
        jToolBar1.add(jSeparator3);

        btn_consultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/utdvvcc/recursos/consulta_placa__1.png"))); // NOI18N
        btn_consultar.setToolTipText("Consultar Placa TE");
        btn_consultar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_consultar.setFocusable(false);
        btn_consultar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_consultar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_consultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_consultarActionPerformed(evt);
            }
        });
        jToolBar1.add(btn_consultar);
        jToolBar1.add(jSeparator4);

        lb_reloj.setFont(new java.awt.Font("Comic Sans MS", 1, 20)); // NOI18N
        lb_reloj.setForeground(new java.awt.Color(153, 153, 0));
        lb_reloj.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_reloj.setText("Reloj Digital");
        lb_reloj.setToolTipText("Reloj");
        lb_reloj.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lb_reloj.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jToolBar1.add(lb_reloj);

        escritorio.setLayer(jToolBar1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 860, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(escritorioLayout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 224, Short.MAX_VALUE))
        );

        jMenu1.setText("File");

        jMenuItem1.setText("Salir");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        m_subir_placas.setText("Tarifa Especial");

        itm_consulta.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.SHIFT_MASK));
        itm_consulta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/utdvvcc/recursos/consulta_placa_i.png"))); // NOI18N
        itm_consulta.setText("Consulta TE");
        itm_consulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itm_consultaActionPerformed(evt);
            }
        });
        m_subir_placas.add(itm_consulta);

        itm_subir.setText("Subir Placas");
        itm_subir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itm_subirActionPerformed(evt);
            }
        });
        m_subir_placas.add(itm_subir);

        itm_doc.setText("Documentación Requerida");
        m_subir_placas.add(itm_doc);

        itm_activacion.setText("Activación TE");
        m_subir_placas.add(itm_activacion);

        itm_bloqueo.setText("Bloqueo TE");
        m_subir_placas.add(itm_bloqueo);

        itm_renovacion.setText("Renovación TE");
        m_subir_placas.add(itm_renovacion);

        jMenuBar1.add(m_subir_placas);

        m_utilidades.setText("Configuración");

        menu_usuarios.setText("Usuarios");

        jMenuItem3.setText("Perfil Usuario");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        menu_usuarios.add(jMenuItem3);

        jMenuItem9.setText("Reg. Usuarios");
        menu_usuarios.add(jMenuItem9);

        m_utilidades.add(menu_usuarios);

        menu_vehiculo.setText("Vehiculos");

        jMenuItem2.setText("Reg. Categoria Vehiculo");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        menu_vehiculo.add(jMenuItem2);

        jMenuItem6.setText("Reg. Tipo Vehiculo");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        menu_vehiculo.add(jMenuItem6);

        itm_marca.setText("Reg. Marca Vehiculo");
        itm_marca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itm_marcaActionPerformed(evt);
            }
        });
        menu_vehiculo.add(itm_marca);

        itm_linea.setText("Reg. Linea Vehiculo");
        itm_linea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itm_lineaActionPerformed(evt);
            }
        });
        menu_vehiculo.add(itm_linea);

        jMenuItem5.setText("Data Vehiculo");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        menu_vehiculo.add(jMenuItem5);

        m_utilidades.add(menu_vehiculo);

        jMenu5.setText("TE");

        jMenuItem4.setText("Reg. Tipo Bloqueo TE");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem4);

        m_utilidades.add(jMenu5);

        jMenuBar1.add(m_utilidades);

        jMenu9.setText("Acerca de");

        jMenuItem12.setText("Acerca de");
        jMenuItem12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem12ActionPerformed(evt);
            }
        });
        jMenu9.add(jMenuItem12);

        jMenuBar1.add(jMenu9);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void btn_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btn_salirActionPerformed

    private void btn_ingresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ingresarActionPerformed
        this.logueo();
    }//GEN-LAST:event_btn_ingresarActionPerformed

    private void pf_contraKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pf_contraKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER)
        {
            this.logueo();
        }
    }//GEN-LAST:event_pf_contraKeyPressed

    private void jMenuItem12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem12ActionPerformed
        Icon icono = null;
        icono = new ImageIcon(getClass().getResource("/com/utdvvcc/recursos/perfil.jpg"));
        JOptionPane.showMessageDialog(this, "Sistema Consulta Tarifa Diferencial\nUTDVVCC\nRealizado por: JONATHAN ARTEAGA\n Desarrollador de Software\nEmail: arteaga_jonathan@hotmail.com","Acerca",JOptionPane.INFORMATION_MESSAGE,icono);

    }//GEN-LAST:event_jMenuItem12ActionPerformed

    private void itm_marcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itm_marcaActionPerformed
        if(estacerrado(marca))
        {
            marca=new JIFMarcaVehiculo();
            escritorio.add(marca);
            Dimension tamanoEscritorio=escritorio.getSize();
            Dimension framesize=marca.getSize();
            marca.setLocation((tamanoEscritorio.width - framesize.width)/2, (tamanoEscritorio.height - framesize.height)/2) ;
            marca.show();
        
        }else
        {
            JOptionPane.showMessageDialog(this, "La ventana ya esta abierta");
        }
    }//GEN-LAST:event_itm_marcaActionPerformed

    private void itm_lineaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itm_lineaActionPerformed
        if(estacerrado(linea))
        {
            try {
                linea=new JIFLineaVehiculo();
            } catch (SQLException ex) {
                Logger.getLogger(MDIPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }
            escritorio.add(linea);
            Dimension tamanoEscritorio=escritorio.getSize();
            Dimension framesize=linea.getSize();
            linea.setLocation((tamanoEscritorio.width - framesize.width)/2, (tamanoEscritorio.height - framesize.height)/2) ;
            linea.show();
        
        }else
        {
            JOptionPane.showMessageDialog(this, "La ventana ya esta abierta");
        }
    }//GEN-LAST:event_itm_lineaActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
          if(estacerrado(categoria))
        {
            categoria=new JIFCategoria();
            escritorio.add(categoria);
            Dimension tamanoEscritorio=escritorio.getSize();
            Dimension framesize=categoria.getSize();
            categoria.setLocation((tamanoEscritorio.width - framesize.width)/2, (tamanoEscritorio.height - framesize.height)/2) ;
            categoria.show();
        
        }else
        {
            JOptionPane.showMessageDialog(this, "La ventana ya esta abierta");
        }
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
            if(estacerrado(perfil))
        {
           perfil=new JIFPerfilUsuario();
            escritorio.add(perfil);
            Dimension tamanoEscritorio=escritorio.getSize();
            Dimension framesize=perfil.getSize();
            perfil.setLocation((tamanoEscritorio.width - framesize.width)/2, (tamanoEscritorio.height - framesize.height)/2) ;
            perfil.show();
        
        }else
        {
            JOptionPane.showMessageDialog(this, "La ventana ya esta abierta");
        }
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void itm_subirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itm_subirActionPerformed
            if(estacerrado(placas))
        {
           placas=new JIFSubirPlacas();
            escritorio.add(placas);
            Dimension tamanoEscritorio=escritorio.getSize();
            Dimension framesize=placas.getSize();
            placas.setLocation((tamanoEscritorio.width - framesize.width)/2, (tamanoEscritorio.height - framesize.height)/2) ;
            placas.show();
        
        }else
        {
            JOptionPane.showMessageDialog(this, "La ventana ya esta abierta");
        }
    }//GEN-LAST:event_itm_subirActionPerformed

    private void itm_consultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itm_consultaActionPerformed
             if(estacerrado(consultar))
        {
           consultar=new JIFConsultarTE();
            escritorio.add(consultar);
            Dimension tamanoEscritorio=escritorio.getSize();
            Dimension framesize=consultar.getSize();
            consultar.setLocation((tamanoEscritorio.width - framesize.width)/2, (tamanoEscritorio.height - framesize.height)/2) ;
            consultar.show();
        
        }else
        {
            JOptionPane.showMessageDialog(this, "La ventana ya esta abierta");
        }
    }//GEN-LAST:event_itm_consultaActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
             if(estacerrado(t_bloq))
        {
           t_bloq=new JIFTipoBloq();
            escritorio.add(t_bloq);
            Dimension tamanoEscritorio=escritorio.getSize();
            Dimension framesize=t_bloq.getSize();
            t_bloq.setLocation((tamanoEscritorio.width - framesize.width)/2, (tamanoEscritorio.height - framesize.height)/2) ;
            t_bloq.show();
        
        }else
        {
            JOptionPane.showMessageDialog(this, "La ventana ya esta abierta");
        }
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
                  if(estacerrado(tipo))
        {
           tipo=new JIFTipoVehiculo();
            escritorio.add(tipo);
            Dimension tamanoEscritorio=escritorio.getSize();
            Dimension framesize=tipo.getSize();
            tipo.setLocation((tamanoEscritorio.width - framesize.width)/2, (tamanoEscritorio.height - framesize.height)/2) ;
            tipo.show();
        
        }else
        {
            JOptionPane.showMessageDialog(this, "La ventana ya esta abierta");
        }
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
                  if(estacerrado(data))
        {
           data=new JIFDataVehiculos();
            escritorio.add(data);
            Dimension tamanoEscritorio=escritorio.getSize();
            Dimension framesize=data.getSize();
            data.setLocation((tamanoEscritorio.width - framesize.width)/2, (tamanoEscritorio.height - framesize.height)/2) ;
            data.show();
        
        }else
        {
            JOptionPane.showMessageDialog(this, "La ventana ya esta abierta");
        }
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void btn_consultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_consultarActionPerformed
        if(estacerrado(consultar))
        {
            consultar=new JIFConsultarTE();
            escritorio.add(consultar);
            Dimension tamanoEscritorio=escritorio.getSize();
            Dimension framesize=consultar.getSize();
            consultar.setLocation((tamanoEscritorio.width - framesize.width)/2, (tamanoEscritorio.height - framesize.height)/2) ;
            consultar.show();

        }else
        {
            JOptionPane.showMessageDialog(this, "La ventana ya esta abierta");
        }
    }//GEN-LAST:event_btn_consultarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws ParseException {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("de.javasoft.plaf.synthetica.SyntheticaBlueIceLookAndFeel;".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel("de.javasoft.plaf.synthetica.SyntheticaBlueIceLookAndFeel;");
                    break;
                }
            }
            UIManager.setLookAndFeel(new SyntheticaBlueIceLookAndFeel());
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MDIPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MDIPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MDIPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MDIPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new MDIPrincipal().setVisible(true);
//                MDIPrincipal principal=new MDIPrincipal();
//                principal.setLocationRelativeTo(null);
//                principal.setVisible(false);
//                principal.setExtendedState(JFrame.MAXIMIZED_BOTH);
//                principal.iniciarSistema();
                new Thread(new Splash()).start();
                
//            }
            }
            });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog JDInicio;
    private javax.swing.JButton btn_consultar;
    private javax.swing.JButton btn_ingresar;
    private javax.swing.JButton btn_salir;
    public static javax.swing.JDesktopPane escritorio;
    private javax.swing.JMenuItem itm_activacion;
    private javax.swing.JMenuItem itm_bloqueo;
    private javax.swing.JMenuItem itm_consulta;
    private javax.swing.JMenuItem itm_doc;
    private javax.swing.JMenuItem itm_linea;
    private javax.swing.JMenuItem itm_marca;
    private javax.swing.JMenuItem itm_renovacion;
    private javax.swing.JMenuItem itm_subir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JToolBar.Separator jSeparator3;
    private javax.swing.JToolBar.Separator jSeparator4;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JLabel lb_reloj;
    private javax.swing.JLabel lb_usuario;
    private javax.swing.JMenu m_subir_placas;
    private javax.swing.JMenu m_utilidades;
    private javax.swing.JMenu menu_usuarios;
    private javax.swing.JMenu menu_vehiculo;
    private javax.swing.JPanel panel;
    private javax.swing.JPasswordField pf_contra;
    private javax.swing.JTextField txt_usuario;
    // End of variables declaration//GEN-END:variables

    
 public void iniciarSistema()
 {
     JDInicio.pack();
     JDInicio.setLocationRelativeTo(null);
     JDInicio.setVisible(true);
     JDInicio.setResizable(false);
 }
 
 public void logueo()
 {
     try
     {
        String level="";
        int idusuario;
         String usuario=txt_usuario.getText();
         String contra=String.valueOf(pf_contra.getPassword());
         
         ResultSet obj=conexion.executeQuery("SELECT u.id, u.usuario, p.nombre_perfil FROM tb_usuario u JOIN tb_perfil p ON u.id_perfil=p.id WHERE usuario='"+usuario+"' AND contrasena=md5('"+contra+"') AND estado=true");
         
         if(obj.next()==true)
         {
             JDInicio.dispose();
             txt_usuario.setText("");
             pf_contra.setText("");
             
             level=obj.getString("nombre_perfil");
             idusuario=obj.getInt("id");
             
             if(level.equals("ADMINISTRADOR"))
             {
                
                 
             this.setVisible(true);
             
       
             System.out.println(level);
             usuario=obj.getString("usuario");
             
             lb_usuario.setText(usuario);
             
             setvSeccion(idusuario);
             setvSeccionNom(usuario);
                 
             }
             else
             {
             
                    this.setVisible(true);
            
             
                    System.out.println(level);
                    usuario=obj.getString("usuario");
             
                    lb_usuario.setText(usuario);
           
                    setvSeccion(idusuario);
                    setvSeccionNom(usuario);
                    
                    itm_subir.setEnabled(false);
                    itm_doc.setEnabled(false);
                    itm_activacion.setEnabled(false);
                    itm_bloqueo.setEnabled(false);
                    itm_bloqueo.setEnabled(false);
                    itm_renovacion.setEnabled(false);
                    m_utilidades.setEnabled(false);

          }
             
         }
         else
         {
             JOptionPane.showMessageDialog(this, "Usuario o contraseña incorrectos. \n Intentelo de nuevo", "Mensaje Error", JOptionPane.ERROR_MESSAGE);
         }
         
     }catch(SQLException | HeadlessException e)
     {
        JOptionPane.showMessageDialog(this, "Error de conexión" + e, "Mensaje Error", JOptionPane.ERROR_MESSAGE);

     }
 }
    
    
    
private boolean estacerrado(Object obj)
{
    JInternalFrame[] activos=escritorio.getAllFrames();
    boolean cerrado=true;
    int i=0;
    while (i<activos.length && cerrado)
    {
        if(activos[i]==obj)
        {
            cerrado=false;
        }
        i++;
    }
    return cerrado;
    
}

    @Override
    public void run() {
        
         Thread ct = Thread.currentThread();

         while(ct == h1) 
         {   

            calcula();

            lb_reloj.setText(hora + ":" + minutos + ":" + segundos + " "+ampm);

        try {

                Thread.sleep(1000);

             }catch(InterruptedException e) {}

        }
  }
    
    
    public void calcula () {        

        Calendar calendario = new GregorianCalendar();

        Date fechaHoraActual = new Date();



        calendario.setTime(fechaHoraActual);

        ampm = calendario.get(Calendar.AM_PM)==Calendar.AM?"AM":"PM";


        if(ampm.equals("PM")){

        int h = calendario.get(Calendar.HOUR_OF_DAY)-12;

        hora = h>9?""+h:"0"+h;

     }else{
            hora = calendario.get(Calendar.HOUR_OF_DAY)>9?""+calendario.get(Calendar.HOUR_OF_DAY):"0"+calendario.get(Calendar.HOUR_OF_DAY);            
           }

            minutos = calendario.get(Calendar.MINUTE)>9?""+calendario.get(Calendar.MINUTE):"0"+calendario.get(Calendar.MINUTE);

            segundos = calendario.get(Calendar.SECOND)>9?""+calendario.get(Calendar.SECOND):"0"+calendario.get(Calendar.SECOND); 

}

}
