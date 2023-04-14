package visao;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import javax.swing.JScrollPane;

public class TelaCarrosUsuario extends JFrame {

	private JPanel contentPane;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JButton btnNewButton_3;
	private JButton btnNewButton_4;
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
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField textField_18;
	private JTextField textField_19;
	private JTextField textField_20;
	private JTextField textField_21;
	private JTextField textField_22;
	private JTextField textField_23;
	private JTextField textField_24;
	private JTextField textField_25;
	private JTextField textField_26;
	private JTextField textField_27;
	private JTextField textField_28;
	private JTextField textField_29;
	private JTextField textField_30;
	private JTextField textField_31;
	private JTextField textField_32;
	private JTextField textField_33;
	private JTextField textField_34;
	private JTextField textField_35;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCarrosUsuario frame = new TelaCarrosUsuario();
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
	public TelaCarrosUsuario() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1920, 1402);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(192, 192, 192));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(514, 24, 743, 86);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Modelo");
		lblNewLabel.setBounds(31, 61, 46, 14);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Ano");
		lblNewLabel_1.setBounds(155, 61, 46, 14);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Cor");
		lblNewLabel_2.setBounds(389, 17, 46, 14);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Marca");
		lblNewLabel_3.setBounds(155, 17, 46, 14);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Preço");
		lblNewLabel_4.setBounds(389, 61, 46, 14);
		panel.add(lblNewLabel_4);
		
		textField = new JTextField();
		textField.setEnabled(false);
		textField.setEditable(false);
		textField.setBounds(196, 6, 154, 29);
		panel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setEnabled(false);
		textField_1.setEditable(false);
		textField_1.setColumns(10);
		textField_1.setBounds(196, 54, 154, 29);
		panel.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setEnabled(false);
		textField_2.setEditable(false);
		textField_2.setColumns(10);
		textField_2.setBounds(426, 6, 154, 29);
		panel.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setEditable(false);
		textField_3.setEnabled(false);
		textField_3.setColumns(10);
		textField_3.setBounds(426, 54, 154, 29);
		panel.add(textField_3);
		
		JButton btnNewButton = new JButton("Visualizar");
		btnNewButton.setBounds(632, 32, 89, 23);
		panel.add(btnNewButton);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBounds(514, 132, 743, 86);
		contentPane.add(panel_1);
		
		JLabel lblNewLabel_5 = new JLabel("Modelo");
		lblNewLabel_5.setBounds(31, 61, 46, 14);
		panel_1.add(lblNewLabel_5);
		
		JLabel lblNewLabel_1_1 = new JLabel("Ano");
		lblNewLabel_1_1.setBounds(155, 61, 46, 14);
		panel_1.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_2_1 = new JLabel("Cor");
		lblNewLabel_2_1.setBounds(389, 17, 46, 14);
		panel_1.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_3_1 = new JLabel("Marca");
		lblNewLabel_3_1.setBounds(155, 17, 46, 14);
		panel_1.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_4_1 = new JLabel("Preço");
		lblNewLabel_4_1.setBounds(389, 61, 46, 14);
		panel_1.add(lblNewLabel_4_1);
		
		textField_4 = new JTextField();
		textField_4.setEnabled(false);
		textField_4.setEditable(false);
		textField_4.setColumns(10);
		textField_4.setBounds(196, 6, 154, 29);
		panel_1.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setEnabled(false);
		textField_5.setEditable(false);
		textField_5.setColumns(10);
		textField_5.setBounds(196, 54, 154, 29);
		panel_1.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setEnabled(false);
		textField_6.setEditable(false);
		textField_6.setColumns(10);
		textField_6.setBounds(426, 6, 154, 29);
		panel_1.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setEnabled(false);
		textField_7.setEditable(false);
		textField_7.setColumns(10);
		textField_7.setBounds(426, 54, 154, 29);
		panel_1.add(textField_7);
		
		btnNewButton_1 = new JButton("Visualizar");
		btnNewButton_1.setBounds(631, 34, 89, 23);
		panel_1.add(btnNewButton_1);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setLayout(null);
		panel_1_1.setBounds(514, 241, 743, 86);
		contentPane.add(panel_1_1);
		
		JLabel lblNewLabel_5_1 = new JLabel("Modelo");
		lblNewLabel_5_1.setBounds(31, 61, 46, 14);
		panel_1_1.add(lblNewLabel_5_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Ano");
		lblNewLabel_1_1_1.setBounds(155, 61, 46, 14);
		panel_1_1.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Cor");
		lblNewLabel_2_1_1.setBounds(389, 17, 46, 14);
		panel_1_1.add(lblNewLabel_2_1_1);
		
		JLabel lblNewLabel_3_1_1 = new JLabel("Marca");
		lblNewLabel_3_1_1.setBounds(155, 17, 46, 14);
		panel_1_1.add(lblNewLabel_3_1_1);
		
		JLabel lblNewLabel_4_1_1 = new JLabel("Preço");
		lblNewLabel_4_1_1.setBounds(389, 61, 46, 14);
		panel_1_1.add(lblNewLabel_4_1_1);
		
		textField_8 = new JTextField();
		textField_8.setEnabled(false);
		textField_8.setEditable(false);
		textField_8.setColumns(10);
		textField_8.setBounds(196, 6, 154, 29);
		panel_1_1.add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setEnabled(false);
		textField_9.setEditable(false);
		textField_9.setColumns(10);
		textField_9.setBounds(196, 54, 154, 29);
		panel_1_1.add(textField_9);
		
		textField_10 = new JTextField();
		textField_10.setEnabled(false);
		textField_10.setEditable(false);
		textField_10.setColumns(10);
		textField_10.setBounds(426, 6, 154, 29);
		panel_1_1.add(textField_10);
		
		textField_11 = new JTextField();
		textField_11.setEnabled(false);
		textField_11.setEditable(false);
		textField_11.setColumns(10);
		textField_11.setBounds(426, 54, 154, 29);
		panel_1_1.add(textField_11);
		
		btnNewButton_2 = new JButton("Visualizar");
		btnNewButton_2.setBounds(629, 35, 89, 23);
		panel_1_1.add(btnNewButton_2);
		
		JPanel panel_1_1_1 = new JPanel();
		panel_1_1_1.setLayout(null);
		panel_1_1_1.setBounds(514, 349, 743, 86);
		contentPane.add(panel_1_1_1);
		
		JLabel lblNewLabel_5_1_1 = new JLabel("Modelo");
		lblNewLabel_5_1_1.setBounds(31, 61, 46, 14);
		panel_1_1_1.add(lblNewLabel_5_1_1);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Ano");
		lblNewLabel_1_1_1_1.setBounds(155, 61, 46, 14);
		panel_1_1_1.add(lblNewLabel_1_1_1_1);
		
		JLabel lblNewLabel_2_1_1_1 = new JLabel("Cor");
		lblNewLabel_2_1_1_1.setBounds(389, 17, 46, 14);
		panel_1_1_1.add(lblNewLabel_2_1_1_1);
		
		JLabel lblNewLabel_3_1_1_1 = new JLabel("Marca");
		lblNewLabel_3_1_1_1.setBounds(155, 17, 46, 14);
		panel_1_1_1.add(lblNewLabel_3_1_1_1);
		
		JLabel lblNewLabel_4_1_1_1 = new JLabel("Preço");
		lblNewLabel_4_1_1_1.setBounds(389, 61, 46, 14);
		panel_1_1_1.add(lblNewLabel_4_1_1_1);
		
		textField_12 = new JTextField();
		textField_12.setEnabled(false);
		textField_12.setEditable(false);
		textField_12.setColumns(10);
		textField_12.setBounds(196, 6, 154, 29);
		panel_1_1_1.add(textField_12);
		
		textField_13 = new JTextField();
		textField_13.setEnabled(false);
		textField_13.setEditable(false);
		textField_13.setColumns(10);
		textField_13.setBounds(196, 54, 154, 29);
		panel_1_1_1.add(textField_13);
		
		textField_14 = new JTextField();
		textField_14.setEnabled(false);
		textField_14.setEditable(false);
		textField_14.setColumns(10);
		textField_14.setBounds(426, 6, 154, 29);
		panel_1_1_1.add(textField_14);
		
		textField_15 = new JTextField();
		textField_15.setEnabled(false);
		textField_15.setEditable(false);
		textField_15.setColumns(10);
		textField_15.setBounds(426, 54, 154, 29);
		panel_1_1_1.add(textField_15);
		
		btnNewButton_3 = new JButton("Visualizar");
		btnNewButton_3.setBounds(625, 34, 89, 23);
		panel_1_1_1.add(btnNewButton_3);
		
		JPanel panel_1_1_1_1 = new JPanel();
		panel_1_1_1_1.setLayout(null);
		panel_1_1_1_1.setBounds(514, 463, 743, 86);
		contentPane.add(panel_1_1_1_1);
		
		JLabel lblNewLabel_5_1_1_1 = new JLabel("Modelo");
		lblNewLabel_5_1_1_1.setBounds(31, 61, 46, 14);
		panel_1_1_1_1.add(lblNewLabel_5_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1_1 = new JLabel("Ano");
		lblNewLabel_1_1_1_1_1.setBounds(155, 61, 46, 14);
		panel_1_1_1_1.add(lblNewLabel_1_1_1_1_1);
		
		JLabel lblNewLabel_2_1_1_1_1 = new JLabel("Cor");
		lblNewLabel_2_1_1_1_1.setBounds(389, 17, 46, 14);
		panel_1_1_1_1.add(lblNewLabel_2_1_1_1_1);
		
		JLabel lblNewLabel_3_1_1_1_1 = new JLabel("Marca");
		lblNewLabel_3_1_1_1_1.setBounds(155, 17, 46, 14);
		panel_1_1_1_1.add(lblNewLabel_3_1_1_1_1);
		
		JLabel lblNewLabel_4_1_1_1_1 = new JLabel("Preço");
		lblNewLabel_4_1_1_1_1.setBounds(389, 61, 46, 14);
		panel_1_1_1_1.add(lblNewLabel_4_1_1_1_1);
		
		textField_16 = new JTextField();
		textField_16.setEnabled(false);
		textField_16.setEditable(false);
		textField_16.setColumns(10);
		textField_16.setBounds(196, 6, 154, 29);
		panel_1_1_1_1.add(textField_16);
		
		textField_17 = new JTextField();
		textField_17.setEnabled(false);
		textField_17.setEditable(false);
		textField_17.setColumns(10);
		textField_17.setBounds(196, 54, 154, 29);
		panel_1_1_1_1.add(textField_17);
		
		textField_18 = new JTextField();
		textField_18.setEnabled(false);
		textField_18.setEditable(false);
		textField_18.setColumns(10);
		textField_18.setBounds(426, 6, 154, 29);
		panel_1_1_1_1.add(textField_18);
		
		textField_19 = new JTextField();
		textField_19.setEnabled(false);
		textField_19.setEditable(false);
		textField_19.setColumns(10);
		textField_19.setBounds(426, 54, 154, 29);
		panel_1_1_1_1.add(textField_19);
		
		btnNewButton_4 = new JButton("Visualizar");
		btnNewButton_4.setBounds(623, 33, 89, 23);
		panel_1_1_1_1.add(btnNewButton_4);
		
		JPanel panel_1_1_1_1_1 = new JPanel();
		panel_1_1_1_1_1.setLayout(null);
		panel_1_1_1_1_1.setBounds(514, 573, 743, 86);
		contentPane.add(panel_1_1_1_1_1);
		
		JLabel lblNewLabel_5_1_1_1_1 = new JLabel("Modelo");
		lblNewLabel_5_1_1_1_1.setBounds(31, 61, 46, 14);
		panel_1_1_1_1_1.add(lblNewLabel_5_1_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1_1_1 = new JLabel("Ano");
		lblNewLabel_1_1_1_1_1_1.setBounds(155, 61, 46, 14);
		panel_1_1_1_1_1.add(lblNewLabel_1_1_1_1_1_1);
		
		JLabel lblNewLabel_2_1_1_1_1_1 = new JLabel("Cor");
		lblNewLabel_2_1_1_1_1_1.setBounds(389, 17, 46, 14);
		panel_1_1_1_1_1.add(lblNewLabel_2_1_1_1_1_1);
		
		JLabel lblNewLabel_3_1_1_1_1_1 = new JLabel("Marca");
		lblNewLabel_3_1_1_1_1_1.setBounds(155, 17, 46, 14);
		panel_1_1_1_1_1.add(lblNewLabel_3_1_1_1_1_1);
		
		JLabel lblNewLabel_4_1_1_1_1_1 = new JLabel("Preço");
		lblNewLabel_4_1_1_1_1_1.setBounds(389, 61, 46, 14);
		panel_1_1_1_1_1.add(lblNewLabel_4_1_1_1_1_1);
		
		textField_20 = new JTextField();
		textField_20.setEnabled(false);
		textField_20.setEditable(false);
		textField_20.setColumns(10);
		textField_20.setBounds(196, 6, 154, 29);
		panel_1_1_1_1_1.add(textField_20);
		
		textField_21 = new JTextField();
		textField_21.setEnabled(false);
		textField_21.setEditable(false);
		textField_21.setColumns(10);
		textField_21.setBounds(196, 54, 154, 29);
		panel_1_1_1_1_1.add(textField_21);
		
		textField_22 = new JTextField();
		textField_22.setEnabled(false);
		textField_22.setEditable(false);
		textField_22.setColumns(10);
		textField_22.setBounds(426, 6, 154, 29);
		panel_1_1_1_1_1.add(textField_22);
		
		textField_23 = new JTextField();
		textField_23.setEnabled(false);
		textField_23.setEditable(false);
		textField_23.setColumns(10);
		textField_23.setBounds(426, 54, 154, 29);
		panel_1_1_1_1_1.add(textField_23);
		
		JButton btnNewButton_4_1 = new JButton("Visualizar");
		btnNewButton_4_1.setBounds(623, 33, 89, 23);
		panel_1_1_1_1_1.add(btnNewButton_4_1);
		
		JPanel panel_1_1_1_1_1_1 = new JPanel();
		panel_1_1_1_1_1_1.setLayout(null);
		panel_1_1_1_1_1_1.setBounds(514, 682, 743, 86);
		contentPane.add(panel_1_1_1_1_1_1);
		
		JLabel lblNewLabel_5_1_1_1_1_1 = new JLabel("Modelo");
		lblNewLabel_5_1_1_1_1_1.setBounds(31, 61, 46, 14);
		panel_1_1_1_1_1_1.add(lblNewLabel_5_1_1_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1_1_1_1 = new JLabel("Ano");
		lblNewLabel_1_1_1_1_1_1_1.setBounds(155, 61, 46, 14);
		panel_1_1_1_1_1_1.add(lblNewLabel_1_1_1_1_1_1_1);
		
		JLabel lblNewLabel_2_1_1_1_1_1_1 = new JLabel("Cor");
		lblNewLabel_2_1_1_1_1_1_1.setBounds(389, 17, 46, 14);
		panel_1_1_1_1_1_1.add(lblNewLabel_2_1_1_1_1_1_1);
		
		JLabel lblNewLabel_3_1_1_1_1_1_1 = new JLabel("Marca");
		lblNewLabel_3_1_1_1_1_1_1.setBounds(155, 17, 46, 14);
		panel_1_1_1_1_1_1.add(lblNewLabel_3_1_1_1_1_1_1);
		
		JLabel lblNewLabel_4_1_1_1_1_1_1 = new JLabel("Preço");
		lblNewLabel_4_1_1_1_1_1_1.setBounds(389, 61, 46, 14);
		panel_1_1_1_1_1_1.add(lblNewLabel_4_1_1_1_1_1_1);
		
		textField_24 = new JTextField();
		textField_24.setEnabled(false);
		textField_24.setEditable(false);
		textField_24.setColumns(10);
		textField_24.setBounds(196, 6, 154, 29);
		panel_1_1_1_1_1_1.add(textField_24);
		
		textField_25 = new JTextField();
		textField_25.setEnabled(false);
		textField_25.setEditable(false);
		textField_25.setColumns(10);
		textField_25.setBounds(196, 54, 154, 29);
		panel_1_1_1_1_1_1.add(textField_25);
		
		textField_26 = new JTextField();
		textField_26.setEnabled(false);
		textField_26.setEditable(false);
		textField_26.setColumns(10);
		textField_26.setBounds(426, 6, 154, 29);
		panel_1_1_1_1_1_1.add(textField_26);
		
		textField_27 = new JTextField();
		textField_27.setEnabled(false);
		textField_27.setEditable(false);
		textField_27.setColumns(10);
		textField_27.setBounds(426, 54, 154, 29);
		panel_1_1_1_1_1_1.add(textField_27);
		
		JButton btnNewButton_4_1_1 = new JButton("Visualizar");
		btnNewButton_4_1_1.setBounds(623, 33, 89, 23);
		panel_1_1_1_1_1_1.add(btnNewButton_4_1_1);
		
		JPanel panel_1_1_1_1_1_1_1 = new JPanel();
		panel_1_1_1_1_1_1_1.setLayout(null);
		panel_1_1_1_1_1_1_1.setBounds(514, 793, 743, 86);
		contentPane.add(panel_1_1_1_1_1_1_1);
		
		JLabel lblNewLabel_5_1_1_1_1_1_1 = new JLabel("Modelo");
		lblNewLabel_5_1_1_1_1_1_1.setBounds(31, 61, 46, 14);
		panel_1_1_1_1_1_1_1.add(lblNewLabel_5_1_1_1_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1_1_1_1_1 = new JLabel("Ano");
		lblNewLabel_1_1_1_1_1_1_1_1.setBounds(155, 61, 46, 14);
		panel_1_1_1_1_1_1_1.add(lblNewLabel_1_1_1_1_1_1_1_1);
		
		JLabel lblNewLabel_2_1_1_1_1_1_1_1 = new JLabel("Cor");
		lblNewLabel_2_1_1_1_1_1_1_1.setBounds(389, 17, 46, 14);
		panel_1_1_1_1_1_1_1.add(lblNewLabel_2_1_1_1_1_1_1_1);
		
		JLabel lblNewLabel_3_1_1_1_1_1_1_1 = new JLabel("Marca");
		lblNewLabel_3_1_1_1_1_1_1_1.setBounds(155, 17, 46, 14);
		panel_1_1_1_1_1_1_1.add(lblNewLabel_3_1_1_1_1_1_1_1);
		
		JLabel lblNewLabel_4_1_1_1_1_1_1_1 = new JLabel("Preço");
		lblNewLabel_4_1_1_1_1_1_1_1.setBounds(389, 61, 46, 14);
		panel_1_1_1_1_1_1_1.add(lblNewLabel_4_1_1_1_1_1_1_1);
		
		textField_28 = new JTextField();
		textField_28.setEnabled(false);
		textField_28.setEditable(false);
		textField_28.setColumns(10);
		textField_28.setBounds(196, 6, 154, 29);
		panel_1_1_1_1_1_1_1.add(textField_28);
		
		textField_29 = new JTextField();
		textField_29.setEnabled(false);
		textField_29.setEditable(false);
		textField_29.setColumns(10);
		textField_29.setBounds(196, 54, 154, 29);
		panel_1_1_1_1_1_1_1.add(textField_29);
		
		textField_30 = new JTextField();
		textField_30.setEnabled(false);
		textField_30.setEditable(false);
		textField_30.setColumns(10);
		textField_30.setBounds(426, 6, 154, 29);
		panel_1_1_1_1_1_1_1.add(textField_30);
		
		textField_31 = new JTextField();
		textField_31.setEnabled(false);
		textField_31.setEditable(false);
		textField_31.setColumns(10);
		textField_31.setBounds(426, 54, 154, 29);
		panel_1_1_1_1_1_1_1.add(textField_31);
		
		JButton btnNewButton_4_1_1_1 = new JButton("Visualizar");
		btnNewButton_4_1_1_1.setBounds(623, 33, 89, 23);
		panel_1_1_1_1_1_1_1.add(btnNewButton_4_1_1_1);
		
		JPanel panel_1_1_1_1_1_1_1_1 = new JPanel();
		panel_1_1_1_1_1_1_1_1.setLayout(null);
		panel_1_1_1_1_1_1_1_1.setBounds(514, 902, 743, 86);
		contentPane.add(panel_1_1_1_1_1_1_1_1);
		
		JLabel lblNewLabel_5_1_1_1_1_1_1_1 = new JLabel("Modelo");
		lblNewLabel_5_1_1_1_1_1_1_1.setBounds(31, 61, 46, 14);
		panel_1_1_1_1_1_1_1_1.add(lblNewLabel_5_1_1_1_1_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1_1_1_1_1_1 = new JLabel("Ano");
		lblNewLabel_1_1_1_1_1_1_1_1_1.setBounds(155, 61, 46, 14);
		panel_1_1_1_1_1_1_1_1.add(lblNewLabel_1_1_1_1_1_1_1_1_1);
		
		JLabel lblNewLabel_2_1_1_1_1_1_1_1_1 = new JLabel("Cor");
		lblNewLabel_2_1_1_1_1_1_1_1_1.setBounds(389, 17, 46, 14);
		panel_1_1_1_1_1_1_1_1.add(lblNewLabel_2_1_1_1_1_1_1_1_1);
		
		JLabel lblNewLabel_3_1_1_1_1_1_1_1_1 = new JLabel("Marca");
		lblNewLabel_3_1_1_1_1_1_1_1_1.setBounds(155, 17, 46, 14);
		panel_1_1_1_1_1_1_1_1.add(lblNewLabel_3_1_1_1_1_1_1_1_1);
		
		JLabel lblNewLabel_4_1_1_1_1_1_1_1_1 = new JLabel("Preço");
		lblNewLabel_4_1_1_1_1_1_1_1_1.setBounds(389, 61, 46, 14);
		panel_1_1_1_1_1_1_1_1.add(lblNewLabel_4_1_1_1_1_1_1_1_1);
		
		textField_32 = new JTextField();
		textField_32.setEnabled(false);
		textField_32.setEditable(false);
		textField_32.setColumns(10);
		textField_32.setBounds(196, 6, 154, 29);
		panel_1_1_1_1_1_1_1_1.add(textField_32);
		
		textField_33 = new JTextField();
		textField_33.setEnabled(false);
		textField_33.setEditable(false);
		textField_33.setColumns(10);
		textField_33.setBounds(196, 54, 154, 29);
		panel_1_1_1_1_1_1_1_1.add(textField_33);
		
		textField_34 = new JTextField();
		textField_34.setEnabled(false);
		textField_34.setEditable(false);
		textField_34.setColumns(10);
		textField_34.setBounds(426, 6, 154, 29);
		panel_1_1_1_1_1_1_1_1.add(textField_34);
		
		textField_35 = new JTextField();
		textField_35.setEnabled(false);
		textField_35.setEditable(false);
		textField_35.setColumns(10);
		textField_35.setBounds(426, 54, 154, 29);
		panel_1_1_1_1_1_1_1_1.add(textField_35);
		
		JButton btnNewButton_4_1_1_1_1 = new JButton("Visualizar");
		btnNewButton_4_1_1_1_1.setBounds(623, 33, 89, 23);
		panel_1_1_1_1_1_1_1_1.add(btnNewButton_4_1_1_1_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(1894, 0, 10, 1041);
		contentPane.add(scrollPane);
	}
}
