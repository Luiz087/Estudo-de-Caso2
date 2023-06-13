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
	private JTextField textSenha;
	private JTextField textCPF;
	private JLabel lblCor;
	private JLabel lblAno;
	private JTextField textUser;
	private JTextField textNome;
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
		table.setModel(new DefaultTableModel(new Object[][] {},
				new String[] { "Nome", "Usu\u00E1rio", "CPF", "Senha"}));
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

		textSenha = new JTextField();
		textSenha.setColumns(10);
		textSenha.setBounds(600, 203, 203, 32);
		contentPane.add(textSenha);

		MaskFormatter mascaraCpf = null;
		try {
			mascaraCpf = new MaskFormatter("###.###.###-##");
		} catch (ParseException e) {
			e.printStackTrace();
		}
		textCPF = new JFormattedTextField(mascaraCpf);
		textCPF.setBounds(600, 160, 203, 32);
		contentPane.add(textCPF);
		textCPF.setColumns(10);

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

		textUser = new JTextField();
		textUser.setColumns(10);
		textUser.setBounds(600, 117, 203, 32);
		contentPane.add(textUser);

		textNome = new JTextField();
		textNome.setColumns(10);
		textNome.setBounds(600, 74, 203, 32);
		contentPane.add(textNome);

		JButton btnDelete = new JButton("Remover");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel tblModel = (DefaultTableModel) table.getModel();
				if (table.getSelectedRowCount() == 1) {
					tblModel.removeRow(table.getSelectedRow());
				} else {
					if (table.getRowCount() == 0) {
						JOptionPane.showMessageDialog(null, "Funcionario removido com sucesso!");
					} else {
						JOptionPane.showMessageDialog(null, "Selecione apenas um para deletar!");

					}
				}
			}
		});
		btnDelete.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnDelete.setBounds(617, 289, 136, 46);
		contentPane.add(btnDelete);

		JButton btnADD = new JButton("Adicionar");
		btnADD.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (textNome.getText().equals("") || textUser.getText().equals("") || textCPF.getText().equals("")
						|| textSenha.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "Insira todas as colunas!");
				} else {
					String data[] = { textNome.getText(), textUser.getText(), textCPF.getText(), textSenha.getText() };
					DefaultTableModel tblModel = (DefaultTableModel) table.getModel();
					tblModel.addRow(data);
					JOptionPane.showMessageDialog(null, "Funcionário adicionado com sucesso!");

					textNome.setText("");
					textUser.setText("");
					textCPF.setText("");
					textSenha.setText("");
				}
			}
		});
		btnADD.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnADD.setBounds(471, 289, 136, 46);
		contentPane.add(btnADD);

		JButton btnUpdate = new JButton("Atualizar");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel tblModel = (DefaultTableModel) table.getModel();
				if (table.getSelectedRowCount() == 1) {
					String Nome = textNome.getText();
					String Usuario = textUser.getText();
					String CPF = textCPF.getText();
					String Senha = textSenha.getText();

					tblModel.setValueAt(Nome, table.getSelectedRow(), 0);
					tblModel.setValueAt(Usuario, table.getSelectedRow(), 1);
					tblModel.setValueAt(CPF, table.getSelectedRow(), 2);
					tblModel.setValueAt(Senha, table.getSelectedRow(), 3);

					JOptionPane.showMessageDialog(null, "Funcionario atualizado com sucesso!");

				} else {
					if (table.getRowCount() == 0) {
						JOptionPane.showMessageDialog(null, "Tabela incompleta!");
					} else {
						JOptionPane.showMessageDialog(null, "Selecione um carro para atualizar!");
					}
				}
			}
		});
		btnUpdate.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnUpdate.setBounds(763, 289, 136, 46);
		contentPane.add(btnUpdate);

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
		lblNewLabel_2.setIcon(new ImageIcon(TelaCrudAdminFunc.class.getResource("/visao/logo bem transparente.png")));
		lblNewLabel_2.setBounds(178, 0, 1011, 749);
		contentPane.add(lblNewLabel_2);
	}
}