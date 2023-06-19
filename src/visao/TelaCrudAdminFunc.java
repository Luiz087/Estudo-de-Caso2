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

import controle.FuncionarioDAO;
import modelo.Funcionario;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.JPasswordField;

public class TelaCrudAdminFunc extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JLabel lblMarca;
	private JTextField textCPF;
	private JLabel lblCor;
	private JLabel lblAno;
	private JTextField textUser;
	private JTextField textNome;
	private JTable table;
	private JLabel lblNewLabel_1;
	private JButton btnNewButton;
	private JPasswordField textSenha;
	private FuncionarioDAO funcDAO;

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
				new String[] { "Nome", "Usu\u00E1rio"}));
		scrollPane.setViewportView(table);
		funcDAO = FuncionarioDAO.getInstancia();
		if(funcDAO.listarFuncionarios().isEmpty()) {
			table.setModel(new DefaultTableModel(new Object[][] {},
					new String[] { "Nome", "Usu\u00E1rio"}));
		} else {
			for (Funcionario func : funcDAO.listarFuncionarios()) {
				DefaultTableModel tblModel = (DefaultTableModel) table.getModel();
				String nome = String.valueOf(func.getNome());
				String usuario = String.valueOf(func.getUsuarioFuncionario());

				String data[] = { nome, usuario };
				tblModel.addRow(data);
			}
		}

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

		MaskFormatter mascaraCpf = null;
		try {
			mascaraCpf = new MaskFormatter("###########");
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
		btnDelete.setIcon(new ImageIcon(TelaCrudAdminFunc.class.getResource("/visao/trash-10-xxl (1).png")));
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel tblModel = (DefaultTableModel) table.getModel();
				if (table.getSelectedRowCount() == 1) {
					int setar = table.getSelectedRow();
					Funcionario func = new Funcionario();
					Long cpfFunc = (Long.valueOf((table.getModel().getValueAt(setar, 1).toString())));
					funcDAO.excluir(cpfFunc);
					
					tblModel.removeRow(table.getSelectedRow());
					JOptionPane.showMessageDialog(null, "Funcionario removido com sucesso!");
				} else {
					if (table.getRowCount() == 0) {
						JOptionPane.showMessageDialog(null, "Selecione um funcionário!");
					} else {
						JOptionPane.showMessageDialog(null, "Selecione apenas um para deletar!");
					}
				}
			}
		});
		btnDelete.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnDelete.setBounds(617, 288, 161, 46);
		contentPane.add(btnDelete);

		JButton btnADD = new JButton("Adicionar");
		btnADD.setIcon(new ImageIcon(TelaCrudAdminFunc.class.getResource("/visao/Green-Add-Button-PNG-HD1.png")));
		btnADD.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Funcionario func1 = new Funcionario();
				
				char[] usuarioSenha = textSenha.getPassword();
				String strSenha = "";
				if (usuarioSenha != null && usuarioSenha.length > 0) {
					strSenha = String.valueOf(usuarioSenha);
				}
				
				if (textNome.getText().equals("") || textUser.getText().equals("") || textCPF.getText().equals("")
						|| strSenha.equals("")) {
					JOptionPane.showMessageDialog(null, "Insira todas as colunas!");
				} else {
					String data[] = { textNome.getText(), textUser.getText() };
					DefaultTableModel tblModel = (DefaultTableModel) table.getModel();
					tblModel.addRow(data);
					JOptionPane.showMessageDialog(null, "Funcionário adicionado com sucesso!");

					func1.setNome(textNome.getText());
					func1.setSenhaFuncionario(strSenha);
					func1.setCpf(Long.valueOf(textCPF.getText()));
					func1.setUsuarioFuncionario(textUser.getText());
					
					funcDAO = FuncionarioDAO.getInstancia();
					funcDAO.inserir(func1);
					
					textNome.setText("");
					textUser.setText("");
					textCPF.setText("");
					textSenha.setText("");
					
					
				}
			}
		});
		btnADD.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnADD.setBounds(461, 288, 146, 46);
		contentPane.add(btnADD);

		JButton btnUpdate = new JButton("Atualizar");
		btnUpdate.setIcon(new ImageIcon(TelaCrudAdminFunc.class.getResource("/visao/NicePng_refresh-icon-png_2047577 (1).png")));
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel tblModel = (DefaultTableModel) table.getModel();
				if (table.getSelectedRowCount() == 1) {
					String Nome = textNome.getText();
					String Usuario = textUser.getText();
					String CPF = textCPF.getText();
					char[] funcSenha = textSenha.getPassword();
					String strSenha = "";
					if (funcSenha != null && funcSenha.length > 0) {
						strSenha = String.valueOf(funcSenha);
					}

					tblModel.setValueAt(Nome, table.getSelectedRow(), 0);
					tblModel.setValueAt(Usuario, table.getSelectedRow(), 1);
					tblModel.setValueAt(CPF, table.getSelectedRow(), 2);
					tblModel.setValueAt(strSenha, table.getSelectedRow(), 3);

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
		btnUpdate.setBounds(788, 288, 136, 46);
		contentPane.add(btnUpdate);

		lblNewLabel_1 = new JLabel("Lista de Funcionários");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Segoe UI Black", Font.BOLD, 38));
		lblNewLabel_1.setBounds(445, 0, 479, 72);
		contentPane.add(lblNewLabel_1);

		btnNewButton = new JButton("Voltar");
		btnNewButton.setIcon(new ImageIcon(TelaCrudAdminFunc.class.getResource("/visao/voltar (1).png")));
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
		
		textSenha = new JPasswordField();
		textSenha.setBounds(600, 209, 203, 32);
		contentPane.add(textSenha);
	}
}