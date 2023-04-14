package visao;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controle.UsuarioDAO;
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

		JButton btnNewButton_1 = new JButton("CRIAR CONTA");
		btnNewButton_1.setBackground(SystemColor.info);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaCadastroUsuario telaCadUsu = new TelaCadastroUsuario();
				dispose();
				telaCadUsu.setExtendedState(JFrame.MAXIMIZED_BOTH);
				telaCadUsu.setVisible(true);
			}
		});
		btnNewButton_1.setBounds(857, 534, 206, 43);
		contentPane.add(btnNewButton_1);

		JLabel lblNewLabel = new JLabel("Não possui conta?");
		lblNewLabel.setForeground(new Color(255, 0, 0));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(880, 510, 169, 14);
		contentPane.add(lblNewLabel);

		textLoginSenha = new JTextField();
		textLoginSenha.setColumns(10);
		textLoginSenha.setBounds(857, 217, 215, 43);
		contentPane.add(textLoginSenha);

		JLabel lblSenha = new JLabel("Senha");
		lblSenha.setFont(new Font("Tahoma", Font.PLAIN, 26));
		lblSenha.setBounds(740, 217, 105, 43);
		contentPane.add(lblSenha);

		JLabel lblNewLabel_1 = new JLabel("Usuário");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 26));
		lblNewLabel_1.setBounds(740, 119, 105, 43);
		contentPane.add(lblNewLabel_1);

		textLoginUsu = new JTextField();
		textLoginUsu.setColumns(10);
		textLoginUsu.setBounds(857, 119, 215, 43);
		contentPane.add(textLoginUsu);

		JButton btnLoginUsuario = new JButton("ENTRAR");
		btnLoginUsuario.setBackground(SystemColor.info);
		btnLoginUsuario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String usuarioLogin = textLoginUsu.getText();
				String usuarioSenha = textLoginSenha.getText();

				
				if (usuarioDao.listarUsuarios().isEmpty()){
					TelaCadastroUsuario telaCadUsu = new TelaCadastroUsuario();
					dispose();
					telaCadUsu.setExtendedState(JFrame.MAXIMIZED_BOTH);
					telaCadUsu.setVisible(true);
					return;
				}
				
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
		btnLoginUsuario.setBounds(857, 393, 206, 43);
		contentPane.add(btnLoginUsuario);

	}
}
