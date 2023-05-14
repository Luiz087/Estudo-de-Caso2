package visao;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaPrincipUsu extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaPrincipUsu frame = new TelaPrincipUsu();
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
	public TelaPrincipUsu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 695, 603);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JButton btnNewButton = new JButton("Sair");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaLogin telaLoginUsu = new TelaLogin();
				dispose();
				telaLoginUsu.setExtendedState(JFrame.MAXIMIZED_BOTH);
				telaLoginUsu.setVisible(true);
			}
		});
		btnNewButton.setBounds(10, 11, 89, 23);
		contentPane.add(btnNewButton);

		JButton btnNewButton_1_1_1_1 = new JButton("Comprar Carro");
		btnNewButton_1_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaCarrosUsuario telaListaCarros = new TelaCarrosUsuario();
				dispose();
				telaListaCarros.setExtendedState(JFrame.MAXIMIZED_BOTH);
				telaListaCarros.setVisible(true);
			}
		});
		btnNewButton_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton_1_1_1_1.setBounds(221, 76, 233, 71);
		contentPane.add(btnNewButton_1_1_1_1);

		JButton btnNewButton_1_1_1_1_1 = new JButton("Excluir conta");
		btnNewButton_1_1_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Conta excluida!");
				TelaLogin telaLoginUsu = new TelaLogin();
				dispose();
				telaLoginUsu.setExtendedState(JFrame.MAXIMIZED_BOTH);
				telaLoginUsu.setVisible(true);
			}
		});
		btnNewButton_1_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton_1_1_1_1_1.setBounds(221, 240, 233, 71);
		contentPane.add(btnNewButton_1_1_1_1_1);

		JButton btnNewButton_1_1_1_1_2 = new JButton("Alterar Dados");
		btnNewButton_1_1_1_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaAtualizarUsu telaAtualiUsu = new TelaAtualizarUsu();
				dispose();
				telaAtualiUsu.setExtendedState(JFrame.MAXIMIZED_BOTH);
				telaAtualiUsu.setVisible(true);
			}
		});
		btnNewButton_1_1_1_1_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton_1_1_1_1_2.setBounds(221, 158, 233, 71);
		contentPane.add(btnNewButton_1_1_1_1_2);
	}
}
