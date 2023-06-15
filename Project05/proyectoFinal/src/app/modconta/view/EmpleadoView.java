package app.modconta.view;
import app.modconta.business.EmpleadoBO;
import app.modconta.databaase.util;
import app.modconta.entity.Contrato;
import app.modconta.entity.Empleado;
import MODEL.ContratoDAO;
import static java.lang.Float.parseFloat;
import java.sql.Connection;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;
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

public class EmpleadoView extends javax.swing.JInternalFrame implements ActionListener {
	EmpleadoBO _Empleadobo;
    ContratoDAO ContratoDAO;
    DefaultTableModel dtm;
    boolean sw = false;
    String cad = "";
    int idEmp; 
    ButtonGroup buttonGroup;
   
    public EmpleadoView() {
    	_Empleadobo = new EmpleadoBO();
        ContratoDAO = new ContratoDAO();
        util utile = new util();
        initComponents();
        dcFechaIncio.setEnabled(true);
        dcFechaFin.setEnabled(true);
        dtm = (DefaultTableModel)tblEmpleado.getModel();
        llenaTabla(false, "");
        buttonGroup = new ButtonGroup();
        buttonGroup.add(rbtnM);
        buttonGroup.add(rbtnF);
        btnRegistrar = new javax.swing.JButton();
        btnRegistrar.setBounds(521, 107, 97, 30);
        jPanel4.add(btnRegistrar);
        
                btnRegistrar.setText("Registrar");
                btnLimpiar = new javax.swing.JButton();
                btnLimpiar.setBounds(521, 148, 90, 30);
                jPanel4.add(btnLimpiar);
                
                        btnLimpiar.setText("Limpiar");
                        jButton2 = new javax.swing.JButton();
                        jButton2.setBounds(541, 189, 57, 47);
                        jPanel4.add(jButton2);
                        
                                jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/buscar.gif")));
                                jButton2.addActionListener(new java.awt.event.ActionListener() {
                                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                                        jButton2ActionPerformed(evt);
                                    }
                                });
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
    }
   
    public void llenaTabla(boolean swr, String cadr)
    {
        List<Empleado> Empleados = _Empleadobo.readAll();
        System.out.print("test");
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
            dtm.addRow(vect);
        }
    } 
     

    private void initComponents() {

        sexo = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtApellidoP = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtDNI = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        rbtnM = new javax.swing.JRadioButton();
        rbtnF = new javax.swing.JRadioButton();
        jLabel13 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        txtSueldo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        dcFechaFin = new com.toedter.calendar.JDateChooser();
        jLabel14 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        dcFechaIncio = new com.toedter.calendar.JDateChooser();
        cbxCargo = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        cbxArea = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        btnRegistrarContrato = new javax.swing.JButton();
        btnLimpiar1 = new javax.swing.JButton();
        txtcodigoempleado = new javax.swing.JTextField();
        idint2 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblEmpleado = new javax.swing.JTable();
        jTextField1 = new javax.swing.JTextField();
        jComboBox3 = new javax.swing.JComboBox<>();
        btnSalir = new javax.swing.JButton();
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
        jLabel4.setBounds(30, 56, 90, 20);

        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNombreKeyPressed(evt);
            }
        });
        jPanel4.add(txtNombre);
        txtNombre.setBounds(130, 11, 330, 30);

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
        txtApellidoP.setBounds(130, 51, 330, 30);

        jLabel6.setText("DNI");
        jPanel4.add(jLabel6);
        jLabel6.setBounds(30, 143, 50, 10);

        txtDNI.setName("txtDireccion"); // NOI18N
        txtDNI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDNIActionPerformed(evt);
            }
        });
        jPanel4.add(txtDNI);
        txtDNI.setBounds(130, 133, 110, 30);

        jLabel7.setText("Celular");
        jPanel4.add(jLabel7);
        jLabel7.setBounds(267, 141, 50, 14);

        txtTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefonoActionPerformed(evt);
            }
        });
        jPanel4.add(txtTelefono);
        txtTelefono.setBounds(330, 133, 130, 30);

        jLabel9.setText("Dirección");
        jPanel4.add(jLabel9);
        jLabel9.setBounds(30, 264, 60, 14);
        jPanel4.add(txtDireccion);
        txtDireccion.setBounds(130, 256, 330, 30);
        jPanel4.add(jLabel11);
        jLabel11.setBounds(0, 0, 0, 0);

        jLabel8.setText("Sexo");
        jPanel4.add(jLabel8);
        jLabel8.setBounds(30, 179, 50, 14);

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

        jLabel13.setText("Código");
        jPanel4.add(jLabel13);
        jLabel13.setBounds(30, 301, 50, 14);
        jPanel4.add(txtCodigo);
        txtCodigo.setBounds(130, 293, 330, 30);

        jTabbedPane1.addTab("Registrar", jPanel4);
        {
        	txtApellidoM = new JTextField();
        	txtApellidoM.setBounds(130, 92, 330, 30);
        	jPanel4.add(txtApellidoM);
        }
        {
        	lblApellidoMaterno = new JLabel();
        	lblApellidoMaterno.setText("Apellido Materno");
        	lblApellidoMaterno.setBounds(30, 97, 90, 20);
        	jPanel4.add(lblApellidoMaterno);
        }

        jPanel2.setBorder(javax.swing.BorderFactory.createCompoundBorder());

        jLabel1.setText("Sueldo");

        dcFechaFin.setDate(Calendar.getInstance().getTime());
        dcFechaFin.setDateFormatString("yyyy/MM/dd");
        dcFechaFin.setPreferredSize(new java.awt.Dimension(120, 20));

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel14.setText("Fecha de fin");
        jLabel14.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel12.setText("Fecha de inicio");
        jLabel12.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        dcFechaIncio.setDate(Calendar.getInstance().getTime());
        dcFechaIncio.setDateFormatString("yyyy/MM/dd");
        dcFechaIncio.setPreferredSize(new java.awt.Dimension(120, 20));

        cbxCargo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "JEFE ", "SUPERVISOR ", "TECNICO", "VENDEDOR" }));
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

        jLabel15.setText("Código del Empleado");

        btnRegistrarContrato.setText("Registrar");
        btnRegistrarContrato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarContratoActionPerformed(evt);
            }
        });
        btnRegistrarContrato.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnRegistrarContratoKeyPressed(evt);
            }
        });

        btnLimpiar1.setText("Limpiar");
        btnLimpiar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiar1ActionPerformed(evt);
            }
        });
        idint2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idint2ActionPerformed(evt);
            }
        });

        jLabel17.setText("ID de Empleado");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2Layout.setHorizontalGroup(
        	jPanel2Layout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(jPanel2Layout.createSequentialGroup()
        			.addContainerGap(202, Short.MAX_VALUE)
        			.addComponent(btnRegistrarContrato, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addComponent(btnLimpiar1, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE)
        			.addGap(216))
        		.addGroup(jPanel2Layout.createSequentialGroup()
        			.addGap(85)
        			.addGroup(jPanel2Layout.createParallelGroup(Alignment.TRAILING)
        				.addGroup(jPanel2Layout.createSequentialGroup()
        					.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING, false)
        						.addComponent(jLabel10, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
        						.addComponent(jLabel5, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
        						.addComponent(jLabel15)
        						.addComponent(jLabel17, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
        						.addComponent(jLabel14, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        						.addComponent(jLabel12, GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE))
        					.addGap(36))
        				.addGroup(jPanel2Layout.createSequentialGroup()
        					.addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
        					.addGap(103)))
        			.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING)
        				.addComponent(dcFechaIncio, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(txtcodigoempleado, GroupLayout.PREFERRED_SIZE, 134, GroupLayout.PREFERRED_SIZE)
        				.addComponent(dcFechaFin, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(txtSueldo, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE)
        				.addComponent(idint2, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
        				.addComponent(cbxCargo, GroupLayout.PREFERRED_SIZE, 128, GroupLayout.PREFERRED_SIZE)
        				.addComponent(cbxArea, GroupLayout.PREFERRED_SIZE, 128, GroupLayout.PREFERRED_SIZE))
        			.addContainerGap(253, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
        	jPanel2Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel2Layout.createSequentialGroup()
        			.addGap(38)
        			.addGroup(jPanel2Layout.createParallelGroup(Alignment.TRAILING)
        				.addComponent(jLabel17)
        				.addComponent(idint2, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(jPanel2Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel15)
        				.addComponent(txtcodigoempleado, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addGroup(jPanel2Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(cbxArea, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jLabel5, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
        			.addGap(18)
        			.addGroup(jPanel2Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel10)
        				.addComponent(cbxCargo, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
        			.addGap(18, 18, Short.MAX_VALUE)
        			.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING)
        				.addComponent(dcFechaIncio, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jLabel12, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
        			.addGap(18)
        			.addGroup(jPanel2Layout.createParallelGroup(Alignment.TRAILING)
        				.addComponent(dcFechaFin, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jLabel14, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addGroup(jPanel2Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(txtSueldo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jLabel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        			.addGap(32)
        			.addGroup(jPanel2Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(btnRegistrarContrato)
        				.addComponent(btnLimpiar1))
        			.addGap(187))
        );
        jPanel2.setLayout(jPanel2Layout);

        jTabbedPane1.addTab("Contrato", jPanel2);
        jPanel2.getAccessibleContext().setAccessibleName("");
        jPanel2.getAccessibleContext().setAccessibleDescription("");

        jPanel3.setLayout(null);

        jLabel2.setText("Búsqueda");
        jPanel3.add(jLabel2);
        jLabel2.setBounds(10, 30, 60, 20);

        tblEmpleado.setModel(new DefaultTableModel(
        	new Object[][] {
        	},
        	new String[] {
        		"ID", "Apellido Paterno", "Apellido Materno", "Nombre", "Sexo", "Telefono", "Direccion", "DNI"
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
        jScrollPane1.setBounds(10, 60, 610, 200);

        jTextField1.setName("txtBusqueda"); // NOI18N
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel3.add(jTextField1);
        jTextField1.setBounds(230, 20, 300, 30);

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "(Elija el criterio)" }));
        jComboBox3.setToolTipText("");
        jPanel3.add(jComboBox3);
        jComboBox3.setBounds(70, 20, 150, 30);

        jTabbedPane1.addTab("Búsqueda", jPanel3);
        
        btnEliminar = new JButton("Eliminar registro");
        btnEliminar.addActionListener(this);
        btnEliminar.setBounds(258, 307, 109, 23);
        jPanel3.add(btnEliminar);

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        lblTitulo.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("EMPLEADOS");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(layout.createSequentialGroup()
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(layout.createSequentialGroup()
        					.addGap(30)
        					.addComponent(jTabbedPane1, GroupLayout.PREFERRED_SIZE, 663, GroupLayout.PREFERRED_SIZE))
        				.addGroup(layout.createSequentialGroup()
        					.addGap(58)
        					.addComponent(lblTitulo, GroupLayout.PREFERRED_SIZE, 608, GroupLayout.PREFERRED_SIZE)))
        			.addContainerGap(32, Short.MAX_VALUE))
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap(662, Short.MAX_VALUE)
        			.addComponent(btnSalir)
        			.addContainerGap())
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap()
        			.addComponent(lblTitulo)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(jTabbedPane1, GroupLayout.PREFERRED_SIZE, 416, GroupLayout.PREFERRED_SIZE)
        			.addGap(51)
        			.addComponent(btnSalir, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap())
        );
        getContentPane().setLayout(layout);

        pack();}


    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {
        this.dispose();
    }

    private void cbxAreaActionPerformed(java.awt.event.ActionEvent evt) {
       
    }

    private void txtDNIActionPerformed(java.awt.event.ActionEvent evt) {
        
    }

    private void btnRegistrarKeyPressed(java.awt.event.KeyEvent evt) {

    }

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {
        
        String proc = btnRegistrar.getText();
        int id = 0;
        String pr = ""; 
            if(valida()){
            util u = new util();
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
            
            if(proc.equals("Registrar")){
                pr = "insert";
            }
            if(proc.equals("Actualizar")){
                id = idEmp;
                pr = "update";
            }
            p.setIdEmpleado(id);
            _Empleadobo.Create(p);
            limpiaControles();
            limpiaTabla();
            llenaTabla(false, "");
            
            //  c.setCodigo(this.txtCodigoContrato.getText());
            // c.setArea(this.cbxArea.getSelectedItem().toString());
            // c.setCargo(this.cbxCargo.getSelectedItem().toString());
            // c.setFechaInicio(this.dcFechaIncio.getDate().toString());
            // c.setFechaFinal(this.dcFechaFin.getDate().toString());
            // c.setSueldo(parseFloat(txtSueldo.getText()));
            
        }
    }

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {
        // limpiaControles();
    }

    private void txtApellidosKeyPressed(java.awt.event.KeyEvent evt) {
        if(evt.getKeyCode() == evt.VK_ENTER){
            this.getFocusOwner().transferFocus();
        }
    }

    private void txtApellidosActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void txtNombreKeyPressed(java.awt.event.KeyEvent evt) {
        if(evt.getKeyCode() == evt.VK_ENTER){
            this.getFocusOwner().transferFocus();
        }
    }

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void tblClienteMouseClicked(java.awt.event.MouseEvent evt) {
        if(evt.getClickCount() == 1){
            this.jTabbedPane1.setSelectedIndex(1);

            //llenaModifica();
        }
    }

    private void txtTelefonoActionPerformed(java.awt.event.ActionEvent evt) {
       
    }

    private void btnRegistrarContratoActionPerformed(java.awt.event.ActionEvent evt) {
        String proc = this.btnRegistrar.getText();
        int id = 0, est;
        String pr = ""; 
        //el formato de la fecha
       // DateFormat df = new SimpleDateFormat("yyyy/MM/dd");
      //   SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
        // String strDate = DateFormat.getDateInstance().format(date);
        // Fecha.setText(date);
        if(valida() == true){
         util u = new util();
           // Empleado p = new Empleado();
            Contrato c = new Contrato();
              //CONTRATO
             c.setIdEmpleado(Integer.parseInt(this.idint2.getText()));
             JOptionPane.showMessageDialog(this, "idEmpleado " + this.idint2.getText());
             c.setIdContrato(this.txtcodigoempleado.getText());
             JOptionPane.showMessageDialog(this, "idContrato" + this.txtcodigoempleado.getText() );
             c.setArea(this.cbxArea.getSelectedItem().toString());
             JOptionPane.showMessageDialog(this, "Area" + this.cbxArea.getSelectedItem().toString());
             c.setCargo(this.cbxCargo.getSelectedItem().toString());
             JOptionPane.showMessageDialog(this, "Cargo" +this.cbxCargo.getSelectedItem().toString() );
            
             //configuramos la fecha de inicio
             String dia_i = Integer.toString(this.dcFechaIncio.getCalendar().get(Calendar.DAY_OF_MONTH));
             String mes_i = Integer.toString(this.dcFechaIncio.getCalendar().get(Calendar.MONTH) + 1);
             String year_i = Integer.toString(this.dcFechaIncio.getCalendar().get(Calendar.YEAR));
             String fecha_i = (year_i + "/" + mes_i+ "/" + dia_i);
             
            //this.dcFechaIncio.etText(fecha_i);
             //String diai = Integer.toString(this.dcFechaIncio.getCalendar().get(Calendar.DAY_OF_MONTH));
            // String mesi = Integer.toString(this.dcFechaFin.getCalendar().get(Calendar.MONTH));
            //String mes = Integer.toString(jdt.getCalendar().get(Calendar.MONTH) + 1);
             //String year = Integer.toString(jdt.getCalendar().get(Calendar.YEAR));
             //String fecha = (year + "-" + mes+ "-" + dia);
             //txtfecha.setText(fecha);
             
             c.setFechaInicio(fecha_i);
             JOptionPane.showMessageDialog(this, "Fehca inicio " + fecha_i);
             
             //configuramos la fecha de inicio
             String dia_f = Integer.toString(this.dcFechaFin.getCalendar().get(Calendar.DAY_OF_MONTH));
             String mes_f = Integer.toString(this.dcFechaFin.getCalendar().get(Calendar.MONTH) + 1);
             String year_f = Integer.toString(this.dcFechaFin.getCalendar().get(Calendar.YEAR));
             String fecha_f = (year_f + "/" + mes_f+ "/" + dia_f);
             
             c.setFechaFinal(fecha_f);
             JOptionPane.showMessageDialog(this, "Fecha fin " + fecha_f);
             c.setSueldo(parseFloat(txtSueldo.getText()));
             JOptionPane.showMessageDialog(this, "todo ");
            //EMPLEADO
            //p.setNombre(this.txtNombre.getText());
            //p.setApellidos(this.txtApellidos.getText());
            //if(rbtnM.isSelected())
            //p.setSexo(this.rbtnM.getText());
            //else if(rbtnF.isSelected())
            //p.setSexo(this.rbtnF.getText());
            //p.setTelefono(this.txtTelefono.getText());
            //p.setDNI(this.txtDNI.getText());
            //p.setDireccion(this.txtDireccion.getText());
            //p.setCodigoContrato(this.txtCodigo.getText());
         
          // p.setFechaInicio(this.dcFechaIncio.getDate().toString());
           //p.setFechaFinal(this.dcFechaFin.getDate().toString());
           //p.setSueldo(parseFloat(txtSueldo.getText()));         
             //cbxCargo.getModel().setSelectedItem();
           //p.setCargo(this.cbxCargo.getSelectedItem().toString());
            
            //p.setArea(this.cbxArea.getSelectedItem().toString());
             //JOptionPane.showMessageDialog(this, "Area ingresado");
            //p.setFechaFinal(this.dcFechaInicio.getDate()); 
            //SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
             //String date = sdf.format(jDateChooser1.getSelectedDate().getTime());
            //jLabel1.setText(date);
      
            if(proc.equals("Registrar"))
            {
           //        id = u.idNext("Empleado", "idEmpleado");
          //      int x=id;
                pr = "insert";
            }
            if(proc.equals("Actualizar")){
                
            //    id = this.idEmp;
                pr = "update";
            }
            //p.setIdEmpleado(id);
            
            ContratoDAO.procesaItem(c,pr);
  
           System.out.println(id);
            limpiaControles();
            limpiaTabla();
            llenaTabla(false, "");       
    }
 }

    private void btnRegistrarContratoKeyPressed(java.awt.event.KeyEvent evt) {
    }

    private void btnLimpiar1ActionPerformed(java.awt.event.ActionEvent evt) {
      
    }

    private void idint2ActionPerformed(java.awt.event.ActionEvent evt) {
       
    }

    private void cbxCargoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxCargoActionPerformed
      
    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
        int x ;
        x = Integer.parseInt(JOptionPane.showInputDialog(" Ingrese el codigo del Empleado"));
        //try {
            /*creamos un objeto dbBean
            dbBean aux = new dbBean();
            HashMap map = new HashMap();
            //Connection cn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=ST;user=sa;password=sasasa;");
            Connection cn = aux.getConnection();
            JasperReport jr= JasperCompileManager.compileReport("src/REPORTS/EmpleadoReporte.jrxml");
            map.put("idCliente",x);
            JasperPrint jp = JasperFillManager.fillReport(jr,map,cn);
            // JasperPrint jp= JasperFillManager.fillReport(jr,idClie,cn);

            JasperViewer jv= new JasperViewer(jp,false);
            jv.setVisible(true);
        } catch (Exception e) {
            System.out.println(e);*/
        //}
    }

 public void limpiaControles(){
        txtNombre.setText("");
        txtApellidoP.setText("");
        txtTelefono.setText("");
        txtDireccion.setText("");
        txtDNI.setText("");
        txtCodigo.setText("");
        buttonGroup.clearSelection();
        btnRegistrar.setText("Registrar");
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
        
        if(buttonGroup.getSelection()== null){
        	JOptionPane.showMessageDialog(this, "Debe seleccionar un sexo");
        	return sw;
        }
        
        return sw = true;
    }
    
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnLimpiar1;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnRegistrarContrato;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox<String> cbxArea;
    private javax.swing.JComboBox<String> cbxCargo;
    private com.toedter.calendar.JDateChooser dcFechaFin;
    private com.toedter.calendar.JDateChooser dcFechaIncio;
    private javax.swing.JTextField idint2;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
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
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JRadioButton rbtnF;
    private javax.swing.JRadioButton rbtnM;
    private javax.swing.ButtonGroup sexo;
    private javax.swing.JTable tblEmpleado;
    private javax.swing.JTextField txtApellidoP;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtDNI;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtSueldo;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JTextField txtcodigoempleado;
    private JTextField txtApellidoM;
    private JLabel lblApellidoMaterno;
    private JButton btnEliminar;
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnEliminar) {
			do_btnEliminar_actionPerformed(e);
		}
	}
	protected void do_btnEliminar_actionPerformed(ActionEvent e) {
		try{
			 int id= Integer.parseInt(String.valueOf(dtm.getValueAt(tblEmpleado.getSelectedRow(),0)));
			 _Empleadobo.Delete(id);
				 limpiaTabla();
		         llenaTabla(false, "");
		         JOptionPane.showMessageDialog(this, "Se elimnó el resgistro con exito");
		 }
		 catch(Exception e1){
			 System.out.println(e1);
		 }
		
	}
}
