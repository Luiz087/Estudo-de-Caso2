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
import javax.swing.ImageIcon;

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
		setTitle("Tela Inicial do Administrador");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1920, 1080);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(41, 124, 122));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon(TelaPrincipAdmin.class.getResource("/visao/v (1).png")));
		lblNewLabel_3.setBounds(798, 70, 150, 150);
		contentPane.add(lblNewLabel_3);

		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(TelaPrincipAdmin.class.getResource("/visao/2942813 (3).png")));
		lblNewLabel_2.setBounds(483, 70, 166, 150);
		contentPane.add(lblNewLabel_2);

		JLabel lblNewLabel = new JLabel("Funções de Administrador");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBackground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setBounds(443, 231, 243, 33);
		contentPane.add(lblNewLabel);

		JLabel lblFunesDeFuncionrio = new JLabel("Função de Funcionário");
		lblFunesDeFuncionrio.setForeground(Color.WHITE);
		lblFunesDeFuncionrio.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblFunesDeFuncionrio.setBounds(750, 236, 228, 22);
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
		btnNewButton_1_1_1_2_1_1.setBounds(443, 371, 233, 71);
		contentPane.add(btnNewButton_1_1_1_2_1_1);

		JButton btnSair = new JButton("Sair");
		btnSair.setForeground(new Color(0, 0, 0));
		btnSair.setFont(new Font("Tahoma", Font.BOLD, 11));

		btnSair.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				TelaLogin telaLoginUsu = new TelaLogin();
				dispose();
				telaLoginUsu.setExtendedState(JFrame.MAXIMIZED_BOTH);
				telaLoginUsu.setVisible(true);
			}
		});
		btnSair.setBackground(new Color(255, 255, 255));
		btnSair.setBounds(10, 15, 131, 30);
		contentPane.add(btnSair);

		JButton btnNewButton_1_1_1_1_1 = new JButton("Listar Carros");
		btnNewButton_1_1_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaCrudAdmCarros telaCrudCarros = new TelaCrudAdmCarros();
				dispose();
				telaCrudCarros.setExtendedState(JFrame.MAXIMIZED_BOTH);
				telaCrudCarros.setVisible(true);
			}
		});
		btnNewButton_1_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton_1_1_1_1_1.setBounds(745, 275, 233, 71);
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
		btnNewButton_1_1_1_2_1_1_2.setBounds(443, 275, 233, 71);
		contentPane.add(btnNewButton_1_1_1_2_1_1_2);

		JButton btnNewButton_1_1_1_1_1_1 = new JButton("Vender Carros");
		btnNewButton_1_1_1_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaCompraCarros telaCarrosComprador = new TelaCompraCarros();
				dispose();
				telaCarrosComprador.setExtendedState(JFrame.MAXIMIZED_BOTH);
				telaCarrosComprador.setVisible(true);
			}
		});
		btnNewButton_1_1_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton_1_1_1_1_1_1.setBounds(745, 371, 233, 71);
		contentPane.add(btnNewButton_1_1_1_1_1_1);

		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(TelaPrincipAdmin.class.getResource("/visao/logo bem transparente.png")));
		lblNewLabel_1.setBounds(195, 0, 1370, 749);
		contentPane.add(lblNewLabel_1);
	}
}
