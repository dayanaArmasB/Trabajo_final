package app.modconta.view;

import javax.swing.table.DefaultTableModel;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CompraView extends javax.swing.JInternalFrame implements ActionListener {
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
        jButton4.addActionListener(this);
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
        jButton6 = new javax.swing.JButton();
        setIconifiable(true);
        setMaximizable(true);
        setTitle("ORDENES DE COMPRA");
        setAutoscrolls(true);

        lblTitulo.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("ORDENES DE COMPRA");

        jLabel1.setText("Proveedor");

        jLabel2.setText("Responsable");

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

        jLabel4.setText("RUC");

        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/agregar.png"))); // NOI18N
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/update.png")));

        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/eliminar.png"))); // NOI18N
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        jLabel5.setText("Direcccion");

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

        jButton4.setText("Salir");

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

        jButton5.setText("Registrar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton7.setText("Aprobar");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setText("Anular");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton6.setText("Generar Factura");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        
        scrollPane = new JScrollPane();
        
        tblDetCompra = new JTable();
        tblDetCompra.setModel(new DefaultTableModel(
        	new Object[][] {
        	},
        	new String[] {
        		"N\u00B0 de Orden de compra", "Fecha de emisi\u00F3n", "Proveedor", "Direcci\u00F3n", "RUC", "Responsable"
        	}
        ));
        scrollPane.setViewportView(tblDetCompra);
        GroupLayout groupLayout = new GroupLayout(getContentPane());
        groupLayout.setHorizontalGroup(
        	groupLayout.createParallelGroup(Alignment.LEADING)
        		.addGroup(groupLayout.createSequentialGroup()
        			.addGap(21)
        			.addComponent(lblTitulo, GroupLayout.PREFERRED_SIZE, 666, GroupLayout.PREFERRED_SIZE))
        		.addGroup(groupLayout.createSequentialGroup()
        			.addGap(30)
        			.addComponent(jPanel4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        		.addGroup(groupLayout.createSequentialGroup()
        			.addGap(21)
        			.addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 67, GroupLayout.PREFERRED_SIZE)
        			.addGap(31)
        			.addComponent(jComboBox1, GroupLayout.PREFERRED_SIZE, 142, GroupLayout.PREFERRED_SIZE)
        			.addGap(23)
        			.addComponent(jLabel4, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
        			.addGap(10)
        			.addComponent(jTextField2, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE))
        		.addGroup(groupLayout.createSequentialGroup()
        			.addGap(21)
        			.addComponent(jLabel5, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE)
        			.addGap(38)
        			.addComponent(jTextField3, GroupLayout.PREFERRED_SIZE, 377, GroupLayout.PREFERRED_SIZE))
        		.addGroup(groupLayout.createSequentialGroup()
        			.addGap(21)
        			.addComponent(jLabel2, GroupLayout.PREFERRED_SIZE, 78, GroupLayout.PREFERRED_SIZE)
        			.addGap(18)
        			.addComponent(jComboBox2, GroupLayout.PREFERRED_SIZE, 144, GroupLayout.PREFERRED_SIZE))
        		.addGroup(groupLayout.createSequentialGroup()
        			.addGap(20)
        			.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 602, GroupLayout.PREFERRED_SIZE)
        			.addGap(8)
        			.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
        				.addComponent(btnAgregar, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
        				.addComponent(btnModificar, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
        				.addComponent(btnEliminar, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)))
        		.addGroup(groupLayout.createSequentialGroup()
        			.addGap(12)
        			.addComponent(jPanelrbtn, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        			.addGap(10)
        			.addComponent(jPanel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        			.addGap(3)
        			.addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, 152, GroupLayout.PREFERRED_SIZE)
        			.addGap(14)
        			.addComponent(jPanel3, GroupLayout.PREFERRED_SIZE, 164, GroupLayout.PREFERRED_SIZE))
        		.addGroup(groupLayout.createSequentialGroup()
        			.addGap(117)
        			.addComponent(jButton5, GroupLayout.PREFERRED_SIZE, 85, GroupLayout.PREFERRED_SIZE)
        			.addGap(10)
        			.addComponent(jButton7, GroupLayout.PREFERRED_SIZE, 79, GroupLayout.PREFERRED_SIZE)
        			.addGap(17)
        			.addComponent(jButton8, GroupLayout.PREFERRED_SIZE, 69, GroupLayout.PREFERRED_SIZE)
        			.addGap(11)
        			.addComponent(jButton6, GroupLayout.PREFERRED_SIZE, 125, GroupLayout.PREFERRED_SIZE)
        			.addGap(136)
        			.addComponent(jButton4, GroupLayout.PREFERRED_SIZE, 83, GroupLayout.PREFERRED_SIZE))
        );
        groupLayout.setVerticalGroup(
        	groupLayout.createParallelGroup(Alignment.LEADING)
        		.addGroup(groupLayout.createSequentialGroup()
        			.addGap(11)
        			.addComponent(lblTitulo)
        			.addGap(2)
        			.addComponent(jPanel4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        			.addGap(16)
        			.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
        				.addGroup(groupLayout.createSequentialGroup()
        					.addGap(3)
        					.addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE))
        				.addComponent(jComboBox1, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
        				.addGroup(groupLayout.createSequentialGroup()
        					.addGap(3)
        					.addComponent(jLabel4, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE))
        				.addComponent(jTextField2, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE))
        			.addGap(10)
        			.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
        				.addComponent(jLabel5, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jTextField3, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE))
        			.addGap(15)
        			.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
        				.addGroup(groupLayout.createSequentialGroup()
        					.addGap(3)
        					.addComponent(jLabel2, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE))
        				.addComponent(jComboBox2, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE))
        			.addGap(9)
        			.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
        				.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 129, GroupLayout.PREFERRED_SIZE)
        				.addGroup(groupLayout.createSequentialGroup()
        					.addComponent(btnAgregar)
        					.addGap(11)
        					.addComponent(btnModificar)
        					.addGap(11)
        					.addComponent(btnEliminar, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)))
        			.addGap(29)
        			.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
        				.addGroup(groupLayout.createSequentialGroup()
        					.addGap(12)
        					.addComponent(jPanelrbtn, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE))
        				.addGroup(groupLayout.createSequentialGroup()
        					.addGap(12)
        					.addComponent(jPanel2, GroupLayout.PREFERRED_SIZE, 81, GroupLayout.PREFERRED_SIZE))
        				.addGroup(groupLayout.createSequentialGroup()
        					.addGap(20)
        					.addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, 63, GroupLayout.PREFERRED_SIZE))
        				.addComponent(jPanel3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addGap(20)
        			.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
        				.addComponent(jButton5, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jButton7, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jButton8, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jButton6, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
        				.addGroup(groupLayout.createSequentialGroup()
        					.addGap(14)
        					.addComponent(jButton4, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))))
        );
        getContentPane().setLayout(groupLayout);

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
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == jButton4) {
			do_jButton4_actionPerformed(e);
		}
	}
	protected void do_jButton4_actionPerformed(ActionEvent e) {
		 dispose();
	}
}
