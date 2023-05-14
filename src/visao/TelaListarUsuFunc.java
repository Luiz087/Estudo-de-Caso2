package visao;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.SystemColor;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaListarUsuFunc extends JFrame {

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaListarUsuFunc frame = new TelaListarUsuFunc();
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
	public TelaListarUsuFunc() {
		setTitle("Tela de Listagem de Funcionários");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1386, 1034);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_2_5 = new JLabel("Lista de Usuários");
		lblNewLabel_2_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_5.setForeground(Color.RED);
		lblNewLabel_2_5.setFont(new Font("Tahoma", Font.BOLD, 38));
		lblNewLabel_2_5.setBounds(445, 0, 479, 72);
		contentPane.add(lblNewLabel_2_5);
		
		JButton btnVoltarTelaLogin = new JButton("Voltar");
		btnVoltarTelaLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaPrincipFunc telaPrincipiFunc = new TelaPrincipFunc();
				dispose();
				telaPrincipiFunc.setExtendedState(JFrame.MAXIMIZED_BOTH);
				telaPrincipiFunc.setVisible(true);
			}
		});
		btnVoltarTelaLogin.setBackground(SystemColor.info);
		btnVoltarTelaLogin.setBounds(10, 15, 131, 30);
		contentPane.add(btnVoltarTelaLogin);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(245, 72, 880, 598);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Usu\u00E1rio", "Nome", "CEP", "Telefone"
			}
		));
		
		scrollPane.setViewportView(table);
	}
}
