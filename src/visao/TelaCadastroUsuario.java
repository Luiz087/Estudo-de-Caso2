package visao;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import controle.UsuarioDAO;
import modelo.Usuario;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.Window.Type;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.JPasswordField;

public class TelaCadastroUsuario extends JFrame {

	private JPanel contentPane;
	private JTextField textCadUsu;
	private UsuarioDAO usuarioDao = UsuarioDAO.getInstancia();
	private JTextField textCadCpf;
	private JTextField textCadNome;
	private JTextField textCadCep;
	private JTextField textCadTel;
	private JTable table;
	private DefaultTableModel model;
	private JPasswordField textCadSenha;

	/**
	 * Create the frame.
	 */
	public TelaCadastroUsuario() {
		setTitle("Cadastro de Usuário");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1920, 1080);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(192, 192, 192));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		model = new DefaultTableModel();
		model.addColumn("Nome");
		model.addColumn("CPF");

		for (Usuario obj : UsuarioDAO.getInstancia().listarUsuarios()) {
			Object[] rowData = { obj.getNome(), obj.getCpf() };
			model.addRow(rowData);
		}

		JButton btnVoltarTelaLogin = new JButton("Voltar");
		btnVoltarTelaLogin.setBackground(SystemColor.info);
		btnVoltarTelaLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaLogin telaLoginUsu = new TelaLogin();
				dispose();
				telaLoginUsu.setExtendedState(JFrame.MAXIMIZED_BOTH);
				telaLoginUsu.setVisible(true);
			}
		});
		btnVoltarTelaLogin.setBounds(10, 15, 131, 30);
		contentPane.add(btnVoltarTelaLogin);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 0, 160));
		panel.setBounds(0, 0, 1380, 822);
		contentPane.add(panel);
		panel.setLayout(null);

		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1
				.setIcon(new ImageIcon("C:\\Users\\bruna\\Downloads\\Minimalist Login Page Mobile Prototype (1).png"));
		lblNewLabel_1.setBounds(0, -78, 406, 829);
		panel.add(lblNewLabel_1);

		JButton btnCadUsuario = new JButton("CADASTRAR");
		btnCadUsuario.setBounds(534, 422, 312, 77);
		panel.add(btnCadUsuario);
		btnCadUsuario.setBackground(SystemColor.info);
		btnCadUsuario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Usuario user = new Usuario();

				String usuarioCad = textCadUsu.getText();
				String senhaCad = textCadSenha.getText();
				String nomeCad = textCadNome.getText();
				String cpfCad = textCadCpf.getText();
				String cepCad = textCadCep.getText();
				String telCad = textCadTel.getText();

				user.setUsuarioCliente(usuarioCad);
				user.setSenhaCliente(senhaCad);
				user.setCep(Long.valueOf(cepCad));
				user.setCpf(Long.valueOf(cpfCad));
				user.setTelefone(telCad);
				user.setNome(nomeCad);

				try {
					usuarioDao.inserir(user);
					textCadUsu.setText(null);
					textCadSenha.setText(null);
					textCadNome.setText(null);
					textCadCpf.setText(null);
					textCadCep.setText(null);
					textCadTel.setText(null);

					for (Usuario user1 : UsuarioDAO.getInstancia().listarUsuarios()) {
						Object[] usuario = new Object[6];
						usuario[0] = user1.getNome();
						usuario[1] = user1.getCpf();

						model.addRow(usuario);
					}

					JOptionPane.showMessageDialog(null, "Usuário cadastrado com sucesso!");

				} catch (Exception ex) {
					ex.printStackTrace();
					JOptionPane.showMessageDialog(null, "Ocorreu um erro. Tente novamente!");
				}
			}
		});
		btnCadUsuario.setFont(new Font("Tahoma", Font.PLAIN, 18));

		JLabel lblNewLabel = new JLabel("Usuário:");
		lblNewLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel.setBounds(484, 83, 105, 49);
		panel.add(lblNewLabel);
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 26));

		JLabel lblSenha = new JLabel("Senha:");
		lblSenha.setHorizontalAlignment(SwingConstants.RIGHT);
		lblSenha.setBounds(484, 245, 105, 43);
		panel.add(lblSenha);
		lblSenha.setForeground(new Color(255, 255, 255));
		lblSenha.setFont(new Font("Tahoma", Font.PLAIN, 26));

		JLabel lblNome = new JLabel("Nome:");
		lblNome.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNome.setBounds(482, 137, 105, 43);
		panel.add(lblNome);
		lblNome.setForeground(new Color(255, 255, 255));
		lblNome.setFont(new Font("Tahoma", Font.PLAIN, 26));

		JLabel lblCpf = new JLabel("CPF:");
		lblCpf.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCpf.setBounds(496, 299, 93, 43);
		panel.add(lblCpf);
		lblCpf.setForeground(new Color(255, 255, 255));
		lblCpf.setFont(new Font("Tahoma", Font.PLAIN, 26));

		textCadUsu = new JTextField();
		textCadUsu.setBounds(592, 83, 195, 43);
		panel.add(textCadUsu);
		textCadUsu.setColumns(10);

		textCadNome = new JTextField();
		textCadNome.setBounds(592, 137, 195, 43);
		panel.add(textCadNome);
		textCadNome.setColumns(10);

		JLabel lblTelefone = new JLabel("Telefone:");
		lblTelefone.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTelefone.setBounds(460, 353, 129, 43);
		panel.add(lblTelefone);
		lblTelefone.setForeground(new Color(255, 255, 255));
		lblTelefone.setFont(new Font("Tahoma", Font.PLAIN, 26));

		textCadTel = new JTextField();
		textCadTel.setBounds(592, 353, 195, 43);
		panel.add(textCadTel);
		textCadTel.setColumns(10);

		JLabel lblCep = new JLabel("CEP:");
		lblCep.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCep.setBounds(484, 191, 105, 43);
		panel.add(lblCep);
		lblCep.setForeground(new Color(255, 255, 255));
		lblCep.setFont(new Font("Tahoma", Font.PLAIN, 26));

		textCadCep = new JTextField();
		textCadCep.setBounds(592, 191, 195, 43);
		panel.add(textCadCep);
		textCadCep.setColumns(10);

		textCadCpf = new JTextField();
		textCadCpf.setBounds(592, 299, 195, 43);
		panel.add(textCadCpf);
		textCadCpf.setColumns(10);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(318, 521, 744, 158);
		panel.add(scrollPane);

		table = new JTable();
		scrollPane.setViewportView(table);

		table.setModel(model);

		JLabel lblNewLabel_2_5 = new JLabel("Cadastro");
		lblNewLabel_2_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_5.setForeground(new Color(255, 255, 255));
		lblNewLabel_2_5.setFont(new Font("Segoe UI Black", Font.BOLD, 38));
		lblNewLabel_2_5.setBounds(450, 0, 479, 72);
		panel.add(lblNewLabel_2_5);
		
		textCadSenha = new JPasswordField();
		textCadSenha.setBounds(592, 245, 195, 43);
		panel.add(textCadSenha);
	}
}
