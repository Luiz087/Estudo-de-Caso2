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

import controle.CarroDAO;
import controle.CarrovendidoDAO;
import modelo.Carro;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class TelaCrudAdmCarros extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JLabel lblNewLabel;
	private JFormattedTextField textPreco;
	private JLabel lblPreo;
	private JLabel lblMarca;
	private JTextField textMarca;
	private JTextField textCor;
	private JLabel lblCor;
	private JLabel lblAno;
	private JTextField textAno;
	private JTextField textModelo;
	private JButton btnNewButton;
	private JLabel lblNewLabel_1;
	private CarrovendidoDAO vendido;
	private CarroDAO carroDAO;
	private JButton btnNewButton_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCrudAdmCarros frame = new TelaCrudAdmCarros();
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
	public TelaCrudAdmCarros() {
		ArrayList venderCarro = new ArrayList<>();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1408, 788);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(41, 124, 122));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(277, 408, 815, 274);
		contentPane.add(scrollPane);

		table = new JTable();
		table.setModel(new DefaultTableModel(new Object[][] {},
				new String[] { "Modelo", "Ano", "Cor", "Marca", "Pre\u00E7o" }));
		scrollPane.setViewportView(table);
		


		lblNewLabel = new JLabel("Modelo:");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 26));
		lblNewLabel.setBounds(478, 74, 112, 32);
		contentPane.add(lblNewLabel);

		MaskFormatter mascaraPreco = null;
		try {
			mascaraPreco = new MaskFormatter("######");
			mascaraPreco.setValidCharacters("0123456789");
		} catch (ParseException e) {
			e.printStackTrace();
		}
		textPreco = new JFormattedTextField(mascaraPreco);
		textPreco.setBounds(600, 246, 203, 32);
		contentPane.add(textPreco);
		textPreco.setColumns(10);

		lblPreo = new JLabel("Preço:");
		lblPreo.setForeground(new Color(255, 255, 255));
		lblPreo.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPreo.setFont(new Font("Tahoma", Font.PLAIN, 26));
		lblPreo.setBounds(478, 246, 112, 32);
		contentPane.add(lblPreo);

		lblMarca = new JLabel("Marca:");
		lblMarca.setForeground(new Color(255, 255, 255));
		lblMarca.setHorizontalAlignment(SwingConstants.RIGHT);
		lblMarca.setFont(new Font("Tahoma", Font.PLAIN, 26));
		lblMarca.setBounds(478, 203, 112, 32);
		contentPane.add(lblMarca);

		textMarca = new JTextField();
		textMarca.setColumns(10);
		textMarca.setBounds(600, 203, 203, 32);
		contentPane.add(textMarca);

		textCor = new JTextField();
		textCor.setColumns(10);
		textCor.setBounds(600, 160, 203, 32);
		contentPane.add(textCor);

		lblCor = new JLabel("Cor:");
		lblCor.setForeground(new Color(255, 255, 255));
		lblCor.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCor.setFont(new Font("Tahoma", Font.PLAIN, 26));
		lblCor.setBounds(478, 160, 112, 32);
		contentPane.add(lblCor);

		lblAno = new JLabel("Ano:");
		lblAno.setForeground(new Color(255, 255, 255));
		lblAno.setHorizontalAlignment(SwingConstants.RIGHT);
		lblAno.setFont(new Font("Tahoma", Font.PLAIN, 26));
		lblAno.setBounds(478, 117, 112, 32);
		contentPane.add(lblAno);

		MaskFormatter mascaraAno = null;
		try {
			mascaraAno = new MaskFormatter("####");
		} catch (ParseException e) {
			e.printStackTrace();
		}
		textAno = new JFormattedTextField(mascaraAno);
		textAno.setBounds(600, 117, 203, 32);
		contentPane.add(textAno);
		textAno.setColumns(10);

		textModelo = new JTextField();
		textModelo.setColumns(10);
		textModelo.setBounds(600, 74, 203, 32);
		contentPane.add(textModelo);

		JButton btnDelete = new JButton("Remover");
		btnDelete.setIcon(new ImageIcon(TelaCrudAdmCarros.class.getResource("/visao/trash-10-xxl (1).png")));
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel tblModel = (DefaultTableModel) table.getModel();
				if (table.getSelectedRowCount() == 1) {
					tblModel.removeRow(table.getSelectedRow());
					JOptionPane.showMessageDialog(null, "Carro removido com sucesso!");
					
				} else {
					if (table.getRowCount() == 0) {
						JOptionPane.showMessageDialog(null, "Nenhum carro selecionado!");
					} else {
						JOptionPane.showMessageDialog(null, "Selecione apenas um para deletar!");
					}
				}
			}
		});
		btnDelete.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnDelete.setBounds(553, 313, 136, 46);
		contentPane.add(btnDelete);

		JButton btnAdd = new JButton("Adicionar");
		btnAdd.setIcon(new ImageIcon(TelaCrudAdmCarros.class.getResource("/visao/Green-Add-Button-PNG-HD1.png")));
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				DefaultTableModel tblModel = (DefaultTableModel) table.getModel();
				if (textModelo.getText().equals("") || textAno.getText().equals("") || textCor.getText().equals("")
						|| textMarca.getText().equals("") || textPreco.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "Insira todas as colunas!");
				} else {
					String data[] = { textModelo.getText(), textAno.getText(), textCor.getText(), textMarca.getText(),
							textPreco.getText() };
					tblModel.addRow(data);
					JOptionPane.showMessageDialog(null, "Carro adicionado com sucesso!");

					Integer ano = Integer.valueOf(textAno.getText());
					Double preco = Double.valueOf(textPreco.getText());
					Carro carro1 = new Carro();
					carro1.setCor(textAno.getText());
					carro1.setMarca(textMarca.getText());
					carro1.setModelo(textModelo.getText());
					carro1.setAno(ano);
					carro1.setPreco(preco);

					textModelo.setText("");
					textAno.setText("");
					textCor.setText("");
					textMarca.setText("");
					textPreco.setText("");
					if (carroDAO == null) {
						carroDAO = CarroDAO.getInstancia();
						carroDAO.inserir(carro1);
					} else {
						carroDAO.inserir(carro1);
					}
				}

			}
		});
		btnAdd.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnAdd.setBounds(388, 313, 155, 46);
		contentPane.add(btnAdd);

		JButton btnUpdate = new JButton("Atualizar");
		btnUpdate.setIcon(
				new ImageIcon(TelaCrudAdmCarros.class.getResource("/visao/NicePng_refresh-icon-png_2047577 (1).png")));
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel tblModel = (DefaultTableModel) table.getModel();
				if (table.getSelectedRowCount() == 1) {
					String Modelo = textModelo.getText();
					String Ano = textAno.getText();
					String Cor = textCor.getText();
					String Marca = textMarca.getText();
					String Preco = textPreco.getText();

					tblModel.setValueAt(Modelo, table.getSelectedRow(), 0);
					tblModel.setValueAt(Ano, table.getSelectedRow(), 1);
					tblModel.setValueAt(Cor, table.getSelectedRow(), 2);
					tblModel.setValueAt(Marca, table.getSelectedRow(), 3);
					tblModel.setValueAt(Preco, table.getSelectedRow(), 4);

					JOptionPane.showMessageDialog(null, "Carro atualizado com sucesso!");

				} else {
					if (table.getRowCount() == 0) {
						JOptionPane.showMessageDialog(null, "Tabela imcompleta!");
					} else {
						JOptionPane.showMessageDialog(null, "Selecione um carro para atualizar!");
					}
				}
			}
		});
		btnUpdate.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnUpdate.setBounds(699, 313, 136, 46);
		contentPane.add(btnUpdate);

		JLabel lblNewLabel_2 = new JLabel("Lista de Carros");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setFont(new Font("Segoe UI Black", Font.BOLD, 38));
		lblNewLabel_2.setBounds(445, 0, 479, 72);
		contentPane.add(lblNewLabel_2);

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

		btnNewButton_1 = new JButton("");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel tblModel = (DefaultTableModel) table.getModel();

				if (carroDAO == null) {
					carroDAO = CarroDAO.getInstancia();
					for (Carro carro : carroDAO.listarCarros()) {
						String data[] = { carro.getModelo(), carro.getAno().toString(), carro.getCor(),
								carro.getMarca(), carro.getPreco().toString() };
						tblModel.addRow(data);
					}
				} else {

					if (carroDAO.listarCarros().isEmpty()) {
						JOptionPane.showMessageDialog(null, "Nenhum carro cadastrado!");
					} else {
						for (Carro carro : carroDAO.listarCarros()) {
							String data[] = { carro.getModelo(), carro.getAno().toString(), carro.getCor(),
									carro.getMarca(), carro.getPreco().toString() };
							tblModel.addRow(data);
						}
					}
				}
			}
		});
		btnNewButton_1.setIcon(
				new ImageIcon(TelaCrudAdmCarros.class.getResource("/visao/NicePng_refresh-icon-png_2047577 (1).png")));
		btnNewButton_1.setBounds(221, 411, 46, 46);
		contentPane.add(btnNewButton_1);

		lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(TelaCrudAdmCarros.class.getResource("/visao/logo bem transparente.png")));
		lblNewLabel_1.setBounds(183, 0, 1045, 749);
		contentPane.add(lblNewLabel_1);
		
		JButton btnVender = new JButton("Vender");
		btnVender.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaCompraCarros telaCompraCarros = new TelaCompraCarros();
				dispose();
				telaCompraCarros.setExtendedState(JFrame.MAXIMIZED_BOTH);
				telaCompraCarros.setVisible(true);
			}
		});
		btnVender.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnVender.setBounds(1246, 19, 136, 46);
		contentPane.add(btnVender);
	}
}