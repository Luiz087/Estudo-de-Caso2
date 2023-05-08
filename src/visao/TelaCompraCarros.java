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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

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
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(0, 0, 160));
		panel_1.setBounds(0, 0, 1438, 798);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(32, 80, 522, 459);
		panel_1.add(panel_3);
		panel_3.setBackground(new Color(39, 39, 39));
		panel_3.setLayout(null);
		
		JLabel lblNewLabel_1_1_2_1_1_2_1_1_1 = new JLabel("Modelo:");
		lblNewLabel_1_1_2_1_1_2_1_1_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_1_2_1_1_2_1_1_1.setBackground(new Color(255, 255, 255));
		lblNewLabel_1_1_2_1_1_2_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblNewLabel_1_1_2_1_1_2_1_1_1.setBounds(0, -2, 86, 60);
		panel_3.add(lblNewLabel_1_1_2_1_1_2_1_1_1);
		
		JLabel lblNewLabel_1_1_2_1_1_2_1_2 = new JLabel("Ano:");
		lblNewLabel_1_1_2_1_1_2_1_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_1_2_1_1_2_1_2.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblNewLabel_1_1_2_1_1_2_1_2.setBounds(10, 77, 76, 46);
		panel_3.add(lblNewLabel_1_1_2_1_1_2_1_2);
		
		JLabel lblNewLabel_1_1_2_1_1_2_2 = new JLabel("Cor:");
		lblNewLabel_1_1_2_1_1_2_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_1_2_1_1_2_2.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblNewLabel_1_1_2_1_1_2_2.setBounds(12, 147, 62, 43);
		panel_3.add(lblNewLabel_1_1_2_1_1_2_2);
		
		textField_9 = new JTextField();
		textField_9.setEditable(false);
		textField_9.setColumns(10);
		textField_9.setBounds(75, 77, 396, 43);
		panel_3.add(textField_9);
		
		JLabel lblNewLabel_1_1_2_1_1_1_1 = new JLabel("Marca:");
		lblNewLabel_1_1_2_1_1_1_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_1_2_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblNewLabel_1_1_2_1_1_1_1.setBounds(0, 223, 74, 43);
		panel_3.add(lblNewLabel_1_1_2_1_1_1_1);
		
		textField_14 = new JTextField();
		textField_14.setEditable(false);
		textField_14.setColumns(10);
		textField_14.setBounds(75, 152, 396, 43);
		panel_3.add(textField_14);
		
		JLabel lblNewLabel_1_1_2_1_1_3 = new JLabel("Preço:");
		lblNewLabel_1_1_2_1_1_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_1_2_1_1_3.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblNewLabel_1_1_2_1_1_3.setBounds(0, 294, 74, 46);
		panel_3.add(lblNewLabel_1_1_2_1_1_3);
		
		textField_5 = new JTextField();
		textField_5.setBounds(82, 11, 389, 44);
		panel_3.add(textField_5);
		textField_5.setEditable(false);
		textField_5.setColumns(10);
		
		textField_7 = new JTextField();
		textField_7.setBounds(75, 297, 396, 43);
		panel_3.add(textField_7);
		textField_7.setEditable(false);
		textField_7.setColumns(10);
		
		textField_10 = new JTextField();
		textField_10.setBounds(75, 223, 396, 43);
		panel_3.add(textField_10);
		textField_10.setEditable(false);
		textField_10.setColumns(10);
		
		JButton btnNewButton = new JButton("COMPRAR");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(539, 569, 248, 72);
		panel_1.add(btnNewButton);
		btnNewButton.setFont(new Font("Sitka Text", Font.PLAIN, 19));
		
		JPanel panel = new JPanel();
		panel.setBounds(734, 80, 509, 459);
		panel_1.add(panel);
		panel.setBackground(new Color(39, 39, 39));
		panel.setLayout(null);
		
		JLabel lblNewLabel_1_1_2_1 = new JLabel("Bairro:");
		lblNewLabel_1_1_2_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_1_2_1.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblNewLabel_1_1_2_1.setBounds(10, 364, 70, 42);
		panel.add(lblNewLabel_1_1_2_1);
		
		JLabel lblNewLabel_1_1_2_1_1 = new JLabel("Rua:");
		lblNewLabel_1_1_2_1_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_1_2_1_1.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblNewLabel_1_1_2_1_1.setBounds(20, 293, 58, 43);
		panel.add(lblNewLabel_1_1_2_1_1);
		
		textField_11 = new JTextField();
		textField_11.setEditable(false);
		textField_11.setColumns(10);
		textField_11.setBounds(83, 293, 373, 43);
		panel.add(textField_11);
		
		JLabel lblNewLabel_1_1_2_1_1_1 = new JLabel("Tel:");
		lblNewLabel_1_1_2_1_1_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_1_2_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblNewLabel_1_1_2_1_1_1.setBounds(20, 224, 169, 43);
		panel.add(lblNewLabel_1_1_2_1_1_1);
		
		textField_12 = new JTextField();
		textField_12.setEditable(false);
		textField_12.setColumns(10);
		textField_12.setBounds(83, 224, 373, 43);
		panel.add(textField_12);
		
		JLabel lblNewLabel_1_1_2_1_1_2 = new JLabel("CEP:");
		lblNewLabel_1_1_2_1_1_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_1_2_1_1_2.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblNewLabel_1_1_2_1_1_2.setBounds(20, 154, 70, 42);
		panel.add(lblNewLabel_1_1_2_1_1_2);
		
		textField_13 = new JTextField();
		textField_13.setEditable(false);
		textField_13.setColumns(10);
		textField_13.setBounds(83, 154, 373, 43);
		panel.add(textField_13);
		
		JLabel lblNewLabel_1_1_2_1_1_2_1 = new JLabel("CPF:");
		lblNewLabel_1_1_2_1_1_2_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_1_2_1_1_2_1.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblNewLabel_1_1_2_1_1_2_1.setBounds(20, 83, 70, 43);
		panel.add(lblNewLabel_1_1_2_1_1_2_1);
		
		textField_8 = new JTextField();
		textField_8.setEditable(false);
		textField_8.setColumns(10);
		textField_8.setBounds(83, 84, 373, 44);
		panel.add(textField_8);
		
		JLabel lblNewLabel_1_1_2_1_1_2_1_1 = new JLabel("Nome:");
		lblNewLabel_1_1_2_1_1_2_1_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_1_2_1_1_2_1_1.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblNewLabel_1_1_2_1_1_2_1_1.setBounds(10, 11, 70, 43);
		panel.add(lblNewLabel_1_1_2_1_1_2_1_1);
		
		textField_15 = new JTextField();
		textField_15.setBounds(83, 364, 373, 42);
		panel.add(textField_15);
		textField_15.setEditable(false);
		textField_15.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setBounds(83, 11, 373, 44);
		panel.add(textField_6);
		textField_6.setEditable(false);
		textField_6.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("TELA DE COMPRA");
		lblNewLabel_2.setBounds(434, 11, 479, 72);
		panel_1.add(lblNewLabel_2);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 38));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setForeground(new Color(255, 0, 0));
	}
}
