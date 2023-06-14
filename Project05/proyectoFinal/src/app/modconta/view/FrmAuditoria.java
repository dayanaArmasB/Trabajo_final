/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.modconta.view;


import app.modconta.business.AuditoriaBO;
import app.modconta.business.Negocios;
import app.modconta.databaase.dbBean;
import app.modconta.entity.Mutation;
import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.DefaultComboBoxModel;
import java.awt.Font;


public class FrmAuditoria extends javax.swing.JInternalFrame {

     AuditoriaBO _auditoriaBO;
     DefaultTableModel dtm;
       
    public FrmAuditoria() 
    {
    	setTitle("CONSULTAS");
        initComponents();
        _auditoriaBO = new AuditoriaBO();
        llenaTabla("");   
   
    }

     private void llenaTabla(String tabla)
     {
     
        List<Mutation> productos = _auditoriaBO.readAll();
        for(int i=0; i<productos.size();i++){
            Vector vec = new Vector();
            vec.add(productos.get(i).getCodigo());
            vec.add(productos.get(i).getObservaciones());
            vec.add(productos.get(i).getVal_antes());
            vec.add(productos.get(i).getVal_despues());
            vec.add(productos.get(i).getRol());
            dtm.addRow(vec);
        }
     }
     
     public void limpiaTabla()
    {
        DefaultTableModel dm = (DefaultTableModel)this.tblFacts.getModel();
        if(dm.getRowCount()>0){
            while(dm.getRowCount()>0){
                dm.removeRow(dm.getRowCount()-1);
            }
        }
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnLeer = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        cmbFiltro = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        btnGenerarPDF = new javax.swing.JButton();

        jLabel1.setFont(new Font("Tahoma", Font.BOLD, 24)); // NOI18N
        jLabel1.setText("CONSULTAS DE AUDITORIA");

        btnLeer.setText("Leer");
        btnLeer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLeerActionPerformed(evt);
            }
        });

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        cmbFiltro.setModel(new DefaultComboBoxModel(new String[] {"Pedidos", "Productos", "Ventas", "Clientes", "Empleados", " "}));
        cmbFiltro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbFiltroActionPerformed(evt);
            }
        });

        jLabel2.setText("Filtro");

        btnGenerarPDF.setText("Exportar PDF");
        btnGenerarPDF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarPDFActionPerformed(evt);
            }
        });
        
        JScrollPane scrollPane = new JScrollPane();

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addGap(214)
        			.addComponent(jLabel1)
        			.addContainerGap(232, Short.MAX_VALUE))
        		.addGroup(layout.createSequentialGroup()
        			.addGap(20)
        			.addComponent(jLabel2)
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addComponent(cmbFiltro, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.RELATED, 395, Short.MAX_VALUE)
        			.addComponent(btnLeer, GroupLayout.PREFERRED_SIZE, 79, GroupLayout.PREFERRED_SIZE)
        			.addGap(163))
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap()
        			.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 761, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        		.addGroup(Alignment.TRAILING, layout.createSequentialGroup()
        			.addContainerGap(691, Short.MAX_VALUE)
        			.addComponent(btnSalir, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap())
        		.addGroup(layout.createSequentialGroup()
        			.addGap(331)
        			.addComponent(btnGenerarPDF)
        			.addContainerGap(353, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap()
        			.addComponent(jLabel1)
        			.addGap(24)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(btnLeer)
        				.addComponent(jLabel2)
        				.addComponent(cmbFiltro, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addGap(18)
        			.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 207, GroupLayout.PREFERRED_SIZE)
        			.addGap(18)
        			.addComponent(btnGenerarPDF)
        			.addGap(23)
        			.addComponent(btnSalir)
        			.addContainerGap())
        );
        
        tblFacts = new JTable();
        tblFacts.setModel(new DefaultTableModel(
        	new Object[][] {
        	},
        	new String[] {
        		"C\u00F3digo", "Observaciones", "Valor Antes", "Valor despu\u00E9s", "Usuario", "Usuario bd", "Fecha"
        	}
        ));
        scrollPane.setViewportView(tblFacts);
        getContentPane().setLayout(layout);

        pack();
    }

    private void btnLeerActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {
        this.dispose();
    }

    private void cmbFiltroActionPerformed(java.awt.event.ActionEvent evt) {
       // cmbFiltro.setEnabled(true);
       limpiaTabla();
       llenaTabla(this.cmbFiltro.getSelectedItem().toString()); 
        //comboEquipos.setModel(h.getvaluesEqVe(Integer.parseInt(comboGrupos.getSelectedItem().toString())));
    }

    private void btnGenerarPDFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarPDFActionPerformed
         try { 
            //creamos un objeto dbBean
              dbBean aux = new dbBean();
             HashMap map = new HashMap();
            // Connection cn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=ST;user=sa;password=sasasa;");
              Connection cn = aux.getConnection();
              //JasperDesign jasdi = JRXmlLoader.load("C:\\Users\\RAUL\\Documents\\rmab\\JAVA\\app.modconta.egener\\src\\app\\modconta\\reports\\ReporteAuditoria.jrxml");
                JasperReport jr= JasperCompileManager.compileReport("src/app/modconta/reports/ReporteAuditoria.jrxml");
              //JasperReport jr= JasperCompileManager.compileReport(jasdi);
             // map.put("idCliente",idClie); 
              JasperPrint  jp = JasperFillManager.fillReport(jr,map,cn);
            // JasperPrint jp= JasperFillManager.fillReport(jr,idClie,cn);
              
              JasperViewer jv= new JasperViewer(jp,false);
              jv.setVisible(true);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    private javax.swing.JButton btnGenerarPDF;
    private javax.swing.JButton btnLeer;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox<String> cmbFiltro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private JTable tblFacts;
}
