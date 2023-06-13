package visao;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.MaskFormatter;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class TelaCrudAdminFunc extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JLabel lblMarca;
	private JTextField textField_1;
	private JTextField textField_2;
	private JLabel lblCor;
	private JLabel lblAno;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTable table;
	private JLabel lblNewLabel_1;
	private JButton btnNewButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCrudAdminFunc frame = new TelaCrudAdminFunc();
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
	public TelaCrudAdminFunc() {
		setTitle("Lista Admin");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1408, 788);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(41, 124, 122));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(277, 368, 815, 315);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Nome", "Usu\u00E1rio", "CPF", "Senha", "Telefone"
			}
		));
		scrollPane.setViewportView(table);
		
		lblNewLabel = new JLabel("Nome:");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 26));
		lblNewLabel.setBounds(420, 74, 170, 32);
		contentPane.add(lblNewLabel);
		
		MaskFormatter mascaraTel = null;
		 try {
		      mascaraTel = new MaskFormatter("(##)#####-####");
		 } catch (ParseException e) {
		      e.printStackTrace();
		 }
		
		lblMarca = new JLabel("Senha:");
		lblMarca.setForeground(new Color(255, 255, 255));
		lblMarca.setHorizontalAlignment(SwingConstants.RIGHT);
		lblMarca.setFont(new Font("Tahoma", Font.PLAIN, 26));
		lblMarca.setBounds(420, 203, 170, 32);
		contentPane.add(lblMarca);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(600, 203, 203, 32);
		contentPane.add(textField_1);
		
		MaskFormatter mascaraCpf = null;
		try {
			mascaraCpf = new MaskFormatter("###.###.###-##");
		} catch(ParseException e) {
			e.printStackTrace();
		}
		textField_2 = new JFormattedTextField(mascaraCpf);
		textField_2.setBounds(600, 160, 203, 32);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		lblCor = new JLabel("CPF:");
		lblCor.setForeground(new Color(255, 255, 255));
		lblCor.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCor.setFont(new Font("Tahoma", Font.PLAIN, 26));
		lblCor.setBounds(420, 160, 170, 32);
		contentPane.add(lblCor);
		
		lblAno = new JLabel("Usuário:");
		lblAno.setForeground(new Color(255, 255, 255));
		lblAno.setHorizontalAlignment(SwingConstants.RIGHT);
		lblAno.setFont(new Font("Tahoma", Font.PLAIN, 26));
		lblAno.setBounds(420, 117, 170, 32);
		contentPane.add(lblAno);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(600, 117, 203, 32);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(600, 74, 203, 32);
		contentPane.add(textField_4);
		
		JButton btnNewButton_1 = new JButton("Remover");
		btnNewButton_1.setIcon(new ImageIcon(TelaCrudAdminFunc.class.getResource("/visao/trash-10-xxl (1).png")));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Funcionário removido com sucesso!");
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton_1.setBounds(617, 289, 136, 46);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("Adicionar");
		btnNewButton_1_1.setIcon(new ImageIcon(TelaCrudAdminFunc.class.getResource("/visao/Green-Add-Button-PNG-HD1.png")));
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Funcionário adicionado com sucesso!");
			}
		});
		btnNewButton_1_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton_1_1.setBounds(457, 289, 150, 46);
		contentPane.add(btnNewButton_1_1);
		
		JButton btnNewButton_1_2 = new JButton("Atualizar");
		btnNewButton_1_2.setIcon(new ImageIcon(TelaCrudAdminFunc.class.getResource("/visao/NicePng_refresh-icon-png_2047577 (1).png")));
		btnNewButton_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Funcionário atualizado com sucesso!");
			}
		});
		btnNewButton_1_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton_1_2.setBounds(763, 289, 136, 46);
		contentPane.add(btnNewButton_1_2);
		
		lblNewLabel_1 = new JLabel("Lista de Funcionários");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Segoe UI Black", Font.BOLD, 38));
		lblNewLabel_1.setBounds(445, 0, 479, 72);
		contentPane.add(lblNewLabel_1);
		
		btnNewButton = new JButton("Voltar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaPrincipAdmin telaPrincipiAdm = new TelaPrincipAdmin();
				dispose();
				telaPrincipiAdm.setExtendedState(JFrame.MAXIMIZED_BOTH);
				telaPrincipiAdm.setVisible(true);
			}
		});
		btnNewButton.setBounds(10, 15, 131, 30);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(TelaCrudAdminFunc.class.getResource("/visao/Design sem nome (3).png")));
		lblNewLabel_2.setBounds(178, 0, 1011, 749);
		contentPane.add(lblNewLabel_2);
	}
}
