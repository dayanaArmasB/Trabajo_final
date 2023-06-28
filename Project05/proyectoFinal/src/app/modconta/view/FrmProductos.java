package app.modconta.view;
import app.modconta.business.ProductoBO;
import app.modconta.entity.Producto;
import java.util.List;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.SpinnerNumberModel;


public class FrmProductos extends javax.swing.JInternalFrame implements ActionListener {
    
    ProductoBO _Productobo;
    DefaultTableModel dtm;
    int idProd; 
   
    public FrmProductos() {
        initComponents();

        dtm = (DefaultTableModel)tblProductos.getModel();
        _Productobo = new ProductoBO();
        llenaTabla();    
    }

    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jTabbedPane1.setFont(new Font("Tahoma", Font.PLAIN, 15));
        jPanelBusqueda = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProductos = new javax.swing.JTable();
        tblProductos.setFont(new Font("Tahoma", Font.PLAIN, 17));
        lblTitulo = new javax.swing.JLabel();
        setIconifiable(true);
        setMaximizable(true);
        setTitle("PRODUCTOS");
        setAutoscrolls(true);
        setFrameIcon(null);
        setVisible(true);

        jTabbedPane1.setMaximumSize(new java.awt.Dimension(32769, 32769));
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel3.setFont(new Font("Tahoma", Font.BOLD, 15));
        txtNombreProduc = new javax.swing.JTextField();
        txtNombreProduc.setFont(new Font("Tahoma", Font.PLAIN, 15));
        btnLimpiar = new javax.swing.JButton();
        btnLimpiar.setFont(new Font("Tahoma", Font.PLAIN, 15));
        jLabel4 = new javax.swing.JLabel();
        jLabel4.setFont(new Font("Tahoma", Font.BOLD, 15));
        spinstock = new javax.swing.JSpinner();
        spinstock.setFont(new Font("Tahoma", Font.PLAIN, 15));
        jLabel11 = new javax.swing.JLabel();
        jLabel11.setFont(new Font("Tahoma", Font.BOLD, 15));
        spinstockMAX = new javax.swing.JSpinner();
        spinstockMAX.setFont(new Font("Tahoma", Font.PLAIN, 15));
        jLabel12 = new javax.swing.JLabel();
        jLabel12.setFont(new Font("Tahoma", Font.BOLD, 15));
        spinstockMIN = new javax.swing.JSpinner();
        spinstockMIN.setFont(new Font("Tahoma", Font.PLAIN, 15));
        
                jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
                
                        jLabel3.setText("Nombre");
                                
                                        txtNombreProduc.addKeyListener(new java.awt.event.KeyAdapter() {
                                            public void keyPressed(java.awt.event.KeyEvent evt) {
                                                txtNombreEquipKeyPressed(evt);
                                            }
                                        });
                                        
                                                btnLimpiar.setText("Limpiar");
                                                btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
                                                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                                                        btnLimpiarActionPerformed(evt);
                                                    }
                                                });
                                                                        
                                                                                jLabel4.setText("Stock");
                                                                                
                                                                                        spinstock.setModel(new SpinnerNumberModel(new Integer(1), new Integer(1), null, new Integer(1)));
                                                                                        
                                                                                                jLabel11.setText("Existencias maximas");
                                                                                                
                                                                                                        spinstockMAX.setModel(new SpinnerNumberModel(new Integer(1), new Integer(1), null, new Integer(1)));
                                                                                                        
                                                                                                                jLabel12.setText("Existencias minimas");
                                                                                                                
                                                                                                                        spinstockMIN.setModel(new SpinnerNumberModel(new Integer(1), new Integer(1), null, new Integer(1)));
                                                                                                                                lblDescipcion = new JLabel("Descipcion");
                                                                                                                                lblDescipcion.setFont(new Font("Tahoma", Font.BOLD, 15));
                                                                                                                                btnRegistrar = new JButton("Registrar");
                                                                                                                                btnRegistrar.setFont(new Font("Tahoma", Font.PLAIN, 15));
                                                                                                                                btnRegistrar.addActionListener(this);
                                                                                                                                {
                                                                                                                                   txtDescripcion = new JTextField();
                                                                                                                                   txtDescripcion.setFont(new Font("Tahoma", Font.PLAIN, 15));
                                                                                                                                      txtDescripcion.setColumns(10);
                                                                                                                                          }
                                                                                                                        
                                                                                                                                javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
                                                                                                                                jPanel4Layout.setHorizontalGroup(
                                                                                                                                	jPanel4Layout.createParallelGroup(Alignment.LEADING)
                                                                                                                                		.addGroup(jPanel4Layout.createSequentialGroup()
                                                                                                                                			.addGap(31)
                                                                                                                                			.addGroup(jPanel4Layout.createParallelGroup(Alignment.LEADING)
                                                                                                                                				.addComponent(lblDescipcion, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE)
                                                                                                                                				.addGroup(jPanel4Layout.createSequentialGroup()
                                                                                                                                					.addGroup(jPanel4Layout.createParallelGroup(Alignment.TRAILING, false)
                                                                                                                                						.addComponent(jLabel12, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                                                                						.addComponent(jLabel3, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 83, GroupLayout.PREFERRED_SIZE)
                                                                                                                                						.addComponent(jLabel4, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE)
                                                                                                                                						.addComponent(jLabel11, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                                                                                                					.addPreferredGap(ComponentPlacement.RELATED)
                                                                                                                                					.addGroup(jPanel4Layout.createParallelGroup(Alignment.LEADING)
                                                                                                                                						.addGroup(jPanel4Layout.createSequentialGroup()
                                                                                                                                							.addPreferredGap(ComponentPlacement.RELATED)
                                                                                                                                							.addGroup(jPanel4Layout.createParallelGroup(Alignment.TRAILING, false)
                                                                                                                                								.addComponent(txtDescripcion, Alignment.LEADING)
                                                                                                                                								.addComponent(txtNombreProduc, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE)))
                                                                                                                                						.addGroup(jPanel4Layout.createSequentialGroup()
                                                                                                                                							.addGap(31)
                                                                                                                                							.addGroup(jPanel4Layout.createParallelGroup(Alignment.TRAILING)
                                                                                                                                								.addComponent(spinstockMAX, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                                                                                                                                								.addComponent(spinstock, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                                                                                                                                								.addComponent(spinstockMIN, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE))))))
                                                                                                                                			.addContainerGap(345, Short.MAX_VALUE))
                                                                                                                                		.addGroup(jPanel4Layout.createSequentialGroup()
                                                                                                                                			.addGap(344)
                                                                                                                                			.addComponent(btnRegistrar, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                                                                			.addGap(61)
                                                                                                                                			.addComponent(btnLimpiar, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                                                                			.addGap(356))
                                                                                                                                );
                                                                                                                                jPanel4Layout.setVerticalGroup(
                                                                                                                                	jPanel4Layout.createParallelGroup(Alignment.LEADING)
                                                                                                                                		.addGroup(jPanel4Layout.createSequentialGroup()
                                                                                                                                			.addGap(28)
                                                                                                                                			.addGroup(jPanel4Layout.createParallelGroup(Alignment.BASELINE)
                                                                                                                                				.addComponent(jLabel3)
                                                                                                                                				.addComponent(txtNombreProduc, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
                                                                                                                                			.addGap(31)
                                                                                                                                			.addGroup(jPanel4Layout.createParallelGroup(Alignment.BASELINE)
                                                                                                                                				.addComponent(lblDescipcion)
                                                                                                                                				.addComponent(txtDescripcion, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE))
                                                                                                                                			.addGap(32)
                                                                                                                                			.addGroup(jPanel4Layout.createParallelGroup(Alignment.BASELINE)
                                                                                                                                				.addComponent(jLabel4, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
                                                                                                                                				.addComponent(spinstock, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
                                                                                                                                			.addGap(18)
                                                                                                                                			.addGroup(jPanel4Layout.createParallelGroup(Alignment.BASELINE)
                                                                                                                                				.addComponent(jLabel11, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                                                                                                                                				.addComponent(spinstockMAX, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
                                                                                                                                			.addGap(26)
                                                                                                                                			.addGroup(jPanel4Layout.createParallelGroup(Alignment.BASELINE)
                                                                                                                                				.addComponent(jLabel12, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                                                                                                                                				.addComponent(spinstockMIN, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
                                                                                                                                			.addGap(72)
                                                                                                                                			.addGroup(jPanel4Layout.createParallelGroup(Alignment.BASELINE)
                                                                                                                                				.addComponent(btnLimpiar)
                                                                                                                                				.addComponent(btnRegistrar))
                                                                                                                                			.addContainerGap(56, Short.MAX_VALUE))
                                                                                                                                );
           jPanel4.setLayout(jPanel4Layout);
            jTabbedPane1.addTab("Productos", jPanel4);

        jPanelBusqueda.setLayout(null);

        tblProductos.setModel(new DefaultTableModel(
        	new Object[][] {
        	},
        	new String[] {
        		"ID", "Nombre", "Descripcion", "Estado", "Stock actual", "Stock maximo", "Stock minimo"
        	}
        ));
        tblProductos.getColumnModel().getColumn(5).setResizable(false);
        tblProductos.setToolTipText("");
        tblProductos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tblProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblEquipoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblProductos);

        jPanelBusqueda.add(jScrollPane1);
        jScrollPane1.setBounds(12, 72, 1052, 391);

        jTabbedPane1.addTab("Búqueda", jPanelBusqueda);
                jButton2 = new javax.swing.JButton();
                jButton2.setFont(new Font("Tahoma", Font.PLAIN, 15));
                jButton2.setBounds(471, 13, 60, 46);
                jPanelBusqueda.add(jButton2);
                
                        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/buscar.gif"))); // NOI18N
                        
                        btnEliminarReg = new JButton("Eliminar registro");
                        btnEliminarReg.setFont(new Font("Tahoma", Font.PLAIN, 15));
                        btnEliminarReg.addActionListener(this);
                        btnEliminarReg.setBounds(324, 27, 135, 25);
                        jPanelBusqueda.add(btnEliminarReg);
                        jButton2.addActionListener(new java.awt.event.ActionListener() {
                            public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButton2ActionPerformed(evt);
                            }
                        });

        lblTitulo.setFont(new java.awt.Font("Tahoma", 1, 24)); 
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("PRODUCTOS");
        btnSalir1 = new javax.swing.JButton();
        btnSalir1.setFont(new Font("Tahoma", Font.PLAIN, 15));
        
                btnSalir1.setText("Salir");
                btnSalir1.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        btnSalir1ActionPerformed(evt);
                    }
                });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(Alignment.TRAILING, layout.createSequentialGroup()
        					.addContainerGap(990, Short.MAX_VALUE)
        					.addComponent(btnSalir1, GroupLayout.PREFERRED_SIZE, 105, GroupLayout.PREFERRED_SIZE))
        				.addGroup(layout.createSequentialGroup()
        					.addGap(23)
        					.addComponent(jTabbedPane1, GroupLayout.PREFERRED_SIZE, 1072, Short.MAX_VALUE))
        				.addGroup(layout.createSequentialGroup()
        					.addGap(285)
        					.addComponent(lblTitulo, GroupLayout.PREFERRED_SIZE, 500, GroupLayout.PREFERRED_SIZE)))
        			.addContainerGap())
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap()
        			.addComponent(lblTitulo)
        			.addGap(18)
        			.addComponent(jTabbedPane1, GroupLayout.DEFAULT_SIZE, 521, Short.MAX_VALUE)
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addComponent(btnSalir1, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
        			.addGap(32))
        );
        getContentPane().setLayout(layout);

        pack();
    }

    private void tblEquipoMouseClicked(java.awt.event.MouseEvent evt) {

    }

    private void txtNombreEquipKeyPressed(java.awt.event.KeyEvent evt) {
        if(evt.getKeyCode() == evt.VK_ENTER){
            this.getFocusOwner().transferFocus();
        }
    }


    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnSalir1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanelBusqueda;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JSpinner spinstock;
    private javax.swing.JSpinner spinstockMAX;
    private javax.swing.JSpinner spinstockMIN;
    private javax.swing.JTable tblProductos;
    private javax.swing.JTextField txtNombreProduc;
    private JLabel lblDescipcion;
    private JTextField txtDescripcion;
    private JButton btnRegistrar;
    private JButton btnEliminarReg;

    public void llenaTabla()
    {
         List<Producto> produc = _Productobo.readAll();
         int i = produc.size(); 
         for(int j = 0; j<i;j++){
          Vector vect = new Vector();
          vect.addElement(produc.get(j).getIdProducto());
          vect.addElement(produc.get(j).getNombre());
          vect.addElement(produc.get(j).getDescripcion());
          vect.addElement(produc.get(j).getEstado());
          vect.addElement(produc.get(j).getStock());
          vect.addElement(produc.get(j).getStockMax());
          vect.addElement(produc.get(j).getStockMin());
          dtm.addRow(vect);
        }
            
    } 
    public void limpiaControles(){
        txtNombreProduc.setText("");
        txtDescripcion.setText("");
        spinstock.setValue(1);
        spinstockMAX.setValue(1);
        spinstockMIN.setValue(1);
        txtNombreProduc.requestFocus();
    }
      
    public void limpiaTabla(){
        DefaultTableModel dm = (DefaultTableModel)tblProductos.getModel();
        if(dm.getRowCount()>0){
            while(dm.getRowCount()>0){
                dm.removeRow(dm.getRowCount()-1);
            }
        }
    }
    public boolean valida(){
        boolean boolIsValid = false;
        if(txtNombreProduc.getText().equals("")){
           JOptionPane.showMessageDialog(this, "Ingrese Nombre del Producto");
           return boolIsValid;
        }
        if(txtDescripcion.getText().equals("")){
              JOptionPane.showMessageDialog(this, "Ingrese una descripción");
              return boolIsValid;
        }
        
        return boolIsValid = true;
    }
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
		int x ;
	    x = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el código del Producto"));
	    try {
	        Producto producto = _Productobo.Find(x);
	        if (producto != null) {
	            JOptionPane.showMessageDialog(this, "Se encontró el registro con éxito");
	        } else {
	            JOptionPane.showMessageDialog(this, "No existe el registro con el código ingresado");
	        }
	    } catch (Exception ex) {
	        ex.printStackTrace();
	        JOptionPane.showMessageDialog(this, "Ocurrió un error al buscar el registro");
	    }
          
       }
        
    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {
        limpiaControles();
    }
    
    private void btnSalir1ActionPerformed(java.awt.event.ActionEvent evt) {
        this.dispose();
    }

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnEliminarReg) {
			do_btnEliminarReg_actionPerformed(e);
		}
		if (e.getSource() == btnRegistrar) {
			do_btnRegistrar_actionPerformed(e);
		}
	}
	protected void do_btnRegistrar_actionPerformed(ActionEvent e) {
		int id = 0;

        if(valida())
        {
              Producto p = new Producto();
              p.setNombre(txtNombreProduc.getText());
              p.setDescripcion(txtDescripcion.getText());
              p.setStock(Integer.parseInt(spinstock.getValue().toString()));
              p.setStockMax(Integer.parseInt(spinstockMAX.getValue().toString()));
              p.setStockMin(Integer.parseInt(spinstockMIN.getValue().toString()));
              p.setIdProducto(id);
              _Productobo.Create(p);
              limpiaControles();
              limpiaTabla();
              llenaTabla();
              JOptionPane.showMessageDialog(this, "Se registro con exito");
        }
	}
	protected void do_btnEliminarReg_actionPerformed(ActionEvent e) {
		try{
			 int id= Integer.parseInt(String.valueOf(dtm.getValueAt(tblProductos.getSelectedRow(),0)));
			 _Productobo.Delete(id);
				 limpiaTabla();
		         llenaTabla();
		         JOptionPane.showMessageDialog(this, "Se elimnó el resgistro con éxito");
		 }
		 catch(Exception e1){
			 System.out.println(e1);
		 }
	}
}
