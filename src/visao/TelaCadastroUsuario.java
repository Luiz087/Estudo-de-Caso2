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

public class TelaCadastroUsuario extends JFrame {

	private JPanel contentPane;
	private JTextField textCadUsu;
	private JTextField textCadSenha;
	private UsuarioDAO usuarioDao = UsuarioDAO.getInstancia();
	private JTextField textCadCpf;
	private JTextField textCadNome;
	private JTextField textCadCep;
	private JTextField textCadTel;
	private JTable table;
	private DefaultTableModel model;

	/**
	 * Create the frame.
	 */
	public TelaCadastroUsuario() {
		setTitle("Cadastro");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1920, 1080);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(192, 192, 192));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("Usuário");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 26));
		lblNewLabel.setBounds(743, 47, 105, 43);
		contentPane.add(lblNewLabel);

		JLabel lblSenha = new JLabel("Senha");
		lblSenha.setFont(new Font("Tahoma", Font.PLAIN, 26));
		lblSenha.setBounds(743, 120, 105, 43);
		contentPane.add(lblSenha);

		textCadUsu = new JTextField();
		textCadUsu.setBounds(858, 47, 195, 43);
		contentPane.add(textCadUsu);
		textCadUsu.setColumns(10);

		textCadSenha = new JTextField();
		textCadSenha.setColumns(10);
		textCadSenha.setBounds(858, 120, 195, 43);
		contentPane.add(textCadSenha);

		JButton btnCadUsuario = new JButton("CADASTRAR");
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
					ex.printStackTrace();				}
			}
		});
		btnCadUsuario.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnCadUsuario.setBounds(858, 561, 239, 58);
		contentPane.add(btnCadUsuario);

		JLabel lblCpf = new JLabel("CPF");
		lblCpf.setFont(new Font("Tahoma", Font.PLAIN, 26));
		lblCpf.setBounds(743, 254, 105, 43);
		contentPane.add(lblCpf);

		textCadCpf = new JTextField();
		textCadCpf.setColumns(10);
		textCadCpf.setBounds(858, 254, 195, 43);
		contentPane.add(textCadCpf);

		JLabel lblNome = new JLabel("Nome");
		lblNome.setFont(new Font("Tahoma", Font.PLAIN, 26));
		lblNome.setBounds(743, 187, 105, 43);
		contentPane.add(lblNome);

		textCadNome = new JTextField();
		textCadNome.setColumns(10);
		textCadNome.setBounds(858, 187, 195, 43);
		contentPane.add(textCadNome);

		JLabel lblCep = new JLabel("CEP");
		lblCep.setFont(new Font("Tahoma", Font.PLAIN, 26));
		lblCep.setBounds(743, 328, 105, 43);
		contentPane.add(lblCep);

		textCadCep = new JTextField();
		textCadCep.setColumns(10);
		textCadCep.setBounds(858, 328, 195, 43);
		contentPane.add(textCadCep);

		textCadTel = new JTextField();
		textCadTel.setColumns(10);
		textCadTel.setBounds(858, 408, 195, 43);
		contentPane.add(textCadTel);

		JLabel lblTelefone = new JLabel("Telefone");
		lblTelefone.setFont(new Font("Tahoma", Font.PLAIN, 26));
		lblTelefone.setBounds(743, 408, 105, 43);
		contentPane.add(lblTelefone);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(601, 759, 744, 158);
		contentPane.add(scrollPane);

		table = new JTable();
		scrollPane.setViewportView(table);

		model = new DefaultTableModel();
		model.addColumn("Nome");
		model.addColumn("CPF");

		for (Usuario obj : UsuarioDAO.getInstancia().listarUsuarios()) {
			Object[] rowData = { obj.getNome(), obj.getCpf() };
			model.addRow(rowData);
		}

		table.setModel(model);

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
		btnVoltarTelaLogin.setBounds(10, 11, 131, 30);
		contentPane.add(btnVoltarTelaLogin);
	}
}
