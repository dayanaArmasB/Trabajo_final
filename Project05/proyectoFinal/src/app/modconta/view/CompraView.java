package app.modconta.view;

import javax.swing.table.DefaultTableModel;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class CompraView extends javax.swing.JInternalFrame {
      DefaultTableModel dtm;
    public CompraView() {
        initComponents();
        this.setAutoscrolls(true);
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanelrbtn = new javax.swing.JPanel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jButton4 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("ORDENES DE COMPRA");
        setAutoscrolls(true);
        getContentPane().setLayout(null);

        lblTitulo.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("ORDENES DE COMPRA");
        getContentPane().add(lblTitulo);
        lblTitulo.setBounds(21, 11, 666, 29);

        jLabel1.setText("Proveedor");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(21, 124, 67, 16);

        jLabel2.setText("Responsable");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(21, 193, 78, 16);

        jPanelrbtn.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "Estado"));

        jRadioButton1.setText("Cancelado");

        jRadioButton2.setText("Pendiente de pago");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelrbtnLayout = new javax.swing.GroupLayout(jPanelrbtn);
        jPanelrbtnLayout.setHorizontalGroup(
        	jPanelrbtnLayout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(jPanelrbtnLayout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(jPanelrbtnLayout.createParallelGroup(Alignment.LEADING)
        				.addComponent(jRadioButton1)
        				.addComponent(jRadioButton2))
        			.addContainerGap(30, Short.MAX_VALUE))
        );
        jPanelrbtnLayout.setVerticalGroup(
        	jPanelrbtnLayout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(Alignment.LEADING, jPanelrbtnLayout.createSequentialGroup()
        			.addGap(10)
        			.addComponent(jRadioButton1)
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addComponent(jRadioButton2)
        			.addContainerGap(30, Short.MAX_VALUE))
        );
        jPanelrbtn.setLayout(jPanelrbtnLayout);

        getContentPane().add(jPanelrbtn);
        jPanelrbtn.setBounds(12, 391, 161, 90);

        getContentPane().add(jComboBox1);
        jComboBox1.setBounds(119, 121, 142, 22);

        getContentPane().add(jComboBox2);
        jComboBox2.setBounds(117, 190, 144, 22);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "Detalles"));

        jLabel3.setText("Items");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(351, 399, 152, 63);

        jLabel4.setText("RUC");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(284, 124, 24, 16);
        getContentPane().add(jTextField2);
        jTextField2.setBounds(318, 121, 59, 22);

        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/agregar.png"))); // NOI18N
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAgregar);
        btnAgregar.setBounds(630, 221, 35, 33);

        btnModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/update.png"))); // NOI18N
        getContentPane().add(btnModificar);
        btnModificar.setBounds(630, 265, 35, 33);

        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/eliminar.png"))); // NOI18N
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEliminar);
        btnEliminar.setBounds(630, 309, 37, 34);

        jLabel5.setText("Direcccion");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(21, 153, 58, 16);
        getContentPane().add(jTextField3);
        jTextField3.setBounds(117, 153, 377, 22);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Incluye IVA/IGV"));

        jRadioButton3.setText("Incluye IGV");

        jRadioButton4.setText("No incluye IGV");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2Layout.setHorizontalGroup(
        	jPanel2Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel2Layout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING)
        				.addComponent(jRadioButton3, GroupLayout.PREFERRED_SIZE, 131, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jRadioButton4))
        			.addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
        	jPanel2Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel2Layout.createSequentialGroup()
        			.addContainerGap()
        			.addComponent(jRadioButton3)
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addComponent(jRadioButton4)
        			.addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel2.setLayout(jPanel2Layout);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(183, 391, 165, 81);

        jButton4.setText("Salir");
        getContentPane().add(jButton4);
        jButton4.setBounds(614, 558, 83, 20);

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel9.setText("N\u00B0 Orden de Compra");

        jLabel10.setText("Fecha de emisi\u00F3n");
        dcFechaRegistro = new com.toedter.calendar.JDateChooser();
        
                dcFechaRegistro.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
                dcFechaRegistro.setPreferredSize(new java.awt.Dimension(150, 26));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4Layout.setHorizontalGroup(
        	jPanel4Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel4Layout.createSequentialGroup()
        			.addGap(33)
        			.addComponent(jLabel9)
        			.addGap(18)
        			.addComponent(jTextField8, GroupLayout.PREFERRED_SIZE, 123, GroupLayout.PREFERRED_SIZE)
        			.addGap(56)
        			.addComponent(jLabel10)
        			.addGap(18)
        			.addComponent(dcFechaRegistro, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap(65, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
        	jPanel4Layout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(Alignment.LEADING, jPanel4Layout.createSequentialGroup()
        			.addGap(15)
        			.addGroup(jPanel4Layout.createParallelGroup(Alignment.TRAILING)
        				.addComponent(dcFechaRegistro, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addGroup(jPanel4Layout.createParallelGroup(Alignment.BASELINE)
        					.addComponent(jLabel9)
        					.addComponent(jTextField8, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        					.addComponent(jLabel10)))
        			.addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel4.setLayout(jPanel4Layout);

        getContentPane().add(jPanel4);
        jPanel4.setBounds(30, 42, 647, 63);

        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jLabel6.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jLabel6.setText("SubTotal:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jLabel7.setText("IGV:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jLabel8.setText("Total:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6)
                    .addComponent(jLabel8))
                .addGap(13, 13, 13)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField7, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)
                    .addComponent(jTextField6)
                    .addComponent(jTextField4))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3);
        jPanel3.setBounds(517, 379, 164, 110);

        jButton5.setText("Registrar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(117, 509, 85, 20);

        jButton7.setText("Aprobar");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7);
        jButton7.setBounds(212, 509, 79, 20);

        jButton8.setText("Anular");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton8);
        jButton8.setBounds(308, 509, 69, 20);

        jButton9.setText("Imprimir");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton9);
        jButton9.setBounds(385, 509, 81, 20);

        jButton6.setText("Generar Factura");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6);
        jButton6.setBounds(479, 509, 125, 20);
        
        scrollPane = new JScrollPane();
        scrollPane.setBounds(20, 221, 602, 129);
        getContentPane().add(scrollPane);
        
        tblDetCompra = new JTable();
        tblDetCompra.setModel(new DefaultTableModel(
        	new Object[][] {
        	},
        	new String[] {
        		"N\u00B0 de Orden de compra", "Fecha de emisi\u00F3n", "Proveedor", "Direcci\u00F3n", "RUC", "Responsable"
        	}
        ));
        scrollPane.setViewportView(tblDetCompra);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
      /*  Vector vec = new Vector();

        vec.addElement(this.comboEquipo.getSelectedItem().toString());
        vec.addElement(this.spincant.getValue().toString());
        vec.addElement(this.txtpunit.getText());
        float foo = Float.parseFloat(txtpunit.getText());
        int can = Integer.parseInt(this.spincant.getValue().toString());
        importexd = can*foo;
        vec.addElement(importexd);
        dtm.addRow(vec);
     */
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
    int fila;
        if(this.tblDetCompra.getRowCount()>0){
            fila = this.tblDetCompra.getSelectedRow();
            dtm.removeRow(fila);
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

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

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnModificar;
    private com.toedter.calendar.JDateChooser dcFechaRegistro;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
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
    private javax.swing.JPanel jPanelrbtn;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JLabel lblTitulo;
    private JScrollPane scrollPane;
    private JTable tblDetCompra;
    // End of variables declaration//GEN-END:variables
}
