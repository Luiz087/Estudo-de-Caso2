package visao;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controle.FuncionarioDAO;
import modelo.Admin;
import modelo.Funcionario;

import javax.swing.JComboBox;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.SystemColor;
import javax.swing.ImageIcon;
import javax.swing.JTable;
import javax.swing.JPasswordField;

public class TelaLogin extends JFrame {

	protected static final String Usuario = null;
	private JPanel contentPane;
	private JTextField textLoginUsu;
	private FuncionarioDAO funcionarioDAO = FuncionarioDAO.getInstancia();
	private JPasswordField textSenhaUsu;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaLogin frame = new TelaLogin();
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
	public TelaLogin() {
		setTitle("Menu Principal");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1920, 1080);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(53, 157, 155));
		contentPane.setBorder(new EmptyBorder(0, 0, 0, 0));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel fundologin = new JPanel();
		fundologin.setBackground(new Color(53, 157, 155));
		fundologin.setBounds(-106, -198, 1582, 963);
		contentPane.add(fundologin);
		fundologin.setLayout(null);

		textSenhaUsu = new JPasswordField();
		textSenhaUsu.setBounds(494, 518, 215, 43);
		fundologin.add(textSenhaUsu);

		JLabel lblUsurio = new JLabel("Usuário:");
		lblUsurio.setBounds(374, 395, 105, 43);
		lblUsurio.setHorizontalAlignment(SwingConstants.RIGHT);
		lblUsurio.setForeground(Color.WHITE);
		lblUsurio.setFont(new Font("Tahoma", Font.PLAIN, 26));
		fundologin.add(lblUsurio);

		JLabel lblSenha = new JLabel("Senha:");
		lblSenha.setBounds(374, 518, 105, 43);
		lblSenha.setHorizontalAlignment(SwingConstants.RIGHT);
		fundologin.add(lblSenha);
		lblSenha.setForeground(new Color(255, 255, 255));
		lblSenha.setFont(new Font("Tahoma", Font.PLAIN, 26));

		textLoginUsu = new JTextField();
		textLoginUsu.setBounds(494, 395, 215, 43);
		fundologin.add(textLoginUsu);
		textLoginUsu.setColumns(10);

		JButton btnLoginUsuario = new JButton("ENTRAR");
		btnLoginUsuario.setBounds(494, 629, 215, 43);
		fundologin.add(btnLoginUsuario);
		btnLoginUsuario.setBackground(SystemColor.info);
		btnLoginUsuario.addActionListener(new ActionListener() {
			@SuppressWarnings("unlikely-arg-type")
			public void actionPerformed(ActionEvent e) {

				Admin adm = new Admin();
				Funcionario func = new Funcionario();
				String usuarioLogin = textLoginUsu.getText();
				char[] usuarioSenha = textSenhaUsu.getPassword();
				String usuAdm = adm.getUsuarioAdmin();
				String senAdm = adm.getSenhaAdmin();

				if (usuAdm.equals(usuarioLogin) && senAdm.equals(usuarioSenha)) {
					TelaPrincipAdmin telaAdmin = new TelaPrincipAdmin();
					dispose();
					telaAdmin.setExtendedState(JFrame.MAXIMIZED_BOTH);
					telaAdmin.setVisible(true);
				} else {
					for (Funcionario func1 : funcionarioDAO.listarFuncionarios()) {
						if (func1.getUsuarioFuncionario().equals(usuarioLogin)
								&& func1.getSenhaFuncionario().equals(usuarioSenha)) {
							TelaPrincipFunc telaFunc = new TelaPrincipFunc();
							dispose();
							telaFunc.setExtendedState(JFrame.MAXIMIZED_BOTH);
							telaFunc.setVisible(true);
						} else {
							JOptionPane.showMessageDialog(null, "Usuário não encontrado!");
						}
					}
				}
			}
		});
		btnLoginUsuario.setFont(new Font("Tahoma", Font.PLAIN, 18));

		JLabel lblNPConta = new JLabel("Não possui conta?");
		lblNPConta.setBounds(1196, 649, 169, 14);
		fundologin.add(lblNPConta);
		lblNPConta.setForeground(new Color(255, 0, 0));
		lblNPConta.setHorizontalAlignment(SwingConstants.CENTER);

		JButton btnCriarConta = new JButton("CRIAR CONTA");
		btnCriarConta.setBounds(1171, 673, 215, 43);
		btnCriarConta.setFont(new Font("Tahoma", Font.PLAIN, 18));
		fundologin.add(btnCriarConta);
		btnCriarConta.setBackground(SystemColor.info);

		JLabel lblBemVindo = new JLabel("BEM VINDO A GSP");
		lblBemVindo.setBounds(374, 258, 596, 92);
		lblBemVindo.setForeground(Color.WHITE);
		lblBemVindo.setFont(new Font("Segoe UI Black", Font.BOLD, 40));
		fundologin.add(lblBemVindo);

		JButton btnEntrarAdmin = new JButton("Entrar Admin");
		btnEntrarAdmin.setBounds(494, 683, 105, 23);
		btnEntrarAdmin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaPrincipAdmin telaAdmPrinc = new TelaPrincipAdmin();
				dispose();
				telaAdmPrinc.setExtendedState(JFrame.MAXIMIZED_BOTH);
				telaAdmPrinc.setVisible(true);
			}
		});
		fundologin.add(btnEntrarAdmin);

		JButton btnEntrarFunc = new JButton("Entrar Func");
		btnEntrarFunc.setBounds(609, 683, 100, 23);
		btnEntrarFunc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaPrincipFunc telPrincFunci = new TelaPrincipFunc();
				dispose();
				telPrincFunci.setExtendedState(JFrame.MAXIMIZED_BOTH);
				telPrincFunci.setVisible(true);
			}
		});
		fundologin.add(btnEntrarFunc);

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(42, 52, 1935, 1074);
		lblNewLabel.setIcon(new ImageIcon(TelaLogin.class.getResource("/visao/Design sem nome (5).png")));
		fundologin.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(83, 198, 987, 754);
		lblNewLabel_1.setIcon(new ImageIcon(TelaLogin.class.getResource("/visao/Design sem nome (3).png")));
		fundologin.add(lblNewLabel_1);
		btnCriarConta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Admin adm = new Admin();
				String usuAdm = adm.getUsuarioAdmin();
				String senAdm = adm.getSenhaAdmin();
				
				String loginAdm = JOptionPane.showInputDialog("Login Administrador: ");
				String senhaAdm = JOptionPane.showInputDialog("Senha Administrador: ");
				
				if (loginAdm.equals(usuAdm) && senhaAdm.equals(senAdm)) {
					TelaCadastroUsuario telaCadUsu = new TelaCadastroUsuario();
					dispose();
					telaCadUsu.setExtendedState(JFrame.MAXIMIZED_BOTH);
					telaCadUsu.setVisible(true);
				} else {
					JOptionPane.showMessageDialog(null, "Necessário login de administrador!");
				}
			}
		});

	}
}
