package visao;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.MaskFormatter;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;

import java.awt.event.ActionListener;
import java.text.ParseException;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import javax.swing.ImageIcon;

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
		setTitle("TELA DE COMPRAS");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1920, 1080);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(41, 124, 122));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBackground(new Color(39, 39, 39));
		panel_3.setBounds(66, 169, 509, 286);
		contentPane.add(panel_3);

		JLabel lblNewLabel_1_1_2_1_1_2_1_1_1 = new JLabel("Modelo:");
		lblNewLabel_1_1_2_1_1_2_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1_2_1_1_2_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblNewLabel_1_1_2_1_1_2_1_1_1.setBackground(Color.WHITE);
		lblNewLabel_1_1_2_1_1_2_1_1_1.setBounds(10, 14, 78, 46);
		panel_3.add(lblNewLabel_1_1_2_1_1_2_1_1_1);

		JLabel lblNewLabel_1_1_2_1_1_2_1_2 = new JLabel("Ano:");
		lblNewLabel_1_1_2_1_1_2_1_2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_1_2_1_1_2_1_2.setForeground(Color.WHITE);
		lblNewLabel_1_1_2_1_1_2_1_2.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblNewLabel_1_1_2_1_1_2_1_2.setBounds(26, 71, 62, 46);
		panel_3.add(lblNewLabel_1_1_2_1_1_2_1_2);

		JLabel lblNewLabel_1_1_2_1_1_2_2 = new JLabel("Cor:");
		lblNewLabel_1_1_2_1_1_2_2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_1_2_1_1_2_2.setForeground(Color.WHITE);
		lblNewLabel_1_1_2_1_1_2_2.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblNewLabel_1_1_2_1_1_2_2.setBounds(26, 120, 62, 43);
		panel_3.add(lblNewLabel_1_1_2_1_1_2_2);

		textField = new JTextField();
		textField.setEditable(false);
		textField.setColumns(10);
		textField.setBounds(101, 66, 396, 43);
		panel_3.add(textField);

		JLabel lblNewLabel_1_1_2_1_1_1_1 = new JLabel("Marca:");
		lblNewLabel_1_1_2_1_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1_2_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblNewLabel_1_1_2_1_1_1_1.setBounds(26, 174, 74, 43);
		panel_3.add(lblNewLabel_1_1_2_1_1_1_1);

		textField_1 = new JTextField();
		textField_1.setEditable(false);
		textField_1.setColumns(10);
		textField_1.setBounds(101, 120, 396, 43);
		panel_3.add(textField_1);

		JLabel lblNewLabel_1_1_2_1_1_3 = new JLabel("Preço:");
		lblNewLabel_1_1_2_1_1_3.setForeground(Color.WHITE);
		lblNewLabel_1_1_2_1_1_3.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblNewLabel_1_1_2_1_1_3.setBounds(26, 228, 74, 46);
		panel_3.add(lblNewLabel_1_1_2_1_1_3);

		textField_2 = new JTextField();
		textField_2.setEditable(false);
		textField_2.setColumns(10);
		textField_2.setBounds(101, 11, 396, 44);
		panel_3.add(textField_2);

		textField_3 = new JTextField();
		textField_3.setEditable(false);
		textField_3.setColumns(10);
		textField_3.setBounds(101, 231, 396, 43);
		panel_3.add(textField_3);

		textField_4 = new JTextField();
		textField_4.setEditable(false);
		textField_4.setColumns(10);
		textField_4.setBounds(101, 174, 396, 43);
		panel_3.add(textField_4);

		JButton btnNewButton = new JButton("COMPRAR");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Compra realizada!");
				TelaCarrosUsuario telaCarrosComprar = new TelaCarrosUsuario();
				dispose();
				telaCarrosComprar.setExtendedState(JFrame.MAXIMIZED_BOTH);
				telaCarrosComprar.setVisible(true);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton.setBounds(561, 569, 248, 72);
		contentPane.add(btnNewButton);

		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(new Color(39, 39, 39));
		panel.setBounds(816, 169, 485, 339);
		contentPane.add(panel);

		JLabel lblNewLabel_1_1_2_1 = new JLabel("Bairro:");
		lblNewLabel_1_1_2_1.setForeground(Color.WHITE);
		lblNewLabel_1_1_2_1.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblNewLabel_1_1_2_1.setBounds(26, 280, 70, 42);
		panel.add(lblNewLabel_1_1_2_1);

		JLabel lblNewLabel_1_1_2_1_1 = new JLabel("Rua:");
		lblNewLabel_1_1_2_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1_2_1_1.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblNewLabel_1_1_2_1_1.setBounds(36, 226, 58, 43);
		panel.add(lblNewLabel_1_1_2_1_1);

		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(99, 226, 373, 43);
		panel.add(textField_5);

		JLabel lblNewLabel_1_1_2_1_1_1 = new JLabel("Tel:");
		lblNewLabel_1_1_2_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1_2_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblNewLabel_1_1_2_1_1_1.setBounds(36, 172, 169, 43);
		panel.add(lblNewLabel_1_1_2_1_1_1);

		MaskFormatter mascaraTel = null;
		 try {
		      mascaraTel = new MaskFormatter("(##)#####-####");
		 } catch (ParseException e) {
		      e.printStackTrace();
		 }
		textField_6 = new JFormattedTextField(mascaraTel);
		textField_6.setBounds(99, 172, 373, 43);
		panel.add(textField_6);
		textField_6.setColumns(10);

		JLabel lblNewLabel_1_1_2_1_1_2 = new JLabel("CEP:");
		lblNewLabel_1_1_2_1_1_2.setForeground(Color.WHITE);
		lblNewLabel_1_1_2_1_1_2.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblNewLabel_1_1_2_1_1_2.setBounds(36, 119, 70, 42);
		panel.add(lblNewLabel_1_1_2_1_1_2);

		MaskFormatter mascaraCep = null;
		try {
			mascaraCep = new MaskFormatter("#####-###");
		} catch(ParseException e) {
			e.printStackTrace();
		}
		textField_7 = new JFormattedTextField(mascaraCep);
		textField_7.setBounds(99, 119, 373, 43);
		panel.add(textField_7);
		textField_7.setColumns(10);

		JLabel lblNewLabel_1_1_2_1_1_2_1 = new JLabel("CPF:");
		lblNewLabel_1_1_2_1_1_2_1.setForeground(Color.WHITE);
		lblNewLabel_1_1_2_1_1_2_1.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblNewLabel_1_1_2_1_1_2_1.setBounds(36, 65, 70, 43);
		panel.add(lblNewLabel_1_1_2_1_1_2_1);

		MaskFormatter mascaraCpf = null;
		try {
			mascaraCpf = new MaskFormatter("###.###.###-##");
		} catch(ParseException e) {
			e.printStackTrace();
		}
		textField_8 = new JFormattedTextField(mascaraCpf);
		textField_8.setBounds(99, 66, 373, 44);
		panel.add(textField_8);
		textField_8.setColumns(10);

		JLabel lblNewLabel_1_1_2_1_1_2_1_1 = new JLabel("Nome:");
		lblNewLabel_1_1_2_1_1_2_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1_2_1_1_2_1_1.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblNewLabel_1_1_2_1_1_2_1_1.setBounds(26, 11, 70, 43);
		panel.add(lblNewLabel_1_1_2_1_1_2_1_1);

		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(99, 280, 373, 42);
		panel.add(textField_9);

		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(99, 11, 373, 44);
		panel.add(textField_10);

		JLabel lblNewLabel_2 = new JLabel("Finalizar Compra");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setFont(new Font("Segoe UI Black", Font.BOLD, 38));
		lblNewLabel_2.setBounds(443, 29, 479, 72);
		contentPane.add(lblNewLabel_2);

		JButton btnNewButton_1 = new JButton("Voltar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaCarrosUsuario telaCarrosComprar = new TelaCarrosUsuario();
				dispose();
				telaCarrosComprar.setExtendedState(JFrame.MAXIMIZED_BOTH);
				telaCarrosComprar.setVisible(true);
			}
		});
		btnNewButton_1.setBounds(10, 15, 131, 30);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(TelaCompraCarros.class.getResource("/visao/Design sem nome (3).png")));
		lblNewLabel.setBounds(149, 0, 1024, 759);
		contentPane.add(lblNewLabel);
	}
}
