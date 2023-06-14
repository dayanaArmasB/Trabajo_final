package app.modconta.view;
import app.modconta.databaase.Helper;
import app.modconta.databaase.dbBean;
import app.modconta.databaase.util;
import app.modconta.entity.DetalleVenta;
import app.modconta.entity.Venta;
import MODEL.ProductoDAO;
import MODEL.VentaDAO;
import MODEL.detvenDAO;
import java.sql.Connection;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
//import jdk.nashorn.internal.scripts.JS;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentaView extends javax.swing.JInternalFrame implements ActionListener {
    ProductoDAO eqx = new ProductoDAO();
    VentaDAO vendao = new VentaDAO();
    detvenDAO detdao= new detvenDAO();
    Helper h = new Helper();
    boolean sw = false;
    String cad = "";
    int idEmp; 
    DefaultTableModel dtm;
    
    //variables para calcular
    private float importexd= 0;
    //el imorte es lo mismo que el subtotal
    // private float subTotal = 0;
    private float subtotal = 0; 
    private float descuento = 0;
    private float igv = 0;
    private float total = 0; 
    private int posicionRegistro = 0;
    int items = 0;
    
     int idx=0;
     
     
    public VentaView() 
    {
    	setTitle("VENTAS");   
        util utile = new util();
        initComponents(); 
        idx = utile.idNext("Venta", "idVenta");
        dtm = (DefaultTableModel)tblDetVen.getModel();
        // combo lista lista los clientes 
        comboCliente.setModel(h.getvalues("Cliente"));
        comboTienda.setModel(h.getvaluesTienda("Tienda"));
        AutoCompleteDecorator.decorate(comboCliente);
        AutoCompleteDecorator.decorate(comboTienda);
        //los botones de DetalleVenta están desactivados
        comboVendedor.setEnabled(false);
        comboEquipo.setEnabled(false);
        txtpunit.enable(false);
        spincant.setEnabled(false);
        txtdes.setEnabled(false);
        int xstring=idx;
  
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        cmbfecha_ven = new com.toedter.calendar.JDateChooser();
        jLabel13 = new javax.swing.JLabel();
        numFACTURA = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        setIconifiable(true);
        setMaximizable(true);

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel4.setText("Fecha de emisi\u00F3n");

        cmbfecha_ven.setDate(Calendar.getInstance().getTime());
        cmbfecha_ven.setPreferredSize(new java.awt.Dimension(120, 20));

        jLabel13.setText("N\u00B0 FACTURA");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2Layout.setHorizontalGroup(
        	jPanel2Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel2Layout.createSequentialGroup()
        			.addGap(22)
        			.addComponent(jLabel13)
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addComponent(numFACTURA, GroupLayout.PREFERRED_SIZE, 187, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.RELATED, 165, Short.MAX_VALUE)
        			.addComponent(jLabel4)
        			.addGap(18)
        			.addComponent(cmbfecha_ven, GroupLayout.PREFERRED_SIZE, 169, GroupLayout.PREFERRED_SIZE)
        			.addGap(34))
        );
        jPanel2Layout.setVerticalGroup(
        	jPanel2Layout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(jPanel2Layout.createSequentialGroup()
        			.addGroup(jPanel2Layout.createParallelGroup(Alignment.TRAILING)
        				.addGroup(jPanel2Layout.createSequentialGroup()
        					.addContainerGap()
        					.addComponent(cmbfecha_ven, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE))
        				.addGroup(jPanel2Layout.createSequentialGroup()
        					.addGap(26)
        					.addGroup(jPanel2Layout.createParallelGroup(Alignment.BASELINE)
        						.addComponent(jLabel13, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        						.addComponent(jLabel4, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        						.addComponent(numFACTURA, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE))))
        			.addGap(19))
        );
        jPanel2.setLayout(jPanel2Layout);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("AREA DE VENTAS");

        jButton5.setText("Cancelar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton2.setText("Generar Factura");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Nueva Venta");
        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        comboCliente = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        comboEquipo = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        spincant = new javax.swing.JSpinner();
        btnAgregar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDetVen = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jLabel10 = new javax.swing.JLabel();
        txtpunit = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        combo_formapag = new javax.swing.JComboBox<>();
        comboVendedor = new javax.swing.JComboBox<>();
        comboTienda = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        btnRegistrar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        txtdes = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        jPanelrbtn2 = new javax.swing.JPanel();
        jRadioButton5 = new javax.swing.JRadioButton();
        jRadioButton6 = new javax.swing.JRadioButton();
        jPanel3 = new javax.swing.JPanel();
        jRadioButton7 = new javax.swing.JRadioButton();
        jRadioButton8 = new javax.swing.JRadioButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        txtItems = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txtsubtotal = new javax.swing.JTextField();
        txtigv = new javax.swing.JTextField();
        txttotal = new javax.swing.JTextField();
        btnGenerarVenta = new javax.swing.JButton();
        
                jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
                
                        jLabel8.setText("Cliente");
                        
                                comboCliente.setEditable(true);
                                comboCliente.addActionListener(new java.awt.event.ActionListener() {
                                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                                        comboClienteActionPerformed(evt);
                                    }
                                });
                                
                                        jLabel9.setText("Vendedor");
                                        
                                                jLabel2.setText("Producto");
                                                
                                                        comboEquipo.setEditable(true);
                                                        comboEquipo.addActionListener(new java.awt.event.ActionListener() {
                                                            public void actionPerformed(java.awt.event.ActionEvent evt) {
                                                                comboEquipoActionPerformed(evt);
                                                            }
                                                        });
                                                        
                                                                jLabel3.setText("Cantidad");
                                                                
                                                                        spincant.setModel(new javax.swing.SpinnerNumberModel(0, 0, 10000, 1));
                                                                        
                                                                                btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/agregar.png"))); // NOI18N
                                                                                btnAgregar.addActionListener(new java.awt.event.ActionListener() {
                                                                                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                                                                                        btnAgregarActionPerformed(evt);
                                                                                    }
                                                                                });
                                                                                
                                                                                        tblDetVen.setModel(new DefaultTableModel(
                                                                                        	new Object[][] {
                                                                                        	},
                                                                                        	new String[] {
                                                                                        		"ID", "Nombre", "Cantidad", "Precio unitario", "Importe", "Observaciones"
                                                                                        	}
                                                                                        ));
                                                                                        tblDetVen.addAncestorListener(new javax.swing.event.AncestorListener() {
                                                                                            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
                                                                                            }
                                                                                            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                                                                                                tblDetVenAncestorAdded(evt);
                                                                                            }
                                                                                            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
                                                                                            }
                                                                                        });
                                                                                        jScrollPane1.setViewportView(tblDetVen);
                                                                                        
                                                                                                jLabel7.setText("Observaci\u00F3n");
                                                                                                        
                                                                                                                jLabel10.setText("Precio unitario");
                                                                                                                
                                                                                                                        txtpunit.addActionListener(new java.awt.event.ActionListener() {
                                                                                                                            public void actionPerformed(java.awt.event.ActionEvent evt) {
                                                                                                                                txtpunitActionPerformed(evt);
                                                                                                                            }
                                                                                                                        });
                                                                                                                        
                                                                                                                                jLabel6.setText("Forma de pago");
                                                                                                                                
                                                                                                                                        combo_formapag.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Al contado", "Por cuotas" }));
                                                                                                                                        combo_formapag.addActionListener(new java.awt.event.ActionListener() {
                                                                                                                                            public void actionPerformed(java.awt.event.ActionEvent evt) {
                                                                                                                                                combo_formapagActionPerformed(evt);
                                                                                                                                            }
                                                                                                                                        });
                                                                                                                                        
                                                                                                                                                comboVendedor.setEditable(true);
                                                                                                                                                comboVendedor.addActionListener(new java.awt.event.ActionListener() {
                                                                                                                                                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                                                                                                                                                        comboVendedorActionPerformed(evt);
                                                                                                                                                    }
                                                                                                                                                });
                                                                                                                                                
                                                                                                                                                        comboTienda.setEditable(true);
                                                                                                                                                        
                                                                                                                                                                jLabel11.setText("Tienda");
                                                                                                                                                                
                                                                                                                                                                        btnRegistrar.setText("Aceptar");
                                                                                                                                                                        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
                                                                                                                                                                            public void actionPerformed(java.awt.event.ActionEvent evt) {
                                                                                                                                                                                btnRegistrarActionPerformed(evt);
                                                                                                                                                                            }
                                                                                                                                                                        });
                                                                                                                                                                        
                                                                                                                                                                                jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/update.png"))); // NOI18N
                                                                                                                                                                                
                                                                                                                                                                                        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/eliminar.png"))); // NOI18N
                                                                                                                                                                                        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
                                                                                                                                                                                            public void actionPerformed(java.awt.event.ActionEvent evt) {
                                                                                                                                                                                                btnEliminarActionPerformed(evt);
                                                                                                                                                                                            }
                                                                                                                                                                                        });
                                                                                                                                                                                        
                                                                                                                                                                                                jLabel12.setText("Descuento (%)");
                                                                                                                                                                                                
                                                                                                                                                                                                        txtdes.setText("0");
                                                                                                                                                                                                        
                                                                                                                                                                                                                jButton6.setText("Calculadora");
                                                                                                                                                                                                                
                                                                                                                                                                                                                        jPanelrbtn2.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "Estado"));
                                                                                                                                                                                                                        
                                                                                                                                                                                                                                jRadioButton5.setText("Cancelado");
                                                                                                                                                                                                                                
                                                                                                                                                                                                                                        jRadioButton6.setText("Pendiente de pago");
                                                                                                                                                                                                                                        jRadioButton6.addActionListener(new java.awt.event.ActionListener() {
                                                                                                                                                                                                                                            public void actionPerformed(java.awt.event.ActionEvent evt) {
                                                                                                                                                                                                                                                jRadioButton6ActionPerformed(evt);
                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                        });
                                                                                                                                                                                                                                        
                                                                                                                                                                                                                                                javax.swing.GroupLayout jPanelrbtn2Layout = new javax.swing.GroupLayout(jPanelrbtn2);
                                                                                                                                                                                                                                                jPanelrbtn2.setLayout(jPanelrbtn2Layout);
                                                                                                                                                                                                                                                jPanelrbtn2Layout.setHorizontalGroup(
                                                                                                                                                                                                                                                    jPanelrbtn2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                                                                                                                                                    .addGroup(jPanelrbtn2Layout.createSequentialGroup()
                                                                                                                                                                                                                                                        .addContainerGap()
                                                                                                                                                                                                                                                        .addComponent(jRadioButton5)
                                                                                                                                                                                                                                                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                                                                                                                                                                                                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelrbtn2Layout.createSequentialGroup()
                                                                                                                                                                                                                                                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                                                                                                                                                                                        .addComponent(jRadioButton6)
                                                                                                                                                                                                                                                        .addContainerGap())
                                                                                                                                                                                                                                                );
                                                                                                                                                                                                                                                jPanelrbtn2Layout.setVerticalGroup(
                                                                                                                                                                                                                                                    jPanelrbtn2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                                                                                                                                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelrbtn2Layout.createSequentialGroup()
                                                                                                                                                                                                                                                        .addGap(10, 10, 10)
                                                                                                                                                                                                                                                        .addComponent(jRadioButton5)
                                                                                                                                                                                                                                                        .addGap(18, 18, 18)
                                                                                                                                                                                                                                                        .addComponent(jRadioButton6)
                                                                                                                                                                                                                                                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                                                                                                                                                                                                                );
                                                                                                                                                                                                                                                
                                                                                                                                                                                                                                                        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Incluye IVA/IGV"));
                                                                                                                                                                                                                                                        
                                                                                                                                                                                                                                                                jRadioButton7.setText("Incluye IGV");
                                                                                                                                                                                                                                                                
                                                                                                                                                                                                                                                                        jRadioButton8.setText("No incluye IGV");
                                                                                                                                                                                                                                                                        
                                                                                                                                                                                                                                                                                javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
                                                                                                                                                                                                                                                                                jPanel3.setLayout(jPanel3Layout);
                                                                                                                                                                                                                                                                                jPanel3Layout.setHorizontalGroup(
                                                                                                                                                                                                                                                                                    jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                                                                                                                                                                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                                                                                                                                                                                                                                                                        .addContainerGap()
                                                                                                                                                                                                                                                                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                                                                                                                                                                                            .addComponent(jRadioButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                                                                                                                                                                            .addComponent(jRadioButton8))
                                                                                                                                                                                                                                                                                        .addContainerGap(16, Short.MAX_VALUE))
                                                                                                                                                                                                                                                                                );
                                                                                                                                                                                                                                                                                jPanel3Layout.setVerticalGroup(
                                                                                                                                                                                                                                                                                    jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                                                                                                                                                                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                                                                                                                                                                                                                                                                        .addContainerGap()
                                                                                                                                                                                                                                                                                        .addComponent(jRadioButton7)
                                                                                                                                                                                                                                                                                        .addGap(18, 18, 18)
                                                                                                                                                                                                                                                                                        .addComponent(jRadioButton8)
                                                                                                                                                                                                                                                                                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                                                                                                                                                                                                                                                );
                                                                                                                                                                                                                                                                                
                                                                                                                                                                                                                                                                                        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "Detalles"));
                                                                                                                                                                                                                                                                                        
                                                                                                                                                                                                                                                                                                jLabel14.setText("Items");
                                                                                                                                                                                                                                                                                                
                                                                                                                                                                                                                                                                                                        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
                                                                                                                                                                                                                                                                                                        jPanel4Layout.setHorizontalGroup(
                                                                                                                                                                                                                                                                                                        	jPanel4Layout.createParallelGroup(Alignment.LEADING)
                                                                                                                                                                                                                                                                                                        		.addGroup(Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                                                                                                                                                                                                                                                                                        			.addContainerGap(23, Short.MAX_VALUE)
                                                                                                                                                                                                                                                                                                        			.addComponent(jLabel14)
                                                                                                                                                                                                                                                                                                        			.addGap(18)
                                                                                                                                                                                                                                                                                                        			.addComponent(txtItems, GroupLayout.PREFERRED_SIZE, 68, GroupLayout.PREFERRED_SIZE)
                                                                                                                                                                                                                                                                                                        			.addGap(20))
                                                                                                                                                                                                                                                                                                        );
                                                                                                                                                                                                                                                                                                        jPanel4Layout.setVerticalGroup(
                                                                                                                                                                                                                                                                                                        	jPanel4Layout.createParallelGroup(Alignment.LEADING)
                                                                                                                                                                                                                                                                                                        		.addGroup(jPanel4Layout.createSequentialGroup()
                                                                                                                                                                                                                                                                                                        			.addContainerGap()
                                                                                                                                                                                                                                                                                                        			.addGroup(jPanel4Layout.createParallelGroup(Alignment.BASELINE)
                                                                                                                                                                                                                                                                                                        				.addComponent(txtItems, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                                                                                                                                                                                                                                                                        				.addComponent(jLabel14))
                                                                                                                                                                                                                                                                                                        			.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                                                                                                                                                                                                                                                                        );
                                                                                                                                                                                                                                                                                                        jPanel4.setLayout(jPanel4Layout);
                                                                                                                                                                                                                                                                                                        
                                                                                                                                                                                                                                                                                                                jPanel5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
                                                                                                                                                                                                                                                                                                                
                                                                                                                                                                                                                                                                                                                        jLabel15.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
                                                                                                                                                                                                                                                                                                                        jLabel15.setText("SubTotal:");
                                                                                                                                                                                                                                                                                                                        
                                                                                                                                                                                                                                                                                                                                jLabel16.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
                                                                                                                                                                                                                                                                                                                                jLabel16.setText("IGV:");
                                                                                                                                                                                                                                                                                                                                
                                                                                                                                                                                                                                                                                                                                        jLabel17.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
                                                                                                                                                                                                                                                                                                                                        jLabel17.setText("Total:");
                                                                                                                                                                                                                                                                                                                                        
                                                                                                                                                                                                                                                                                                                                                javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
                                                                                                                                                                                                                                                                                                                                                jPanel5.setLayout(jPanel5Layout);
                                                                                                                                                                                                                                                                                                                                                jPanel5Layout.setHorizontalGroup(
                                                                                                                                                                                                                                                                                                                                                    jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                                                                                                                                                                                                                                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                                                                                                                                                                                                                                                                                                                                        .addContainerGap()
                                                                                                                                                                                                                                                                                                                                                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                                                                                                                                                                                                                                                            .addComponent(jLabel16)
                                                                                                                                                                                                                                                                                                                                                            .addComponent(jLabel15)
                                                                                                                                                                                                                                                                                                                                                            .addComponent(jLabel17))
                                                                                                                                                                                                                                                                                                                                                        .addGap(13, 13, 13)
                                                                                                                                                                                                                                                                                                                                                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                                                                                                                                                                                                                                                            .addComponent(txttotal, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)
                                                                                                                                                                                                                                                                                                                                                            .addComponent(txtigv)
                                                                                                                                                                                                                                                                                                                                                            .addComponent(txtsubtotal))
                                                                                                                                                                                                                                                                                                                                                        .addContainerGap())
                                                                                                                                                                                                                                                                                                                                                );
                                                                                                                                                                                                                                                                                                                                                jPanel5Layout.setVerticalGroup(
                                                                                                                                                                                                                                                                                                                                                    jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                                                                                                                                                                                                                                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                                                                                                                                                                                                                                                                                                                                        .addContainerGap()
                                                                                                                                                                                                                                                                                                                                                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                                                                                                                                                                                                                                                                                            .addComponent(jLabel15)
                                                                                                                                                                                                                                                                                                                                                            .addComponent(txtsubtotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                                                                                                                                                                                                                                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                                                                                                                                                                                                                                                                                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                                                                                                                                                                                                                                                                                            .addComponent(jLabel16)
                                                                                                                                                                                                                                                                                                                                                            .addComponent(txtigv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                                                                                                                                                                                                                                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                                                                                                                                                                                                                                                                                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                                                                                                                                                                                                                                                            .addComponent(jLabel17)
                                                                                                                                                                                                                                                                                                                                                            .addComponent(txttotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                                                                                                                                                                                                                                                                                        .addContainerGap(15, Short.MAX_VALUE))
                                                                                                                                                                                                                                                                                                                                                );
                                                                                                                                                                                                                                                                                                                                                
                                                                                                                                                                                                                                                                                                                                                        btnGenerarVenta.setText("Generar Venta");
                                                                                                                                                                                                                                                                                                                                                        btnGenerarVenta.addActionListener(new java.awt.event.ActionListener() {
                                                                                                                                                                                                                                                                                                                                                            public void actionPerformed(java.awt.event.ActionEvent evt) {
                                                                                                                                                                                                                                                                                                                                                                btnGenerarVentaActionPerformed(evt);
                                                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                                                        });
                                                                                                                                                                                                                                                                                                                                                                button = new JButton();
                                                                                                                                                                                                                                                                                                                                                                button.setText("Salir");
                                                                                                                                                                                                                                                                                                                                                        
                                                                                                                                                                                                                                                                                                                                                                javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
                                                                                                                                                                                                                                                                                                                                                                jPanel1Layout.setHorizontalGroup(
                                                                                                                                                                                                                                                                                                                                                                	jPanel1Layout.createParallelGroup(Alignment.LEADING)
                                                                                                                                                                                                                                                                                                                                                                		.addGroup(jPanel1Layout.createSequentialGroup()
                                                                                                                                                                                                                                                                                                                                                                			.addGap(10)
                                                                                                                                                                                                                                                                                                                                                                			.addGroup(jPanel1Layout.createParallelGroup(Alignment.TRAILING)
                                                                                                                                                                                                                                                                                                                                                                				.addGroup(jPanel1Layout.createSequentialGroup()
                                                                                                                                                                                                                                                                                                                                                                					.addComponent(jLabel5)
                                                                                                                                                                                                                                                                                                                                                                					.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
                                                                                                                                                                                                                                                                                                                                                                						.addGroup(jPanel1Layout.createSequentialGroup()
                                                                                                                                                                                                                                                                                                                                                                							.addGap(18)
                                                                                                                                                                                                                                                                                                                                                                							.addGroup(jPanel1Layout.createParallelGroup(Alignment.TRAILING)
                                                                                                                                                                                                                                                                                                                                                                								.addGroup(jPanel1Layout.createSequentialGroup()
                                                                                                                                                                                                                                                                                                                                                                									.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
                                                                                                                                                                                                                                                                                                                                                                										.addComponent(jLabel9)
                                                                                                                                                                                                                                                                                                                                                                										.addComponent(jLabel8, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
                                                                                                                                                                                                                                                                                                                                                                										.addComponent(jLabel11))
                                                                                                                                                                                                                                                                                                                                                                									.addGap(31))
                                                                                                                                                                                                                                                                                                                                                                								.addGroup(jPanel1Layout.createSequentialGroup()
                                                                                                                                                                                                                                                                                                                                                                									.addGroup(jPanel1Layout.createParallelGroup(Alignment.TRAILING)
                                                                                                                                                                                                                                                                                                                                                                										.addComponent(jLabel2, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE)
                                                                                                                                                                                                                                                                                                                                                                										.addComponent(jLabel6))
                                                                                                                                                                                                                                                                                                                                                                									.addGap(18)))
                                                                                                                                                                                                                                                                                                                                                                							.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
                                                                                                                                                                                                                                                                                                                                                                								.addGroup(jPanel1Layout.createSequentialGroup()
                                                                                                                                                                                                                                                                                                                                                                									.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
                                                                                                                                                                                                                                                                                                                                                                										.addComponent(comboVendedor, GroupLayout.PREFERRED_SIZE, 254, GroupLayout.PREFERRED_SIZE)
                                                                                                                                                                                                                                                                                                                                                                										.addComponent(combo_formapag, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)
                                                                                                                                                                                                                                                                                                                                                                										.addComponent(comboEquipo, GroupLayout.PREFERRED_SIZE, 254, GroupLayout.PREFERRED_SIZE))
                                                                                                                                                                                                                                                                                                                                                                									.addGap(18)
                                                                                                                                                                                                                                                                                                                                                                									.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
                                                                                                                                                                                                                                                                                                                                                                										.addComponent(jLabel12)
                                                                                                                                                                                                                                                                                                                                                                										.addComponent(jLabel3, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE))
                                                                                                                                                                                                                                                                                                                                                                									.addGap(18)
                                                                                                                                                                                                                                                                                                                                                                									.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
                                                                                                                                                                                                                                                                                                                                                                										.addComponent(txtdes, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
                                                                                                                                                                                                                                                                                                                                                                										.addGroup(jPanel1Layout.createSequentialGroup()
                                                                                                                                                                                                                                                                                                                                                                											.addComponent(spincant, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
                                                                                                                                                                                                                                                                                                                                                                											.addPreferredGap(ComponentPlacement.UNRELATED)
                                                                                                                                                                                                                                                                                                                                                                											.addComponent(jLabel10)
                                                                                                                                                                                                                                                                                                                                                                											.addGap(18)
                                                                                                                                                                                                                                                                                                                                                                											.addComponent(txtpunit, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE))))
                                                                                                                                                                                                                                                                                                                                                                								.addGroup(jPanel1Layout.createSequentialGroup()
                                                                                                                                                                                                                                                                                                                                                                									.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
                                                                                                                                                                                                                                                                                                                                                                										.addComponent(comboCliente, GroupLayout.PREFERRED_SIZE, 250, GroupLayout.PREFERRED_SIZE)
                                                                                                                                                                                                                                                                                                                                                                										.addComponent(comboTienda, GroupLayout.PREFERRED_SIZE, 250, GroupLayout.PREFERRED_SIZE))
                                                                                                                                                                                                                                                                                                                                                                									.addGap(61)
                                                                                                                                                                                                                                                                                                                                                                									.addComponent(btnRegistrar))))
                                                                                                                                                                                                                                                                                                                                                                						.addGroup(jPanel1Layout.createSequentialGroup()
                                                                                                                                                                                                                                                                                                                                                                							.addPreferredGap(ComponentPlacement.RELATED)
                                                                                                                                                                                                                                                                                                                                                                							.addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 571, GroupLayout.PREFERRED_SIZE)
                                                                                                                                                                                                                                                                                                                                                                							.addGap(31)
                                                                                                                                                                                                                                                                                                                                                                							.addGroup(jPanel1Layout.createParallelGroup(Alignment.TRAILING, false)
                                                                                                                                                                                                                                                                                                                                                                								.addComponent(jButton6, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                                                                                                                                                                                                                                                                                                								.addComponent(btnGenerarVenta, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                                                                                                                                                                                                                                                                                                                                                					.addContainerGap(61, Short.MAX_VALUE))
                                                                                                                                                                                                                                                                                                                                                                				.addGroup(jPanel1Layout.createSequentialGroup()
                                                                                                                                                                                                                                                                                                                                                                					.addGroup(jPanel1Layout.createParallelGroup(Alignment.TRAILING)
                                                                                                                                                                                                                                                                                                                                                                						.addGroup(jPanel1Layout.createSequentialGroup()
                                                                                                                                                                                                                                                                                                                                                                							.addComponent(jPanelrbtn2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                                                                                                                                                                                                                                                                                                                                							.addPreferredGap(ComponentPlacement.RELATED)
                                                                                                                                                                                                                                                                                                                                                                							.addComponent(jPanel3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                                                                                                                                                                                                                                                                                                                                							.addPreferredGap(ComponentPlacement.RELATED)
                                                                                                                                                                                                                                                                                                                                                                							.addComponent(jPanel4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                                                                                                                                                                                                                                                                                                                                							.addGap(18)
                                                                                                                                                                                                                                                                                                                                                                							.addComponent(jPanel5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                                                                                                                                                                                                                                                                                                                                							.addGap(28))
                                                                                                                                                                                                                                                                                                                                                                						.addGroup(jPanel1Layout.createSequentialGroup()
                                                                                                                                                                                                                                                                                                                                                                							.addComponent(jLabel7)
                                                                                                                                                                                                                                                                                                                                                                							.addGap(18)
                                                                                                                                                                                                                                                                                                                                                                							.addComponent(jScrollPane2, GroupLayout.PREFERRED_SIZE, 358, GroupLayout.PREFERRED_SIZE)
                                                                                                                                                                                                                                                                                                                                                                							.addGap(125)))
                                                                                                                                                                                                                                                                                                                                                                					.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING, false)
                                                                                                                                                                                                                                                                                                                                                                						.addComponent(btnAgregar, GroupLayout.PREFERRED_SIZE, 35, Short.MAX_VALUE)
                                                                                                                                                                                                                                                                                                                                                                						.addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 35, Short.MAX_VALUE)
                                                                                                                                                                                                                                                                                                                                                                						.addComponent(btnEliminar, 0, 0, Short.MAX_VALUE))
                                                                                                                                                                                                                                                                                                                                                                					.addGap(199))))
                                                                                                                                                                                                                                                                                                                                                                		.addGroup(Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                                                                                                                                                                                                                                                                                                                                			.addContainerGap(685, Short.MAX_VALUE)
                                                                                                                                                                                                                                                                                                                                                                			.addComponent(button, GroupLayout.PREFERRED_SIZE, 99, GroupLayout.PREFERRED_SIZE)
                                                                                                                                                                                                                                                                                                                                                                			.addGap(144))
                                                                                                                                                                                                                                                                                                                                                                );
                                                                                                                                                                                                                                                                                                                                                                jPanel1Layout.setVerticalGroup(
                                                                                                                                                                                                                                                                                                                                                                	jPanel1Layout.createParallelGroup(Alignment.LEADING)
                                                                                                                                                                                                                                                                                                                                                                		.addGroup(jPanel1Layout.createSequentialGroup()
                                                                                                                                                                                                                                                                                                                                                                			.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
                                                                                                                                                                                                                                                                                                                                                                				.addGroup(jPanel1Layout.createSequentialGroup()
                                                                                                                                                                                                                                                                                                                                                                					.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
                                                                                                                                                                                                                                                                                                                                                                						.addGroup(jPanel1Layout.createSequentialGroup()
                                                                                                                                                                                                                                                                                                                                                                							.addGap(99)
                                                                                                                                                                                                                                                                                                                                                                							.addComponent(jLabel5))
                                                                                                                                                                                                                                                                                                                                                                						.addGroup(jPanel1Layout.createSequentialGroup()
                                                                                                                                                                                                                                                                                                                                                                							.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
                                                                                                                                                                                                                                                                                                                                                                								.addGroup(jPanel1Layout.createSequentialGroup()
                                                                                                                                                                                                                                                                                                                                                                									.addGap(40)
                                                                                                                                                                                                                                                                                                                                                                									.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
                                                                                                                                                                                                                                                                                                                                                                										.addComponent(jLabel8)
                                                                                                                                                                                                                                                                                                                                                                										.addComponent(comboCliente, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
                                                                                                                                                                                                                                                                                                                                                                									.addPreferredGap(ComponentPlacement.UNRELATED)
                                                                                                                                                                                                                                                                                                                                                                									.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
                                                                                                                                                                                                                                                                                                                                                                										.addComponent(jLabel11)
                                                                                                                                                                                                                                                                                                                                                                										.addComponent(comboTienda, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)))
                                                                                                                                                                                                                                                                                                                                                                								.addGroup(jPanel1Layout.createSequentialGroup()
                                                                                                                                                                                                                                                                                                                                                                									.addGap(51)
                                                                                                                                                                                                                                                                                                                                                                									.addComponent(btnRegistrar, GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                                                                                                                                                                                                                                                                                                                                                                									.addPreferredGap(ComponentPlacement.RELATED)))
                                                                                                                                                                                                                                                                                                                                                                							.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
                                                                                                                                                                                                                                                                                                                                                                								.addGroup(jPanel1Layout.createSequentialGroup()
                                                                                                                                                                                                                                                                                                                                                                									.addGap(41)
                                                                                                                                                                                                                                                                                                                                                                									.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
                                                                                                                                                                                                                                                                                                                                                                										.addComponent(spincant, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
                                                                                                                                                                                                                                                                                                                                                                										.addComponent(jLabel10, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
                                                                                                                                                                                                                                                                                                                                                                										.addComponent(txtpunit, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE))
                                                                                                                                                                                                                                                                                                                                                                									.addPreferredGap(ComponentPlacement.RELATED)
                                                                                                                                                                                                                                                                                                                                                                									.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
                                                                                                                                                                                                                                                                                                                                                                										.addComponent(txtdes, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
                                                                                                                                                                                                                                                                                                                                                                										.addComponent(jLabel12)))
                                                                                                                                                                                                                                                                                                                                                                								.addGroup(jPanel1Layout.createSequentialGroup()
                                                                                                                                                                                                                                                                                                                                                                									.addPreferredGap(ComponentPlacement.RELATED)
                                                                                                                                                                                                                                                                                                                                                                									.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
                                                                                                                                                                                                                                                                                                                                                                										.addComponent(combo_formapag, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                                                                                                                                                                                                                                                                                                                                										.addComponent(jLabel6, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
                                                                                                                                                                                                                                                                                                                                                                									.addGap(9)
                                                                                                                                                                                                                                                                                                                                                                									.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
                                                                                                                                                                                                                                                                                                                                                                										.addComponent(comboVendedor, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
                                                                                                                                                                                                                                                                                                                                                                										.addComponent(jLabel9)
                                                                                                                                                                                                                                                                                                                                                                										.addComponent(jLabel3))
                                                                                                                                                                                                                                                                                                                                                                									.addGap(20)
                                                                                                                                                                                                                                                                                                                                                                									.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
                                                                                                                                                                                                                                                                                                                                                                										.addComponent(comboEquipo, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
                                                                                                                                                                                                                                                                                                                                                                										.addComponent(jLabel2))))))
                                                                                                                                                                                                                                                                                                                                                                					.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
                                                                                                                                                                                                                                                                                                                                                                						.addGroup(jPanel1Layout.createSequentialGroup()
                                                                                                                                                                                                                                                                                                                                                                							.addGap(31)
                                                                                                                                                                                                                                                                                                                                                                							.addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 89, GroupLayout.PREFERRED_SIZE))
                                                                                                                                                                                                                                                                                                                                                                						.addGroup(jPanel1Layout.createSequentialGroup()
                                                                                                                                                                                                                                                                                                                                                                							.addGap(44)
                                                                                                                                                                                                                                                                                                                                                                							.addComponent(btnGenerarVenta)
                                                                                                                                                                                                                                                                                                                                                                							.addPreferredGap(ComponentPlacement.RELATED)
                                                                                                                                                                                                                                                                                                                                                                							.addComponent(jButton6)))
                                                                                                                                                                                                                                                                                                                                                                					.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
                                                                                                                                                                                                                                                                                                                                                                						.addGroup(jPanel1Layout.createSequentialGroup()
                                                                                                                                                                                                                                                                                                                                                                							.addGap(36)
                                                                                                                                                                                                                                                                                                                                                                							.addComponent(jPanel4, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
                                                                                                                                                                                                                                                                                                                                                                							.addGap(45)
                                                                                                                                                                                                                                                                                                                                                                							.addComponent(jScrollPane2, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE))
                                                                                                                                                                                                                                                                                                                                                                						.addGroup(jPanel1Layout.createSequentialGroup()
                                                                                                                                                                                                                                                                                                                                                                							.addPreferredGap(ComponentPlacement.UNRELATED)
                                                                                                                                                                                                                                                                                                                                                                							.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING, false)
                                                                                                                                                                                                                                                                                                                                                                								.addComponent(jPanel5, 0, 0, Short.MAX_VALUE)
                                                                                                                                                                                                                                                                                                                                                                								.addGroup(jPanel1Layout.createSequentialGroup()
                                                                                                                                                                                                                                                                                                                                                                									.addComponent(btnAgregar)
                                                                                                                                                                                                                                                                                                                                                                									.addPreferredGap(ComponentPlacement.RELATED)
                                                                                                                                                                                                                                                                                                                                                                									.addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
                                                                                                                                                                                                                                                                                                                                                                									.addPreferredGap(ComponentPlacement.RELATED)
                                                                                                                                                                                                                                                                                                                                                                									.addComponent(btnEliminar, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)))))
                                                                                                                                                                                                                                                                                                                                                                					.addGap(55)
                                                                                                                                                                                                                                                                                                                                                                					.addComponent(button))
                                                                                                                                                                                                                                                                                                                                                                				.addGroup(jPanel1Layout.createSequentialGroup()
                                                                                                                                                                                                                                                                                                                                                                					.addGap(337)
                                                                                                                                                                                                                                                                                                                                                                					.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
                                                                                                                                                                                                                                                                                                                                                                						.addComponent(jPanel3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                                                                                                                                                                                                                                                                                                                                						.addComponent(jPanelrbtn2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                                                                                                                                                                                                                                                                                                                                                					.addGap(53)
                                                                                                                                                                                                                                                                                                                                                                					.addComponent(jLabel7)))
                                                                                                                                                                                                                                                                                                                                                                			.addContainerGap())
                                                                                                                                                                                                                                                                                                                                                                );
                                                                                                                                                                                                                                                                                                                                                                jTextArea1 = new javax.swing.JTextArea();
                                                                                                                                                                                                                                                                                                                                                                jScrollPane2.setViewportView(jTextArea1);
                                                                                                                                                                                                                                                                                                                                                                
                                                                                                                                                                                                                                                                                                                                                                        jTextArea1.setColumns(20);
                                                                                                                                                                                                                                                                                                                                                                        jTextArea1.setRows(5);
                                                                                                                                                                                                                                                                                                                                                                jPanel1.setLayout(jPanel1Layout);
        btnSalir = new JButton();
        btnSalir.addActionListener(this);
        btnSalir.setText("Salir");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(Alignment.TRAILING, layout.createSequentialGroup()
        			.addContainerGap()
        			.addComponent(jPanel1, 0, 0, Short.MAX_VALUE)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(layout.createSequentialGroup()
        					.addGap(18)
        					.addGroup(layout.createParallelGroup(Alignment.LEADING)
        						.addComponent(jButton2)
        						.addComponent(jButton3, GroupLayout.PREFERRED_SIZE, 111, GroupLayout.PREFERRED_SIZE)))
        				.addGroup(layout.createSequentialGroup()
        					.addGap(29)
        					.addGroup(layout.createParallelGroup(Alignment.LEADING)
        						.addComponent(btnSalir, GroupLayout.PREFERRED_SIZE, 92, GroupLayout.PREFERRED_SIZE)
        						.addComponent(jButton5, GroupLayout.PREFERRED_SIZE, 92, GroupLayout.PREFERRED_SIZE))))
        			.addGap(24))
        		.addGroup(layout.createSequentialGroup()
        			.addGap(279)
        			.addComponent(jLabel1)
        			.addContainerGap(428, Short.MAX_VALUE))
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap()
        			.addComponent(jPanel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap(153, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addGroup(layout.createParallelGroup(Alignment.LEADING, false)
        				.addGroup(layout.createSequentialGroup()
        					.addGap(19)
        					.addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addComponent(jPanel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        					.addPreferredGap(ComponentPlacement.UNRELATED)
        					.addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, 548, GroupLayout.PREFERRED_SIZE))
        				.addGroup(layout.createSequentialGroup()
        					.addGap(344)
        					.addComponent(jButton2)
        					.addGap(20)
        					.addComponent(jButton3)
        					.addGap(18)
        					.addComponent(jButton5)
        					.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        					.addComponent(btnSalir)))
        			.addGap(68))
        );
        getContentPane().setLayout(layout);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void comboVendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboVendedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboVendedorActionPerformed

    private void comboEquipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboEquipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboEquipoActionPerformed

    private void comboClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboClienteActionPerformed
     
    }//GEN-LAST:event_comboClienteActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
         int x ;
          
       x = Integer.parseInt(JOptionPane.showInputDialog(" Ingrese el numero del Factura"));
       try { 
            //creamos un objeto dbBean
              dbBean aux = new dbBean();
              HashMap map = new HashMap();
              //Connection cn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=ST;user=sa;password=sasasa;");
              Connection cn = aux.getConnection();
              JasperReport jr= JasperCompileManager.compileReport("src/REPORTS/ClienteReporte.jrxml");
              map.put("idVenta",x); 
              JasperPrint jp = JasperFillManager.fillReport(jr,map,cn);
              // JasperPrint jp= JasperFillManager.fillReport(jr,idClie,cn);
 
              JasperViewer jv= new JasperViewer(jp,false);
              jv.setVisible(true);
        } catch (Exception e) {
            System.out.println(e);
        }
        
        /* try {
              dbBean aux = new dbBean();
              //Connection cn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=ST;user=sa;password=sasasa;");
              Connection cn = aux.getConnection();
              JasperReport jr= JasperCompileManager.compileReport("src/REPORTS/FacturaReporte.jrxml");
              JasperPrint jp= JasperFillManager.fillReport(jr,null,cn);
              JasperViewer jv= new JasperViewer(jp,false);
              jv.setVisible(true);
        } catch (Exception e) {
            System.out.println(e);
        }*/
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtpunitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpunitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpunitActionPerformed

    private void combo_formapagActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_formapagActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combo_formapagActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
      //activamos los botones de DetalleVenta 
             comboEquipo.setEnabled(true);
             txtpunit.setEnabled(true);
             spincant.setEnabled(true);       
             comboVendedor.setEnabled(true);
             comboEquipo.setEnabled(true);
             txtdes.setEnabled(true);
             //Lista los equipos
             comboEquipo.setModel(h.getvalues("Equipo"));
             //Lista los vendedores
             comboVendedor.setModel(h.getvalues("Empleado"));
             AutoCompleteDecorator.decorate(comboVendedor); 
        
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        
        
            Vector vec = new Vector();
            vec.addElement(eqx.FindIDEquipo(this.comboEquipo.getSelectedItem().toString()));
            vec.addElement(this.comboEquipo.getSelectedItem().toString());
            vec.addElement(this.spincant.getValue().toString());
            vec.addElement(this.txtpunit.getText());
            float foo = Float.parseFloat(txtpunit.getText());
            int can = Integer.parseInt(this.spincant.getValue().toString());
            float descuento= Float.parseFloat(txtdes.getText());
            if(descuento==0)
            {
            importexd = can*foo;
            }else{
             //calculo 
            importexd = can*foo*(100-descuento)/100;
            
            }
           
            vec.addElement(importexd);
            dtm.addRow(vec);
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnGenerarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarVentaActionPerformed
       //registraremos la venta 
        String proc = this.btnRegistrar.getText();
        int id = 0, est;
        String pr = "";
        if(valida() == true){
            util u = new util();
            Venta ven = new Venta();
            ven.setCliente(vendao.FindID(this.comboCliente.getSelectedItem().toString()));
            ven.setTienda(vendao.FindIDTienda(this.comboTienda.getSelectedItem().toString()));
            ven.setVendedor(this.comboVendedor.getSelectedItem().toString());
            ven.setForma_Pago(this.combo_formapag.getSelectedItem().toString());
             //configuramos la fecha de la venta
             String dia_i = Integer.toString(this.cmbfecha_ven.getCalendar().get(Calendar.DAY_OF_MONTH));
             String mes_i = Integer.toString(this.cmbfecha_ven.getCalendar().get(Calendar.MONTH) + 1);
             String year_i = Integer.toString(this.cmbfecha_ven.getCalendar().get(Calendar.YEAR));
             String fecha_i = (year_i + "/" + mes_i+ "/" + dia_i);
             ven.setFecha(fecha_i);
             ven.setForma_Pago(this.combo_formapag.getSelectedItem().toString());
             
            id = u.idNext("Venta", "idVenta");
            pr = "insert";
            ven.setIdVenta(id);
            vendao.procesaItem(ven, pr);
              for(int i =0;i<this.tblDetVen.getRowCount();i++){
                    DetalleVenta detVent = new  DetalleVenta ();
                    detVent.setIdVenta(id);
                    detVent.setIdEquipo(Integer.parseInt(dtm.getValueAt(i,0).toString().trim()));
                    detVent.setCantidad(Integer.parseInt(dtm.getValueAt(i, 2).toString().trim()));
                    detVent.setP_unit(Float.parseFloat(dtm.getValueAt(i, 3).toString().trim()));
                    detVent.setImporte(Float.parseFloat(dtm.getValueAt(i, 4).toString().trim()));
                    float aux_sub=Float.parseFloat(dtm.getValueAt(i, 4).toString().trim());
                    float aux_igv =18*aux_sub/100;
                    detVent.setIGV(aux_igv);
                    this.subtotal = this.subtotal+aux_sub;
                    this.igv= this.igv+aux_igv;
                    detVent.setTotal(aux_sub+aux_igv);
                    this.detdao.procesaItem(detVent, "insert");
                    
                }
             total = subtotal + igv;
             System.out.println("el subtotal a pagar es " + subtotal);
             System.out.println("el igv es  " + igv);
             System.out.println("el total a pagar es  " +(total));
             this.items = this.tblDetVen.getRowCount();
             
             //En los cuadritos items y total
             this.txtItems.setText(Integer.toString(this.items));
             this.txtsubtotal.setText(Float.toString(this.subtotal));
             this.txtigv.setText(Float.toString(this.igv));
             this.txttotal.setText(Float.toString(this.total));
            /*    
            if(proc.equals("Registrar")){
                id = u.idNext("Venta", "idVenta");
                pr = "insert";
            }
            if(proc.equals("Actualizar")){
                //id = this.idClie;
                pr = "update";
            }
    */
           
            //limpiaControles();
            //limpiaTabla();
            //llenaTabla(false, "");
        }   
    }//GEN-LAST:event_btnGenerarVentaActionPerformed

    private void jRadioButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton6ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
      this.dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        int fila;
        if(this.tblDetVen.getRowCount()>0){
            fila = this.tblDetVen.getSelectedRow();
            dtm.removeRow(fila);
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void tblDetVenAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_tblDetVenAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_tblDetVenAncestorAdded

 public void limpiaControles()
 {
  this.btnRegistrar.setText("Registrar");
   //   this.txtNombre.requestFocus();
 }
 
    public void limpiaTabla(){
        DefaultTableModel dm = (DefaultTableModel)this.tblDetVen.getModel();
        if(dm.getRowCount()>0){
            while(dm.getRowCount()>0){
                dm.removeRow(dm.getRowCount()-1);
            }
        }
    }
      public boolean valida(){
   /*
        boolean sw = false;
        if(this.txtApellidos.getText().equals("")){
           JOptionPane.showMessageDialog(this, "Ingrese Apellidos");
        }else{
            if(this.txtNombre.getText().equals("")){
                JOptionPane.showMessageDialog(this, "Ingrese Nombres");
            }else{
                sw = true;
            }
        }*/
        return true;

    }  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGenerarVenta;
    private javax.swing.JButton btnRegistrar;
    private com.toedter.calendar.JDateChooser cmbfecha_ven;
    private javax.swing.JComboBox<String> comboCliente;
    private javax.swing.JComboBox<String> comboEquipo;
    private javax.swing.JComboBox<String> comboTienda;
    private javax.swing.JComboBox<String> comboVendedor;
    private javax.swing.JComboBox<String> combo_formapag;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
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
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanelrbtn2;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JRadioButton jRadioButton6;
    private javax.swing.JRadioButton jRadioButton7;
    private javax.swing.JRadioButton jRadioButton8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField numFACTURA;
    private javax.swing.JSpinner spincant;
    private javax.swing.JTable tblDetVen;
    private javax.swing.JTextField txtItems;
    private javax.swing.JTextField txtdes;
    private javax.swing.JTextField txtigv;
    private javax.swing.JTextField txtpunit;
    private javax.swing.JTextField txtsubtotal;
    private javax.swing.JTextField txttotal;
    private JButton button;
    private JButton btnSalir;
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnSalir) {
			do_btnSalir_actionPerformed(e);
		}
	}
	protected void do_btnSalir_actionPerformed(ActionEvent e) {
		 dispose();
	}
}
