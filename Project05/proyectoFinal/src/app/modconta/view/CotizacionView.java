package app.modconta.view;
import app.modconta.databaase.Helper;
import app.modconta.databaase.util;
import MODEL.ProductoDAO;
import MODEL.ServicioDAO;
import MODEL.VentaDAO;
import MODEL.detserDAO;
import app.modconta.business.Negocios;
import app.modconta.databaase.dbBean;
import app.modconta.entity.Cotizacion;
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
import javax.swing.JTabbedPane;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Dimension;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JTable;

public class CotizacionView extends javax.swing.JInternalFrame 
{
      //variables  
    ProductoDAO eqx = new ProductoDAO();
    ServicioDAO ServicioDAO;
    detserDAO detserDAO;
    VentaDAO vaux;
    
    
    Negocios boPedido;
    
    DefaultTableModel dtm,dtm2;
    boolean sw = false;
    String cad = "";
    //int idClie; 
    Helper h = new Helper();
    
    public CotizacionView() 
    {
    	setTitle("COTIZACIONES");
        initComponents();
        boPedido = new Negocios();
                 //ServicioDAO = new ServicioDAO();
                 //detserDAO = new detserDAO();
       
                 //comboEquipos.setEnabled(false);
                 //AreaCausa.setEnabled(false);
                 //AreaFallas.setEnabled(false);
                 //AreaSolucion.setEnabled(false);
                 //comboClientes.setModel(h.getvaluesVentas("Venta"));
                 comboPedidos.setModel(boPedido.getvaluesName("id_pedido", "pedido"));
                 // comboGrupos.setModel(boPedido.getvaluesName("codigo", "grupo_ma"));
                 //comboClientes.setModel(h.getvaluesTienda("Tienda"));
                   AutoCompleteDecorator.decorate(comboPedidos);
                   lbMonto = new javax.swing.JLabel();
                   lbMonto.setBounds(17, 124, 70, 14);
                   jPanel4.add(lbMonto);
                   
                           lbMonto.setText("Monto (s/.)");
                           jPanel4 = new javax.swing.JPanel();
                           btnFechaEntrega = new com.toedter.calendar.JDateChooser();
                           jLabel10 = new javax.swing.JLabel();
                           comboPedidos = new javax.swing.JComboBox<>();
                           jLabel2 = new javax.swing.JLabel();
                           txtfolio = new javax.swing.JTextField();
                           btnBuscar = new javax.swing.JButton();
                           txtDescripcion = new javax.swing.JTextField();
                           jLabel6 = new javax.swing.JLabel();
                           jLabel11 = new javax.swing.JLabel();
                           txtMonto = new javax.swing.JTextField();
                           
                                   jPanel4.setLayout(null);
                                   
                                           btnFechaEntrega.setDate(Calendar.getInstance().getTime());
                                           btnFechaEntrega.setPreferredSize(new java.awt.Dimension(120, 20));
                                           jPanel4.add(btnFechaEntrega);
                                           btnFechaEntrega.setBounds(80, 80, 130, 20);
                                                   
                                                           jLabel10.setText("Descripci\u00F3n");
                                                           jPanel4.add(jLabel10);
                                                           jLabel10.setBounds(17, 161, 74, 20);
                                                           
                                                                   comboPedidos.setEditable(true);
                                                                   comboPedidos.addActionListener(new java.awt.event.ActionListener() {
                                                                       public void actionPerformed(java.awt.event.ActionEvent evt) {
                                                                           comboPedidosActionPerformed(evt);
                                                                       }
                                                                   });
                                                                   jPanel4.add(comboPedidos);
                                                                   comboPedidos.setBounds(80, 50, 130, 22);
                                                                   
                                                                           jLabel2.setText("Folio Cotizaci\u00F3n");
                                                                           jPanel4.add(jLabel2);
                                                                           jLabel2.setBounds(17, 20, 83, 16);
                                                                           jPanel4.add(txtfolio);
                                                                           txtfolio.setBounds(110, 17, 130, 22);
                                                                                   
                                                                                           btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/buscar.gif"))); // NOI18N
                                                                                           btnBuscar.addActionListener(new java.awt.event.ActionListener() {
                                                                                               public void actionPerformed(java.awt.event.ActionEvent evt) {
                                                                                                   btnBuscarActionPerformed(evt);
                                                                                               }
                                                                                           });
                                                                                           jPanel4.add(btnBuscar);
                                                                                           btnBuscar.setBounds(595, 20, 50, 30);
                                                                                           jPanel4.add(txtDescripcion);
                                                                                           txtDescripcion.setBounds(110, 160, 480, 22);
                                                                                           
                                                                                                   jLabel6.setText("Fecha");
                                                                                                   jPanel4.add(jLabel6);
                                                                                                   jLabel6.setBounds(17, 80, 50, 20);
                                                                                                   
                                                                                                           jLabel11.setText("Pedido");
                                                                                                           jPanel4.add(jLabel11);
                                                                                                           jLabel11.setBounds(17, 51, 100, 20);
                                                                                                           jPanel4.add(txtMonto);
                                                                                                           txtMonto.setBounds(110, 120, 130, 22);
                                                                                                           
                                                                                                                   jTabbedPane1.addTab("Registrar Cotizaci髇", jPanel4);
                                                                                                                   {
                                                                                                                   	lblMonto = new JLabel();
                                                                                                                   	lblMonto.setText("Monto");
                                                                                                                   	lblMonto.setBounds(17, 121, 50, 20);
                                                                                                                   	jPanel4.add(lblMonto);
                                                                                                                   }
                                                                                                                   {
                                                                                                                   	panel = new JPanel();
                                                                                                                   	jTabbedPane1.addTab("Busqueda", null, panel, null);
                                                                                                                   	panel.setLayout(null);
                                                                                                                   	{
                                                                                                                   		label = new JLabel();
                                                                                                                   		label.setText("B鷖queda");
                                                                                                                   		label.setBounds(10, 25, 60, 20);
                                                                                                                   		panel.add(label);
                                                                                                                   	}
                                                                                                                   	{
                                                                                                                   		scrollPane = new JScrollPane();
                                                                                                                   		scrollPane.setBounds(10, 60, 610, 200);
                                                                                                                   		panel.add(scrollPane);
                                                                                                                   		
                                                                                                                   		table = new JTable();
                                                                                                                   		scrollPane.setViewportView(table);
                                                                                                                   	}
                                                                                                                   	{
                                                                                                                   		textField = new JTextField();
                                                                                                                   		textField.setName("txtBusqueda");
                                                                                                                   		textField.setBounds(230, 20, 300, 30);
                                                                                                                   		panel.add(textField);
                                                                                                                   	}
                                                                                                                   	{
                                                                                                                   		cbxCotizaciones = new JComboBox<String>();
                                                                                                                   		cbxCotizaciones.setToolTipText("");
                                                                                                                   		cbxCotizaciones.setBounds(70, 20, 150, 30);
                                                                                                                   		panel.add(cbxCotizaciones);
                                                                                                                   	}
                                                                                                                   }

    }

       public boolean valida()
      {
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

     

    //M脡TODO PARA LIMPIAR CONTROLES 
    public void limpiaControles()
     {
        this.btnRegistrar.setText("Registrar");
       //   this.txtNombre.requestFocus();
     }
 
   
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        btnSalir = new javax.swing.JButton();
        btnRegistrar = new javax.swing.JButton();
        btnAprobar = new javax.swing.JButton();
        btnAnular = new javax.swing.JButton();
        btnModificarPedido = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("GENERACI\u00D3N DE COTIZACI\u00D3N");

        jTabbedPane1.setMaximumSize(new java.awt.Dimension(32769, 32769));

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
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
        btnLimpiar = new javax.swing.JButton();
        
                btnLimpiar.setText("Limpiar");
                btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        btnLimpiarActionPerformed(evt);
                    }
                });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(layout.createSequentialGroup()
        			.addGap(25)
        			.addComponent(jTabbedPane1, GroupLayout.PREFERRED_SIZE, 660, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        				.addGroup(layout.createSequentialGroup()
        					.addGap(18)
        					.addGroup(layout.createParallelGroup(Alignment.LEADING)
        						.addComponent(btnRegistrar, GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
        						.addComponent(btnModificarPedido, GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
        						.addComponent(btnAnular, GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
        						.addComponent(btnAprobar, GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
        						.addComponent(btnLimpiar, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE))
        					.addGap(50))
        				.addGroup(layout.createSequentialGroup()
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addComponent(btnSalir, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
        					.addContainerGap())))
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap(257, Short.MAX_VALUE)
        			.addComponent(jLabel1)
        			.addGap(249))
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(layout.createSequentialGroup()
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(layout.createSequentialGroup()
        					.addContainerGap()
        					.addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addComponent(jTabbedPane1, GroupLayout.PREFERRED_SIZE, 321, GroupLayout.PREFERRED_SIZE))
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
        					.addComponent(btnLimpiar, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)))
        			.addContainerGap(43, Short.MAX_VALUE))
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap(301, Short.MAX_VALUE)
        			.addComponent(btnSalir)
        			.addContainerGap())
        );
        getContentPane().setLayout(layout);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        limpiaControles();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        
        try {
        int id = 0, est;
        int idClient = 0;
        String pr = "";
        if(valida() == true)
        {
            util u = new util();
            //Pedido p = new Pedido();
            Cotizacion c = new Cotizacion();
            // idClient = boPedido.ObtenerCampoTablaGenerico("clientes", "idcliente", "nombre", comboPedidos.getSelectedItem().toString(),true);
            c.setRol("RMAB");
           // c.setIdPedido(boPedido.ObtenerCampoTablaGenerico("pedido", "id_pedido", "folio", txtfolio.getText(),false));
            c.setIdPedido(Integer.parseInt(comboPedidos.getSelectedItem().toString()));
            c.setDescripcion(txtDescripcion.getText().toString());
            c.setMonto(txtMonto.getText().toString());
//p.setIdCliente(idClient);
            //p.setFolio(txtfolio.getText()); 
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
            if(boPedido.RegistrarCotizacion(c) == true)
            {
//                for(int i =0;i<dtm2.getRowCount();i++)
//                { 
//                    int  idGrupo = boPedido.ObtenerCampoTablaGenerico("grupo_ma", "id_grupo", "codigo", dtm2.getValueAt(i, 0).toString().trim(),true);
//                    DetallePedido detpe = new  DetallePedido();
//                    detpe.setId_grupo(idGrupo);
//                    detpe.setPlantel(Integer.parseInt(dtm2.getValueAt(i, 1).toString().trim()));
//                    detpe.setCantidadHoras(Float.parseFloat(dtm2.getValueAt(i, 2).toString().trim()));
//                    detpe.setObservaciones(dtm2.getValueAt(i,3).toString());
//                    //int aux = boPedido.ObtenerCampoTablaGenerico("pedido", "id_pedido", "folio", txtfolio.getText());
//                    // String aux2= String.valueOf(aux);
//                            
//                    detpe.setIdPedido(boPedido.ObtenerCampoTablaGenerico("pedido", "id_pedido", "folio", txtfolio.getText(),true));
//                    //detse.setP_unit(Float.parseFloat(dtm2.getValueAt(i, 3).toString().trim()));
//                    //detse.setImporte(Float.parseFloat(dtm2.getValueAt(i, 4).toString().trim()));      
//                    if(!boPedido.registrarItemPedido(detpe)==true) 
//                    {
//                       JOptionPane.showMessageDialog(null, "No se pudo registrar el detalle ", "ERROR", JOptionPane.ERROR_MESSAGE);
//                    }
//                }
                    JOptionPane.showMessageDialog(null, "Se registr贸 la cotizaci贸n con 茅xito ", "脡XITO", JOptionPane.INFORMATION_MESSAGE);
                    limpiaControles();
            }
            else
            {
                JOptionPane.showMessageDialog(null, "No se pudo registrar correctamente la cotizaci贸n", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }
        }
        catch (Exception e) 
        { 
            JOptionPane.showMessageDialog(null, "Ocurri贸 un error al registrar la cotizaci贸n " + e.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        finally
        {
        
        }
    }//GEN-LAST:event_btnRegistrarActionPerformed

    
    private void btnRegistrarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnRegistrarKeyPressed

    }//GEN-LAST:event_btnRegistrarKeyPressed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnAprobarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAprobarActionPerformed
     /* try {
        int id = 0, est;
        int idClient = 0;
        String pr = "";
        if(valida() == true)
        {
            util u = new util();
            Pedido p = new Pedido();
            //c.setIdPedido(boPedido.ObtenerCampoTablaGenerico("pedido", "id_pedido", "folio", txtfolio.getText(),false));
            
            p.setFolio(txtfolio.getText());
            p.setEstado("A");
            if(boPedido.ActualizarPedido(p) == true)
            {
               
            }
            else
            {
                JOptionPane.showMessageDialog(null, "No se pudo aprobar correctamente la cotizaci贸n", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
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
        } 
        */
    }//GEN-LAST:event_btnAprobarActionPerformed

    private void btnAnularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnularActionPerformed
       /* try {
        int id = 0, est;
        int idClient = 0;
        String pr = "";
        if(valida() == true)
        {
            util u = new util();
            Pedido p = new Pedido();
            idClient = boPedido.ObtenerCampoTablaGenerico("clientes", "idcliente", "nombre", comboPedidos.getSelectedItem().toString(),true);
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
        }*/
    }//GEN-LAST:event_btnAnularActionPerformed

    private void comboPedidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboPedidosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboPedidosActionPerformed

    private void btnModificarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarPedidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnModificarPedidoActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        int x ;
        x = Integer.parseInt(JOptionPane.showInputDialog(" Ingrese el codigo del Empleado"));
        try {
            //creamos un objeto dbBean
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
            System.out.println(e);
        }
    }//GEN-LAST:event_btnBuscarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnular;
    private javax.swing.JButton btnAprobar;
    private javax.swing.JButton btnBuscar;
    private com.toedter.calendar.JDateChooser btnFechaEntrega;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnModificarPedido;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox<String> comboPedidos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lbMonto;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JTextField txtMonto;
    private javax.swing.JTextField txtfolio;
    private JLabel lblMonto;
    private JPanel panel;
    private JLabel label;
    private JScrollPane scrollPane;
    private JTextField textField;
    private JComboBox<String> cbxCotizaciones;
    private JTable table;
}


   





