package app.modconta.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JButton;

public class FrmUpdateCliente extends JFrame {

	private JPanel contentPane;
	private JLabel label;
	private JTabbedPane tabbedPane;
	private JPanel panel;
	private JLabel label_1;
	private JTextField txtNom;
	private JLabel label_2;
	private JTextField txtApellP;
	private JLabel label_3;
	private JTextField txtApellM;
	private JLabel label_4;
	private JRadioButton rdnM;
	private JRadioButton rdnF;
	private JLabel label_5;
	private JTextField txtDir;
	private JLabel label_6;
	private JTextField txtTelf;
	private JLabel label_7;
	private JTextField txtDni;
	private JLabel label_8;
	private JTextField txtRuc;
	private JButton button;


	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmUpdateCliente frame = new FrmUpdateCliente();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public FrmUpdateCliente() {
		//int id= Integer.parseInt(String.valueOf(_DefaultTableModel.getValueAt(tblCliente.getSelectedRow(),0)));
		//txtApellM.setText(id);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 868, 544);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		{
			label = new JLabel();
			label.setText("ACTUALIZAR DATOS CLIENTES");
			label.setHorizontalAlignment(SwingConstants.CENTER);
			label.setFont(new Font("Tahoma", Font.BOLD, 24));
			label.setBounds(164, 13, 574, 29);
			contentPane.add(label);
		}
		{
			tabbedPane = new JTabbedPane(JTabbedPane.TOP);
			tabbedPane.setBounds(24, 55, 801, 442);
			contentPane.add(tabbedPane);
			{
				panel = new JPanel();
				tabbedPane.addTab("Actualizar datos", null, panel, null);
				panel.setLayout(null);
				{
					label_1 = new JLabel();
					label_1.setText("Nombre");
					label_1.setBounds(12, 35, 60, 21);
					panel.add(label_1);
				}
				{
					txtNom = new JTextField();
					txtNom.setBounds(92, 25, 310, 30);
					panel.add(txtNom);
				}
				{
					label_2 = new JLabel();
					label_2.setText("Apellido Paterno");
					label_2.setBounds(12, 70, 102, 21);
					panel.add(label_2);
				}
				{
					txtApellP = new JTextField();
					txtApellP.setBounds(126, 69, 189, 30);
					panel.add(txtApellP);
				}
				{
					label_3 = new JLabel();
					label_3.setText("Apellido Materno");
					label_3.setBounds(12, 119, 102, 21);
					panel.add(label_3);
				}
				{
					txtApellM = new JTextField();
					txtApellM.setBounds(126, 114, 189, 30);
					panel.add(txtApellM);
				}
				{
					label_4 = new JLabel();
					label_4.setText("Sexo");
					label_4.setBounds(12, 176, 40, 21);
					panel.add(label_4);
				}
				{
					rdnM = new JRadioButton();
					rdnM.setText("Masculino");
					rdnM.setBounds(116, 171, 85, 25);
					panel.add(rdnM);
				}
				{
					rdnF = new JRadioButton();
					rdnF.setText("Femenino");
					rdnF.setBounds(241, 171, 85, 25);
					panel.add(rdnF);
				}
				{
					label_5 = new JLabel();
					label_5.setText("Direccion");
					label_5.setBounds(12, 215, 70, 20);
					panel.add(label_5);
				}
				{
					txtDir = new JTextField();
					txtDir.setBounds(102, 210, 310, 30);
					panel.add(txtDir);
				}
				{
					label_6 = new JLabel();
					label_6.setText("Telefono");
					label_6.setBounds(12, 257, 50, 21);
					panel.add(label_6);
				}
				{
					txtTelf = new JTextField();
					txtTelf.setName("txtDireccion");
					txtTelf.setBounds(92, 252, 310, 30);
					panel.add(txtTelf);
				}
				{
					label_7 = new JLabel();
					label_7.setText("DNI");
					label_7.setBounds(12, 311, 60, 20);
					panel.add(label_7);
				}
				{
					txtDni = new JTextField();
					txtDni.setName("txtDireccion");
					txtDni.setBounds(84, 306, 310, 30);
					panel.add(txtDni);
				}
				{
					label_8 = new JLabel();
					label_8.setText("RUC");
					label_8.setBounds(12, 363, 30, 21);
					panel.add(label_8);
				}
				{
					txtRuc = new JTextField();
					txtRuc.setName("txtRUC");
					txtRuc.setBounds(83, 358, 310, 30);
					panel.add(txtRuc);
				}
				{
					button = new JButton("Actualizar");
					button.setBounds(590, 174, 90, 30);
					panel.add(button);
				}
			}
		}
		
	}

}
