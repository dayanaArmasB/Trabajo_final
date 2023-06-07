/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package app.modconta.view;
import MODEL.ClienteDAO;
import app.modconta.databaase.dbBean;
import app.modconta.databaase.util;
import app.modconta.entity.Cliente;
import java.sql.Connection;
import java.util.HashMap;
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

public class FrmCliente extends javax.swing.JInternalFrame {
    ClienteDAO ClienteDAO;
    DefaultTableModel _DefaultTableModel;
    boolean sw = false;
    String cad = "";
    int idClie; 
    ButtonGroup buttonGroup;
    /**
     * Creates new form FrmCliente
     */
    public FrmCliente() {
        initComponents();
         ClienteDAO = new ClienteDAO();
        _DefaultTableModel = (DefaultTableModel)tblCliente.getModel();
        llenaTabla(false, "");
        
        buttonGroup = new ButtonGroup();
        buttonGroup.add(this.jRadioButton1);
        buttonGroup.add(this.jRadioButton2);
    }
public void llenaTabla(boolean swr, String cadr)
    {
        Vector<Cliente> ClientesCollection = ClienteDAO.ListaItem(swr, cadr);
        int i = ClientesCollection.size(); 
        for(int j = 0; j<i;j++){
            Vector vect = new Vector();
            vect.addElement(ClientesCollection.get(j).getIdCliente());
            vect.addElement(ClientesCollection.get(j).getNombre());
            vect.addElement(ClientesCollection.get(j).getApellidoP());
            vect.addElement(ClientesCollection.get(j).getApellidoM());
            vect.addElement(ClientesCollection.get(j).getTelefono());
            vect.addElement(ClientesCollection.get(j).getDireccion());
            vect.addElement(ClientesCollection.get(j).getSexo());
            vect.addElement(ClientesCollection.get(j).getDNI());
            vect.addElement(ClientesCollection.get(j).getRUC());
            _DefaultTableModel.addRow(vect);
        }
        
    }     
       public void limpiaControles(){
        txtNombre.setText("");
        txtApellidoP.setText("");
        txtApellidoM.setText("");
        txtTelefono.setText("");
        txtDNI.setText("");
        txtDireccion.setText("");
        txtRUC.setText("");
        btnRegistrar.setText("Registrar");
        txtNombre.requestFocus();
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
        if (txtNombre.getText().equals("")) {
        	JOptionPane.showMessageDialog(this, "Ingrese Nombres");
        	return sw;
		}
        if(txtApellidoP.getText().equals("")){
        	JOptionPane.showMessageDialog(this, "Debe ingresar apellido paterno");
         	return sw;
        }

        if(txtApellidoM.getText().equals("")){
        	JOptionPane.showMessageDialog(this, "Debe ingresar apellido Materno ");
        	return sw;
        }
        if(txtDireccion.getText().equals("")){
        	JOptionPane.showMessageDialog(this, "Debe ingresar direccion");
        }
        if(txtTelefono.getText().equals("")){
        	JOptionPane.showMessageDialog(this, "Debe ingresar telefono");
        }
        if(txtDNI.getText().equals("")){
        	JOptionPane.showMessageDialog(this, "Debe ingresar DNI");
        }
        if(txtRUC.getText().equals("")){
        	JOptionPane.showMessageDialog(this, "Debe ingresar RUC");
        }
        if(buttonGroup.getSelection()== null){
        	JOptionPane.showMessageDialog(this, "Debe seleccionar un sexo");
        }
        
        
        
        
        return sw = true;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
   
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
        		"IDCliente", "Nombre", "Apellido Paterno", "Apellido Materno", "Telefono", "Direcci\u00F3n", "Sexo", "DNI", "RUC"
        	}
        ));
        tblCliente.getColumnModel().getColumn(2).setPreferredWidth(110);
        tblCliente.getColumnModel().getColumn(3).setPreferredWidth(114);
        jTextField1 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();

        jButton1.setText("Generar Reporte Clientes");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        lblTitulo.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("CLIENTE");

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
        jLabel3.setBounds(50, 20, 60, 21);
        jLabel4 = new javax.swing.JLabel();
        jLabel4.setBounds(16, 54, 102, 21);
        txtNombre = new javax.swing.JTextField();
        txtNombre.setBounds(130, 10, 310, 30);
        jLabel5 = new javax.swing.JLabel();
        jLabel5.setBounds(58, 279, 60, 20);
        btnLimpiar = new javax.swing.JButton();
        btnLimpiar.setBounds(535, 188, 80, 30);
        txtRUC = new javax.swing.JTextField();
        txtRUC.setBounds(130, 317, 310, 30);
        jLabel6 = new javax.swing.JLabel();
        jLabel6.setBounds(50, 236, 50, 21);
        btnRegistrar = new javax.swing.JButton();
        btnRegistrar.setBounds(525, 145, 90, 30);
        txtTelefono = new javax.swing.JTextField();
        txtTelefono.setBounds(130, 231, 310, 30);
        txtDNI = new javax.swing.JTextField();
        txtDNI.setBounds(130, 274, 310, 30);
        jLabel7 = new javax.swing.JLabel();
        jLabel7.setBounds(59, 322, 30, 21);
        jLabel1 = new javax.swing.JLabel();
        jLabel1.setBounds(40, 193, 70, 20);
        jPanelrbtn = new javax.swing.JPanel();
        jPanelrbtn.setBounds(131, 135, 266, 40);
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        txtDireccion = new javax.swing.JTextField();
        txtDireccion.setBounds(130, 188, 310, 30);
        jLabel8 = new javax.swing.JLabel();
        jLabel8.setBounds(50, 150, 40, 21);
        jButton2 = new javax.swing.JButton();
        jButton2.setBounds(545, 236, 60, 32);
        
                jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
                
                        jLabel3.setText("Nombre");
                        
                                jLabel4.setText("Apellido Paterno");
                                
                                        txtNombre.addActionListener(new java.awt.event.ActionListener() {
                                            public void actionPerformed(java.awt.event.ActionEvent evt) {
                                                txtNombreActionPerformed(evt);
                                            }
                                        });
                                        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
                                            public void keyPressed(java.awt.event.KeyEvent evt) {
                                                txtNombreKeyPressed(evt);
                                            }
                                        });
                                        
                                                jLabel5.setText("DNI");
                                                
                                                        btnLimpiar.setText("Limpiar");
                                                        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
                                                            public void actionPerformed(java.awt.event.ActionEvent evt) {
                                                                btnLimpiarActionPerformed(evt);
                                                            }
                                                        });
                                                        
                                                                txtRUC.setName("txtRUC"); // NOI18N
                                                                txtRUC.addActionListener(new java.awt.event.ActionListener() {
                                                                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                                                                        txtRUCActionPerformed(evt);
                                                                    }
                                                                });
                                                                
                                                                        jLabel6.setText("Telefono");
                                                                        
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
                                                                                
                                                                                        txtTelefono.setName("txtDireccion"); // NOI18N
                                                                                        txtTelefono.addActionListener(new java.awt.event.ActionListener() {
                                                                                            public void actionPerformed(java.awt.event.ActionEvent evt) {
                                                                                                txtTelefonoActionPerformed(evt);
                                                                                            }
                                                                                        });
                                                                                        
                                                                                                txtDNI.setName("txtDireccion"); // NOI18N
                                                                                                txtDNI.addActionListener(new java.awt.event.ActionListener() {
                                                                                                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                                                                                                        txtDNIActionPerformed(evt);
                                                                                                    }
                                                                                                });
                                                                                                
                                                                                                        jLabel7.setText("RUC");
                                                                                                        
                                                                                                                jLabel1.setText("Direcci\u00F3n");
                                                                                                                
                                                                                                                        jPanelrbtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
                                                                                                                        
                                                                                                                                jRadioButton1.setText("Masculino");
                                                                                                                                
                                                                                                                                        jRadioButton2.setText("Femenino");
                                                                                                                                        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
                                                                                                                                            public void actionPerformed(java.awt.event.ActionEvent evt) {
                                                                                                                                                jRadioButton2ActionPerformed(evt);
                                                                                                                                            }
                                                                                                                                        });
                                                                                                                                        
                                                                                                                                                javax.swing.GroupLayout jPanelrbtnLayout = new javax.swing.GroupLayout(jPanelrbtn);
                                                                                                                                                jPanelrbtn.setLayout(jPanelrbtnLayout);
                                                                                                                                                jPanelrbtnLayout.setHorizontalGroup(
                                                                                                                                                    jPanelrbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                                                    .addGroup(jPanelrbtnLayout.createSequentialGroup()
                                                                                                                                                        .addGap(22, 22, 22)
                                                                                                                                                        .addComponent(jRadioButton1)
                                                                                                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                                                                                                                                                        .addComponent(jRadioButton2)
                                                                                                                                                        .addGap(32, 32, 32))
                                                                                                                                                );
                                                                                                                                                jPanelrbtnLayout.setVerticalGroup(
                                                                                                                                                    jPanelrbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelrbtnLayout.createSequentialGroup()
                                                                                                                                                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                                                                                        .addGroup(jPanelrbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                                                                                            .addComponent(jRadioButton1)
                                                                                                                                                            .addComponent(jRadioButton2))
                                                                                                                                                        .addContainerGap())
                                                                                                                                                );
                                                                                                                                                
                                                                                                                                                        jLabel8.setText("Sexo");
                                                                                                                                                        
                                                                                                                                                                jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/buscar.gif"))); // NOI18N
                                                                                                                                                                jButton2.addActionListener(new java.awt.event.ActionListener() {
                                                                                                                                                                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                                                                                                                                                                        jButton2ActionPerformed(evt);
                                                                                                                                                                    }
                                                                                                                                                                });
                                                                                                                                                                
                                                                                                                                                                        jTabbedPane1.addTab("Registrar", jPanel4);
                                                                                                                                                                        
                                                                                                                                                                        lblApellidoMaterno = new JLabel();
                                                                                                                                                                        lblApellidoMaterno.setBounds(16, 97, 102, 21);
                                                                                                                                                                        lblApellidoMaterno.setText("Apellido Materno");
                                                                                                                                                                        
                                                                                                                                                                        txtApellidoM = new JTextField();
                                                                                                                                                                        txtApellidoM.setBounds(130, 92, 189, 30);
                                                                                                                                                                        jPanel4.setLayout(null);
                                                                                                                                                                        jPanel4.add(jLabel3);
                                                                                                                                                                        jPanel4.add(jLabel4);
                                                                                                                                                                        jPanel4.add(txtNombre);
                                                                                                                                                                        jPanel4.add(jLabel5);
                                                                                                                                                                        jPanel4.add(btnLimpiar);
                                                                                                                                                                        jPanel4.add(txtRUC);
                                                                                                                                                                        jPanel4.add(jLabel6);
                                                                                                                                                                        jPanel4.add(btnRegistrar);
                                                                                                                                                                        jPanel4.add(txtTelefono);
                                                                                                                                                                        jPanel4.add(txtDNI);
                                                                                                                                                                        jPanel4.add(jLabel7);
                                                                                                                                                                        jPanel4.add(jLabel1);
                                                                                                                                                                        jPanel4.add(jPanelrbtn);
                                                                                                                                                                        jPanel4.add(txtDireccion);
                                                                                                                                                                        jPanel4.add(jLabel8);
                                                                                                                                                                        jPanel4.add(jButton2);
                                                                                                                                                                        jPanel4.add(lblApellidoMaterno);
                                                                                                                                                                        jPanel4.add(txtApellidoM);
                                                                                                                                                                        
                                                                                                                                                                        txtApellidoP = new JTextField();
                                                                                                                                                                        txtApellidoP.setBounds(130, 53, 189, 30);
                                                                                                                                                                        jPanel4.add(txtApellidoP);
        jPanel3.add(jTextField1);
        jTextField1.setBounds(230, 10, 250, 30);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "(Elija el criterio)", "Nombre", "Apellidos", "DNI", "RUC" }));
        jComboBox1.setAutoscrolls(true);
        jPanel3.add(jComboBox1);
        jComboBox1.setBounds(100, 10, 120, 30);

        jTabbedPane1.addTab("B�squeda", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addGap(191)
        			.addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 196, GroupLayout.PREFERRED_SIZE)
        			.addGap(18)
        			.addComponent(btnSalir, GroupLayout.PREFERRED_SIZE, 73, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap(412, Short.MAX_VALUE))
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap()
        			.addComponent(jTabbedPane1, GroupLayout.PREFERRED_SIZE, 781, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap())
        		.addGroup(layout.createSequentialGroup()
        			.addGap(67)
        			.addComponent(lblTitulo, GroupLayout.DEFAULT_SIZE, 687, Short.MAX_VALUE)
        			.addGap(136))
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addGap(22)
        			.addComponent(lblTitulo)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(jTabbedPane1, GroupLayout.PREFERRED_SIZE, 411, GroupLayout.PREFERRED_SIZE)
        			.addGap(27)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(btnSalir, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE))
        			.addContainerGap(23, Short.MAX_VALUE))
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
            p.setNombre(txtNombre.getText());
            p.setApellidoP(txtApellidoP.getText());
            p.setApellidoM(txtApellidoM.getText());
            p.setTelefono(txtTelefono.getText());
            p.setDireccion(txtDireccion.getText());
            if(jRadioButton1.isSelected())
            p.setSexo(jRadioButton1.getText());
            if(jRadioButton2.isSelected())
            p.setSexo(jRadioButton2.getText());
            p.setDNI(txtDNI.getText());
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
            ClienteDAO.procesaItem(p, pr);
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

    private void txtDNIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDNIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDNIActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton2ActionPerformed

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
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanelrbtn;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTable tblCliente;
    private javax.swing.JTextField txtDNI;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtRUC;
    private javax.swing.JTextField txtTelefono;
    private JLabel lblApellidoMaterno;
    private JTextField txtApellidoM;
    private JTextField txtApellidoP;
}
