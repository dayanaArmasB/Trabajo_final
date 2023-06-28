/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package app.modconta.view;
import app.modconta.business.ClienteBO;
import app.modconta.entity.Cliente;
import java.util.List;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;

import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Cursor;


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
        llenaTabla();
        
        buttonGroup = new ButtonGroup();
        buttonGroup.add(jRadioButton1);
        buttonGroup.add(jRadioButton2);
        btnRegistrar = new javax.swing.JButton();
        btnRegistrar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        btnRegistrar.setFont(new Font("Tahoma", Font.PLAIN, 15));
        btnRegistrar.setBounds(606, 145, 90, 30);
        jPanelRegistro.add(btnRegistrar);
        
                btnRegistrar.setText("Registrar");
                btnLimpiar = new javax.swing.JButton();
                btnLimpiar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
                btnLimpiar.setFont(new Font("Tahoma", Font.PLAIN, 15));
                btnLimpiar.setBounds(606, 188, 90, 30);
                jPanelRegistro.add(btnLimpiar);
                
                        btnLimpiar.setText("Limpiar");
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
        getContentPane().add(jTabbedPaneGroupCliente);
        getContentPane().add(btnSalir);
    }



	private void initComponents() {
        lblTitulo = new javax.swing.JLabel();
        lblTitulo.setBounds(300, 24, 574, 29);
        btnSalir = new javax.swing.JButton();
        btnSalir.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        btnSalir.setFont(new Font("Tahoma", Font.PLAIN, 15));
        btnSalir.setBounds(1089, 572, 73, 25);
        jTabbedPaneGroupCliente = new javax.swing.JTabbedPane();
        jTabbedPaneGroupCliente.setFont(new Font("Tahoma", Font.PLAIN, 15));
        jTabbedPaneGroupCliente.setBounds(39, 66, 1123, 493);
        jTabbedPaneGroupCliente.setToolTipText("test");
        jPanelBusqueda = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCliente = new javax.swing.JTable();
        tblCliente.setFont(new Font("Tahoma", Font.PLAIN, 17));
        tblCliente.setModel(new DefaultTableModel(
        	new Object[][] {
        	},
        	new String[] {
        		"IDCliente", "Nombre", "Apellido Paterno", "Apellido Materno", "Estado", "Telefono", "Direccion", "Sexo", "DNI", "RUC"
        	}
        ));
        tblCliente.getColumnModel().getColumn(2).setPreferredWidth(110);
        tblCliente.getColumnModel().getColumn(3).setPreferredWidth(114);

        lblTitulo.setFont(new java.awt.Font("Tahoma", 1, 24));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("CLIENTES");

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        jPanelBusqueda.setLayout(null);
        tblCliente.setToolTipText("");
        tblCliente.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        tblCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblClienteMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblCliente);

        jPanelBusqueda.add(jScrollPane1);
        jScrollPane1.setBounds(20, 80, 1086, 352);
        jPanelRegistro = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel3.setFont(new Font("Tahoma", Font.BOLD, 15));
        jLabel3.setBounds(50, 20, 60, 21);
        jLabel4 = new javax.swing.JLabel();
        jLabel4.setFont(new Font("Tahoma", Font.BOLD, 15));
        jLabel4.setBounds(16, 54, 138, 21);
        txtNombre = new javax.swing.JTextField();
        txtNombre.setFont(new Font("Tahoma", Font.PLAIN, 15));
        txtNombre.setBounds(130, 10, 310, 30);
        jLabel5 = new javax.swing.JLabel();
        jLabel5.setFont(new Font("Tahoma", Font.BOLD, 15));
        jLabel5.setBounds(58, 279, 60, 20);
        txtRUC = new javax.swing.JTextField();
        txtRUC.setFont(new Font("Tahoma", Font.PLAIN, 15));
        txtRUC.setBounds(130, 317, 310, 30);
        jLabel6 = new javax.swing.JLabel();
        jLabel6.setFont(new Font("Tahoma", Font.BOLD, 15));
        jLabel6.setBounds(40, 235, 70, 21);
        txtTelefono = new javax.swing.JTextField();
        txtTelefono.setFont(new Font("Tahoma", Font.PLAIN, 15));
        txtTelefono.setBounds(130, 231, 310, 30);
        txtDNI = new javax.swing.JTextField();
        txtDNI.setFont(new Font("Tahoma", Font.PLAIN, 15));
        txtDNI.setBounds(130, 274, 310, 30);
        jLabel7 = new javax.swing.JLabel();
        jLabel7.setFont(new Font("Tahoma", Font.BOLD, 15));
        jLabel7.setBounds(59, 322, 51, 21);
        jLabel1 = new javax.swing.JLabel();
        jLabel1.setFont(new Font("Tahoma", Font.BOLD, 15));
        jLabel1.setBounds(40, 193, 90, 20);
        jPanelrbtn = new javax.swing.JPanel();
        jPanelrbtn.setBounds(131, 135, 266, 40);
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton1.setFont(new Font("Tahoma", Font.PLAIN, 15));
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton2.setFont(new Font("Tahoma", Font.PLAIN, 15));
        txtDireccion = new javax.swing.JTextField();
        txtDireccion.setFont(new Font("Tahoma", Font.PLAIN, 15));
        txtDireccion.setBounds(130, 188, 310, 30);
        jLabel8 = new javax.swing.JLabel();
        jLabel8.setFont(new Font("Tahoma", Font.BOLD, 15));
        jLabel8.setBounds(50, 150, 40, 21);
        
jPanelRegistro.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
                
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
                                                        
txtRUC.setName("txtRUC");
 txtRUC.addActionListener(new java.awt.event.ActionListener() {
  public void actionPerformed(java.awt.event.ActionEvent evt) {
txtRUCActionPerformed(evt);
 }
});
                                                                
jLabel6.setText("Tel\u00E9fono");
                                                                        
txtTelefono.setName("txtDireccion"); 
 txtTelefono.addActionListener(new java.awt.event.ActionListener() {
public void actionPerformed(java.awt.event.ActionEvent evt) {
txtTelefonoActionPerformed(evt);
 }
});
                                                                                
txtDNI.setName("txtDireccion"); 
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
                                                                                                                                                        
   jTabbedPaneGroupCliente.addTab("Registrar", jPanelRegistro);
                                                                                                                                                                
 lblApellidoMaterno = new JLabel();
 lblApellidoMaterno.setFont(new Font("Tahoma", Font.BOLD, 15));
 lblApellidoMaterno.setBounds(16, 97, 138, 21);
 lblApellidoMaterno.setText("Apellido Materno");
                                                                                                                                                                
 txtApellidoM = new JTextField();
 txtApellidoM.setFont(new Font("Tahoma", Font.PLAIN, 15));
txtApellidoM.setBounds(155, 92, 189, 30);
jPanelRegistro.setLayout(null);
  jPanelRegistro.add(jLabel3);
  jPanelRegistro.add(jLabel4);
  jPanelRegistro.add(txtNombre);
 jPanelRegistro.add(jLabel5);
  jPanelRegistro.add(txtRUC);
  jPanelRegistro.add(jLabel6);
   jPanelRegistro.add(txtTelefono);
 jPanelRegistro.add(txtDNI);
 jPanelRegistro.add(jLabel7);
  jPanelRegistro.add(jLabel1);
 jPanelRegistro.add(jPanelrbtn);
  jPanelRegistro.add(txtDireccion);
 jPanelRegistro.add(jLabel8);
  jPanelRegistro.add(lblApellidoMaterno);
 jPanelRegistro.add(txtApellidoM);
txtApellidoP = new JTextField();
txtApellidoP.setFont(new Font("Tahoma", Font.PLAIN, 15));
txtApellidoP.setBounds(155, 50, 189, 30);
jPanelRegistro.add(txtApellidoP);

        jTabbedPaneGroupCliente.addTab("Búsqueda", jPanelBusqueda);
        
        btnEliminar = new JButton("Eliminar Registro");
        btnEliminar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        btnEliminar.setFont(new Font("Tahoma", Font.PLAIN, 15));
        btnEliminar.setBounds(424, 31, 159, 25);
        jPanelBusqueda.add(btnEliminar);
        btnBuscar = new javax.swing.JButton();
        btnBuscar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        btnBuscar.setFont(new Font("Tahoma", Font.PLAIN, 15));
        btnBuscar.setBounds(595, 24, 60, 43);
        jPanelBusqueda.add(btnBuscar);
        
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

    }
    

    

    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanelBusqueda;
    private javax.swing.JPanel jPanelRegistro;
    private javax.swing.JPanel jPanelrbtn;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPaneGroupCliente;
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
    private JButton btnEliminar;
    
   

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnEliminar) {
			do_btnEliminar_actionPerformed(e);
		}
	}
	protected void do_btnEliminar_actionPerformed(ActionEvent e) {
		 try{
			 int id= Integer.parseInt(String.valueOf(_DefaultTableModel.getValueAt(tblCliente.getSelectedRow(),0)));
				_Clientebo.Delete(id);
				 limpiaTabla();
		         llenaTabla();
		         JOptionPane.showMessageDialog(this, "Se eliminó el registro con éxito");
		 }
		 catch(Exception e1){
			 System.out.println(e1);
		 }
		
	}
	private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
		int x ;
	    x = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el código del Cliente"));
	    try {
	        Cliente cliente = _Clientebo.Find(x);
	        if (cliente != null) {
	            JOptionPane.showMessageDialog(this, "Se encontró el registro con éxito");
	        } else {
	            JOptionPane.showMessageDialog(this, "No existe el código ingresado");
	        }
	    } catch (Exception e) {
	        e.printStackTrace();
	        JOptionPane.showMessageDialog(this, "Ocurrió un error al buscar el registro");
	    }
		
		
    }
	
    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {
        limpiaControles();
    }
	
	private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {

        int id = 0;
        if(valida()){
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
            p.setIdCliente(id);
            _Clientebo.Create(p);
            limpiaControles();
            limpiaTabla();
            llenaTabla();
            JOptionPane.showMessageDialog(this, "Se registró con éxito");
        }
    }
	
	public boolean valida(){
        boolean sw = false;
        String dni = txtDNI.getText();
        String ruc = txtRUC.getText();
        String telf = txtTelefono.getText();
        if (txtNombre.getText().equals("")) {
        	JOptionPane.showMessageDialog(this, "Ingrese Nombres");
        	return sw;
		}
        if(txtApellidoP.getText().equals("")){
        	JOptionPane.showMessageDialog(this, "Debe ingresar Apellido Paterno");
         	return sw;
        }

        if(txtApellidoM.getText().equals("")){
        	JOptionPane.showMessageDialog(this, "Debe ingresar Apellido Materno ");
        	return sw;
        }
        if(txtDireccion.getText().equals("")){
        	JOptionPane.showMessageDialog(this, "Debe ingresar Dirección");
        	return sw;
        }
        if(txtTelefono.getText().equals("")){
        	JOptionPane.showMessageDialog(this, "Debe ingresar Teléfono");
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
        // "\\d+" es una expresion regular que significa un digito o mas 
        if (dni.length() != 8 || !dni.matches("\\d+")
        	    || ruc.length() != 11 || !ruc.matches("\\d+")
        	    || telf.length() != 9 || !telf.matches("\\d+")) {

        	    if (dni.length() != 8) {
        	        JOptionPane.showMessageDialog(this, "El campo DNI debe contener 8 dígitos");
        	    }
        	    if (!dni.matches("\\d+")) {
        	        JOptionPane.showMessageDialog(this, "El campo DNI solo debe contener números");
        	    }
        	    if (ruc.length() != 11) {
        	        JOptionPane.showMessageDialog(this, "El campo RUC debe contener 11 dígitos");
        	    }
        	    if (!ruc.matches("\\d+")) {
        	        JOptionPane.showMessageDialog(this, "El campo RUC solo debe contener números");
        	    }
        	    if (telf.length() != 9) {
        	        JOptionPane.showMessageDialog(this, "El campo Teléfono debe contener 9 dígitos");
        	    }
        	    if (!telf.matches("\\d+")) {
        	        JOptionPane.showMessageDialog(this, "El campo Teléfono solo debe contener números");
        	    }
        	    
        	    return sw;
        	}

        
        return sw = true;
    }
	
    public void limpiaControles(){
        txtNombre.setText("");
        txtApellidoP.setText("");
        txtApellidoM.setText("");
        txtTelefono.setText("");
        txtDNI.setText("");
        txtDireccion.setText("");
        txtRUC.setText("");
        buttonGroup.clearSelection();
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
    
    public void llenaTabla()
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
}
