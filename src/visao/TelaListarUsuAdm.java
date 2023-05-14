package visao;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
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

public class TelaListarUsuAdm extends JFrame {

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaListarUsuAdm frame = new TelaListarUsuAdm();
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
	public TelaListarUsuAdm() {
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
				TelaPrincipAdmin telaPrincipiAdm = new TelaPrincipAdmin();
				dispose();
				telaPrincipiAdm.setExtendedState(JFrame.MAXIMIZED_BOTH);
				telaPrincipiAdm.setVisible(true);
			}
		});
		btnVoltarTelaLogin.setBackground(SystemColor.info);
		btnVoltarTelaLogin.setBounds(10, 15, 131, 30);
		contentPane.add(btnVoltarTelaLogin);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(245, 71, 880, 500);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Usu\u00E1rio", "Nome", "CEP", "CPF", "Telefone"
			}
		));
		
		scrollPane.setViewportView(table);
		
		JButton btnNewButton_1_1 = new JButton("Remover Usuário");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Usuário removido!");
			}
		});
		btnNewButton_1_1.setFont(new Font("Tahoma", Font.PLAIN, 26));
		btnNewButton_1_1.setBounds(560, 632, 250, 46);
		contentPane.add(btnNewButton_1_1);
	}
}
