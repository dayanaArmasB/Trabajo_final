package app.modconta.view;
import app.modconta.databaase.Helper;
import app.modconta.databaase.util;
import MODEL.ProductoDAO;
import MODEL.ServicioDAO;
import MODEL.VentaDAO;
import MODEL.detserDAO;
import app.modconta.business.Negocios;
import app.modconta.business.PedidoBO;
import app.modconta.databaase.dbBean;
import app.modconta.entity.Constantes;
import app.modconta.entity.DetallePedido;
import app.modconta.entity.Pedido;
import java.sql.Connection;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Vector;
import javax.swing.JOptionPane;
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
import javax.swing.JLabel;
import com.toedter.calendar.JDateChooser;
import java.awt.Dimension;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;


public class PedidoView extends javax.swing.JInternalFrame 
{
	PedidoBO _pedidoBO;
    ServicioDAO ServicioDAO;
    detserDAO detserDAO;
    VentaDAO vaux;
    Negocios boPedido;
    String RUCClient ="";
    DefaultTableModel dtm,dtm2;
    boolean sw = false;
    String cad = "";
    //int idClie; 
    Helper h = new Helper();
    
    public PedidoView() 
    {
    	setTitle("PEDIDOS");
        initComponents();
        dtm2 = (DefaultTableModel)tbGrupos.getModel();
        _pedidoBO = new PedidoBO();
        comboClientes.setModel(boPedido.getvaluesName("nombre", "clientes"));
       //comboClientes.setModel(h.getvaluesTienda("Tienda"));
         AutoCompleteDecorator.decorate(comboClientes);
         
         lblFechaDeAprobacin = new JLabel();
         lblFechaDeAprobacin.setText("Fecha de Aprobaci\u00F3n");
         lblFechaDeAprobacin.setBounds(12, 128, 130, 20);
         jPanel4.add(lblFechaDeAprobacin);
         
         JDateChooser btnFechaAprobaci髇 = new JDateChooser();
         btnFechaAprobaci髇.setPreferredSize(new Dimension(120, 20));
         btnFechaAprobaci髇.setBounds(136, 128, 120, 20);
         jPanel4.add(btnFechaAprobaci髇);
         
         JLabel lblFechaDeAnulacin = new JLabel();
         lblFechaDeAnulacin.setText("Fecha de Anulaci\u00F3n");
         lblFechaDeAnulacin.setBounds(267, 128, 130, 20);
         jPanel4.add(lblFechaDeAnulacin);
         
         JDateChooser btnFechaAnulacion = new JDateChooser();
         btnFechaAnulacion.setPreferredSize(new Dimension(120, 20));
         btnFechaAnulacion.setBounds(395, 128, 120, 20);
         jPanel4.add(btnFechaAnulacion);
         
         JLabel lblFechaDeCreacin = new JLabel();
         lblFechaDeCreacin.setText("Fecha de Creaci\u00F3n");
         lblFechaDeCreacin.setBounds(12, 95, 130, 20);
         jPanel4.add(lblFechaDeCreacin);
         
         JDateChooser btnFechaCreaci髇 = new JDateChooser();
         btnFechaCreaci髇.setPreferredSize(new Dimension(120, 20));
         btnFechaCreaci髇.setBounds(126, 95, 120, 20);
         jPanel4.add(btnFechaCreaci髇);
         
         JLabel lblId = new JLabel();
         lblId.setText("ID");
         lblId.setBounds(12, 21, 33, 21);
         jPanel4.add(lblId);
         
         txtID = new JTextField();
         txtID.setBounds(40, 18, 130, 29);
         jPanel4.add(txtID);
         
         JLabel lblCliente = new JLabel();
         lblCliente.setText("Cliente");
         lblCliente.setBounds(12, 57, 63, 21);
         jPanel4.add(lblCliente);
         
         JLabel lblEstado = new JLabel();
         lblEstado.setText("Estado");
         lblEstado.setBounds(12, 161, 63, 21);
         jPanel4.add(lblEstado);
         
         JComboBox comboBox = new JComboBox();
         comboBox.setModel(new DefaultComboBoxModel(new String[] {"Anulado", "Activo", "Finalizado"}));
         comboBox.setBounds(90, 161, 80, 22);
         jPanel4.add(comboBox);
        //dtm2 = (DefaultTableModel)jTable1.getModel();
    }

       public boolean valida()
      {
        boolean sw = false;
        if(this.txtfolio.getText().equals("")){
           JOptionPane.showMessageDialog(this, "Debe Ingresar N掳 Folio");
           return false;
        }
           
        if(this.txtfolio.getText().length()> Constantes.MAX_TAMAMO_FOLIO)
        {
        JOptionPane.showMessageDialog(null, "El folio no debe exceder " + String.valueOf(Constantes.MAX_TAMAMO_FOLIO) + " caracteres" , "VALIDACION", JOptionPane.WARNING_MESSAGE);
        return false;
        }
          
        if(dtm2.getRowCount()<=0)
        {
        JOptionPane.showMessageDialog(this, "No existe detalles en el pedido de compra N掳"+ txtfolio.getText()+ ". Por favor, debe ingresar al menos un detalle.");
        return false;
        }
        return true;
      }

    //M脡TODO PARA LIMPIAR CONTROLES 
    public void limpiaControles()
     {
        this.txtRucCliente.setText("");
        this.btnRegistrar.setText("Registrar");
       //   this.txtNombre.requestFocus();
     }
 
    public void limpiaTabla()
    {
        DefaultTableModel dm = (DefaultTableModel)this.tbGrupos.getModel();
        if(dm.getRowCount()>0){
            while(dm.getRowCount()>0){
                dm.removeRow(dm.getRowCount()-1);
            }
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        btnFechaEntrega = new com.toedter.calendar.JDateChooser();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tbGrupos = new javax.swing.JTable();
        btnAgregar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        txtRucCliente = new javax.swing.JTextField();
        comboClientes = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        txtfolio = new javax.swing.JTextField();
        txtobservaciondetalle = new javax.swing.JTextField();
        lblObservacion = new javax.swing.JLabel();
        btnLeer = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        btnExportarPDF = new javax.swing.JButton();
        btnRegistrar = new javax.swing.JButton();
        btnAprobar = new javax.swing.JButton();
        btnAnular = new javax.swing.JButton();
        btnModificarPedido = new javax.swing.JButton();
        btnCotizar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("REGISTRO DE PEDIDOS");

        jTabbedPane1.setMaximumSize(new java.awt.Dimension(32769, 32769));

        jPanel4.setLayout(null);

        btnFechaEntrega.setDate(Calendar.getInstance().getTime());
        btnFechaEntrega.setPreferredSize(new java.awt.Dimension(120, 20));
        jPanel4.add(btnFechaEntrega);
        btnFechaEntrega.setBounds(374, 95, 120, 20);

        jLabel5.setText("Fecha de Entrega");
        jPanel4.add(jLabel5);
        jLabel5.setBounds(257, 95, 110, 20);

        tbGrupos.setModel(new DefaultTableModel(
        	new Object[][] {
        	},
        	new String[] {
        		"ID Pedido", "Fecha de Creacion", "Fecha de Entrega", "Fecha de Aprobacion", "Fecha de Anulacion", "Estado", "Folio", "ID Cliente", "Observacion"
        	}
        ));
        tbGrupos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbGruposMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tbGrupos);

        jPanel4.add(jScrollPane4);
        jScrollPane4.setBounds(12, 249, 678, 200);

        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/agregar.png"))); // NOI18N
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        jPanel4.add(btnAgregar);
        btnAgregar.setBounds(639, 107, 35, 32);

        btnModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/update.png"))); // NOI18N
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        jPanel4.add(btnModificar);
        btnModificar.setBounds(639, 140, 35, 32);

        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/eliminar.png"))); // NOI18N
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel4.add(btnEliminar);
        btnEliminar.setBounds(639, 178, 35, 32);

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        jPanel4.add(btnLimpiar);
        btnLimpiar.setBounds(554, 49, 120, 29);
        jPanel4.add(txtRucCliente);
        txtRucCliente.setBounds(247, 53, 140, 29);

        comboClientes.setEditable(true);
        comboClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboClientesActionPerformed(evt);
            }
        });
        jPanel4.add(comboClientes);
        comboClientes.setBounds(99, 53, 130, 29);

        jLabel2.setText("Folio");
        jPanel4.add(jLabel2);
        jLabel2.setBounds(214, 19, 33, 21);
        jPanel4.add(txtfolio);
        txtfolio.setBounds(257, 15, 130, 29);
        jPanel4.add(txtobservaciondetalle);
        txtobservaciondetalle.setBounds(90, 196, 230, 29);

        lblObservacion.setText("Observaci\u00F3n");
        jPanel4.add(lblObservacion);
        lblObservacion.setBounds(12, 200, 82, 21);

        btnLeer.setText("Leer");
        btnLeer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLeerActionPerformed(evt);
            }
        });
        jPanel4.add(btnLeer);
        btnLeer.setBounds(554, 15, 120, 29);

        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/buscar.gif"))); // NOI18N
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        jPanel4.add(btnBuscar);
        btnBuscar.setBounds(506, 33, 40, 30);

        jTabbedPane1.addTab("Registrar Pedidos", jPanel4);

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        btnExportarPDF.setText("Exportar PDF");
        btnExportarPDF.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnExportarPDF.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        btnExportarPDF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExportarPDFActionPerformed(evt);
            }
        });

        btnRegistrar.setText("Registrar");
        btnRegistrar.setName("btnRegistrarPedido"); // NOI18N
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

        btnAprobar.setText("Aprobar");
        btnAprobar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAprobarActionPerformed(evt);
            }
        });

        btnAnular.setText("Anular");
        btnAnular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnularActionPerformed(evt);
            }
        });

        btnModificarPedido.setText("Modificar");
        btnModificarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarPedidoActionPerformed(evt);
            }
        });

        btnCotizar.setText("Cotizar");
        btnCotizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCotizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap()
        			.addComponent(jTabbedPane1, GroupLayout.PREFERRED_SIZE, 707, GroupLayout.PREFERRED_SIZE)
        			.addGap(18)
        			.addGroup(layout.createParallelGroup(Alignment.LEADING, false)
        				.addComponent(btnSalir, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        				.addComponent(btnCotizar, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        				.addComponent(btnExportarPDF, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        				.addComponent(btnAnular, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        				.addComponent(btnAprobar, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        				.addComponent(btnModificarPedido, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        				.addComponent(btnRegistrar, GroupLayout.PREFERRED_SIZE, 161, GroupLayout.PREFERRED_SIZE))
        			.addContainerGap(31, Short.MAX_VALUE))
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap(350, Short.MAX_VALUE)
        			.addComponent(jLabel1)
        			.addGap(293))
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(layout.createSequentialGroup()
        					.addGap(12)
        					.addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addComponent(jTabbedPane1, GroupLayout.PREFERRED_SIZE, 518, GroupLayout.PREFERRED_SIZE))
        				.addGroup(layout.createSequentialGroup()
        					.addGap(100)
        					.addComponent(btnRegistrar)
        					.addGap(3)
        					.addComponent(btnModificarPedido)
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addComponent(btnAprobar)
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addComponent(btnAnular)
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addComponent(btnExportarPDF)
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addComponent(btnCotizar)
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addComponent(btnSalir)))
        			.addContainerGap(40, Short.MAX_VALUE))
        );
        getContentPane().setLayout(layout);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        limpiaControles();
        limpiaTabla();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        
       /* try {
        int id = 0, est;
        int idClient = 0;
        String pr = "";
        if(valida() == true)
        {
            util u = new util();
            Pedido p = new Pedido();
            idClient = boPedido.ObtenerCampoTablaGenerico("clientes", "idcliente", "nombre", comboClientes.getSelectedItem().toString(),true);
            p.setIdCliente(idClient);
            p.setFolio(txtfolio.getText());
            //s.setIdVenta(Integer.parseInt(comboGrupos.getSelectedItem().toString()));
             //configuramos la fecha 
//             String dia_i = Integer.toString(this.btnFechaEntrega.getCalendar().get(Calendar.DAY_OF_MONTH));
//             String mes_i = Integer.toString(this.btnFechaEntrega.getCalendar().get(Calendar.MONTH) + 1);
//             String year_i = Integer.toString(this.btnFechaEntrega.getCalendar().get(Calendar.YEAR));
             //String fecha_i = (year_i + "/" + mes_i+ "/" + dia_i);
             //s.setFechaEntrega(fecha_i);
             
              //configuramos la fecha
//String dia_i2 = Integer.toString(this.btnFechaEntrega.getCalendar().get(Calendar.DAY_OF_MONTH));
//String mes_i2 = Integer.toString(this.btnFechaEntrega.getCalendar().get(Calendar.MONTH) + 1);
//String year_i2 = Integer.toString(this.btnFechaEntrega.getCalendar().get(Calendar.YEAR));
             //String fecha_i2 = (dia_i2 + "/" + mes_i2+ "/" +year_i2 );
            // s.setFechaRecibido(fecha_i2);
            //s.setIdTienda(vaux.FindIDTienda(this.comboClientes.getSelectedItem().toString()));
           // id = u.idNext("Servicio", "idServicio");
            //pr = "insert";
             //s.setIdServicio(id);
            //ServicioDAO.procesaItem(s, pr);  
            if(boPedido.RegistrarPedido(p) == true)
            {
                for(int i =0;i<dtm2.getRowCount();i++)
                { 
                    int  idGrupo = boPedido.ObtenerCampoTablaGenerico("grupo_ma", "id_grupo", "codigo", dtm2.getValueAt(i, 0).toString().trim(),true);
                    DetallePedido detpe = new  DetallePedido();
                    detpe.setId_grupo(idGrupo);
                    detpe.setPlantel(Integer.parseInt(dtm2.getValueAt(i, 1).toString().trim()));
                    detpe.setCantidadHoras(Float.parseFloat(dtm2.getValueAt(i, 2).toString().trim()));
                    detpe.setObservaciones(dtm2.getValueAt(i,3).toString());
                    //int aux = boPedido.ObtenerCampoTablaGenerico("pedido", "id_pedido", "folio", txtfolio.getText());
                    // String aux2= String.valueOf(aux);
                            
                    detpe.setIdPedido(boPedido.ObtenerCampoTablaGenerico("pedido", "id_pedido", "folio", txtfolio.getText(),true));
                    //detse.setP_unit(Float.parseFloat(dtm2.getValueAt(i, 3).toString().trim()));
                    //detse.setImporte(Float.parseFloat(dtm2.getValueAt(i, 4).toString().trim()));      
                    if(!boPedido.registrarItemPedido(detpe)==true) 
                    {
                       JOptionPane.showMessageDialog(null, "No se pudo registrar el detalle ", "ERROR", JOptionPane.ERROR_MESSAGE);
                    }
                }
                    JOptionPane.showMessageDialog(null, "Se registraron los registros correctamente", "脡XITO", JOptionPane.INFORMATION_MESSAGE);
                    limpiaControles();
                     limpiaTabla();
            }
            else
            {
                JOptionPane.showMessageDialog(null, "No se pudo registrar correctamente el pedido", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }
        }
        catch (Exception e) 
        { 
            JOptionPane.showMessageDialog(null, "Ocurri贸 un error al registrar " + e.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        finally
        {
        
        }*/
    }//GEN-LAST:event_btnRegistrarActionPerformed

    
    private void btnRegistrarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnRegistrarKeyPressed

    }//GEN-LAST:event_btnRegistrarKeyPressed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnExportarPDFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExportarPDFActionPerformed
   try{           
              String x = this.txtfolio.getText().trim();
             //creamos un objeto dbBean
              dbBean aux = new dbBean();
             HashMap map = new HashMap();
            // Connection cn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=ST;user=sa;password=sasasa;");
              Connection cn = aux.getConnection();
              //JasperDesign jasdi = JRXmlLoader.load("C:\\Users\\RAUL\\Documents\\rmab\\JAVA\\app.modconta.egener\\src\\app\\modconta\\reports\\ReporteAuditoria.jrxml");
                JasperReport jr= JasperCompileManager.compileReport("src/app/modconta/reports/ReportePedido.jrxml");
               // String x =
                map.put("folio",x);
              //JasperReport jr= JasperCompileManager.compileReport(jasdi);
             // map.put("idCliente",idClie); 
              JasperPrint  jp = JasperFillManager.fillReport(jr,map,cn);
            // JasperPrint jp= JasperFillManager.fillReport(jr,idClie,cn);
              
              JasperViewer jv= new JasperViewer(jp,false);
              jv.setVisible(true);
    } catch (Exception e) {
            System.out.println(e);
        }
    

    }//GEN-LAST:event_btnExportarPDFActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        //crea un vector  y le asignamos los valores 
        Vector vec = new Vector();
        vec.addElement(this.txtobservaciondetalle.getText());
        //float foo = Float.parseFloat(txtpunit.getText());
        //int can = Integer.parseInt(this.spincant.getValue().toString());
        //importexd = can*foo;
        //vec.addElement(importexd);
        dtm2.addRow(vec);
        
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
              
      try   
      {
            int fila;
            if(this.tbGrupos.getRowCount()>0)
            {
              fila = this.tbGrupos.getSelectedRow();
              dtm2.removeRow(fila);
            }
        }  
          catch (Exception e) 
        { 
            JOptionPane.showMessageDialog(null,  e.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
            System.out.println(e.getCause() +  " " + e.getLocalizedMessage());
        }    
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnAprobarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAprobarActionPerformed
     /* try {
        int id = 0, est;
        int idClient = 0;
        String pr = "";
     
            util u = new util();
            Pedido p = new Pedido();
            p.setIdPedido(boPedido.ObtenerCampoTablaGenerico("pedido", "id_pedido", "folio", txtfolio.getText(),false));
            p.setIdCliente(idClient);
            p.setFolio(txtfolio.getText());
            p.setEstado("A");
            if(boPedido.ActualizarPedido(p) == true)
            {
               
            }
            else
            {
                JOptionPane.showMessageDialog(null, "No se pudo aprobar correctamente el pedido", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        
        }
        catch (Exception e) 
        { 
            JOptionPane.showMessageDialog(null, "Ocurri贸 un error al APROBAR EL PEDIDO " + e.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
            throw e;
        }
        finally
        {
            JOptionPane.showMessageDialog(null, "Se aprob贸 el pedido con 茅xito", "脡XITO", JOptionPane.OK_OPTION);
            limpiaControles();
            limpiaTabla();
        }*/
    }//GEN-LAST:event_btnAprobarActionPerformed

    private void btnAnularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnularActionPerformed
      /*  try {
        int id = 0, est;
        int idClient = 0;
        String pr = "";
   
            util u = new util();
            Pedido p = new Pedido();
            idClient = boPedido.ObtenerCampoTablaGenerico("clientes", "idcliente", "nombre", comboClientes.getSelectedItem().toString(),true);
            p.setIdCliente(idClient);
            p.setIdPedido(boPedido.ObtenerCampoTablaGenerico("pedido", "id_pedido", "folio", txtfolio.getText(),false));
            p.setFolio(txtfolio.getText());
            p.setEstado("N");
            if(boPedido.ActualizarPedido(p) == true)
            {
               
            }
            else
            {
                JOptionPane.showMessageDialog(null, "No se pudo anular correctamente el pedido", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        
        }
        catch (Exception e) 
        { 
            JOptionPane.showMessageDialog(null, "Ocurri贸 un error al APROBAR EL PEDIDO " + e.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
            throw e;
        }
        finally
        {
            JOptionPane.showMessageDialog(null, "Se anul贸 el pedido con 茅xito", "脡XITO", JOptionPane.OK_OPTION);
            limpiaControles();
            limpiaTabla();
        } */
    }//GEN-LAST:event_btnAnularActionPerformed

    private void comboClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboClientesActionPerformed
       RUCClient =String.valueOf(boPedido.ObtenerCampoTablaGenerico("clientes", "RUC", "nombre", comboClientes.getSelectedItem().toString(),true));
        txtRucCliente.setText(RUCClient);
    }//GEN-LAST:event_comboClientesActionPerformed

    private void btnModificarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarPedidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnModificarPedidoActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnLeerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLeerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLeerActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
    
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnCotizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCotizarActionPerformed
      //Crear la instancia
      CotizacionView cotiz =new CotizacionView();
      MDIApplication.escritorio.add(cotiz);
      cotiz.setVisible(true);
       cotiz.toFront();
        //this.toBack();
    }//GEN-LAST:event_btnCotizarActionPerformed

    private void tbGruposMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbGruposMouseClicked
 

    }//GEN-LAST:event_tbGruposMouseClicked

    
     
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnAnular;
    private javax.swing.JButton btnAprobar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCotizar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnExportarPDF;
    private com.toedter.calendar.JDateChooser btnFechaEntrega;
    private javax.swing.JButton btnLeer;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnModificarPedido;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox<String> comboClientes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblObservacion;
    private javax.swing.JTable tbGrupos;
    private javax.swing.JTextField txtRucCliente;
    private javax.swing.JTextField txtfolio;
    private javax.swing.JTextField txtobservaciondetalle;
    private JLabel lblFechaDeAprobacin;
    private JTextField txtID;
}

   





