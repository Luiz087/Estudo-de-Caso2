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
import javax.swing.JCheckBox;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class TelaCrudFuncCarros extends JFrame {

	private JPanel contentPane;
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
	private JLabel lblNewLabel_1;
	private JTable Table1;
	private JScrollPane scrollPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCrudFuncCarros frame = new TelaCrudFuncCarros();
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
	public TelaCrudFuncCarros() {
		setTitle("Lista de Carros");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1408, 788);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(41, 124, 122));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblNewLabel = new JLabel("Modelo:");
		lblNewLabel.setBounds(478, 74, 112, 32);
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 26));
		contentPane.add(lblNewLabel);
		
		textPreco = new JTextField();
		textPreco.setBounds(600, 246, 203, 32);
		textPreco.setColumns(10);
		contentPane.add(textPreco);
		
		lblPreo = new JLabel("Preço:");
		lblPreo.setBounds(478, 246, 112, 32);
		lblPreo.setForeground(new Color(255, 255, 255));
		lblPreo.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPreo.setFont(new Font("Tahoma", Font.PLAIN, 26));
		contentPane.add(lblPreo);
		
		lblMarca = new JLabel("Marca:");
		lblMarca.setBounds(478, 203, 112, 32);
		lblMarca.setForeground(new Color(255, 255, 255));
		lblMarca.setHorizontalAlignment(SwingConstants.RIGHT);
		lblMarca.setFont(new Font("Tahoma", Font.PLAIN, 26));
		contentPane.add(lblMarca);
		
		textMarca = new JTextField();
		textMarca.setBounds(600, 203, 203, 32);
		textMarca.setColumns(10);
		contentPane.add(textMarca);
		
		textCor = new JTextField();
		textCor.setBounds(600, 160, 203, 32);
		textCor.setColumns(10);
		contentPane.add(textCor);
		
		lblCor = new JLabel("Cor:");
		lblCor.setBounds(478, 160, 112, 32);
		lblCor.setForeground(new Color(255, 255, 255));
		lblCor.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCor.setFont(new Font("Tahoma", Font.PLAIN, 26));
		contentPane.add(lblCor);
		
		lblAno = new JLabel("Ano:");
		lblAno.setBounds(478, 117, 112, 32);
		lblAno.setForeground(new Color(255, 255, 255));
		lblAno.setHorizontalAlignment(SwingConstants.RIGHT);
		lblAno.setFont(new Font("Tahoma", Font.PLAIN, 26));
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
		textModelo.setBounds(600, 74, 203, 32);
		textModelo.setColumns(10);
		contentPane.add(textModelo);
		
		JButton btnDelete = new JButton("Remover");
		btnDelete.setBounds(618, 313, 136, 46);
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel tblModel = (DefaultTableModel) Table1.getModel();
				if(Table1.getSelectedRowCount()==1){
					tblModel.removeRow(Table1.getSelectedRow());
			}else {
				if(Table1.getRowCount()==0){
					JOptionPane.showMessageDialog(null, "Carro removido com sucesso!");
				}else {
					JOptionPane.showMessageDialog(null, "Selecione apenas um para deletar!");

				}
			}
		}
		});
		btnDelete.setFont(new Font("Tahoma", Font.PLAIN, 18));
		contentPane.add(btnDelete);
		
		JButton btnAdd = new JButton("Adicionar");
		btnAdd.setBounds(472, 313, 136, 46);
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textModelo.getText().equals("") || textCor.getText().equals("") || textMarca.getText().equals("") || textPreco.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "Insira todas as colunas!");
				} else {
					String data[] = {textModelo.getText(), textCor.getText(), textMarca.getText(), textPreco.getText()};
					DefaultTableModel tblModel = (DefaultTableModel)Table1.getModel();
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
		contentPane.add(btnAdd);
		
		JButton btnUpdate = new JButton("Atualizar");
		btnUpdate.setBounds(764, 313, 136, 46);
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel tblModel = (DefaultTableModel) Table1.getModel();
				if(Table1.getSelectedRowCount() == 1) {
					String Modelo = textModelo.getText();
					String Ano = textModelo.getText();
					String Cor = textModelo.getText();
					String Marca = textModelo.getText();
					String Preco = textModelo.getText();
				
					tblModel.setValueAt(Modelo, Table1.getSelectedRow(), 0);
					tblModel.setValueAt(Ano, Table1.getSelectedRow(), 1);
					tblModel.setValueAt(Cor, Table1.getSelectedRow(), 2);
					tblModel.setValueAt(Marca, Table1.getSelectedRow(), 3);
					tblModel.setValueAt(Preco, Table1.getSelectedRow(), 4);
					
					JOptionPane.showMessageDialog(null, "Carro atualizado com sucesso!");

				} else {
					if(Table1.getRowCount()== 0) {
						JOptionPane.showMessageDialog(null, "Tabela imcompleta!");
					}else {
						JOptionPane.showMessageDialog(null, "Selecione um carro para atualizar!");
					}
				}
			}
		});
		btnUpdate.setFont(new Font("Tahoma", Font.PLAIN, 18));
		contentPane.add(btnUpdate);
		
		JLabel lblNewLabel_2 = new JLabel("Lista de Carros");
		lblNewLabel_2.setBounds(445, 0, 479, 72);
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setFont(new Font("Segoe UI Black", Font.BOLD, 38));
		contentPane.add(lblNewLabel_2);
		
		lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				DefaultTableModel tblModel = (DefaultTableModel)Table1.getModel();
				String tblModelo = tblModel.getValueAt(Table1.getSelectedRow(), 0).toString();
				String tblCor = tblModel.getValueAt(Table1.getSelectedRow(), 1).toString();
				String tblMarca = tblModel.getValueAt(Table1.getSelectedRow(), 2).toString();
				String tblPreco = tblModel.getValueAt(Table1.getSelectedRow(), 3).toString();
				
				textModelo.setText(tblModelo);
				textCor.setText(tblCor);
				textMarca.setText(tblMarca);
				textPreco.setText(tblPreco);
			}
		});
		lblNewLabel_1.setBounds(183, 0, 1177, 777);
		lblNewLabel_1.setIcon(new ImageIcon(TelaCrudFuncCarros.class.getResource("/visao/Design sem nome (3).png")));
		contentPane.add(lblNewLabel_1);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(391, 394, 558, 310);
		contentPane.add(scrollPane);
		
		Table1 = new JTable();
		scrollPane.setViewportView(Table1);
		Table1.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Modelo", "Cor", "Marca", "Preco"
			}
		));
	}
}
