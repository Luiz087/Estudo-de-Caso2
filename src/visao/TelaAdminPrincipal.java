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

public class TelaAdminPrincipal extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaAdminPrincipal frame = new TelaAdminPrincipal();
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
	public TelaAdminPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1920, 1080);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton_1_1_1 = new JButton("Adicionar Funcionário");
		btnNewButton_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton_1_1_1.setBounds(230, 55, 233, 71);
		contentPane.add(btnNewButton_1_1_1);
		
		JLabel lblNewLabel = new JLabel("Funções de Administrador");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBackground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setBounds(241, 11, 217, 33);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton_1_1_1_1 = new JButton("Adicionar Funcionário");
		btnNewButton_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton_1_1_1_1.setBounds(590, 55, 233, 71);
		contentPane.add(btnNewButton_1_1_1_1);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 0, 160));
		panel.setBounds(0, 0, 1370, 749);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblFunesDeFuncionrio = new JLabel("Funções de Funcionário");
		lblFunesDeFuncionrio.setBounds(592, 5, 185, 22);
		panel.add(lblFunesDeFuncionrio);
		lblFunesDeFuncionrio.setForeground(new Color(255, 255, 255));
		lblFunesDeFuncionrio.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		JButton btnNewButton_1_1_1_2_1_1 = new JButton("Listar Funcionários");
		btnNewButton_1_1_1_2_1_1.setBounds(232, 164, 233, 71);
		panel.add(btnNewButton_1_1_1_2_1_1);
		btnNewButton_1_1_1_2_1_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
	}
}
