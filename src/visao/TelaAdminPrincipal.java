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
		btnNewButton_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton_1_1_1.setBounds(230, 55, 233, 71);
		contentPane.add(btnNewButton_1_1_1);
		
		JLabel lblNewLabel = new JLabel("Funções de Administrador");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setBounds(241, 11, 217, 33);
		contentPane.add(lblNewLabel);
		
		JLabel lblFunesDeFuncionrio = new JLabel("Funções de Funcionário");
		lblFunesDeFuncionrio.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblFunesDeFuncionrio.setBounds(601, 11, 217, 33);
		contentPane.add(lblFunesDeFuncionrio);
		
		JButton btnNewButton_1_1_1_1 = new JButton("Adicionar Funcionário");
		btnNewButton_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton_1_1_1_1.setBounds(590, 55, 233, 71);
		contentPane.add(btnNewButton_1_1_1_1);
		
		JButton btnNewButton_1_1_1_2 = new JButton("Remover Funcionário");
		btnNewButton_1_1_1_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton_1_1_1_2.setBounds(230, 156, 233, 71);
		contentPane.add(btnNewButton_1_1_1_2);
		
		JButton btnNewButton_1_1_1_2_1 = new JButton("Alterar Funcionário");
		btnNewButton_1_1_1_2_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton_1_1_1_2_1.setBounds(230, 264, 233, 71);
		contentPane.add(btnNewButton_1_1_1_2_1);
		
		JButton btnNewButton_1_1_1_2_1_1 = new JButton("Listar Funcionários");
		btnNewButton_1_1_1_2_1_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton_1_1_1_2_1_1.setBounds(230, 375, 233, 71);
		contentPane.add(btnNewButton_1_1_1_2_1_1);
	}
}
