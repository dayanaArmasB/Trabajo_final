package app.modconta.view;

import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MDIApplication extends javax.swing.JFrame {

    public MDIApplication() {
        
        try {
             initComponents();
        } catch (Exception e) {
               JOptionPane.showMessageDialog(null,e.getMessage() + " " + e.getClass() + "" + e.getCause() + " " + e.getStackTrace()) ;
        }
       
    }

    private void initComponents() {

        escritorio = new javax.swing.JDesktopPane();
        jToolBar1 = new javax.swing.JToolBar();
        btnClientes = new javax.swing.JButton();
        jSeparator6 = new javax.swing.JToolBar.Separator();
        btnEmpleados = new javax.swing.JButton();
        jSeparator5 = new javax.swing.JToolBar.Separator();
        btnProveedores = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        btnEquipos = new javax.swing.JButton();
        jSeparator9 = new javax.swing.JToolBar.Separator();
        jButton3 = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JToolBar.Separator();
        btnVentas = new javax.swing.JButton();
        jSeparator8 = new javax.swing.JToolBar.Separator();
        btnServicios = new javax.swing.JButton();
        jSeparator10 = new javax.swing.JToolBar.Separator();
        btnPedidos = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JToolBar.Separator();
        jSeparator4 = new javax.swing.JToolBar.Separator();
        btnSalir = new javax.swing.JButton();

        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        setTitle("ERP(LIBRERIA-BAZAR YULIZA)");

        jToolBar1.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.MatteBorder(null), javax.swing.BorderFactory.createCompoundBorder()));
        jToolBar1.setFloatable(false);
        jToolBar1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jToolBar1.setRollover(true);
        jToolBar1.setMaximumSize(new java.awt.Dimension(466, 33));

        btnClientes.setFont(new java.awt.Font("Arial Black", 3, 12)); // NOI18N
        btnClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/User_1.png"))); // NOI18N
        btnClientes.setText("Clientes");
        btnClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClientesActionPerformed(evt);
            }
        });
        jToolBar1.add(btnClientes);
        jToolBar1.add(jSeparator6);

        btnEmpleados.setFont(new java.awt.Font("Arial Black", 3, 12)); // NOI18N
        btnEmpleados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Business_People_01_1.png"))); // NOI18N
        btnEmpleados.setText("Empleados ");
        btnEmpleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmpleadosActionPerformed(evt);
            }
        });
        jToolBar1.add(btnEmpleados);
        jToolBar1.add(jSeparator5);

        btnProveedores.setFont(new java.awt.Font("Arial Black", 3, 12)); // NOI18N
        btnProveedores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/contact-list.png"))); // NOI18N
        btnProveedores.setText("Proveedores");
        btnProveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProveedoresActionPerformed(evt);
            }
        });
        jToolBar1.add(btnProveedores);
        jToolBar1.add(jSeparator1);

        btnEquipos.setFont(new java.awt.Font("Arial Black", 3, 12)); // NOI18N
        btnEquipos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/backup-restore.png"))); // NOI18N
        btnEquipos.setText("Productos");
        btnEquipos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEquiposActionPerformed(evt);
            }
        });
        jToolBar1.add(btnEquipos);
        jToolBar1.add(jSeparator9);

        jButton3.setFont(new java.awt.Font("Arial Black", 3, 12)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Shopping_Full.png"))); // NOI18N
        jButton3.setText("Compras");
        jButton3.setFocusable(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton3);
        jToolBar1.add(jSeparator2);

        btnVentas.setFont(new java.awt.Font("Arial Black", 3, 12)); // NOI18N
        btnVentas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/sign_dolar_24_1.png"))); // NOI18N
        btnVentas.setText("Ventas");
        btnVentas.setFocusable(false);
        btnVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVentasActionPerformed(evt);
            }
        });
        jToolBar1.add(btnVentas);
        jToolBar1.add(jSeparator8);

        btnServicios.setFont(new java.awt.Font("Arial Black", 3, 12)); // NOI18N
        btnServicios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/dollar blue.png"))); // NOI18N
        btnServicios.setText("Cotizaciones");
        btnServicios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnServiciosActionPerformed(evt);
            }
        });
        jToolBar1.add(btnServicios);
        jToolBar1.add(jSeparator10);

        btnPedidos.setFont(new java.awt.Font("Arial Black", 3, 12)); // NOI18N
        btnPedidos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/shopping_cart.png"))); // NOI18N
        btnPedidos.setText("Pedidos");
        btnPedidos.setFocusable(false);
        btnPedidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPedidosActionPerformed(evt);
            }
        });
        jToolBar1.add(btnPedidos);
        jToolBar1.add(jSeparator3);
        btnAuditoria = new javax.swing.JButton();
        jToolBar1.add(btnAuditoria);
        
                btnAuditoria.setFont(new java.awt.Font("Arial Black", 3, 12)); // NOI18N
                btnAuditoria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/edit.png"))); // NOI18N
                btnAuditoria.setText("Auditoria");
                btnAuditoria.setFocusable(false);
                btnAuditoria.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
                btnAuditoria.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        btnAuditoriaActionPerformed(evt);
                    }
                });
        jToolBar1.add(jSeparator4);

        btnSalir.setFont(new java.awt.Font("Arial Black", 3, 12)); // NOI18N
        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Log Off.png"))); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        jToolBar1.add(btnSalir);

        escritorio.setLayer(jToolBar1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorioLayout.setHorizontalGroup(
        	escritorioLayout.createParallelGroup(Alignment.LEADING)
        		.addGroup(escritorioLayout.createSequentialGroup()
        			.addComponent(jToolBar1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap(1306, Short.MAX_VALUE))
        );
        escritorioLayout.setVerticalGroup(
        	escritorioLayout.createParallelGroup(Alignment.LEADING)
        		.addGroup(escritorioLayout.createSequentialGroup()
        			.addComponent(jToolBar1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap(359, Short.MAX_VALUE))
        );
        escritorio.setLayout(escritorioLayout);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addComponent(escritorio, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap(24, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addComponent(escritorio, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap(223, Short.MAX_VALUE))
        );
        getContentPane().setLayout(layout);

        pack();
        
        menuBar = new JMenuBar();
        setJMenuBar(menuBar);
        
        mnNewMenu = new JMenu("Options");
        menuBar.add(mnNewMenu);
        
        mntmOptiions = new JMenuItem("Optiions");
        mntmOptiions.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        		
        		cargarFormulario(FrmTemas.class);
        		
        	}
        });
        mnNewMenu.add(mntmOptiions);
    }

    private void btnClientesActionPerformed(java.awt.event.ActionEvent evt) {
        cargarFormulario(FrmCliente.class);
    }

    private void btnEquiposActionPerformed(java.awt.event.ActionEvent evt) {
        cargarFormulario(FrmProductos.class);
    }

    private void btnEmpleadosActionPerformed(java.awt.event.ActionEvent evt) {
      cargarFormulario(EmpleadoView.class);
    }

    private void btnServiciosActionPerformed(java.awt.event.ActionEvent evt) {
        cargarFormulario(CotizacionView.class);
    }

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {
      System.exit(0);
      //cargarFormulario(Login.class);
    }

    private void btnVentasActionPerformed(java.awt.event.ActionEvent evt) {
       cargarFormulario(VentaView.class);
    }

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
        cargarFormulario(CompraView.class);
    }

    private void btnProveedoresActionPerformed(java.awt.event.ActionEvent evt) {
    	cargarFormulario(FrmProveedor.class);
    }

    private void btnPedidosActionPerformed(java.awt.event.ActionEvent evt) {
         cargarFormulario(PedidoView.class);
    }

    private void btnAuditoriaActionPerformed(java.awt.event.ActionEvent evt) {
         cargarFormulario(FrmAuditoria.class);
    }


    private javax.swing.JButton btnAuditoria;
    private javax.swing.JButton btnClientes;
    private javax.swing.JButton btnEmpleados;
    private javax.swing.JButton btnEquipos;
    private javax.swing.JButton btnPedidos;
    private javax.swing.JButton btnProveedores;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnServicios;
    private javax.swing.JButton btnVentas;
    public static javax.swing.JDesktopPane escritorio;
    private javax.swing.JButton jButton3;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator10;
    private javax.swing.JToolBar.Separator jSeparator11;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JToolBar.Separator jSeparator3;
    private javax.swing.JToolBar.Separator jSeparator4;
    private javax.swing.JToolBar.Separator jSeparator5;
    private javax.swing.JToolBar.Separator jSeparator6;
    private javax.swing.JToolBar.Separator jSeparator7;
    private javax.swing.JToolBar.Separator jSeparator8;
    private javax.swing.JToolBar.Separator jSeparator9;
    private javax.swing.JToolBar jToolBar1;
    private JMenuBar menuBar;
    private JMenu mnNewMenu;
    private JMenuItem mntmOptiions;

    private void cargarFormulario(Class<?> aClass) {
        try {

            JInternalFrame view = null;
            for(JInternalFrame f:escritorio.getAllFrames() )
            {
              if(aClass.isInstance(f)){
                  view=f;
                  break;
              }
            }
            if(view==null)
            {
              view = (JInternalFrame) Class.forName(aClass.getName()).newInstance();
              escritorio.add(view);
              view.setVisible(true);   
            }
        view.setSelected(true);
        } catch (Exception e) {
            System.out.println("Ocurrio un error al abrir el formulario" + e.getMessage());
        }
    }

}
