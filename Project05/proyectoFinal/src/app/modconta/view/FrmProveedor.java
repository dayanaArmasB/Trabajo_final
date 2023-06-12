/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package app.modconta.view;
import MODEL.ProveedorDAO;
import app.modconta.business.ClienteBO;
import app.modconta.databaase.dbBean;
import app.modconta.databaase.util;
import app.modconta.entity.Cliente;
import java.sql.Connection;
import java.util.HashMap;
import java.util.List;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ButtonGroup;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class FrmProveedor extends javax.swing.JInternalFrame {
	ClienteBO _Clientebo;
    DefaultTableModel _DefaultTableModel;
    boolean sw = false;
    String cad = "";
    int idClie; 
    ButtonGroup buttonGroup;

    public FrmProveedor() {
    	setTitle("CLIENTES");
        initComponents();
        _Clientebo = new ClienteBO();
        _DefaultTableModel = (DefaultTableModel)tblCliente.getModel();
        llenaTabla(false, "");
        
        buttonGroup = new ButtonGroup();
    }
public void llenaTabla(boolean swr, String cadr)
    {
	List<Cliente> Clientes = _Clientebo.readAll();
        int i = Clientes.size(); 
        for(int j = 0; j<i;j++){
            Vector vect = new Vector();
            vect.addElement(Clientes.get(j).getIdCliente());
            vect.addElement(Clientes.get(j).getNombre());
            vect.addElement(Clientes.get(j).getApellidoP());
            vect.addElement(Clientes.get(j).getApellidoM());
            vect.addElement(Clientes.get(j).getTelefono());
            vect.addElement(Clientes.get(j).getDireccion());
            vect.addElement(Clientes.get(j).getSexo());
            vect.addElement(Clientes.get(j).getDNI());
            vect.addElement(Clientes.get(j).getRUC());
            _DefaultTableModel.addRow(vect);
        }
        
    }     
       public void limpiaControles(){
        txtNombreC.setText("");

        txtTelefono.setText("");
        txtDireccion.setText("");
        txtRUC.setText("");
        btnRegistrar.setText("Registrar");
        txtNombreC.requestFocus();
    }
    public void limpiaTabla(){
        DefaultTableModel dm = (DefaultTableModel)this.tblCliente.getModel();
        if(dm.getRowCount()>0){
            while(dm.getRowCount()>0){
                dm.removeRow(dm.getRowCount()-1);
            }
        }
    }
    public boolean valida(){
        boolean sw = false;
        if (txtNombreC.getText().equals("")) {
        	JOptionPane.showMessageDialog(this, "Ingrese Nombres");
        	return sw;
		}

        if(txtDireccion.getText().equals("")){
        	JOptionPane.showMessageDialog(this, "Debe ingresar direccion");
        }
        if(txtTelefono.getText().equals("")){
        	JOptionPane.showMessageDialog(this, "Debe ingresar telefono");
        }
        if(txtRUC.getText().equals("")){
        	JOptionPane.showMessageDialog(this, "Debe ingresar RUC");
        }
        if(buttonGroup.getSelection()== null){
        	JOptionPane.showMessageDialog(this, "Debe seleccionar un sexo");
        }
        
        
        
        
        return sw = true;
    }

   
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        lblTitulo = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jTabbedPane1.setToolTipText("test");
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCliente = new javax.swing.JTable();
        tblCliente.setModel(new DefaultTableModel(
        	new Object[][] {
        	},
        	new String[] {
        		"ID", "Nombre", "Direccion", "Telefono", "Estado", "RUC", "Cuenta Corriente"
        	}
        ));
        tblCliente.getColumnModel().getColumn(4).setResizable(false);
        tblCliente.getColumnModel().getColumn(6).setPreferredWidth(121);
        jTextField1 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();

        jButton1.setText("Generar Reporte Proveedores");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        lblTitulo.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("PROVEEDORES");

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        jPanel3.setLayout(null);

        jLabel2.setText("B\u00FAsqueda");
        jLabel2.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel3.add(jLabel2);
        jLabel2.setBounds(20, 10, 80, 30);
        tblCliente.setToolTipText("");
        tblCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tblCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblClienteMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblCliente);

        jPanel3.add(jScrollPane1);
        jScrollPane1.setBounds(20, 80, 744, 261);

        jTextField1.setName("txtBusqueda"); // NOI18N
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel3.setBounds(58, 56, 60, 21);
        txtNombreC = new javax.swing.JTextField();
        txtNombreC.setBounds(130, 56, 310, 30);
        txtRUC = new javax.swing.JTextField();
        txtRUC.setBounds(130, 238, 310, 30);
        jLabel6 = new javax.swing.JLabel();
        jLabel6.setBounds(58, 147, 50, 21);
        txtTelefono = new javax.swing.JTextField();
        txtTelefono.setBounds(130, 142, 310, 30);
        jLabel7 = new javax.swing.JLabel();
        jLabel7.setBounds(58, 238, 30, 21);
        jLabel1 = new javax.swing.JLabel();
        jLabel1.setBounds(58, 104, 70, 20);
        txtDireccion = new javax.swing.JTextField();
        txtDireccion.setBounds(130, 99, 310, 30);
        
                jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
                
                        jLabel3.setText("Nombre");
                        
                                txtNombreC.addActionListener(new java.awt.event.ActionListener() {
                                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                                        txtNombreActionPerformed(evt);
                                    }
                                });
                                txtNombreC.addKeyListener(new java.awt.event.KeyAdapter() {
                                    public void keyPressed(java.awt.event.KeyEvent evt) {
                                        txtNombreKeyPressed(evt);
                                    }
                                });
                                
                                        txtRUC.setName("txtRUC"); // NOI18N
                                        txtRUC.addActionListener(new java.awt.event.ActionListener() {
                                            public void actionPerformed(java.awt.event.ActionEvent evt) {
                                                txtRUCActionPerformed(evt);
                                            }
                                        });
                                        
                                                jLabel6.setText("Telefono");
                                                
                                                        txtTelefono.setName("txtDireccion"); // NOI18N
                                                        txtTelefono.addActionListener(new java.awt.event.ActionListener() {
                                                            public void actionPerformed(java.awt.event.ActionEvent evt) {
                                                                txtTelefonoActionPerformed(evt);
                                                            }
                                                        });
                                                        
                                                                jLabel7.setText("RUC");
                                                                
                                                                        jLabel1.setText("Direcci\u00F3n");
                                                                        
                                                                                jTabbedPane1.addTab("Registrar", jPanel4);
                                                                                jPanel4.setLayout(null);
                                                                                jPanel4.add(jLabel3);
                                                                                jPanel4.add(txtNombreC);
                                                                                jPanel4.add(txtRUC);
                                                                                jPanel4.add(jLabel6);
                                                                                jPanel4.add(txtTelefono);
                                                                                jPanel4.add(jLabel7);
                                                                                jPanel4.add(jLabel1);
                                                                                jPanel4.add(txtDireccion);
                                                                                
                                                                                JLabel lblId = new JLabel();
                                                                                lblId.setText("ID");
                                                                                lblId.setBounds(58, 18, 60, 21);
                                                                                jPanel4.add(lblId);
                                                                                
                                                                                txtIDC = new JTextField();
                                                                                txtIDC.setBounds(130, 13, 310, 30);
                                                                                jPanel4.add(txtIDC);
                                                                                
                                                                                JLabel lblEstado = new JLabel();
                                                                                lblEstado.setText("Estado");
                                                                                lblEstado.setBounds(58, 189, 50, 21);
                                                                                jPanel4.add(lblEstado);
                                                                                
                                                                                txtEstado = new JTextField();
                                                                                txtEstado.setName("txtRUC");
                                                                                txtEstado.setBounds(130, 188, 310, 30);
                                                                                jPanel4.add(txtEstado);
                                                                                
                                                                                txtCta = new JTextField();
                                                                                txtCta.setName("txtRUC");
                                                                                txtCta.setBounds(130, 281, 310, 30);
                                                                                jPanel4.add(txtCta);
                                                                                
                                                                                JLabel lblCuentaCorriente = new JLabel();
                                                                                lblCuentaCorriente.setText("Cuenta Corriente");
                                                                                lblCuentaCorriente.setBounds(12, 286, 116, 21);
                                                                                jPanel4.add(lblCuentaCorriente);
        jPanel3.add(jTextField1);
        jTextField1.setBounds(230, 10, 250, 30);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "(Elija el criterio)", "Nombre", "Apellidos", "DNI", "RUC" }));
        jComboBox1.setAutoscrolls(true);
        jPanel3.add(jComboBox1);
        jComboBox1.setBounds(100, 10, 120, 30);

        jTabbedPane1.addTab("Búsqueda", jPanel3);
        btnRegistrar = new javax.swing.JButton();
        
                btnRegistrar.setText("Registrar");
                btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        btnRegistrarActionPerformed(evt);
                    }
                });
                btnRegistrar.addKeyListener(new java.awt.event.KeyAdapter() {
                    public void keyPressed(java.awt.event.KeyEvent evt) {
                        btnRegistrarKeyPressed(evt);
                    }
                });
        btnLimpiar = new javax.swing.JButton();
        
                btnLimpiar.setText("Limpiar");
                btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        btnLimpiarActionPerformed(evt);
                    }
                });
        jButton2 = new javax.swing.JButton();
        
                jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/buscar.gif"))); // NOI18N
                jButton2.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        jButton2ActionPerformed(evt);
                    }
                });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(Alignment.LEADING, layout.createSequentialGroup()
        			.addGap(49)
        			.addComponent(btnRegistrar, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)
        			.addGap(18)
        			.addComponent(btnLimpiar, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
        			.addGap(18)
        			.addComponent(jButton2, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.RELATED, 280, Short.MAX_VALUE)
        			.addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 213, GroupLayout.PREFERRED_SIZE)
        			.addGap(36))
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap(675, Short.MAX_VALUE)
        			.addComponent(btnSalir, GroupLayout.PREFERRED_SIZE, 73, GroupLayout.PREFERRED_SIZE)
        			.addGap(96))
        		.addGroup(layout.createSequentialGroup()
        			.addGap(27)
        			.addComponent(jTabbedPane1, GroupLayout.PREFERRED_SIZE, 787, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap(30, Short.MAX_VALUE))
        		.addGroup(layout.createSequentialGroup()
        			.addGap(169)
        			.addComponent(lblTitulo, GroupLayout.DEFAULT_SIZE, 484, Short.MAX_VALUE)
        			.addGap(191))
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addGap(20)
        			.addComponent(lblTitulo)
        			.addGap(18)
        			.addComponent(jTabbedPane1, GroupLayout.PREFERRED_SIZE, 389, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        					.addComponent(btnRegistrar, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
        					.addComponent(btnLimpiar, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
        				.addGroup(layout.createSequentialGroup()
        					.addGap(5)
        					.addComponent(jButton1)
        					.addPreferredGap(ComponentPlacement.UNRELATED)
        					.addComponent(btnSalir))
        				.addComponent(jButton2, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE))
        			.addContainerGap(37, Short.MAX_VALUE))
        );
        getContentPane().setLayout(layout);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        try {
            //creamos un objeto dbBean
            dbBean aux = new dbBean();
            HashMap map = new HashMap();
            //Connection cn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=ST;user=sa;password=sasasa;");
            Connection cn = aux.getConnection();
            JasperReport jr= JasperCompileManager.compileReport("src/REPORTS/ClienteReporte.jrxml");
            map.put("idCliente",idClie);
            JasperPrint jp = JasperFillManager.fillReport(jr,null,cn);
            // JasperPrint jp= JasperFillManager.fillReport(jr,idClie,cn);

            JasperViewer jv= new JasperViewer(jp,false);
            jv.setVisible(true);
        } catch (Exception e) {
            System.out.println(e);
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtNombreKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyPressed
        if(evt.getKeyCode() == evt.VK_ENTER){
            this.getFocusOwner().transferFocus();
        }
    }//GEN-LAST:event_txtNombreKeyPressed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        limpiaControles();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void txtRUCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRUCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRUCActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed

        String proc = this.btnRegistrar.getText();
        int id = 0, est;
        String pr = "";
        if(valida()){
            util u = new util();
            Cliente p = new Cliente();
            p.setNombre(txtNombreC.getText());
            p.setTelefono(txtTelefono.getText());
            p.setDireccion(txtDireccion.getText());

            p.setRUC(txtRUC.getText());

            if(proc.equals("Registrar")){
               // id = u.idNext("Cliente", "idCliente");
                pr = "insert";
            }
            if(proc.equals("Actualizar")){
                id = idClie;
                pr = "update";
            }
            p.setIdCliente(id);
            _Clientebo.Create(p);
            limpiaControles();
            limpiaTabla();
            llenaTabla(false, "");
        }
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnRegistrarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnRegistrarKeyPressed

    }//GEN-LAST:event_btnRegistrarKeyPressed

    private void txtTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefonoActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int x ;
        x = Integer.parseInt(JOptionPane.showInputDialog(" Ingrese el codigo del Cliente"));
        try {
            //creamos un objeto dbBean
            dbBean aux = new dbBean();
            HashMap map = new HashMap();
            //Connection cn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=ST;user=sa;password=sasasa;");
            Connection cn = aux.getConnection();
            JasperReport jr= JasperCompileManager.compileReport("src/REPORTS/ClienteReporte.jrxml");
            map.put("idCliente",x);
            JasperPrint jp = JasperFillManager.fillReport(jr,map,cn);
            // JasperPrint jp= JasperFillManager.fillReport(jr,idClie,cn);

            JasperViewer jv= new JasperViewer(jp,false);
            jv.setVisible(true);
        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void tblClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblClienteMouseClicked
        if(evt.getClickCount() == 1){
            this.jTabbedPane1.setSelectedIndex(1);
            //llenaModifica();
        }
    }//GEN-LAST:event_tblClienteMouseClicked

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTable tblCliente;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtNombreC;
    private javax.swing.JTextField txtRUC;
    private javax.swing.JTextField txtTelefono;
    private JTextField txtIDC;
    private JTextField txtEstado;
    private JTextField txtCta;
}
