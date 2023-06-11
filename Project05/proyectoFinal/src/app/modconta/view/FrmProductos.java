package app.modconta.view;
import app.modconta.business.ProductoBO;
import app.modconta.databaase.Helper;
import app.modconta.databaase.dbBean;
import app.modconta.databaase.util;
import app.modconta.entity.Producto;
import MODEL.ProductoDAO;
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
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class FrmProductos extends javax.swing.JInternalFrame {
    
    Helper h = new Helper();
    ProductoBO _Productobo;
    DefaultTableModel dtm;
    int idEqui; 
    public FrmProductos() {
        initComponents();    
        dtm = (DefaultTableModel)tblEquipo.getModel();
        _Productobo = new ProductoBO();
        LeerProductosGrid();    
    }
    
    public void LeerProductosGrid()
    {
         List<Producto> equip = _Productobo.readAll();
        int i = equip.size(); 
        for(int j = 0; j<i;j++){
          Vector vect = new Vector();
          vect.addElement(equip.get(j).getIdProducto());
          vect.addElement(equip.get(j).getNombre());
          vect.addElement(equip.get(j).getStock());
          vect.addElement(equip.get(j).getStockMax());
          vect.addElement(equip.get(j).getStockMin());
          vect.addElement(equip.get(j).getIdModelo());
          dtm.addRow(vect);
        }
            
    } 
public void limpiaControles(){
        this.txtNombreProduc.setText("");
        this.btnRegistrar.setText("Registrar");
        this.txtNombreProduc.requestFocus();
    }
      
    public void limpiaTabla(){
        DefaultTableModel dm = (DefaultTableModel)this.tblEquipo.getModel();
        if(dm.getRowCount()>0){
            while(dm.getRowCount()>0){
                dm.removeRow(dm.getRowCount()-1);
            }
        }
    }
    public boolean valida(){
        boolean sw = false;
        if(this.txtNombreProduc.getText().equals("")){
           JOptionPane.showMessageDialog(this, "Ingrese Nombre del Product");
        }else{
           if(this.txtNombreProduc.getText().equals("")){
                JOptionPane.showMessageDialog(this, "Ingresa bien");
            }
           else{
                sw = true;  
        }
    }
        return sw;
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel6 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        txtNombre2 = new javax.swing.JTextField();
        btnLimpiar2 = new javax.swing.JButton();
        btnRegistrar2 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jPanel5 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        txtNombre1 = new javax.swing.JTextField();
        btnLimpiar1 = new javax.swing.JButton();
        btnRegistrar1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblEquipo = new javax.swing.JTable();
        jComboBox4 = new javax.swing.JComboBox<>();
        jTextField2 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        lblTitulo = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("PRODUCTOS");
        setAutoscrolls(true);
        setFrameIcon(null);
        setVisible(true);

        jTabbedPane1.setMaximumSize(new java.awt.Dimension(32769, 32769));

        jPanel6.setLayout(null);

        jLabel13.setText("Nombre");
        jPanel6.add(jLabel13);
        jLabel13.setBounds(40, 20, 50, 30);

        txtNombre2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombre2ActionPerformed(evt);
            }
        });
        txtNombre2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNombre2KeyPressed(evt);
            }
        });
        jPanel6.add(txtNombre2);
        txtNombre2.setBounds(100, 20, 370, 30);

        btnLimpiar2.setText("Limpiar");
        btnLimpiar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiar2ActionPerformed(evt);
            }
        });
        jPanel6.add(btnLimpiar2);
        btnLimpiar2.setBounds(290, 120, 120, 25);

        btnRegistrar2.setText("Registrar");
        btnRegistrar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrar2ActionPerformed(evt);
            }
        });
        btnRegistrar2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnRegistrar2KeyPressed(evt);
            }
        });
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        lblMarca = new javax.swing.JLabel();
        txtNombreProduc = new javax.swing.JTextField();
        btnLimpiar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        comboMarca = new javax.swing.JComboBox<>();
        comboModelo = new javax.swing.JComboBox<>();
        btnRegistrar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        spinstock = new javax.swing.JSpinner();
        jLabel11 = new javax.swing.JLabel();
        spinstockMAX = new javax.swing.JSpinner();
        jLabel12 = new javax.swing.JLabel();
        spinstockMIN = new javax.swing.JSpinner();
        
                jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
                
                        jLabel3.setText("Nombre");
                        
                                lblMarca.setText("Marca");
                                
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
                                                
                                                        jLabel6.setText("Modelo");
                                                        
                                                                comboMarca.addMouseListener(new java.awt.event.MouseAdapter() {
                                                                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                                                                        comboMarcaMouseClicked(evt);
                                                                    }
                                                                });
                                                                comboMarca.addActionListener(new java.awt.event.ActionListener() {
                                                                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                                                                        comboMarcaActionPerformed(evt);
                                                                    }
                                                                });
                                                                
                                                                        btnRegistrar.setText("Registrar");
                                                                        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
                                                                            public void actionPerformed(java.awt.event.ActionEvent evt) {
                                                                                btnRegistrarActionPerformed(evt);
                                                                            }
                                                                        });
                                                                        
                                                                                jLabel4.setText("Stock");
                                                                                
                                                                                        spinstock.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
                                                                                        
                                                                                                jLabel11.setText("Existencias maximas");
                                                                                                
                                                                                                        spinstockMAX.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
                                                                                                        
                                                                                                                jLabel12.setText("Existencias minimas");
                                                                                                                
                                                                                                                        spinstockMIN.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
                                                                                                                        
                                                                                                                        lblId = new JLabel();
                                                                                                                        lblId.setText("ID");
                                                                                                                        
                                                                                                                        txtIDProduc = new JTextField();
                                                                                                                        
                                                                                                                                javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
                                                                                                                                jPanel4Layout.setHorizontalGroup(
                                                                                                                                	jPanel4Layout.createParallelGroup(Alignment.LEADING)
                                                                                                                                		.addGroup(jPanel4Layout.createSequentialGroup()
                                                                                                                                			.addGroup(jPanel4Layout.createParallelGroup(Alignment.LEADING)
                                                                                                                                				.addGroup(jPanel4Layout.createSequentialGroup()
                                                                                                                                					.addGap(31)
                                                                                                                                					.addGroup(jPanel4Layout.createParallelGroup(Alignment.LEADING)
                                                                                                                                						.addGroup(jPanel4Layout.createSequentialGroup()
                                                                                                                                							.addGroup(jPanel4Layout.createParallelGroup(Alignment.LEADING)
                                                                                                                                								.addComponent(jLabel3, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
                                                                                                                                								.addComponent(lblMarca, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)
                                                                                                                                								.addComponent(jLabel6, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE))
                                                                                                                                							.addGap(18)
                                                                                                                                							.addGroup(jPanel4Layout.createParallelGroup(Alignment.LEADING)
                                                                                                                                								.addComponent(comboMarca, GroupLayout.PREFERRED_SIZE, 310, GroupLayout.PREFERRED_SIZE)
                                                                                                                                								.addComponent(comboModelo, GroupLayout.PREFERRED_SIZE, 310, GroupLayout.PREFERRED_SIZE)))
                                                                                                                                						.addGroup(jPanel4Layout.createParallelGroup(Alignment.LEADING)
                                                                                                                                							.addGroup(jPanel4Layout.createSequentialGroup()
                                                                                                                                								.addComponent(jLabel11, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)
                                                                                                                                								.addPreferredGap(ComponentPlacement.RELATED)
                                                                                                                                								.addComponent(spinstockMAX, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE))
                                                                                                                                							.addGroup(jPanel4Layout.createSequentialGroup()
                                                                                                                                								.addComponent(jLabel12, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE)
                                                                                                                                								.addGap(18)
                                                                                                                                								.addComponent(spinstockMIN, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE))
                                                                                                                                							.addGroup(jPanel4Layout.createSequentialGroup()
                                                                                                                                								.addComponent(jLabel4, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
                                                                                                                                								.addGap(18)
                                                                                                                                								.addComponent(spinstock, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)))))
                                                                                                                                				.addGroup(jPanel4Layout.createSequentialGroup()
                                                                                                                                					.addGap(39)
                                                                                                                                					.addComponent(lblId, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
                                                                                                                                					.addPreferredGap(ComponentPlacement.RELATED)
                                                                                                                                					.addGroup(jPanel4Layout.createParallelGroup(Alignment.LEADING)
                                                                                                                                						.addComponent(txtNombreProduc, GroupLayout.PREFERRED_SIZE, 310, GroupLayout.PREFERRED_SIZE)
                                                                                                                                						.addComponent(txtIDProduc, GroupLayout.PREFERRED_SIZE, 310, GroupLayout.PREFERRED_SIZE)))
                                                                                                                                				.addGroup(jPanel4Layout.createSequentialGroup()
                                                                                                                                					.addGap(268)
                                                                                                                                					.addComponent(btnLimpiar, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE)
                                                                                                                                					.addGap(61)
                                                                                                                                					.addComponent(btnRegistrar, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)))
                                                                                                                                			.addContainerGap(297, Short.MAX_VALUE))
                                                                                                                                );
                                                                                                                                jPanel4Layout.setVerticalGroup(
                                                                                                                                	jPanel4Layout.createParallelGroup(Alignment.LEADING)
                                                                                                                                		.addGroup(jPanel4Layout.createSequentialGroup()
                                                                                                                                			.addContainerGap()
                                                                                                                                			.addGroup(jPanel4Layout.createParallelGroup(Alignment.BASELINE)
                                                                                                                                				.addComponent(lblId)
                                                                                                                                				.addComponent(txtIDProduc, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
                                                                                                                                			.addGap(13)
                                                                                                                                			.addGroup(jPanel4Layout.createParallelGroup(Alignment.BASELINE)
                                                                                                                                				.addComponent(jLabel3)
                                                                                                                                				.addComponent(txtNombreProduc, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
                                                                                                                                			.addGap(18)
                                                                                                                                			.addGroup(jPanel4Layout.createParallelGroup(Alignment.BASELINE)
                                                                                                                                				.addComponent(lblMarca, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
                                                                                                                                				.addComponent(comboMarca, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                                                                                                                			.addGap(27)
                                                                                                                                			.addGroup(jPanel4Layout.createParallelGroup(Alignment.BASELINE)
                                                                                                                                				.addComponent(jLabel6, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
                                                                                                                                				.addComponent(comboModelo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                                                                                                                			.addGap(28)
                                                                                                                                			.addGroup(jPanel4Layout.createParallelGroup(Alignment.BASELINE)
                                                                                                                                				.addComponent(jLabel4, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
                                                                                                                                				.addComponent(spinstock, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
                                                                                                                                			.addGap(29)
                                                                                                                                			.addGroup(jPanel4Layout.createParallelGroup(Alignment.BASELINE)
                                                                                                                                				.addComponent(jLabel11, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                                                                                                                                				.addComponent(spinstockMAX, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
                                                                                                                                			.addPreferredGap(ComponentPlacement.UNRELATED)
                                                                                                                                			.addGroup(jPanel4Layout.createParallelGroup(Alignment.BASELINE)
                                                                                                                                				.addComponent(jLabel12, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                                                                                                                                				.addComponent(spinstockMIN, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
                                                                                                                                			.addGap(50)
                                                                                                                                			.addGroup(jPanel4Layout.createParallelGroup(Alignment.BASELINE)
                                                                                                                                				.addComponent(btnRegistrar)
                                                                                                                                				.addComponent(btnLimpiar))
                                                                                                                                			.addContainerGap(81, Short.MAX_VALUE))
                                                                                                                                );
                                                                                                                                jPanel4.setLayout(jPanel4Layout);
                                                                                                                                
                                                                                                                                        jTabbedPane1.addTab("Productos", jPanel4);
        jPanel6.add(btnRegistrar2);
        btnRegistrar2.setBounds(170, 120, 110, 25);

        jLabel14.setText("Marca");
        jPanel6.add(jLabel14);
        jLabel14.setBounds(40, 70, 35, 16);

        jPanel6.add(jComboBox2);
        jComboBox2.setBounds(100, 60, 80, 30);

        jTabbedPane1.addTab("Modelos", jPanel6);

        jPanel5.setLayout(null);

        jLabel8.setText("Nombre");
        jPanel5.add(jLabel8);
        jLabel8.setBounds(50, 20, 60, 20);

        txtNombre1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNombre1KeyPressed(evt);
            }
        });
        jPanel5.add(txtNombre1);
        txtNombre1.setBounds(120, 20, 320, 30);

        btnLimpiar1.setText("Limpiar");
        btnLimpiar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiar1ActionPerformed(evt);
            }
        });
        jPanel5.add(btnLimpiar1);
        btnLimpiar1.setBounds(320, 70, 120, 25);

        btnRegistrar1.setText("Registrar");
        btnRegistrar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrar1ActionPerformed(evt);
            }
        });
        btnRegistrar1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnRegistrar1KeyPressed(evt);
            }
        });
        jPanel5.add(btnRegistrar1);
        btnRegistrar1.setBounds(200, 70, 110, 25);

        jTabbedPane1.addTab("Marcas", jPanel5);

        jPanel3.setLayout(null);

        jLabel2.setText("Tipo");
        jPanel3.add(jLabel2);
        jLabel2.setBounds(30, 28, 70, 30);

        tblEquipo.setModel(new DefaultTableModel(
        	new Object[][] {
        	},
        	new String[] {
        		"ID", "Nombre", "Marca", "Modelo", "Stock actual", "Stock maximo", "Stock minimo"
        	}
        ));
        tblEquipo.getColumnModel().getColumn(5).setResizable(false);
        tblEquipo.setToolTipText("");
        tblEquipo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tblEquipo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblEquipoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblEquipo);

        jPanel3.add(jScrollPane1);
        jScrollPane1.setBounds(30, 110, 800, 350);

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel3.add(jComboBox4);
        jComboBox4.setBounds(110, 28, 310, 30);
        jPanel3.add(jTextField2);
        jTextField2.setBounds(110, 69, 310, 30);

        jLabel15.setText("Búsqueda");
        jPanel3.add(jLabel15);
        jLabel15.setBounds(30, 69, 70, 30);

        jTabbedPane1.addTab("Búqueda", jPanel3);
        jButton1 = new javax.swing.JButton();
        jButton1.setBounds(454, 38, 235, 32);
        jPanel3.add(jButton1);
        
                jButton1.setText("Generar reporte de productos");
                jButton2 = new javax.swing.JButton();
                jButton2.setBounds(699, 28, 60, 46);
                jPanel3.add(jButton2);
                
                        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/buscar.gif"))); // NOI18N
                        jButton2.addActionListener(new java.awt.event.ActionListener() {
                            public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButton2ActionPerformed(evt);
                            }
                        });
                jButton1.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        jButton1ActionPerformed(evt);
                    }
                });

        lblTitulo.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("PRODUCTOS");
        btnSalir1 = new javax.swing.JButton();
        
                btnSalir1.setText("Salir");
                btnSalir1.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        btnSalir1ActionPerformed(evt);
                    }
                });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap(261, Short.MAX_VALUE)
        			.addComponent(lblTitulo, GroupLayout.PREFERRED_SIZE, 500, GroupLayout.PREFERRED_SIZE)
        			.addGap(184))
        		.addGroup(Alignment.LEADING, layout.createSequentialGroup()
        			.addGap(22)
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addComponent(btnSalir1, GroupLayout.PREFERRED_SIZE, 105, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jTabbedPane1, GroupLayout.PREFERRED_SIZE, 853, GroupLayout.PREFERRED_SIZE))
        			.addContainerGap(70, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap()
        			.addComponent(lblTitulo)
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addComponent(jTabbedPane1, GroupLayout.PREFERRED_SIZE, 526, GroupLayout.PREFERRED_SIZE)
        			.addGap(18)
        			.addComponent(btnSalir1, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
        			.addGap(80))
        );
        getContentPane().setLayout(layout);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblEquipoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblEquipoMouseClicked
        if(evt.getClickCount() == 1){
            this.jTabbedPane1.setSelectedIndex(1);
            //   llenaModifica();
        }
    }//GEN-LAST:event_tblEquipoMouseClicked

    private void txtNombreEquipKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreEquipKeyPressed
        if(evt.getKeyCode() == evt.VK_ENTER){
            this.getFocusOwner().transferFocus();
        }
    }//GEN-LAST:event_txtNombreEquipKeyPressed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        // limpiaControles();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void txtNombre1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombre1KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombre1KeyPressed

    private void btnLimpiar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLimpiar1ActionPerformed

    private void btnRegistrar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRegistrar1ActionPerformed

    private void btnRegistrar1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnRegistrar1KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRegistrar1KeyPressed

    private void btnRegistrar2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnRegistrar2KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRegistrar2KeyPressed

    private void btnRegistrar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrar2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRegistrar2ActionPerformed

    private void btnLimpiar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiar2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLimpiar2ActionPerformed

    private void txtNombre2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombre2KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombre2KeyPressed

    private void btnSalir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalir1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSalir1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         try {
              dbBean aux = new dbBean();
              //Connection cn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=ST;user=sa;password=sasasa;");
              Connection cn = aux.getConnection();
              JasperReport jr= JasperCompileManager.compileReport("src/REPORTS/EquipoReporte.jrxml");
              JasperPrint jp= JasperFillManager.fillReport(jr,null,cn);
              JasperViewer jv= new JasperViewer(jp,false);
              jv.setVisible(true);
        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void comboMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboMarcaActionPerformed

     comboModelo.setModel(h.getvaluesofModelo("Modelo",comboMarca.getSelectedItem().toString()));   
    }//GEN-LAST:event_comboMarcaActionPerformed

    private void comboMarcaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_comboMarcaMouseClicked
    
    }//GEN-LAST:event_comboMarcaMouseClicked

      
    
    
    
    
    private void txtNombre2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombre2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombre2ActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
  
        String proc = this.btnRegistrar.getText();
        int id = 0, est;
        String pr = "";
        if(valida() == true)
        {
            //this.spincant.getValue().toString()
              util u = new util();
              Producto eq = new Producto();
              eq.setNombre(this.txtNombreProduc.getText());
              JOptionPane.showMessageDialog(this, "ya esta nombre" );
              System.out.println(this.comboMarca.getSelectedItem().toString());
              //eq.marc.setNombre(this.comboMarca.getSelectedItem().toString());
            //  eq.setMarc(this.comboMarca.getSelectedItem().toString());
             // JOptionPane.showMessageDialog(this, "ya esta marca" );
             // eq.setMode(this.comboModelo.getSelectedItem().toString());
             // JOptionPane.showMessageDialog(this, "ya esta modelo" );
              JOptionPane.showMessageDialog(this, "ya esta so" );
              JOptionPane.showMessageDialog(this, "ok" );
              JOptionPane.showMessageDialog(this, "ok" );
              eq.setStock(Integer.parseInt(this.spinstock.getValue().toString()));
              eq.setStockMax(Integer.parseInt(this.spinstockMAX.getValue().toString()));
              eq.setStockMin(Integer.parseInt(this.spinstockMIN.getValue().toString()));
              JOptionPane.showMessageDialog(this, "ok" );
             // eq.setIdModelo(ProductoDAO.FindID(this.comboModelo.getSelectedItem().toString()));
           if(proc.equals("Registrar")){
                id = u.idNext("Equipo", "idEquipo");
                pr = "insert";
            }
            if(proc.equals("Actualizar")){
               id = this.idEqui;
                pr = "update";
            }
            eq.setIdProducto(id);
            //ProductoDAO.procesaItem(eq, pr);
            limpiaControles();
            limpiaTabla();
            this.LeerProductosGrid();
        }

        
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
     int x ;
     x = Integer.parseInt(JOptionPane.showInputDialog(" Ingrese el codigo del Producto"));
      try { 
            //creamos un objeto dbBean
              dbBean aux = new dbBean();
              HashMap map = new HashMap();
              //Connection cn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=ST;user=sa;password=sasasa;");
              Connection cn = aux.getConnection();
              JasperReport jr= JasperCompileManager.compileReport("src/REPORTS/EquipoReporte.jrxml");
              map.put("idCliente",x); 
              JasperPrint jp = JasperFillManager.fillReport(jr,map,cn);
            // JasperPrint jp= JasperFillManager.fillReport(jr,idClie,cn);
              
              JasperViewer jv= new JasperViewer(jp,false);
              jv.setVisible(true);
        } catch (Exception e) {
            System.out.println(e);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

 
          

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnLimpiar1;
    private javax.swing.JButton btnLimpiar2;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnRegistrar1;
    private javax.swing.JButton btnRegistrar2;
    private javax.swing.JButton btnSalir1;
    private javax.swing.JComboBox<String> comboMarca;
    private javax.swing.JComboBox<String> comboModelo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JLabel lblMarca;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JSpinner spinstock;
    private javax.swing.JSpinner spinstockMAX;
    private javax.swing.JSpinner spinstockMIN;
    private javax.swing.JTable tblEquipo;
    private javax.swing.JTextField txtNombre1;
    private javax.swing.JTextField txtNombre2;
    private javax.swing.JTextField txtNombreProduc;
    private JLabel lblId;
    private JTextField txtIDProduc;
    // End of variables declaration//GEN-END:variables

}
