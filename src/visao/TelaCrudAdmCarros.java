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

public class TelaCrudAdmCarros extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JLabel lblNewLabel;
	private JTextField textPreco;
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
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Modelo", "Ano", "Cor", "Marca", "Pre\u00E7o"
			}
		));
		scrollPane.setViewportView(table);
		
		lblNewLabel = new JLabel("Modelo:");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 26));
		lblNewLabel.setBounds(478, 74, 112, 32);
		contentPane.add(lblNewLabel);
		
		textPreco = new JTextField();
		textPreco.setColumns(10);
		textPreco.setBounds(600, 246, 203, 32);
		contentPane.add(textPreco);
		
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
		      mascaraAno = new MaskFormatter("#### / ####");
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
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel tblModel = (DefaultTableModel) table.getModel();
				if(table.getSelectedRowCount()==1){
					tblModel.removeRow(table.getSelectedRow());
			}else {
				if(table.getRowCount()==0){
					JOptionPane.showMessageDialog(null, "Carro removido com sucesso!");
				}else {
					JOptionPane.showMessageDialog(null, "Selecione apenas um para deletar!");

				}
			}
		}
		});
		btnDelete.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnDelete.setBounds(618, 313, 136, 46);
		contentPane.add(btnDelete);
		
		JButton btnAdd = new JButton("Adicionar");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textModelo.getText().equals("") ||  textAno.getText().equals("") || textCor.getText().equals("") || textMarca.getText().equals("") || textPreco.getText().equals("") ) {
					JOptionPane.showMessageDialog(null, "Insira todas as colunas!");
				} else {
					String data[] = {textModelo.getText(), textAno.getText(), textCor.getText(), textMarca.getText(), textPreco.getText()};
					DefaultTableModel tblModel = (DefaultTableModel)table.getModel();
					tblModel.addRow(data);
					JOptionPane.showMessageDialog(null, "Carro adicionado com sucesso!");
					
					textModelo.setText("");	
					textAno.setText("");	
					textCor.setText("");	
					textMarca.setText("");	
					textPreco.setText("");	
				}				
			}
		});
		btnAdd.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnAdd.setBounds(472, 313, 136, 46);
		contentPane.add(btnAdd);
		
		JButton btnUpdate = new JButton("Atualizar");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel tblModel = (DefaultTableModel) table.getModel();
				if(table.getSelectedRowCount() == 1) {
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
					if(table.getRowCount()== 0) {
						JOptionPane.showMessageDialog(null, "Tabela imcompleta!");
					}else {
						JOptionPane.showMessageDialog(null, "Selecione um carro para atualizar!");
					}
				}
			}
		});
		btnUpdate.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnUpdate.setBounds(764, 313, 136, 46);
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
		
		lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(TelaCrudAdmCarros.class.getResource("/visao/Design sem nome (3).png")));
		lblNewLabel_1.setBounds(183, 0, 1045, 749);
		contentPane.add(lblNewLabel_1);
	}
}
