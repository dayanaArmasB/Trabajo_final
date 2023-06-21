/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.modconta.view;

import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.SwingUtilities;
import java.awt.Font;
import java.awt.Window;


public class FrmTemas extends javax.swing.JInternalFrame {

       
    public FrmTemas() 
    {
    	setTitle("User Settings");
    	
        initComponents();
        cmbFiltro.addItem("Acryl");
        cmbFiltro.addItem("Aero");
        cmbFiltro.addItem("Bernstein");
        cmbFiltro.addItem("Fast");
        cmbFiltro.addItem("Graphite");
        cmbFiltro.addItem("Hifi");
        cmbFiltro.addItem("Luna");
        cmbFiltro.addItem("McWin");
        cmbFiltro.addItem("Mint");
        cmbFiltro.addItem("Noire");
        cmbFiltro.addItem("Smart");
        cmbFiltro.addItem("Texture");
    }

     
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();
        cmbFiltro = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        btnGenerarPDF = new javax.swing.JButton();
        jLabel1.setFont(new Font("Tahoma", Font.BOLD, 24)); // NOI18N
        jLabel1.setText("PERSONALIZACIÓN DE TEMAS");

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        cmbFiltro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbFiltroActionPerformed(evt);
            }
        });

        jLabel2.setText("Filtro");

        btnGenerarPDF.setText("Aplicar\r\n");
        btnGenerarPDF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarPDFActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(layout.createSequentialGroup()
        			.addGap(214)
        			.addComponent(jLabel1)
        			.addContainerGap(262, Short.MAX_VALUE))
        		.addGroup(layout.createSequentialGroup()
        			.addGap(20)
        			.addComponent(jLabel2)
        			.addGap(41)
        			.addComponent(cmbFiltro, 0, 374, Short.MAX_VALUE)
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addComponent(btnGenerarPDF)
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addComponent(btnSalir, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
        			.addGap(219))
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap()
        			.addComponent(jLabel1)
        			.addGap(24)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel2)
        				.addComponent(cmbFiltro, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(btnGenerarPDF)
        				.addComponent(btnSalir))
        			.addGap(335))
        );
        getContentPane().setLayout(layout);

        pack();
    }

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {
        this.dispose();
    }

    private void cmbFiltroActionPerformed(java.awt.event.ActionEvent evt) {
 
        
    }

    private void btnGenerarPDFActionPerformed(java.awt.event.ActionEvent evt) {
        try {
            String selectedItem = (String) cmbFiltro.getSelectedItem();
         javax.swing.UIManager.setLookAndFeel("com.jtattoo.plaf."+ selectedItem.toLowerCase()+ "."+ selectedItem  +"LookAndFeel");
         
         // Obtén todas las ventanas abiertas en tu aplicación
         Window[] windows = Window.getWindows();
         
         // Actualiza cada ventana
         for (Window window : windows) {
             SwingUtilities.updateComponentTreeUI(window);
             window.pack(); // Opcionalmente, puedes llamar al método pack() para redimensionar la ventana según el nuevo aspecto
         }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmTemas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }

    private javax.swing.JButton btnGenerarPDF;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox<String> cmbFiltro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
}
