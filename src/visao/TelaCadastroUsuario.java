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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 945, 728);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(192, 192, 192));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("Usuário");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 26));
		lblNewLabel.setBounds(223, 11, 105, 43);
		contentPane.add(lblNewLabel);

		JLabel lblSenha = new JLabel("Senha");
		lblSenha.setFont(new Font("Tahoma", Font.PLAIN, 26));
		lblSenha.setBounds(223, 65, 105, 43);
		contentPane.add(lblSenha);

		textCadUsu = new JTextField();
		textCadUsu.setBounds(339, 11, 160, 43);
		contentPane.add(textCadUsu);
		textCadUsu.setColumns(10);

		textCadSenha = new JTextField();
		textCadSenha.setColumns(10);
		textCadSenha.setBounds(339, 65, 160, 43);
		contentPane.add(textCadSenha);

		JButton btnCadUsuario = new JButton("CADASTRAR");
		btnCadUsuario.setBackground(new Color(128, 255, 128));
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
		btnCadUsuario.setBounds(328, 362, 189, 52);
		contentPane.add(btnCadUsuario);

		JLabel lblCpf = new JLabel("CPF");
		lblCpf.setFont(new Font("Tahoma", Font.PLAIN, 26));
		lblCpf.setBounds(223, 173, 105, 43);
		contentPane.add(lblCpf);

		textCadCpf = new JTextField();
		textCadCpf.setColumns(10);
		textCadCpf.setBounds(339, 173, 160, 43);
		contentPane.add(textCadCpf);

		JLabel lblNome = new JLabel("Nome");
		lblNome.setFont(new Font("Tahoma", Font.PLAIN, 26));
		lblNome.setBounds(223, 119, 105, 43);
		contentPane.add(lblNome);

		textCadNome = new JTextField();
		textCadNome.setColumns(10);
		textCadNome.setBounds(339, 119, 160, 43);
		contentPane.add(textCadNome);

		JLabel lblCep = new JLabel("CEP");
		lblCep.setFont(new Font("Tahoma", Font.PLAIN, 26));
		lblCep.setBounds(223, 227, 105, 43);
		contentPane.add(lblCep);

		textCadCep = new JTextField();
		textCadCep.setColumns(10);
		textCadCep.setBounds(339, 227, 160, 43);
		contentPane.add(textCadCep);

		textCadTel = new JTextField();
		textCadTel.setColumns(10);
		textCadTel.setBounds(339, 281, 160, 43);
		contentPane.add(textCadTel);

		JLabel lblTelefone = new JLabel("Telefone");
		lblTelefone.setFont(new Font("Tahoma", Font.PLAIN, 26));
		lblTelefone.setBounds(223, 281, 105, 43);
		contentPane.add(lblTelefone);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(111, 484, 642, 158);
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
		btnVoltarTelaLogin.setBackground(new Color(128, 255, 128));
		btnVoltarTelaLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaLogin telaLoginUsu = new TelaLogin();
				dispose();
				telaLoginUsu.setExtendedState(JFrame.MAXIMIZED_BOTH);
				telaLoginUsu.setVisible(true);
			}
		});
		btnVoltarTelaLogin.setBounds(10, 11, 89, 23);
		contentPane.add(btnVoltarTelaLogin);
	}
}
