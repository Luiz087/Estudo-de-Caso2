package visao;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class TelaAtualizarUsu extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaAtualizarUsu frame = new TelaAtualizarUsu();
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
	public TelaAtualizarUsu() {
		setTitle("Atualizar dados do Usuário");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1386, 1023);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(41, 124, 122));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Usuário:");
		lblNewLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 26));
		lblNewLabel.setBounds(457, 75, 120, 49);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(587, 81, 195, 43);
		contentPane.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setEditable(false);
		textField_1.setColumns(10);
		textField_1.setBounds(587, 135, 195, 43);
		contentPane.add(textField_1);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNome.setForeground(Color.WHITE);
		lblNome.setFont(new Font("Tahoma", Font.PLAIN, 26));
		lblNome.setBounds(457, 135, 120, 43);
		contentPane.add(lblNome);
		
		JLabel lblCep = new JLabel("CEP:");
		lblCep.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCep.setForeground(Color.WHITE);
		lblCep.setFont(new Font("Tahoma", Font.PLAIN, 26));
		lblCep.setBounds(457, 189, 120, 43);
		contentPane.add(lblCep);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(587, 189, 195, 43);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(587, 243, 195, 43);
		contentPane.add(textField_3);
		
		JLabel lblSenha = new JLabel("Senha:");
		lblSenha.setHorizontalAlignment(SwingConstants.RIGHT);
		lblSenha.setForeground(Color.WHITE);
		lblSenha.setFont(new Font("Tahoma", Font.PLAIN, 26));
		lblSenha.setBounds(457, 243, 120, 43);
		contentPane.add(lblSenha);
		
		JLabel lblCpf = new JLabel("CPF:");
		lblCpf.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCpf.setForeground(Color.WHITE);
		lblCpf.setFont(new Font("Tahoma", Font.PLAIN, 26));
		lblCpf.setBounds(457, 297, 120, 43);
		contentPane.add(lblCpf);
		
		textField_4 = new JTextField();
		textField_4.setEditable(false);
		textField_4.setColumns(10);
		textField_4.setBounds(587, 297, 195, 43);
		contentPane.add(textField_4);
		
		JLabel lblTelefone = new JLabel("Telefone:");
		lblTelefone.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTelefone.setForeground(Color.WHITE);
		lblTelefone.setFont(new Font("Tahoma", Font.PLAIN, 26));
		lblTelefone.setBounds(457, 351, 120, 43);
		contentPane.add(lblTelefone);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(587, 351, 195, 43);
		contentPane.add(textField_5);
		
		JButton btnAtualizar = new JButton("Atualizar");
		btnAtualizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Dados atualizados com sucesso!");
				TelaPrincipUsu telaPricipipUsu = new TelaPrincipUsu();
				dispose();
				telaPricipipUsu.setExtendedState(JFrame.MAXIMIZED_BOTH);
				telaPricipipUsu.setVisible(true);
			}
		});
		btnAtualizar.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnAtualizar.setBackground(SystemColor.info);
		btnAtualizar.setBounds(529, 455, 312, 77);
		contentPane.add(btnAtualizar);
		
		JLabel lblNewLabel_2_5 = new JLabel("Atualizar Dados");
		lblNewLabel_2_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_5.setForeground(new Color(255, 255, 255));
		lblNewLabel_2_5.setFont(new Font("Segoe UI Black", Font.BOLD, 38));
		lblNewLabel_2_5.setBounds(445, 0, 479, 72);
		contentPane.add(lblNewLabel_2_5);
		
		JButton btnNewButton_1 = new JButton("Voltar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaPrincipUsu telaPricipipUsu = new TelaPrincipUsu();
				dispose();
				telaPricipipUsu.setExtendedState(JFrame.MAXIMIZED_BOTH);
				telaPricipipUsu.setVisible(true);
			}
		});
		btnNewButton_1.setBounds(10, 15, 131, 30);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(TelaAtualizarUsu.class.getResource("/visao/Design sem nome (3).png")));
		lblNewLabel_1.setBounds(193, 0, 1090, 784);
		contentPane.add(lblNewLabel_1);
	}
}
