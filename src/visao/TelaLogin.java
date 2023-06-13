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
		Admin adm = new Admin();
		Funcionario func = new Funcionario();

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
		btnLoginUsuario.setBackground(new Color(255, 255, 255));
		btnLoginUsuario.addActionListener(new ActionListener() {
			@SuppressWarnings("unlikely-arg-type")
			public void actionPerformed(ActionEvent e) {

				String usuarioLogin = textLoginUsu.getText();
				char[] usuarioSenha = textSenhaUsu.getPassword();
				String strSenha = "";
				if (usuarioSenha != null && usuarioSenha.length > 0) {
					strSenha = String.valueOf(usuarioSenha);
				}
				String usuAdm = adm.getUsuarioAdmin();
				String senAdm = adm.getSenhaAdmin();

				if (usuarioLogin.isEmpty() || strSenha.isEmpty()) {
					JOptionPane.showMessageDialog(null, "Insira todo os dados obrigatórios!");
				} else if (usuAdm.equals(usuarioLogin) && senAdm.equals(strSenha)) {
					TelaPrincipAdmin telaAdmin = new TelaPrincipAdmin();
					dispose();
					telaAdmin.setExtendedState(JFrame.MAXIMIZED_BOTH);
					telaAdmin.setVisible(true);
				} else {

					Funcionario fun = funcionarioDAO.efetuarLogin(usuarioLogin, strSenha);
					if (fun != null) {
						// existe
						TelaCrudFuncCarros telaFunc = new TelaCrudFuncCarros();
						dispose();
						telaFunc.setExtendedState(JFrame.MAXIMIZED_BOTH);
						telaFunc.setVisible(true);
					} else {
						JOptionPane.showMessageDialog(null, "Usuario/senha incorretos ou usuario inexistente!");
					}

				}
			}
		});
		btnLoginUsuario.setFont(new Font("Tahoma", Font.PLAIN, 18));

		JLabel lblBemVindo = new JLabel("BEM VINDO A GSP");
		lblBemVindo.setBounds(374, 258, 596, 92);
		lblBemVindo.setForeground(Color.WHITE);
		lblBemVindo.setFont(new Font("Segoe UI Black", Font.BOLD, 40));
		fundologin.add(lblBemVindo);

		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(83, 198, 987, 754);
		lblNewLabel_1.setIcon(new ImageIcon(TelaLogin.class.getResource("/visao/Design sem nome (3).png")));
		fundologin.add(lblNewLabel_1);

	}
}
