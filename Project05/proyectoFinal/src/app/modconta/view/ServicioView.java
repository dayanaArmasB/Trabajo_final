package app.modconta.view;
import app.modconta.databaase.Helper;
import app.modconta.databaase.dbBean;
import app.modconta.databaase.util;
import app.modconta.entity.DetalleVenta;
import app.modconta.entity.DetalleServicio;
import app.modconta.entity.Servicio;
import MODEL.ProductoDAO;
import MODEL.ServicioDAO;
import MODEL.VentaDAO;
import MODEL.detserDAO;
import java.sql.Connection;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTable;
import javax.swing.JTextArea;

public class ServicioView extends javax.swing.JInternalFrame {
      //variables  
    ProductoDAO eqx = new ProductoDAO();
    ServicioDAO ServicioDAO;
    detserDAO detserDAO;
    VentaDAO vaux;
    DefaultTableModel dtm,dtm2;
    boolean sw = false;
    String cad = "";
    int idClie; 
    Helper h = new Helper();
    public ServicioView() {
    	setTitle("ORDEN DE SERVICIO");
        ServicioDAO = new ServicioDAO();
        detserDAO = new detserDAO();
        initComponents();
//        comboEquipos.setEnabled(false);
//        AreaCausa.setEnabled(false);
//        AreaFallas.setEnabled(false);
//        AreaSolucion.setEnabled(false);
        //comboVentas.setModel(h.getvaluesVentas("Venta"));
        comboTienda.setModel(h.getvaluesTienda("Tienda"));
        AutoCompleteDecorator.decorate(comboTienda);
        jButton5 = new javax.swing.JButton();
        jButton5.setBounds(95, 384, 85, 20);
        jPanel4.add(jButton5);
        
                jButton5.setText("Registrar");
                jButton7 = new javax.swing.JButton();
                jButton7.setBounds(200, 384, 79, 20);
                jPanel4.add(jButton7);
                
                        jButton7.setText("Aprobar");
                        jButton8 = new javax.swing.JButton();
                        jButton8.setBounds(300, 384, 69, 20);
                        jPanel4.add(jButton8);
                        
                                jButton8.setText("Anular");
                                jButton9 = new javax.swing.JButton();
                                jButton9.setBounds(389, 384, 81, 20);
                                jPanel4.add(jButton9);
                                
                                        jButton9.setText("Imprimir");
                                        jButton6 = new javax.swing.JButton();
                                        jButton6.setBounds(495, 384, 125, 20);
                                        jPanel4.add(jButton6);
                                        
                                                jButton6.setText("Generar Factura");
                                                jButton4 = new javax.swing.JButton();
                                                jButton4.setBounds(319, 437, 83, 20);
                                                jPanel4.add(jButton4);
                                                
                                                        jButton4.setText("Salir");
                                                jButton6.addActionListener(new java.awt.event.ActionListener() {
                                                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                                                        jButton6ActionPerformed(evt);
                                                    }
                                                });
                                        jButton9.addActionListener(new java.awt.event.ActionListener() {
                                            public void actionPerformed(java.awt.event.ActionEvent evt) {
                                                jButton9ActionPerformed(evt);
                                            }
                                        });
                                jButton8.addActionListener(new java.awt.event.ActionListener() {
                                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                                        jButton8ActionPerformed(evt);
                                    }
                                });
                        jButton7.addActionListener(new java.awt.event.ActionListener() {
                            public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButton7ActionPerformed(evt);
                            }
                        });
//         dtm2 = (DefaultTableModel)jTable1.getModel();
       // llenaTabla(false, "");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        btnFechaEntrega = new com.toedter.calendar.JDateChooser();
        btnFechaRecibido = new com.toedter.calendar.JDateChooser();
        jLabel5 = new javax.swing.JLabel();
        comboVentas = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        comboTienda = new javax.swing.JComboBox<>();
        jScrollPane4 = new javax.swing.JScrollPane();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        btnLimpiar = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("ORDEN DE SERVICIO");

        jTabbedPane1.setMaximumSize(new java.awt.Dimension(32769, 32769));

        jPanel4.setLayout(null);

        jLabel8.setText("N�mero de Factura");
        jPanel4.add(jLabel8);
        jLabel8.setBounds(30, 20, 100, 16);

        btnFechaEntrega.setDate(Calendar.getInstance().getTime());
        btnFechaEntrega.setPreferredSize(new java.awt.Dimension(120, 20));
        jPanel4.add(btnFechaEntrega);
        btnFechaEntrega.setBounds(500, 50, 120, 30);

        btnFechaRecibido.setDate(Calendar.getInstance().getTime());
        btnFechaRecibido.setPreferredSize(new java.awt.Dimension(120, 20));
        jPanel4.add(btnFechaRecibido);
        btnFechaRecibido.setBounds(500, 10, 120, 30);

        jLabel5.setText("Fecha de Entrega");
        jPanel4.add(jLabel5);
        jLabel5.setBounds(360, 50, 120, 20);

        comboVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboVentasActionPerformed(evt);
            }
        });
        jPanel4.add(comboVentas);
        comboVentas.setBounds(150, 20, 120, 22);

        jLabel6.setText("Tienda");
        jPanel4.add(jLabel6);
        jLabel6.setBounds(90, 50, 90, 16);

        jLabel9.setText("Detalle de servicio");
        jPanel4.add(jLabel9);
        jLabel9.setBounds(20, 110, 110, 20);
        jPanel4.add(comboTienda);
        comboTienda.setBounds(150, 50, 120, 22);

        jPanel4.add(jScrollPane4);
        jScrollPane4.setBounds(20, 140, 630, 141);
        
        tblServicio = new JTable();
        tblServicio.setModel(new DefaultTableModel(
        	new Object[][] {
        	},
        	new String[] {
        		"N\u00FAmero de factura", "Tienda", "Fecha de recepci\u00F3n", "Fecha de entrega"
        	}
        ));
        jScrollPane4.setViewportView(tblServicio);

        jLabel2.setText("Recomendaciones");
        jPanel4.add(jLabel2);
        jLabel2.setBounds(30, 320, 103, 16);

        jPanel4.add(jScrollPane1);
        jScrollPane1.setBounds(130, 302, 520, 60);
        
        JTextArea txtRecomendaciones = new JTextArea();
        jScrollPane1.setViewportView(txtRecomendaciones);

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        jPanel4.add(btnLimpiar);
        btnLimpiar.setBounds(664, 190, 107, 25);

        jLabel13.setText("Fecha de Recibido");
        jPanel4.add(jLabel13);
        jLabel13.setBounds(360, 20, 110, 20);

        jTabbedPane1.addTab("Detalles", jPanel4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap(285, Short.MAX_VALUE)
        			.addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 286, GroupLayout.PREFERRED_SIZE)
        			.addGap(285))
        		.addGroup(layout.createSequentialGroup()
        			.addGap(34)
        			.addComponent(jTabbedPane1, GroupLayout.PREFERRED_SIZE, 786, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap(36, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap()
        			.addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(jTabbedPane1, GroupLayout.PREFERRED_SIZE, 505, GroupLayout.PREFERRED_SIZE)
        			.addGap(96))
        );
        getContentPane().setLayout(layout);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        // limpiaControles();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    

    public void limpiaControles()
 {
//  this.btnRegistrar.setText("Registrar");
   //   this.txtNombre.requestFocus();
 }
 
    public void limpiaTabla(){
        DefaultTableModel dm = (DefaultTableModel)this.tblServicio.getModel();
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
    private void comboVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboVentasActionPerformed
//        comboEquipos.setEnabled(true);
//        comboEquipos.setModel(h.getvaluesEqVe(Integer.parseInt(comboVentas.getSelectedItem().toString())));
    }//GEN-LAST:event_comboVentasActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        //         int x ;
        //
        //       x = Integer.parseInt(JOptionPane.showInputDialog(" Ingrese el numero del Factura"));
        //       try {
            //            //creamos un objeto dbBean
            //              dbBean aux = new dbBean();
            //              HashMap map = new HashMap();
            //              //Connection cn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=ST;user=sa;password=sasasa;");
            //              Connection cn = aux.getConnection();
            //              JasperReport jr= JasperCompileManager.compileReport("src/REPORTS/ClienteReporte.jrxml");
            //              map.put("idVenta",x);
            //              JasperPrint jp = JasperFillManager.fillReport(jr,map,cn);
            //              // JasperPrint jp= JasperFillManager.fillReport(jr,idClie,cn);
            //
            //              JasperViewer jv= new JasperViewer(jp,false);
            //              jv.setVisible(true);
            //        } catch (Exception e) {
            //            System.out.println(e);
            //        }
        //
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
    }//GEN-LAST:event_jButton6ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser btnFechaEntrega;
    private com.toedter.calendar.JDateChooser btnFechaRecibido;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JComboBox<String> comboTienda;
    private javax.swing.JComboBox<String> comboVentas;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private JTable tblServicio;
}
