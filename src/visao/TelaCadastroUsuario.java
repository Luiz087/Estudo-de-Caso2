package visao;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaCadastroUsuario extends JFrame {

	private JPanel contentPane;
	private JTextField textCadUsu;
	private JTextField textCadSenha;


	/**
	 * Create the frame.
	 */
	public TelaCadastroUsuario() {
		TelaCadastroUsuario telaCadUsu = new TelaCadastroUsuario();
		telaCadUsu.setExtendedState(JFrame.MAXIMIZED_BOTH);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 849, 528);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Usuário");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 26));
		lblNewLabel.setBounds(239, 74, 105, 43);
		contentPane.add(lblNewLabel);
		
		JLabel lblSenha = new JLabel("Senha");
		lblSenha.setFont(new Font("Tahoma", Font.PLAIN, 26));
		lblSenha.setBounds(239, 165, 105, 43);
		contentPane.add(lblSenha);
		
		textCadUsu = new JTextField();
		textCadUsu.setBounds(339, 74, 160, 43);
		contentPane.add(textCadUsu);
		textCadUsu.setColumns(10);
		
		textCadSenha = new JTextField();
		textCadSenha.setColumns(10);
		textCadSenha.setBounds(339, 165, 160, 43);
		contentPane.add(textCadSenha);
		
		JButton btnCadUsuario = new JButton("CADASTRAR");
		btnCadUsuario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnCadUsuario.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnCadUsuario.setBounds(325, 254, 189, 52);
		contentPane.add(btnCadUsuario);
	}
}
