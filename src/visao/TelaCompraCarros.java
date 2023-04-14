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
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;

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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 723, 633);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("TELA DE COMPRA");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setForeground(new Color(255, 0, 0));
		lblNewLabel_2.setBounds(197, 11, 282, 14);
		contentPane.add(lblNewLabel_2);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(128, 128, 128));
		panel.setBounds(340, 36, 327, 242);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setBounds(10, 14, 34, 14);
		panel.add(lblNome);
		
		textField_5 = new JTextField();
		textField_5.setEditable(false);
		textField_5.setColumns(10);
		textField_5.setBounds(54, 11, 161, 20);
		panel.add(textField_5);
		
		JLabel lblNewLabel_1_2 = new JLabel("CPF");
		lblNewLabel_1_2.setBounds(10, 50, 19, 14);
		panel.add(lblNewLabel_1_2);
		
		textField_6 = new JTextField();
		textField_6.setEditable(false);
		textField_6.setColumns(10);
		textField_6.setBounds(54, 47, 161, 20);
		panel.add(textField_6);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("CEP");
		lblNewLabel_1_1_2.setBounds(10, 84, 19, 14);
		panel.add(lblNewLabel_1_1_2);
		
		textField_7 = new JTextField();
		textField_7.setEditable(false);
		textField_7.setColumns(10);
		textField_7.setBounds(54, 81, 161, 20);
		panel.add(textField_7);
		
		JLabel lblTelefone = new JLabel("Telefone");
		lblTelefone.setBounds(10, 125, 42, 14);
		panel.add(lblTelefone);
		
		textField_8 = new JTextField();
		textField_8.setEditable(false);
		textField_8.setColumns(10);
		textField_8.setBounds(54, 122, 161, 20);
		panel.add(textField_8);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("Rua");
		lblNewLabel_1_2_1.setBounds(10, 165, 19, 14);
		panel.add(lblNewLabel_1_2_1);
		
		textField_9 = new JTextField();
		textField_9.setEditable(false);
		textField_9.setColumns(10);
		textField_9.setBounds(54, 162, 161, 20);
		panel.add(textField_9);
		
		JLabel lblNewLabel_1_1_2_1 = new JLabel("Bairro");
		lblNewLabel_1_1_2_1.setBounds(10, 203, 34, 14);
		panel.add(lblNewLabel_1_1_2_1);
		
		textField_10 = new JTextField();
		textField_10.setEditable(false);
		textField_10.setColumns(10);
		textField_10.setBounds(54, 200, 161, 20);
		panel.add(textField_10);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(23, 36, 307, 242);
		contentPane.add(panel_3);
		panel_3.setBackground(Color.GRAY);
		panel_3.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Modelo");
		lblNewLabel.setBounds(10, 11, 34, 14);
		panel_3.add(lblNewLabel);
		
		textField_1 = new JTextField();
		textField_1.setBounds(54, 8, 161, 20);
		panel_3.add(textField_1);
		textField_1.setEditable(false);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Ano");
		lblNewLabel_1.setBounds(10, 47, 19, 14);
		panel_3.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setBounds(54, 44, 161, 20);
		panel_3.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("Cor");
		lblNewLabel_1_1.setBounds(10, 89, 19, 14);
		panel_3.add(lblNewLabel_1_1);
		
		textField_2 = new JTextField();
		textField_2.setEditable(false);
		textField_2.setColumns(10);
		textField_2.setBounds(54, 86, 161, 20);
		panel_3.add(textField_2);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Marca");
		lblNewLabel_1_1_1.setBounds(10, 127, 34, 14);
		panel_3.add(lblNewLabel_1_1_1);
		
		textField_3 = new JTextField();
		textField_3.setEditable(false);
		textField_3.setColumns(10);
		textField_3.setBounds(54, 124, 161, 20);
		panel_3.add(textField_3);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Preço");
		lblNewLabel_1_1_1_1.setBounds(10, 166, 34, 14);
		panel_3.add(lblNewLabel_1_1_1_1);
		
		textField_4 = new JTextField();
		textField_4.setEditable(false);
		textField_4.setColumns(10);
		textField_4.setBounds(54, 163, 161, 20);
		panel_3.add(textField_4);
		
		JButton btnNewButton = new JButton("Comprar");
		btnNewButton.setBounds(291, 472, 126, 52);
		contentPane.add(btnNewButton);
	}
}
