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
import javax.swing.ImageIcon;

public class TelaListarComprasAdm extends JFrame {

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaListarComprasAdm frame = new TelaListarComprasAdm();
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
	public TelaListarComprasAdm() {
		setTitle("Tela de Listagem de Funcionários");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1386, 1034);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 160));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_2_5 = new JLabel("Lista de Comprados");
		lblNewLabel_2_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_5.setForeground(new Color(255, 255, 255));
		lblNewLabel_2_5.setFont(new Font("Segoe UI Black", Font.BOLD, 38));
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
		scrollPane.setBounds(245, 72, 880, 577);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Modelo", "Ano", "Cor", "Marca", "Pre\u00E7o"
			}
		));
		
		scrollPane.setViewportView(table);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(TelaListarComprasAdm.class.getResource("/visao/Design sem nome (3).png")));
		lblNewLabel.setBounds(187, 0, 1079, 749);
		contentPane.add(lblNewLabel);
	}
}
