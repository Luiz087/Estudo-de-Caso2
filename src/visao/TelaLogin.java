package visao;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controle.UsuarioDAO;
import modelo.Admin;
import modelo.Usuario;

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

public class TelaLogin extends JFrame {

	protected static final String Usuario = null;
	private JPanel contentPane;
	private JTextField textLoginSenha;
	private JTextField textLoginUsu;
	private UsuarioDAO usuarioDao = UsuarioDAO.getInstancia();

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
		contentPane.setBackground(new Color(0, 0, 160));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel fundologin = new JPanel();
		fundologin.setBackground(new Color(0, 0, 160));
		fundologin.setBounds(-106, -198, 1582, 963);
		contentPane.add(fundologin);
		fundologin.setLayout(null);
		
		JLabel lblUsurio = new JLabel("Usuário:");
		lblUsurio.setHorizontalAlignment(SwingConstants.RIGHT);
		lblUsurio.setForeground(Color.WHITE);
		lblUsurio.setFont(new Font("Tahoma", Font.PLAIN, 26));
		lblUsurio.setBounds(374, 395, 105, 43);
		fundologin.add(lblUsurio);

		JLabel lblSenha = new JLabel("Senha:");
		lblSenha.setHorizontalAlignment(SwingConstants.RIGHT);
		lblSenha.setBounds(374, 518, 105, 43);
		fundologin.add(lblSenha);
		lblSenha.setForeground(new Color(255, 255, 255));
		lblSenha.setFont(new Font("Tahoma", Font.PLAIN, 26));

		textLoginUsu = new JTextField();
		textLoginUsu.setBounds(494, 395, 215, 43);
		fundologin.add(textLoginUsu);
		textLoginUsu.setColumns(10);

		textLoginSenha = new JTextField();
		textLoginSenha.setBounds(494, 518, 215, 43);
		fundologin.add(textLoginSenha);
		textLoginSenha.setColumns(10);

		JButton btnLoginUsuario = new JButton("ENTRAR");
		btnLoginUsuario.setBounds(494, 629, 215, 43);
		fundologin.add(btnLoginUsuario);
		btnLoginUsuario.setBackground(SystemColor.info);
		btnLoginUsuario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/*
				 * Admin adm = new Admin(); String usuarioLogin = textLoginUsu.getText(); String
				 * usuarioSenha = textLoginSenha.getText(); String usuAdm =
				 * adm.getUsuarioAdmin(); String senhaAdm = adm.getUsuarioAdmin();
				 * 
				 * for (Usuario user : usuarioDao.listarUsuarios()) { if
				 * (user.getUsuarioCliente().equals(usuarioLogin) &&
				 * user.getSenhaCliente().equals(usuarioSenha)) { TelaCarrosUsuario
				 * telaCarrosUsu = new TelaCarrosUsuario(); dispose();
				 * telaCarrosUsu.setExtendedState(JFrame.MAXIMIZED_BOTH);
				 * telaCarrosUsu.setVisible(true); } else { JOptionPane.showMessageDialog(null,
				 * "Usuário não encontrado!"); } }
				 */
				TelaPrincipUsu telaPrinciUsu = new TelaPrincipUsu();
				dispose();
				telaPrinciUsu.setExtendedState(JFrame.MAXIMIZED_BOTH);
				telaPrinciUsu.setVisible(true);
			}
		});
		btnLoginUsuario.setFont(new Font("Tahoma", Font.PLAIN, 18));

		JLabel lblNPConta = new JLabel("Não possui conta?");
		lblNPConta.setBounds(1196, 646, 169, 14);
		fundologin.add(lblNPConta);
		lblNPConta.setForeground(new Color(255, 0, 0));
		lblNPConta.setHorizontalAlignment(SwingConstants.CENTER);

		JButton btnCriarConta = new JButton("CRIAR CONTA");
		btnCriarConta.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnCriarConta.setBounds(1178, 670, 215, 43);
		fundologin.add(btnCriarConta);
		btnCriarConta.setBackground(SystemColor.info);

		JLabel lblBemVindo = new JLabel("BEM VINDO A GSP");
		lblBemVindo.setForeground(Color.WHITE);
		lblBemVindo.setFont(new Font("Segoe UI Black", Font.BOLD, 40));
		lblBemVindo.setBounds(374, 258, 596, 92);
		fundologin.add(lblBemVindo);

		JButton btnEntrarAdmin = new JButton("Entrar Admin");
		btnEntrarAdmin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaPrincipAdmin telaAdmPrinc = new TelaPrincipAdmin();
				dispose();
				telaAdmPrinc.setExtendedState(JFrame.MAXIMIZED_BOTH);
				telaAdmPrinc.setVisible(true);
			}
		});
		btnEntrarAdmin.setBounds(494, 683, 105, 23);
		fundologin.add(btnEntrarAdmin);

		JButton btnEntrarFunc = new JButton("Entrar Func");
		btnEntrarFunc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaPrincipFunc telPrincFunci = new TelaPrincipFunc();
				dispose();
				telPrincFunci.setExtendedState(JFrame.MAXIMIZED_BOTH);
				telPrincFunci.setVisible(true);
			}
		});
		btnEntrarFunc.setBounds(609, 683, 100, 23);
		fundologin.add(btnEntrarFunc);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(TelaLogin.class.getResource("/visao/Design sem nome (5).png")));
		lblNewLabel.setBounds(47, 64, 1935, 1074);
		fundologin.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(TelaLogin.class.getResource("/visao/Design sem nome (3).png")));
		lblNewLabel_1.setBounds(83, 198, 987, 754);
		fundologin.add(lblNewLabel_1);
		btnCriarConta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaCadastroUsuario telaCadUsu = new TelaCadastroUsuario();
				dispose();
				telaCadUsu.setExtendedState(JFrame.MAXIMIZED_BOTH);
				telaCadUsu.setVisible(true);
			}
		});

	}
}
