package visao;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.SystemColor;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaPrincipFunc extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaPrincipFunc frame = new TelaPrincipFunc();
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
	public TelaPrincipFunc() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 674, 598);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JButton btnSair = new JButton("Sair");
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaLogin telaLoginUsu = new TelaLogin();
				dispose();
				telaLoginUsu.setExtendedState(JFrame.MAXIMIZED_BOTH);
				telaLoginUsu.setVisible(true);
			}
		});
		btnSair.setBackground(SystemColor.info);
		btnSair.setBounds(10, 15, 131, 30);
		contentPane.add(btnSair);

		JButton btnNewButton_1_1_1_1 = new JButton("Listar Carros");
		btnNewButton_1_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaCrudFuncCarros telaCrudFunc = new TelaCrudFuncCarros();
				dispose();
				telaCrudFunc.setExtendedState(JFrame.MAXIMIZED_BOTH);
				telaCrudFunc.setVisible(true);
			}
		});
		btnNewButton_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton_1_1_1_1.setBounds(215, 71, 233, 71);
		contentPane.add(btnNewButton_1_1_1_1);

		JButton btnNewButton_1_1_1_2 = new JButton("Listar Usuários");
		btnNewButton_1_1_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaListarUsuFunc telaListUsu = new TelaListarUsuFunc();
				dispose();
				telaListUsu.setExtendedState(JFrame.MAXIMIZED_BOTH);
				telaListUsu.setVisible(true);
			}
		});
		btnNewButton_1_1_1_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton_1_1_1_2.setBounds(215, 153, 233, 71);
		contentPane.add(btnNewButton_1_1_1_2);
	}

}
