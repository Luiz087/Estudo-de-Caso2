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

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ContainerAdapter;
import java.awt.event.ContainerEvent;

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
	private JTextField textModelo;
	private JButton btnNewButton;
	private CarroDAO carroDAO = CarroDAO.getInstancia();
	private JComboBox comboAno;

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
		setTitle("Lista de Carros");
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

		JLabel carroCad = new JLabel("Nenhum carro cadastrado!");
		carroCad.setFont(new Font("Tahoma", Font.BOLD, 18));
		carroCad.setForeground(new Color(255, 0, 0));
		carroCad.setBounds(564, 298, 242, 27);
		contentPane.add(carroCad);
		if(CarroDAO.listarCarros().isEmpty()) {
			carroCad.setVisible(true);
		} else {
			carroCad.setVisible(false);
		}
		
		table = new JTable();
		table.setModel(new DefaultTableModel(new Object[][] {},
				new String[] { "Modelo", "Ano", "Cor", "Marca", "Pre\u00E7o" }));
		scrollPane.setViewportView(table);
		if (carroDAO == null) {
			carroDAO = CarroDAO.getInstancia();
		}
		for (Carro qtdCarro : CarroDAO.listarCarros()) {
			DefaultTableModel tblModel = (DefaultTableModel) table.getModel();
			String ano = String.valueOf(qtdCarro.getAno());
			String preco = String.valueOf(qtdCarro.getPreco());

			String data[] = { qtdCarro.getModelo(), ano, qtdCarro.getCor(), qtdCarro.getMarca(), preco };
			tblModel.addRow(data);
		}


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
		
		JComboBox comboAno = new JComboBox();
		comboAno.setModel(new DefaultComboBoxModel(new String[] {"", "2023", "2022", "2021", "2020", "2019", "2018", "2017", "2016", "2015", "2014", "2013", "2012", "2011", "2010", "2009", "2008", "2007", "2006", "2005", "2004", "2003", "2002", "2001", "2000", "1999", "1998", "1997", "1996", "1995", "1994", "1993", "1992", "1991", "1990", "1989", "1988", "1987", "1986", "1985", "1984", "1983", "1982", "1981", "1980", "1979", "1978", "1977", "1976", "1975", "1974", "1973", "1972", "1971", "1970", "1969", "1968", "1967", "1966", "1965", "1964", "1963", "1962", "1961", "1960", "1959", "1958", "1957", "1956", "1955", "1954", "1953", "1952", "1951", "1950", "1949", "1948", "1947", "1946", "1945", "1944", "1943", "1942", "1941", "1940", "1939", "1938", "1937", "1936", "1935", "1934", "1933", "1932", "1931", "1930", "1929", "1928", "1927", "1926", "1925", "1924", "1923", "1922", "1921", "1920", "1919", "1918", "1917", "1916", "1915", "1914", "1913", "1912", "1911", "1910", "1909", "1908", "1907", "1906", "1905", "1904", "1903", "1902", "1901", "1900"}));
		comboAno.setBounds(600, 117, 203, 32);
		contentPane.add(comboAno);

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

		textModelo = new JTextField();
		textModelo.setColumns(10);
		textModelo.setBounds(600, 74, 203, 32);
		contentPane.add(textModelo);

		JButton btnDelete = new JButton("Remover");
		btnDelete.setIcon(new ImageIcon(TelaCrudAdmCarros.class.getResource("/visao/trash-10-xxl (1).png")));
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel tblModel = (DefaultTableModel) table.getModel();
				if(table.getSelectedRowCount()==1){
					int setar = table.getSelectedRow();
					String Modelo = table.getModel().getValueAt(setar, 0).toString();
					Integer Ano = Integer.valueOf(table.getModel().getValueAt(setar, 1).toString());
					String Cor = table.getModel().getValueAt(setar, 2).toString();
					String Marca = table.getModel().getValueAt(setar, 3).toString();
					Double Preco = Double.valueOf(table.getModel().getValueAt(setar, 4).toString());
					carroDAO.excluir(Modelo, Ano, Cor, Marca, Preco);
					tblModel.removeRow(table.getSelectedRow());
					
				} else {
					if(table.getRowCount()==0){
						JOptionPane.showMessageDialog(null, "Selecione um carro!");
					}else {
						JOptionPane.showMessageDialog(null, "Selecione apenas um para deletar!");
					}
				}
			}
		});
		btnDelete.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnDelete.setBounds(631, 336, 136, 46);
		contentPane.add(btnDelete);

		JButton btnAdd = new JButton("Adicionar");
		btnAdd.setIcon(new ImageIcon(TelaCrudAdmCarros.class.getResource("/visao/Green-Add-Button-PNG-HD1.png")));
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel tblModel = (DefaultTableModel) table.getModel();
				String anoc = (String) comboAno.getSelectedItem();
				if (textModelo.getText().equals("") || anoc.equals("") || textCor.getText().equals("")
						|| textMarca.getText().equals("") || textPreco.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "Insira todas as colunas!");
				} else {
					String data[] = { textModelo.getText(), anoc, textCor.getText(), textMarca.getText(),
							textPreco.getText() };
					tblModel.addRow(data);
					JOptionPane.showMessageDialog(null, "Carro adicionado com sucesso!");

					Integer ano = Integer.valueOf((String) comboAno.getSelectedItem());
					Double preco = Double.valueOf(textPreco.getText());
					Carro carro1 = new Carro();
					carro1.setCor(textCor.getText());
					carro1.setMarca(textMarca.getText());
					carro1.setModelo(textModelo.getText());
					carro1.setAno(ano);
					carro1.setPreco(preco);

					textModelo.setText("");
					comboAno.setSelectedItem("");
					textCor.setText("");
					textMarca.setText("");
					textPreco.setText("");
					carroCad.setVisible(false);
					
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
		btnAdd.setBounds(466, 336, 155, 46);
		contentPane.add(btnAdd);

		JButton btnUpdate = new JButton("Atualizar");
		btnUpdate.setIcon(
				new ImageIcon(TelaCrudAdmCarros.class.getResource("/visao/NicePng_refresh-icon-png_2047577 (1).png")));
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel tblModel = (DefaultTableModel) table.getModel();
				if (table.getSelectedRowCount() == 1) {
					Integer Ano = Integer.valueOf((String) comboAno.getSelectedItem());
					String Cor = textCor.getText();
					Double Preco = Double.valueOf(textPreco.getText());
					
					int setar = table.getSelectedRow();
					String Modelo = table.getModel().getValueAt(setar, 0).toString();
					String Marca = table.getModel().getValueAt(setar, 3).toString();
					
					tblModel.setValueAt(Ano, table.getSelectedRow(), 1);
					tblModel.setValueAt(Cor, table.getSelectedRow(), 2);
					tblModel.setValueAt(Preco, table.getSelectedRow(), 4);
					
					carroDAO.alterar(Modelo, Marca, Ano,Cor,Preco);
					
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
		btnUpdate.setBounds(777, 336, 136, 46);
		contentPane.add(btnUpdate);

		JLabel lblNewLabel_2 = new JLabel("Lista de Carros");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setFont(new Font("Segoe UI Black", Font.BOLD, 38));
		lblNewLabel_2.setBounds(445, 0, 479, 72);
		contentPane.add(lblNewLabel_2);

		btnNewButton = new JButton("Voltar");
		btnNewButton.setIcon(new ImageIcon(TelaCrudAdmCarros.class.getResource("/visao/voltar (1).png")));
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
		
		JButton btnVender = new JButton("Vender");
		btnVender.setIcon(new ImageIcon(TelaCrudAdmCarros.class.getResource("/visao/1585258 (1).png")));
		btnVender.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaCompraCarros telaCompraCarros = new TelaCompraCarros();
				dispose();
				telaCompraCarros.setExtendedState(JFrame.MAXIMIZED_BOTH);
				telaCompraCarros.setVisible(true);
			}
		});
		btnVender.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnVender.setBounds(1205, 21, 155, 46);
		
		
		
		
		contentPane.add(btnVender);
		
		

	}
}