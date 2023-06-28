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
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;


public class FrmTemas extends javax.swing.JInternalFrame implements ActionListener {

       
    public FrmTemas() 
    {
    	setFrameIcon(new ImageIcon(FrmTemas.class.getResource("/Icons/_Help_Circle_Blue.png")));
    	setTitle("User Settings");
    	
        initComponents();
        cmbFiltro.addItem("Acryl");
        cmbFiltro.addItem("Aero");
        cmbFiltro.addItem("Bernstein");
        cmbFiltro.addItem("Graphite");
        cmbFiltro.addItem("Luna");
        cmbFiltro.addItem("McWin");
        cmbFiltro.addItem("Mint");
        cmbFiltro.addItem("Noire");
        cmbFiltro.addItem("Smart");
        cmbFiltro.addItem("Texture");
    }

     
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        cmbFiltro = new javax.swing.JComboBox<>();
        cmbFiltro.setFont(new Font("Tahoma", Font.PLAIN, 15));
        jLabel2 = new javax.swing.JLabel();
        jLabel2.setFont(new Font("Tahoma", Font.PLAIN, 15));
        jLabel1.setFont(new Font("Tahoma", Font.BOLD, 24));
        jLabel1.setText("PERSONALIZACIÓN DE TEMAS");
        cmbFiltro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbFiltroActionPerformed(evt);
            }
        });

        jLabel2.setText("Filtro");
        btnAplicarTema = new JButton("Aplicar tema");
        btnAplicarTema.setFont(new Font("Tahoma", Font.PLAIN, 15));
        btnAplicarTema.addActionListener(this);
        
        btnSalir = new JButton("Salir");
        btnSalir.setFont(new Font("Tahoma", Font.PLAIN, 15));
        btnSalir.addActionListener(this);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(Alignment.LEADING, layout.createSequentialGroup()
        			.addGap(20)
        			.addComponent(jLabel2)
        			.addGap(29)
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(layout.createSequentialGroup()
        					.addComponent(jLabel1)
        					.addContainerGap())
        				.addGroup(layout.createSequentialGroup()
        					.addComponent(cmbFiltro, 0, 206, Short.MAX_VALUE)
        					.addGap(26)
        					.addComponent(btnAplicarTema)
        					.addPreferredGap(ComponentPlacement.UNRELATED)
        					.addComponent(btnSalir)
        					.addGap(66))))
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
        				.addComponent(btnSalir)
        				.addComponent(btnAplicarTema))
        			.addGap(335))
        );
        getContentPane().setLayout(layout);

        pack();
    }

    private void cmbFiltroActionPerformed(java.awt.event.ActionEvent evt) {
 
        
    }
    private javax.swing.JComboBox<String> cmbFiltro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private JButton btnAplicarTema;
    private JButton btnSalir;
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == btnSalir) {
			do_btnSalir_actionPerformed(arg0);
		}
		if (arg0.getSource() == btnAplicarTema) {
			do_btnAplicarTema_actionPerformed(arg0);
		}
	}
	protected void do_btnAplicarTema_actionPerformed(ActionEvent arg0) {
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
	protected void do_btnSalir_actionPerformed(ActionEvent arg0) {
		 this.dispose();
	}
}
