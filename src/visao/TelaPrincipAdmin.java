package visao;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import java.awt.ScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import javax.swing.JToolBar;

public class TelaPrincipAdmin extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaPrincipAdmin frame = new TelaPrincipAdmin();
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
	public TelaPrincipAdmin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1920, 1080);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 160));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("Funções de Administrador");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBackground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setBounds(408, 11, 217, 33);
		contentPane.add(lblNewLabel);

		JLabel lblFunesDeFuncionrio = new JLabel("Funções de Funcionário");
		lblFunesDeFuncionrio.setForeground(Color.WHITE);
		lblFunesDeFuncionrio.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblFunesDeFuncionrio.setBounds(775, 16, 185, 22);
		contentPane.add(lblFunesDeFuncionrio);

		JButton btnNewButton_1_1_1_2_1_1 = new JButton("Listar Funcionários");
		btnNewButton_1_1_1_2_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaCrudAdminFunc telaCrudAdminFunci = new TelaCrudAdminFunc();
				dispose();
				telaCrudAdminFunci.setExtendedState(JFrame.MAXIMIZED_BOTH);
				telaCrudAdminFunci.setVisible(true);
			}
		});
		btnNewButton_1_1_1_2_1_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton_1_1_1_2_1_1.setBounds(397, 55, 233, 71);
		contentPane.add(btnNewButton_1_1_1_2_1_1);

		JButton btnNewButton_1_1_1_2_1_1_1 = new JButton("Listar Clientes");
		btnNewButton_1_1_1_2_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaListarUsuAdm telaListUsu = new TelaListarUsuAdm();
				dispose();
				telaListUsu.setExtendedState(JFrame.MAXIMIZED_BOTH);
				telaListUsu.setVisible(true);
			}
		});
		btnNewButton_1_1_1_2_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton_1_1_1_2_1_1_1.setBounds(758, 137, 233, 71);
		contentPane.add(btnNewButton_1_1_1_2_1_1_1);

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

		JButton btnNewButton_1_1_1_1_1 = new JButton("Listar Carro");
		btnNewButton_1_1_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaCrudAdmCarros telaCrudCarros = new TelaCrudAdmCarros();
				dispose();
				telaCrudCarros.setExtendedState(JFrame.MAXIMIZED_BOTH);
				telaCrudCarros.setVisible(true);
			}
		});
		btnNewButton_1_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton_1_1_1_1_1.setBounds(758, 55, 233, 71);
		contentPane.add(btnNewButton_1_1_1_1_1);

		JButton btnNewButton_1_1_1_2_1_1_2 = new JButton("Listar Carros Vendidos");
		btnNewButton_1_1_1_2_1_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaListarComprasAdm telaCarrosComprados = new TelaListarComprasAdm();
				dispose();
				telaCarrosComprados.setExtendedState(JFrame.MAXIMIZED_BOTH);
				telaCarrosComprados.setVisible(true);
			}
		});
		btnNewButton_1_1_1_2_1_1_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton_1_1_1_2_1_1_2.setBounds(397, 137, 233, 71);
		contentPane.add(btnNewButton_1_1_1_2_1_1_2);
	}
}
