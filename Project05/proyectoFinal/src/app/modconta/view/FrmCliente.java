/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package app.modconta.view;
import app.modconta.business.ClienteBO;
import app.modconta.databaase.dbBean;
import app.modconta.databaase.util;
import app.modconta.entity.Cliente;
import java.sql.Connection;
import java.util.List;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ButtonGroup;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class FrmCliente extends javax.swing.JInternalFrame implements ActionListener {
	ClienteBO _Clientebo;
    DefaultTableModel _DefaultTableModel;
    boolean sw = false;
    String cad = "";
    int idClie; 
    ButtonGroup buttonGroup;

    public FrmCliente() {
    	setMaximizable(true);
    	setIconifiable(true);
    	setTitle("CLIENTES");
        initComponents();
        _Clientebo = new ClienteBO();
        _DefaultTableModel = (DefaultTableModel)tblCliente.getModel();
        llenaTabla(false, "");
        
        buttonGroup = new ButtonGroup();
        buttonGroup.add(jRadioButton1);
        buttonGroup.add(jRadioButton2);
        btnRegistrar = new javax.swing.JButton();
        btnRegistrar.setBounds(606, 92, 90, 30);
        jPanel4.add(btnRegistrar);
        
                btnRegistrar.setText("Registrar");
                btnLimpiar = new javax.swing.JButton();
                btnLimpiar.setBounds(606, 135, 90, 30);
                jPanel4.add(btnLimpiar);
                
                        btnLimpiar.setText("Limpiar");
                        
                        btnActualizar = new JButton("Actualizar");
                        btnActualizar.setBounds(606, 176, 90, 30);
                        jPanel4.add(btnActualizar);
                        btnActualizar.addActionListener(this);
                        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
                            public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnLimpiarActionPerformed(evt);
                            }
                        });
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
        getContentPane().setLayout(null);
        getContentPane().add(lblTitulo);
        getContentPane().add(jTabbedPane1);
        getContentPane().add(btnSalir);
    }



    private void initComponents() {
        lblTitulo = new javax.swing.JLabel();
        lblTitulo.setBounds(143, 20, 574, 29);
        btnSalir = new javax.swing.JButton();
        btnSalir.setBounds(804, 490, 73, 25);
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jTabbedPane1.setBounds(41, 68, 798, 411);
        jTabbedPane1.setToolTipText("test");
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCliente = new javax.swing.JTable();
        tblCliente.setModel(new DefaultTableModel(
        	new Object[][] {
        	},
        	new String[] {
        		"IDCliente", "Nombre", "Apellido Paterno", "Apellido Materno", "Estado", "Telefono", "Direccion", "Sexo", "DNI", "RUC"
        	}
        ));
        tblCliente.getColumnModel().getColumn(2).setPreferredWidth(110);
        tblCliente.getColumnModel().getColumn(3).setPreferredWidth(114);
        jTextField1 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();

        lblTitulo.setFont(new java.awt.Font("Tahoma", 1, 24));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("CLIENTES");

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

        jTextField1.setName("txtBusqueda");
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
        txtRUC = new javax.swing.JTextField();
        txtRUC.setBounds(130, 317, 310, 30);
        jLabel6 = new javax.swing.JLabel();
        jLabel6.setBounds(50, 236, 50, 21);
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
  jPanel4.add(txtRUC);
  jPanel4.add(jLabel6);
   jPanel4.add(txtTelefono);
 jPanel4.add(txtDNI);
 jPanel4.add(jLabel7);
  jPanel4.add(jLabel1);
 jPanel4.add(jPanelrbtn);
  jPanel4.add(txtDireccion);
 jPanel4.add(jLabel8);
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

        jTabbedPane1.addTab("Búsqueda", jPanel3);
        
        btnEliminar = new JButton("Eliminar Registro");
        btnEliminar.setBounds(554, 13, 111, 25);
        jPanel3.add(btnEliminar);
        btnBuscar = new javax.swing.JButton();
        btnBuscar.setBounds(688, 10, 60, 30);
        jPanel3.add(btnBuscar);
        
                btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/buscar.gif"))); // NOI18N
                btnBuscar.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        jButton2ActionPerformed(evt);
                    }
                });
        btnEliminar.addActionListener(this);

        pack();
    }

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {
        dispose();
    }

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {
      
    }

    private void txtNombreKeyPressed(java.awt.event.KeyEvent evt) {
        if(evt.getKeyCode() == evt.VK_ENTER){
            this.getFocusOwner().transferFocus();
        }
    }

    

    private void txtRUCActionPerformed(java.awt.event.ActionEvent evt) {
        
    }


    private void btnRegistrarKeyPressed(java.awt.event.KeyEvent evt) {

    }

    private void txtTelefonoActionPerformed(java.awt.event.ActionEvent evt) {
        
    }

    private void txtDNIActionPerformed(java.awt.event.ActionEvent evt) {
        
    }

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {
       
    }

    

    private void tblClienteMouseClicked(java.awt.event.MouseEvent evt) {
        if(evt.getClickCount() == 1){
            this.jTabbedPane1.setSelectedIndex(1);
            //llenaModifica();
        }
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
            vect.addElement(Clientes.get(j).getEstado());
            vect.addElement(Clientes.get(j).getTelefono());
            vect.addElement(Clientes.get(j).getDireccion());
            vect.addElement(Clientes.get(j).getSexo());
            vect.addElement(Clientes.get(j).getDNI());
            vect.addElement(Clientes.get(j).getRUC());
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
        DefaultTableModel dm = (DefaultTableModel)tblCliente.getModel();
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
        	return sw;
        }
        if(txtTelefono.getText().equals("")){
        	JOptionPane.showMessageDialog(this, "Debe ingresar telefono");
        	return sw;
        }
        if(txtDNI.getText().equals("")){
        	JOptionPane.showMessageDialog(this, "Debe ingresar DNI");
        	return sw;
        }
        if(txtRUC.getText().equals("")){
        	JOptionPane.showMessageDialog(this, "Debe ingresar RUC");
        	return sw;
        }
        if(buttonGroup.getSelection()== null){
        	JOptionPane.showMessageDialog(this, "Debe seleccionar un sexo");
        	return sw;
        }
        
        return sw = true;
    }
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
        int x ;
        x = Integer.parseInt(JOptionPane.showInputDialog(" Ingrese el codigo del Cliente"));
        try {
           
        	_Clientebo.Find(x);
            JOptionPane.showMessageDialog(this, "Se encontró el resgistro con exito");
            
        } catch (Exception e) {
        	JOptionPane.showMessageDialog(this, "error ");
        }
        
        
        /*creamos un objeto dbBean
        dbBean aux = new dbBean();
        HashMap map = new HashMap();
        //Connection cn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=ST;user=sa;password=sasasa;");
        Connection cn = aux.getConnection();
        JasperReport jr= JasperCompileManager.compileReport("src/REPORTS/ClienteReporte.jrxml");
        map.put("idCliente",x);
        JasperPrint jp = JasperFillManager.fillReport(jr,map,cn);
        // JasperPrint jp= JasperFillManager.fillReport(jr,idClie,cn);

        JasperViewer jv= new JasperViewer(jp,false);
        jv.setVisible(true);*/
    }
    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {
        limpiaControles();
    }
    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {

        String proc = btnRegistrar.getText();
        int id = 0;
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
    }

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {
        
    }

    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnBuscar;
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
    private JButton btnActualizar;
    private JButton btnEliminar;
    
   

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnEliminar) {
			do_btnEliminar_actionPerformed(e);
		}
		if (e.getSource() == btnActualizar) {
			do_btnActualizar_actionPerformed(e);
		}
	}
	protected void do_btnActualizar_actionPerformed(ActionEvent e) {
        
		String nombre = String.valueOf(_DefaultTableModel.getValueAt(tblCliente.getSelectedRow(),1));
		Cliente p = new Cliente();
		p.setNombre(nombre.toString());
        _Clientebo.Update(p);
        limpiaTabla();
        llenaTabla(false, "");
        JOptionPane.showMessageDialog(this, "Se actuaizó el resgistro con exito");
        
	}
	protected void do_btnEliminar_actionPerformed(ActionEvent e) {
		
		 try{
			 int id= Integer.parseInt(String.valueOf(_DefaultTableModel.getValueAt(tblCliente.getSelectedRow(),0)));
				_Clientebo.Delete(id);
				 limpiaTabla();
		         llenaTabla(false, "");
		         JOptionPane.showMessageDialog(this, "Se elimnó el resgistro con exito");
		 }
		 catch(Exception e1){
			 System.out.println(e1);
		 }
		
	}
}
