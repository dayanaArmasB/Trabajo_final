/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.modconta.view;

import app.modconta.databaase.dbBean;
import app.modconta.databaase.util;
import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.GroupLayout;

public class Login extends javax.swing.JFrame {

    public Login() {
        initComponents();   
    }

    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();
        btnSalir = new javax.swing.JButton();
        btnIngresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(570, 200));
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/amsn_1.png"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("LOGIN");

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12));
        jLabel2.setText("Nombre de usuario:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); 
        jLabel3.setText("Contrase\u00F1a:");

        txtUsuario.setFont(new java.awt.Font("Consolas", 0, 14)); 

        txtPassword.setFont(new java.awt.Font("Consolas", 0, 14));
        txtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordActionPerformed(evt);
            }
        });
        txtPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPasswordKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtUsuario)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(0, 85, Short.MAX_VALUE))
                    .addComponent(txtPassword))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                .addContainerGap())
        );

        btnSalir.setFont(new java.awt.Font("Tahoma", 1, 12));
        btnSalir.setText("SALIR");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        btnIngresar.setFont(new java.awt.Font("Tahoma", 1, 12));
        btnIngresar.setText("INGRESAR");
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        				.addGroup(layout.createSequentialGroup()
        					.addGap(18)
        					.addComponent(btnIngresar)
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addComponent(btnSalir, GroupLayout.PREFERRED_SIZE, 115, GroupLayout.PREFERRED_SIZE))
        				.addGroup(layout.createSequentialGroup()
        					.addContainerGap()
        					.addComponent(jLabel4, GroupLayout.PREFERRED_SIZE, 56, GroupLayout.PREFERRED_SIZE)
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 91, GroupLayout.PREFERRED_SIZE)
        					.addGap(40))
        				.addGroup(layout.createSequentialGroup()
        					.addContainerGap()
        					.addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)))
        			.addContainerGap())
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addGap(12)
        			.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        				.addGroup(layout.createSequentialGroup()
        					.addComponent(jLabel1)
        					.addGap(18))
        				.addGroup(layout.createSequentialGroup()
        					.addComponent(jLabel4, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE)
        					.addPreferredGap(ComponentPlacement.RELATED)))
        			.addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(btnIngresar)
        				.addComponent(btnSalir))
        			.addContainerGap(23, Short.MAX_VALUE))
        );
        getContentPane().setLayout(layout);

        pack();
    }

    private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {
        
        System.exit(0);
    }

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {
        String p1 = txtPassword.getText();
        String u1 = txtUsuario.getText();
        Identificar(u1,p1);
        
    }

    private void formKeyPressed(java.awt.event.KeyEvent evt) {
        
         if(evt.getKeyCode() == KeyEvent.VK_ENTER)
            {
      String p1 = txtPassword.getText();
        String u1 = txtUsuario.getText();
        Identificar(u1,p1);
            }
    }

    private void txtPasswordKeyPressed(java.awt.event.KeyEvent evt) {
   
      if(evt.getKeyCode() == KeyEvent.VK_ENTER)
            {
      String p1 = txtPassword.getText();
        String u1 = txtUsuario.getText();
        Identificar(u1,p1);
            }

    }
    
    public static void main(String args[]) {
        try {
         javax.swing.UIManager.setLookAndFeel("com.jtattoo.plaf.hifi.HiFiLookAndFeel");
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }
    
    
    
 private void Identificar(String usuario, String password) {
       
   try { 
            util u = new util();
            String consul = " select 1 from usuarios where usuario='"+ usuario +"'  and clave = '" + password + "'";            
            ResultSet rr=u.consultar(consul);
            if(rr.next())
            {
                MDIApplication menu = new MDIApplication();
                this.hide();
                menu.show(); 
               JOptionPane.showMessageDialog(null, "Bienvenid@ " + usuario);
            }
           else
            {
               JOptionPane.showMessageDialog(null, "Usuario o Password No Valido");   
            }
        } 
        catch (HeadlessException | SQLException e) 
        { 
            JOptionPane.showMessageDialog(null,"Ocurrio un error " + e.getMessage());             
        }
    }
    private javax.swing.JButton btnIngresar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsuario;
}
