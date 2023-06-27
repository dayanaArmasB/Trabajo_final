/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package app.modconta.view;
import app.modconta.business.ProveedorBO;
import app.modconta.entity.Producto;
import app.modconta.entity.Proveedor;
import java.awt.event.ActionListener;
import java.util.List;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.LayoutStyle.ComponentPlacement;

public class FrmProveedor extends javax.swing.JInternalFrame implements ActionListener {
	ProveedorBO _Proveedorbo;
    DefaultTableModel _DefaultTableModel;
    boolean sw = false;
    String cad = "";
    int idProve; 

    public FrmProveedor() {
    	setIconifiable(true);
    	setMaximizable(true);
    	setTitle("PROVEEDORES");
        initComponents();
        _Proveedorbo = new ProveedorBO();
        _DefaultTableModel = (DefaultTableModel)tblProveedor.getModel();
        llenaTabla();
        
    }


    private void initComponents() {
        lblTitulo = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();
        btnSalir.setFont(new Font("Tahoma", Font.PLAIN, 15));
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jTabbedPane1.setFont(new Font("Tahoma", Font.PLAIN, 15));
        jTabbedPane1.setToolTipText("test");
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProveedor = new javax.swing.JTable();
        tblProveedor.setModel(new DefaultTableModel(
        	new Object[][] {
        	},
        	new String[] {
        		"ID", "Nombre", "Direccion", "Telefono", "Estado", "RUC", "Cuenta Corriente"
        	}
        ));
        tblProveedor.getColumnModel().getColumn(4).setResizable(false);
        tblProveedor.getColumnModel().getColumn(6).setPreferredWidth(121);

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
        tblProveedor.setToolTipText("");
        tblProveedor.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tblProveedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblClienteMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblProveedor);

        jPanel3.add(jScrollPane1);
        jScrollPane1.setBounds(20, 80, 905, 328);
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel3.setFont(new Font("Tahoma", Font.BOLD, 15));
        jLabel3.setBounds(120, 27, 60, 21);
        txtNombre = new javax.swing.JTextField();
        txtNombre.setBounds(285, 23, 310, 30);
        txtRUC = new javax.swing.JTextField();
        txtRUC.setBounds(285, 248, 310, 30);
        jLabel6 = new javax.swing.JLabel();
        jLabel6.setFont(new Font("Tahoma", Font.BOLD, 15));
        jLabel6.setBounds(124, 174, 80, 21);
        txtTelefono = new javax.swing.JTextField();
        txtTelefono.setBounds(285, 170, 310, 30);
        jLabel7 = new javax.swing.JLabel();
        jLabel7.setFont(new Font("Tahoma", Font.BOLD, 15));
        jLabel7.setBounds(140, 252, 60, 21);
        jLabel1 = new javax.swing.JLabel();
        jLabel1.setFont(new Font("Tahoma", Font.BOLD, 15));
        jLabel1.setBounds(112, 102, 92, 20);
        txtDireccion = new javax.swing.JTextField();
        txtDireccion.setBounds(285, 98, 310, 30);
        
                jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
                
                        jLabel3.setText("Nombre");
                        
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
                                
                                        txtRUC.setName("txtRUC"); 
                                        txtRUC.addActionListener(new java.awt.event.ActionListener() {
                                            public void actionPerformed(java.awt.event.ActionEvent evt) {
                                                txtRUCActionPerformed(evt);
                                            }
                                        });
                                        
                                                jLabel6.setText("Telefono");
                                                
                                                        txtTelefono.setName("txtDireccion"); 
                                                        txtTelefono.addActionListener(new java.awt.event.ActionListener() {
                                                            public void actionPerformed(java.awt.event.ActionEvent evt) {
                                                                txtTelefonoActionPerformed(evt);
                                                            }
                                                        });
                                                        
                                                                jLabel7.setText("RUC");
                                                                
                                                                        jLabel1.setText("Direccion");
                                                                        
                                                                                jTabbedPane1.addTab("Registrar", jPanel4);
                                                                                jPanel4.setLayout(null);
                                                                                jPanel4.add(jLabel3);
                                                                                jPanel4.add(txtNombre);
                                                                                jPanel4.add(txtRUC);
                                                                                jPanel4.add(jLabel6);
                                                                                jPanel4.add(txtTelefono);
                                                                                jPanel4.add(jLabel7);
                                                                                jPanel4.add(jLabel1);
                                                                                jPanel4.add(txtDireccion);
                                                                                
                                                                                txtCta = new JTextField();
                                                                                txtCta.setName("txtRUC");
                                                                                txtCta.setBounds(285, 328, 310, 30);
                                                                                jPanel4.add(txtCta);
                                                                                
                                                                                JLabel lblCuentaCorriente = new JLabel();
                                                                                lblCuentaCorriente.setFont(new Font("Tahoma", Font.BOLD, 15));
                                                                                lblCuentaCorriente.setText("Cuenta Corriente");
                                                                                lblCuentaCorriente.setBounds(99, 332, 138, 21);
                                                                                jPanel4.add(lblCuentaCorriente);
                                                                                btnRegistrar = new javax.swing.JButton();
                                                                                btnRegistrar.setFont(new Font("Tahoma", Font.PLAIN, 15));
                                                                                btnRegistrar.setBounds(735, 126, 90, 30);
                                                                                jPanel4.add(btnRegistrar);
                                                                                
                                                                                        btnRegistrar.setText("Registrar");
                                                                                        btnLimpiar = new javax.swing.JButton();
                                                                                        btnLimpiar.setFont(new Font("Tahoma", Font.PLAIN, 15));
                                                                                        btnLimpiar.setBounds(735, 169, 90, 30);
                                                                                        jPanel4.add(btnLimpiar);
                                                                                        
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

        jTabbedPane1.addTab("Búsqueda", jPanel3);
        {
        	btnEliminar = new JButton("Eliminar registro");
        	btnEliminar.setFont(new Font("Tahoma", Font.PLAIN, 15));
        	btnEliminar.addActionListener(this);
        	btnEliminar.setBounds(217, 27, 190, 23);
        	jPanel3.add(btnEliminar);
        }
        
        button = new JButton();
        button.setFont(new Font("Tahoma", Font.PLAIN, 15));
        button.addActionListener(this);
        button.setIcon(new ImageIcon(FrmProveedor.class.getResource("/Icons/buscar.gif")));
        button.setBounds(435, 18, 60, 32);
        jPanel3.add(button);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(layout.createSequentialGroup()
        			.addGap(169)
        			.addComponent(lblTitulo, GroupLayout.DEFAULT_SIZE, 484, Short.MAX_VALUE)
        			.addGap(191))
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap(866, Short.MAX_VALUE)
        			.addComponent(btnSalir, GroupLayout.PREFERRED_SIZE, 73, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap())
        		.addGroup(Alignment.LEADING, layout.createSequentialGroup()
        			.addGap(27)
        			.addComponent(jTabbedPane1, GroupLayout.PREFERRED_SIZE, 958, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap(21, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addGap(20)
        			.addComponent(lblTitulo)
        			.addGap(18)
        			.addComponent(jTabbedPane1, GroupLayout.DEFAULT_SIZE, 465, Short.MAX_VALUE)
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addComponent(btnSalir)
        			.addGap(25))
        );
        getContentPane().setLayout(layout);

        pack();
    }



    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void txtNombreKeyPressed(java.awt.event.KeyEvent evt) {
        if(evt.getKeyCode() == evt.VK_ENTER){
           getFocusOwner().transferFocus();
        }
    }

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {
        limpiaControles();
    }

    private void txtRUCActionPerformed(java.awt.event.ActionEvent evt) {
       
    }

    


    private void txtTelefonoActionPerformed(java.awt.event.ActionEvent evt) {
      
    }

    private void tblClienteMouseClicked(java.awt.event.MouseEvent evt) {

    }

    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTable tblProveedor;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtRUC;
    private javax.swing.JTextField txtTelefono;
    private JTextField txtCta;
    private JButton btnEliminar;
    private JButton button;
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == button) {
			do_button_actionPerformed(arg0);
		}
		if (arg0.getSource() == btnEliminar) {
			do_btnEliminar_actionPerformed(arg0);
		}
	}
	
    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {
        this.dispose();
    }
	private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {

        int id = 0;
        if(valida()){
            Proveedor p = new Proveedor();
            p.setNombre(txtNombre.getText());
            p.setTelefono(txtTelefono.getText());
            p.setDireccion(txtDireccion.getText());
            p.setRUC(txtRUC.getText());
            p.setCTA(txtCta.getText());
            p.setIdProveedor(id);
            _Proveedorbo.Create(p);
            limpiaControles();
            limpiaTabla();
            llenaTabla();
            JOptionPane.showMessageDialog(this, "se registró con exito");
        }
    }
	protected void do_btnEliminar_actionPerformed(ActionEvent arg0) {
		try{
			 int id= Integer.parseInt(String.valueOf(_DefaultTableModel.getValueAt(tblProveedor.getSelectedRow(),0)));
			 _Proveedorbo.Delete(id);
				 limpiaTabla();
		         llenaTabla();
		         JOptionPane.showMessageDialog(this, "Se elimnó el resgistro con exito");
		 }
		 catch(Exception e1){
			 System.out.println(e1);
		 }
	}
	
	public void llenaTabla()
    {
	List<Proveedor> Proveedores = _Proveedorbo.readAll();
        int i = Proveedores.size(); 
        for(int j = 0; j<i;j++){
            Vector vect = new Vector();
            vect.addElement(Proveedores.get(j).getIdProveedor());
            vect.addElement(Proveedores.get(j).getNombre());
            vect.addElement(Proveedores.get(j).getDireccion());
            vect.addElement(Proveedores.get(j).getTelefono());
            vect.addElement(Proveedores.get(j).getEstado());
            vect.addElement(Proveedores.get(j).getRUC());
            vect.addElement(Proveedores.get(j).getCTA());
            _DefaultTableModel.addRow(vect);
        }
        
    }     
       public void limpiaControles(){
        txtNombre.setText("");
        txtTelefono.setText("");
        txtDireccion.setText("");
        txtRUC.setText("");
        txtCta.setText("");
        txtNombre.requestFocus();
    }
    public void limpiaTabla(){
        DefaultTableModel dm = (DefaultTableModel)this.tblProveedor.getModel();
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

        if(txtDireccion.getText().equals("")){
        	JOptionPane.showMessageDialog(this, "Debe ingresar Dirección");
        	return sw;
        }
        if(txtTelefono.getText().equals("")){
        	JOptionPane.showMessageDialog(this, "Debe ingresar Teléfono");
        	return sw;
        }
        if(txtRUC.getText().equals("")){
        	JOptionPane.showMessageDialog(this, "Debe ingresar RUC");
        	return sw;
        }
        if(txtCta.getText().equals("")){
        	JOptionPane.showMessageDialog(this, "Debe ingresar número de cuenta");
        	return sw;
        }
    
        return sw = true;
    }
	protected void do_button_actionPerformed(ActionEvent arg0) {
		int x ;
	    x = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el código del Proveedor"));
	    try {
	    	Proveedor proveedor = _Proveedorbo.Find(x);
	        if (proveedor != null) {
	            JOptionPane.showMessageDialog(this, "Se encontró el registro con éxito");
	        } else {
	            JOptionPane.showMessageDialog(this, "No existe el registro con el código ingresado");
	        }
	    } catch (Exception ex) {
	        ex.printStackTrace();
	        JOptionPane.showMessageDialog(this, "Ocurrió un error al buscar el registro");
	    }
	}
}
