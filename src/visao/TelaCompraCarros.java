package visao;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;

public class TelaCompraCarros extends JFrame {

	private JPanel contentPane;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_8;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_9;
	private JTextField textField_14;
	private JTextField textField_15;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCompraCarros frame = new TelaCompraCarros();
					frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TelaCompraCarros() {
		setTitle("TELA DE COMPRAS");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1920, 1080);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("TELA DE COMPRA");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 38));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setForeground(new Color(255, 0, 0));
		lblNewLabel_2.setBounds(668, 11, 479, 72);
		contentPane.add(lblNewLabel_2);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(128, 128, 128));
		panel.setBounds(942, 86, 952, 606);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1_1_2_1 = new JLabel("Bairro");
		lblNewLabel_1_1_2_1.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblNewLabel_1_1_2_1.setBounds(10, 512, 169, 67);
		panel.add(lblNewLabel_1_1_2_1);
		
		textField_10 = new JTextField();
		textField_10.setEditable(false);
		textField_10.setColumns(10);
		textField_10.setBounds(189, 515, 495, 70);
		panel.add(textField_10);
		
		JLabel lblNewLabel_1_1_2_1_1 = new JLabel("Rua");
		lblNewLabel_1_1_2_1_1.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblNewLabel_1_1_2_1_1.setBounds(10, 417, 169, 67);
		panel.add(lblNewLabel_1_1_2_1_1);
		
		textField_11 = new JTextField();
		textField_11.setEditable(false);
		textField_11.setColumns(10);
		textField_11.setBounds(189, 420, 495, 70);
		panel.add(textField_11);
		
		JLabel lblNewLabel_1_1_2_1_1_1 = new JLabel("Telefone");
		lblNewLabel_1_1_2_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblNewLabel_1_1_2_1_1_1.setBounds(10, 319, 169, 67);
		panel.add(lblNewLabel_1_1_2_1_1_1);
		
		textField_12 = new JTextField();
		textField_12.setEditable(false);
		textField_12.setColumns(10);
		textField_12.setBounds(189, 322, 495, 70);
		panel.add(textField_12);
		
		JLabel lblNewLabel_1_1_2_1_1_2 = new JLabel("CEP");
		lblNewLabel_1_1_2_1_1_2.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblNewLabel_1_1_2_1_1_2.setBounds(10, 215, 169, 67);
		panel.add(lblNewLabel_1_1_2_1_1_2);
		
		textField_13 = new JTextField();
		textField_13.setEditable(false);
		textField_13.setColumns(10);
		textField_13.setBounds(189, 218, 495, 70);
		panel.add(textField_13);
		
		JLabel lblNewLabel_1_1_2_1_1_2_1 = new JLabel("CPF");
		lblNewLabel_1_1_2_1_1_2_1.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblNewLabel_1_1_2_1_1_2_1.setBounds(10, 118, 169, 67);
		panel.add(lblNewLabel_1_1_2_1_1_2_1);
		
		textField_8 = new JTextField();
		textField_8.setEditable(false);
		textField_8.setColumns(10);
		textField_8.setBounds(189, 121, 495, 70);
		panel.add(textField_8);
		
		JLabel lblNewLabel_1_1_2_1_1_2_1_1 = new JLabel("Nome");
		lblNewLabel_1_1_2_1_1_2_1_1.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblNewLabel_1_1_2_1_1_2_1_1.setBounds(10, 23, 169, 67);
		panel.add(lblNewLabel_1_1_2_1_1_2_1_1);
		
		textField_5 = new JTextField();
		textField_5.setEditable(false);
		textField_5.setColumns(10);
		textField_5.setBounds(189, 26, 495, 70);
		panel.add(textField_5);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(25, 86, 868, 606);
		contentPane.add(panel_3);
		panel_3.setBackground(Color.GRAY);
		panel_3.setLayout(null);
		
		JLabel lblNewLabel_1_1_2_1_1_2_1_1_1 = new JLabel("Modelo");
		lblNewLabel_1_1_2_1_1_2_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblNewLabel_1_1_2_1_1_2_1_1_1.setBounds(54, 11, 169, 67);
		panel_3.add(lblNewLabel_1_1_2_1_1_2_1_1_1);
		
		textField_6 = new JTextField();
		textField_6.setEditable(false);
		textField_6.setColumns(10);
		textField_6.setBounds(233, 14, 495, 70);
		panel_3.add(textField_6);
		
		JLabel lblNewLabel_1_1_2_1_1_2_1_2 = new JLabel("Ano");
		lblNewLabel_1_1_2_1_1_2_1_2.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblNewLabel_1_1_2_1_1_2_1_2.setBounds(54, 106, 169, 67);
		panel_3.add(lblNewLabel_1_1_2_1_1_2_1_2);
		
		textField_7 = new JTextField();
		textField_7.setEditable(false);
		textField_7.setColumns(10);
		textField_7.setBounds(233, 109, 495, 70);
		panel_3.add(textField_7);
		
		JLabel lblNewLabel_1_1_2_1_1_2_2 = new JLabel("Cor");
		lblNewLabel_1_1_2_1_1_2_2.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblNewLabel_1_1_2_1_1_2_2.setBounds(54, 203, 169, 67);
		panel_3.add(lblNewLabel_1_1_2_1_1_2_2);
		
		textField_9 = new JTextField();
		textField_9.setEditable(false);
		textField_9.setColumns(10);
		textField_9.setBounds(233, 206, 495, 70);
		panel_3.add(textField_9);
		
		JLabel lblNewLabel_1_1_2_1_1_1_1 = new JLabel("Marca");
		lblNewLabel_1_1_2_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblNewLabel_1_1_2_1_1_1_1.setBounds(54, 307, 169, 67);
		panel_3.add(lblNewLabel_1_1_2_1_1_1_1);
		
		textField_14 = new JTextField();
		textField_14.setEditable(false);
		textField_14.setColumns(10);
		textField_14.setBounds(233, 310, 495, 70);
		panel_3.add(textField_14);
		
		JLabel lblNewLabel_1_1_2_1_1_3 = new JLabel("Preço");
		lblNewLabel_1_1_2_1_1_3.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblNewLabel_1_1_2_1_1_3.setBounds(54, 405, 169, 67);
		panel_3.add(lblNewLabel_1_1_2_1_1_3);
		
		textField_15 = new JTextField();
		textField_15.setEditable(false);
		textField_15.setColumns(10);
		textField_15.setBounds(233, 408, 495, 70);
		panel_3.add(textField_15);
		
		JButton btnNewButton = new JButton("Comprar");
		btnNewButton.setBounds(645, 719, 553, 232);
		contentPane.add(btnNewButton);
	}
}
