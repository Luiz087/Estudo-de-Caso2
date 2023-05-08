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
		contentPane.setBackground(new Color(192, 192, 192));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel fundologin = new JPanel();
		fundologin.setBackground(new Color(0, 0, 160));
		fundologin.setBounds(-195, -198, 1582, 963);
		contentPane.add(fundologin);
		fundologin.setLayout(null);
		
				JLabel lblNewLabel_1 = new JLabel("Usuário: ");
				lblNewLabel_1.setBounds(454, 396, 105, 92);
				fundologin.add(lblNewLabel_1);
				lblNewLabel_1.setForeground(new Color(255, 255, 255));
				lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 26));
				
						JLabel lblSenha = new JLabel("Senha:");
						lblSenha.setBounds(454, 528, 105, 43);
						fundologin.add(lblSenha);
						lblSenha.setForeground(new Color(255, 255, 255));
						lblSenha.setFont(new Font("Tahoma", Font.PLAIN, 26));
						
								textLoginUsu = new JTextField();
								textLoginUsu.setBounds(569, 427, 215, 43);
								fundologin.add(textLoginUsu);
								textLoginUsu.setColumns(10);
								
										textLoginSenha = new JTextField();
										textLoginSenha.setBounds(569, 528, 215, 43);
										fundologin.add(textLoginSenha);
										textLoginSenha.setColumns(10);
										
												JButton btnLoginUsuario = new JButton("ENTRAR");
												btnLoginUsuario.setBounds(569, 715, 215, 43);
												fundologin.add(btnLoginUsuario);
												btnLoginUsuario.setBackground(SystemColor.info);
												btnLoginUsuario.addActionListener(new ActionListener() {
													public void actionPerformed(ActionEvent e) {
														Admin adm = new Admin();
														String usuarioLogin = textLoginUsu.getText();
														String usuarioSenha = textLoginSenha.getText();
														String usuAdm = adm.getUsuarioAdmin();
														String senhaAdm = adm.getUsuarioAdmin();
														
														for (Usuario user : usuarioDao.listarUsuarios()) {
															if (user.getUsuarioCliente().equals(usuarioLogin) && user.getSenhaCliente().equals(usuarioSenha)) {
																TelaCarrosUsuario telaCarrosUsu = new TelaCarrosUsuario();
																dispose();
																telaCarrosUsu.setExtendedState(JFrame.MAXIMIZED_BOTH);
																telaCarrosUsu.setVisible(true);
															} else {
																JOptionPane.showMessageDialog(null, "Usuário não encontrado!");
															}
														}
													}
												});
												btnLoginUsuario.setFont(new Font("Tahoma", Font.PLAIN, 18));
												
														JLabel lblNewLabel = new JLabel("Não possui conta?");
														lblNewLabel.setBounds(1281, 564, 169, 14);
														fundologin.add(lblNewLabel);
														lblNewLabel.setForeground(new Color(255, 0, 0));
														lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
														
																JButton btnNewButton_1 = new JButton("CRIAR CONTA");
																btnNewButton_1.setBounds(1262, 589, 215, 43);
																fundologin.add(btnNewButton_1);
																btnNewButton_1.setBackground(SystemColor.info);
																
																JLabel fundopretologin = new JLabel("");
																fundopretologin.setIcon(new ImageIcon("C:\\Users\\bruna\\Downloads\\Minimalist Login Page Mobile Prototype.png"));
																fundopretologin.setBounds(1161, 190, 432, 762);
																fundologin.add(fundopretologin);
																btnNewButton_1.addActionListener(new ActionListener() {
																	public void actionPerformed(ActionEvent e) {
																		TelaCadastroUsuario telaCadUsu = new TelaCadastroUsuario();
																		dispose();
																		telaCadUsu.setExtendedState(JFrame.MAXIMIZED_BOTH);
																		telaCadUsu.setVisible(true);
																	}
																});

	}
}
