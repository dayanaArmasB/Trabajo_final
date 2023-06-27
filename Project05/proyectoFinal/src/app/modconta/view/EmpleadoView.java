package app.modconta.view;
import app.modconta.business.EmpleadoBO;
import app.modconta.entity.Cliente;
import app.modconta.entity.Empleado;
import java.util.List;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Font;

public class EmpleadoView extends javax.swing.JInternalFrame implements ActionListener {
	EmpleadoBO _Empleadobo;
    DefaultTableModel dtm;
    boolean sw = false;
    String cad = "";
    int idEmp; 
    ButtonGroup buttonGroup;
   
    public EmpleadoView() {
    	_Empleadobo = new EmpleadoBO();
        initComponents();
        dtm = (DefaultTableModel)tblEmpleado.getModel();
        llenaTabla();
        buttonGroup = new ButtonGroup();
        buttonGroup.add(rbtnM);
        buttonGroup.add(rbtnF);
    }
   
    private void initComponents() {

        sexo = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jTabbedPane1.setFont(new Font("Tahoma", Font.PLAIN, 15));
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel3.setFont(new Font("Tahoma", Font.BOLD, 15));
        jLabel4 = new javax.swing.JLabel();
        jLabel4.setFont(new Font("Tahoma", Font.BOLD, 15));
        txtNombre = new javax.swing.JTextField();
        txtNombre.setFont(new Font("Tahoma", Font.PLAIN, 15));
        txtApellidoP = new javax.swing.JTextField();
        txtApellidoP.setFont(new Font("Tahoma", Font.PLAIN, 15));
        jLabel6 = new javax.swing.JLabel();
        jLabel6.setFont(new Font("Tahoma", Font.BOLD, 15));
        txtDNI = new javax.swing.JTextField();
        txtDNI.setFont(new Font("Tahoma", Font.PLAIN, 15));
        jLabel7 = new javax.swing.JLabel();
        jLabel7.setFont(new Font("Tahoma", Font.BOLD, 15));
        txtTelefono = new javax.swing.JTextField();
        txtTelefono.setFont(new Font("Tahoma", Font.PLAIN, 15));
        jLabel9 = new javax.swing.JLabel();
        jLabel9.setFont(new Font("Tahoma", Font.BOLD, 15));
        txtDireccion = new javax.swing.JTextField();
        txtDireccion.setFont(new Font("Tahoma", Font.PLAIN, 15));
        jLabel11 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel8.setFont(new Font("Tahoma", Font.BOLD, 15));
        jPanel1 = new javax.swing.JPanel();
        rbtnM = new javax.swing.JRadioButton();
        rbtnM.setFont(new Font("Tahoma", Font.PLAIN, 15));
        rbtnF = new javax.swing.JRadioButton();
        rbtnF.setFont(new Font("Tahoma", Font.PLAIN, 15));
        jPanel2 = new javax.swing.JPanel();
        txtSueldo = new javax.swing.JTextField();
        txtSueldo.setFont(new Font("Tahoma", Font.PLAIN, 15));
        jLabel1 = new javax.swing.JLabel();
        jLabel1.setFont(new Font("Tahoma", Font.BOLD, 15));
        cbxCargo = new javax.swing.JComboBox<>();
        cbxCargo.setFont(new Font("Tahoma", Font.PLAIN, 15));
        jLabel10 = new javax.swing.JLabel();
        jLabel10.setFont(new Font("Tahoma", Font.BOLD, 15));
        cbxArea = new javax.swing.JComboBox<>();
        cbxArea.setFont(new Font("Tahoma", Font.PLAIN, 15));
        jLabel5 = new javax.swing.JLabel();
        jLabel5.setFont(new Font("Tahoma", Font.BOLD, 15));
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblEmpleado = new javax.swing.JTable();
        tblEmpleado.setFont(new Font("Tahoma", Font.PLAIN, 17));
        btnSalir = new javax.swing.JButton();
        btnSalir.setFont(new Font("Tahoma", Font.PLAIN, 15));
        lblTitulo = new javax.swing.JLabel();
        setIconifiable(true);
        setMaximizable(true);
        setTitle("EMPLEADOS");
        setAutoscrolls(true);

        jTabbedPane1.setMaximumSize(new java.awt.Dimension(32769, 32769));

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel4.setLayout(null);

        jLabel3.setText("Nombre");
        jPanel4.add(jLabel3);
        jLabel3.setBounds(30, 19, 60, 14);

        jLabel4.setText("Apellido Paterno");
        jPanel4.add(jLabel4);
        jLabel4.setBounds(30, 56, 130, 20);

        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNombreKeyPressed(evt);
            }
        });
        jPanel4.add(txtNombre);
        txtNombre.setBounds(156, 12, 330, 30);

        txtApellidoP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellidosActionPerformed(evt);
            }
        });
        txtApellidoP.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtApellidosKeyPressed(evt);
            }
        });
        jPanel4.add(txtApellidoP);
        txtApellidoP.setBounds(156, 52, 330, 30);

        jLabel6.setText("DNI");
        jPanel4.add(jLabel6);
        jLabel6.setBounds(30, 143, 50, 20);

        txtDNI.setName("txtDireccion"); // NOI18N
        txtDNI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDNIActionPerformed(evt);
            }
        });
        jPanel4.add(txtDNI);
        txtDNI.setBounds(157, 133, 110, 30);

        jLabel7.setText("Celular");
        jPanel4.add(jLabel7);
        jLabel7.setBounds(279, 142, 65, 23);

        txtTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefonoActionPerformed(evt);
            }
        });
        jPanel4.add(txtTelefono);
        txtTelefono.setBounds(356, 133, 130, 30);

        jLabel9.setText("Dirección");
        jPanel4.add(jLabel9);
        jLabel9.setBounds(30, 223, 74, 14);
        jPanel4.add(txtDireccion);
        txtDireccion.setBounds(130, 215, 330, 30);
        jPanel4.add(jLabel11);
        jLabel11.setBounds(0, 0, 0, 0);

        jLabel8.setText("Sexo");
        jPanel4.add(jLabel8);
        jLabel8.setBounds(30, 179, 50, 20);

        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 51, 51)));

        sexo.add(rbtnM);
        rbtnM.setText("Masculino");

        sexo.add(rbtnF);
        rbtnF.setText("Femenino");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1Layout.setHorizontalGroup(
        	jPanel1Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
        			.addContainerGap()
        			.addComponent(rbtnM, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.RELATED, 94, Short.MAX_VALUE)
        			.addComponent(rbtnF, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
        			.addGap(28))
        );
        jPanel1Layout.setVerticalGroup(
        	jPanel1Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel1Layout.createSequentialGroup()
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(rbtnF)
        				.addComponent(rbtnM))
        			.addGap(0, 5, Short.MAX_VALUE))
        );
        jPanel1.setLayout(jPanel1Layout);

        jPanel4.add(jPanel1);
        jPanel1.setBounds(130, 174, 330, 30);

        jTabbedPane1.addTab("Registrar", jPanel4);
        {
        	txtApellidoM = new JTextField();
        	txtApellidoM.setFont(new Font("Tahoma", Font.PLAIN, 15));
        	txtApellidoM.setBounds(156, 95, 330, 30);
        	jPanel4.add(txtApellidoM);
        }
        {
        	lblApellidoMaterno = new JLabel();
        	lblApellidoMaterno.setFont(new Font("Tahoma", Font.BOLD, 15));
        	lblApellidoMaterno.setText("Apellido Materno");
        	lblApellidoMaterno.setBounds(30, 97, 130, 20);
        	jPanel4.add(lblApellidoMaterno);
        }

        jPanel2.setBorder(javax.swing.BorderFactory.createCompoundBorder());

        jLabel1.setText("Sueldo");

        cbxCargo.setModel(new DefaultComboBoxModel(new String[] {"JEFE", "SUPERVISOR", "VENDEDOR"}));
        cbxCargo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxCargoActionPerformed(evt);
            }
        });

        jLabel10.setText("Cargo");

        cbxArea.setModel(new DefaultComboBoxModel(new String[] {"VENTAS", "ALMACEN"}));
        cbxArea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxAreaActionPerformed(evt);
            }
        });

        jLabel5.setText("Área");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2Layout.setHorizontalGroup(
        	jPanel2Layout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(jPanel2Layout.createSequentialGroup()
        			.addContainerGap(259, Short.MAX_VALUE)
        			.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING, false)
        				.addComponent(jLabel1, GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        				.addComponent(jLabel5, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        				.addComponent(jLabel10, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE))
        			.addGap(55)
        			.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING)
        				.addComponent(txtSueldo, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE)
        				.addComponent(cbxCargo, GroupLayout.PREFERRED_SIZE, 128, GroupLayout.PREFERRED_SIZE)
        				.addComponent(cbxArea, GroupLayout.PREFERRED_SIZE, 128, GroupLayout.PREFERRED_SIZE))
        			.addContainerGap(458, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
        	jPanel2Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel2Layout.createSequentialGroup()
        			.addGap(104)
        			.addGroup(jPanel2Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(cbxArea, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jLabel5, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
        			.addGap(18)
        			.addGroup(jPanel2Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel10)
        				.addComponent(cbxCargo, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
        			.addGap(18)
        			.addGroup(jPanel2Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel1, GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE)
        				.addComponent(txtSueldo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addGap(188))
        );
        jPanel2.setLayout(jPanel2Layout);

        jTabbedPane1.addTab("Contrato", jPanel2);
        jPanel2.getAccessibleContext().setAccessibleName("");
        jPanel2.getAccessibleContext().setAccessibleDescription("");

        jPanel3.setLayout(null);

        tblEmpleado.setModel(new DefaultTableModel(
        	new Object[][] {
        	},
        	new String[] {
        		"ID", "Apellido Paterno", "Apellido Materno", "Nombre", "Sexo", "Telefono", "Direccion", "DNI", "Estado", "Rol", "Area", "Cargo", "Sueldo"
        	}
        ));
        tblEmpleado.setToolTipText("");
        tblEmpleado.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tblEmpleado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblClienteMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblEmpleado);

        jPanel3.add(jScrollPane1);
        jScrollPane1.setBounds(10, 79, 1221, 320);

        jTabbedPane1.addTab("Búsqueda", jPanel3);
        
        btnEliminar = new JButton("Eliminar registro");
        btnEliminar.setFont(new Font("Tahoma", Font.PLAIN, 15));
        btnEliminar.addActionListener(this);
        btnEliminar.setBounds(380, 24, 211, 23);
        jPanel3.add(btnEliminar);
        
        button = new JButton();
        button.setFont(new Font("Tahoma", Font.PLAIN, 17));
        button.addActionListener(new ActionListener() {
        
        	public void actionPerformed(ActionEvent e) {
        		if (e.getSource() == button) {
        			do_button_actionPerformed(e);
        		}
        	}
        });
        button.setIcon(new ImageIcon(EmpleadoView.class.getResource("/Icons/buscar.gif")));
        button.setBounds(602, 13, 57, 47);
        jPanel3.add(button);

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        lblTitulo.setFont(new java.awt.Font("Tahoma", 1, 24));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("EMPLEADOS");
        btnRegistrar = new javax.swing.JButton();
        btnRegistrar.setFont(new Font("Tahoma", Font.PLAIN, 15));
        
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
        btnLimpiar.setFont(new Font("Tahoma", Font.PLAIN, 15));
        
                btnLimpiar.setText("Limpiar");
                btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        btnLimpiarActionPerformed(evt);
                    }
                });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(Alignment.TRAILING, layout.createSequentialGroup()
        			.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        				.addGroup(Alignment.LEADING, layout.createSequentialGroup()
        					.addGap(30)
        					.addComponent(jTabbedPane1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        				.addGroup(Alignment.LEADING, layout.createSequentialGroup()
        					.addGap(270)
        					.addComponent(lblTitulo, GroupLayout.PREFERRED_SIZE, 608, GroupLayout.PREFERRED_SIZE))
        				.addGroup(Alignment.LEADING, layout.createSequentialGroup()
        					.addContainerGap(453, Short.MAX_VALUE)
        					.addComponent(btnRegistrar, GroupLayout.PREFERRED_SIZE, 97, GroupLayout.PREFERRED_SIZE)
        					.addGap(37)
        					.addComponent(btnLimpiar, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)
        					.addGap(504)
        					.addComponent(btnSalir, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE)))
        			.addContainerGap())
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap()
        			.addComponent(lblTitulo)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(jTabbedPane1, GroupLayout.PREFERRED_SIZE, 445, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(layout.createSequentialGroup()
        					.addGap(66)
        					.addComponent(btnSalir, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
        				.addGroup(layout.createSequentialGroup()
        					.addGap(42)
        					.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        						.addComponent(btnRegistrar, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
        						.addComponent(btnLimpiar, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))))
        			.addGap(20))
        );
        getContentPane().setLayout(layout);

        pack();}


    private void cbxAreaActionPerformed(java.awt.event.ActionEvent evt) {
       
    }

    private void txtDNIActionPerformed(java.awt.event.ActionEvent evt) {
        
    }

    private void btnRegistrarKeyPressed(java.awt.event.KeyEvent evt) {

    }


    private void txtApellidosKeyPressed(java.awt.event.KeyEvent evt) {
        if(evt.getKeyCode() == evt.VK_ENTER){
            this.getFocusOwner().transferFocus();
        }
    }

    private void txtApellidosActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void txtNombreKeyPressed(java.awt.event.KeyEvent evt) {
        if(evt.getKeyCode() == evt.VK_ENTER){
            this.getFocusOwner().transferFocus();
        }
    }

    private void tblClienteMouseClicked(java.awt.event.MouseEvent evt) {

    }

    private void txtTelefonoActionPerformed(java.awt.event.ActionEvent evt) {
       
    }

    private void cbxCargoActionPerformed(java.awt.event.ActionEvent evt) {
      
    }

    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox<String> cbxArea;
    private javax.swing.JComboBox<String> cbxCargo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JRadioButton rbtnF;
    private javax.swing.JRadioButton rbtnM;
    private javax.swing.ButtonGroup sexo;
    private javax.swing.JTable tblEmpleado;
    private javax.swing.JTextField txtApellidoP;
    private javax.swing.JTextField txtDNI;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtSueldo;
    private javax.swing.JTextField txtTelefono;
    private JTextField txtApellidoM;
    private JLabel lblApellidoMaterno;
    private JButton btnEliminar;
    private JButton button;
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnEliminar) {
			do_btnEliminar_actionPerformed(e);
		}
	}
	
    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {
        limpiaControles();
    }
	
    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {
        this.dispose();
    }
	protected void do_btnEliminar_actionPerformed(ActionEvent e) {
		try{
			 int id= Integer.parseInt(String.valueOf(dtm.getValueAt(tblEmpleado.getSelectedRow(),0)));
			 _Empleadobo.Delete(id);
				 limpiaTabla();
		         llenaTabla();
		         JOptionPane.showMessageDialog(this, "Se elimnó el registro con exito");
		 }
		 catch(Exception e1){
			 System.out.println(e1);
		 }
		
	}
	private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {
        

        int id = 0;
            if(valida()){
            Empleado p = new Empleado();
            p.setApellidoPaterno(txtApellidoP.getText());
            p.setApellidoMaterno(txtApellidoM.getText());
            p.setNombre(txtNombre.getText());
            if(rbtnM.isSelected())
            p.setSexo(rbtnM.getText());
            if(rbtnF.isSelected())
            p.setSexo(rbtnF.getText());
            p.setTelefono(txtTelefono.getText());
            p.setDireccion(txtDireccion.getText());
            p.setDNI(txtDNI.getText());
            p.setArea(cbxArea.getSelectedItem().toString());
            p.setCargo(cbxCargo.getSelectedItem().toString());
            p.setSueldo(Integer.parseInt(txtSueldo.getText()));
            p.setIdEmpleado(id);
            _Empleadobo.Create(p);
            limpiaControles();
            limpiaTabla();
            llenaTabla();
            JOptionPane.showMessageDialog(this, "Se registró con éxito");
 
        }
    }
	
	 public void limpiaControles(){
	        txtNombre.setText("");
	        txtApellidoP.setText("");
	        txtTelefono.setText("");
	        txtDireccion.setText("");
	        txtDNI.setText("");
	        buttonGroup.clearSelection();
	        txtSueldo.setText("");
	        txtNombre.requestFocus();
	        
	    }
    public void limpiaTabla(){
        DefaultTableModel dm = (DefaultTableModel)tblEmpleado.getModel();
        if(dm.getRowCount()>0){
            while(dm.getRowCount()>0){
                dm.removeRow(dm.getRowCount()-1);
            }
        }
    }
	
	public boolean valida(){
        boolean sw = false;
        if (txtNombre.getText().equals("")) {
        	JOptionPane.showMessageDialog(this, "Ingrese Nombre");
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
        
        if(buttonGroup.getSelection()== null){
        	JOptionPane.showMessageDialog(this, "Debe seleccionar un sexo");
        	return sw;
        }
        if(txtSueldo.getText().equals("")){
        	JOptionPane.showMessageDialog(this, "Debe ingresar sueldo");
        	return sw;
        }
        
        return sw = true;
    }
	
	public void llenaTabla()
    {
        List<Empleado> Empleados = _Empleadobo.readAll();
        int i = Empleados.size(); 
        for(int j = 0; j<i;j++){
            Vector vect = new Vector();
            vect.addElement(Empleados.get(j).getIdEmpleado());
            vect.addElement(Empleados.get(j).getApellidoPaterno());
            vect.addElement(Empleados.get(j).getApellidoMaterno());
            vect.addElement(Empleados.get(j).getNombre());
            vect.addElement(Empleados.get(j).getSexo());
            vect.addElement(Empleados.get(j).getTelefono());
            vect.addElement(Empleados.get(j).getDireccion());   
            vect.addElement(Empleados.get(j).getDNI());
            vect.addElement(Empleados.get(j).getEstado());
            vect.addElement(Empleados.get(j).getRol());
            vect.addElement(Empleados.get(j).getArea());
            vect.addElement(Empleados.get(j).getCargo());
            vect.addElement(Empleados.get(j).getSueldo());
            dtm.addRow(vect);
        }
    } 

	protected void do_button_actionPerformed(ActionEvent e) {
		int x ;
	    x = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el código del Empleado"));
	    try {
	        Empleado empleado = _Empleadobo.Find(x);
	        if (empleado != null) {
	            JOptionPane.showMessageDialog(this, "Se encontró el registro con éxito");
	        } else {
	            JOptionPane.showMessageDialog(this, "No existe el registro con el código ingresado");
	        }
	    } catch (Exception e1) {
	        e1.printStackTrace();
	        JOptionPane.showMessageDialog(this, "Ocurrió un error al buscar el registro");
	    }
		
	}
}
