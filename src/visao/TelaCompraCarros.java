package visao;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import controle.CarroDAO;
import controle.CarrovendidoDAO;
import modelo.Carro;

import java.awt.Color;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class TelaCompraCarros extends JFrame {

	private JPanel contentPane;
	private JTextField textModelo;
	private JTextField textAno;
	private JTextField textCor;
	private JTextField textMarca;
	private JTextField textPreco;
	private JTable table;
	private CarrovendidoDAO vendido;
	private CarroDAO carroDAO = CarroDAO.getInstancia();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCompraCarros frame = new TelaCompraCarros();
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
	public TelaCompraCarros() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1386, 1083);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(41, 124, 122));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(TelaCompraCarros.class.getResource("/visao/voltar (1).png")));
		lblNewLabel_1.setBounds(10, 9, 46, 32);
		contentPane.add(lblNewLabel_1);

		textModelo = new JTextField();
		textModelo.setEditable(false);
		textModelo.setBounds(583, 74, 203, 32);
		contentPane.add(textModelo);
		textModelo.setColumns(10);

		JLabel lblNewLabel_2 = new JLabel("Disponíveis para venda");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Segoe UI Black", Font.BOLD, 38));
		lblNewLabel_2.setBounds(445, 0, 479, 72);
		contentPane.add(lblNewLabel_2);

		textAno = new JTextField();
		textAno.setEditable(false);
		textAno.setColumns(10);
		textAno.setBounds(583, 115, 203, 32);
		contentPane.add(textAno);

		textCor = new JTextField();
		textCor.setEditable(false);
		textCor.setColumns(10);
		textCor.setBounds(583, 158, 203, 32);
		contentPane.add(textCor);

		textMarca = new JTextField();
		textMarca.setEditable(false);
		textMarca.setColumns(10);
		textMarca.setBounds(583, 201, 203, 32);
		contentPane.add(textMarca);

		JButton btnNewButton = new JButton("Vender");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel tblModel = (DefaultTableModel) table.getModel();
				if (table.getSelectedRowCount() == 1) {

					Carro carro1 = new Carro();

					int setar = table.getSelectedRow();

					textModelo.setText(table.getModel().getValueAt(setar, 0).toString());
					textAno.setText(table.getModel().getValueAt(setar, 1).toString());
					textCor.setText(table.getModel().getValueAt(setar, 2).toString());
					textMarca.setText(table.getModel().getValueAt(setar, 3).toString());
					textPreco.setText(table.getModel().getValueAt(setar, 4).toString());

					String modelo = textModelo.getText();
					String ano = textAno.getText();
					String cor = textCor.getText();
					String marca = textMarca.getText();
					String preco = textPreco.getText();

					carro1.setModelo(modelo);
					carro1.setAno(Integer.valueOf(ano));
					carro1.setCor(cor);
					carro1.setMarca(marca);
					carro1.setPreco(Double.valueOf(preco));

					if (vendido == null) {
						vendido = CarrovendidoDAO.getInstancia();
						vendido.inserir(carro1);
					} else {
						vendido.inserir(carro1);
					}
					carroDAO.excluir(modelo, Integer.valueOf(ano), cor, marca, Double.valueOf(preco));

					tblModel.removeRow(table.getSelectedRow());
					
					textModelo.setText("");
					textAno.setText("");
					textCor.setText("");
					textMarca.setText("");
					textPreco.setText("");

				} else {
					if (table.getRowCount() == 0) {
						JOptionPane.showMessageDialog(null, "Carro vendido com sucesso!");
					} else {
						JOptionPane.showMessageDialog(null, "Selecione apenas carro um para vender!");
					}
				}
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton.setBounds(607, 634, 155, 46);
		contentPane.add(btnNewButton);

		textPreco = new JTextField();
		textPreco.setEditable(false);
		textPreco.setColumns(10);
		textPreco.setBounds(583, 244, 203, 32);
		contentPane.add(textPreco);

		JLabel lblPreo = new JLabel("Preço:");
		lblPreo.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPreo.setForeground(Color.WHITE);
		lblPreo.setFont(new Font("Tahoma", Font.PLAIN, 26));
		lblPreo.setBounds(461, 246, 112, 32);
		contentPane.add(lblPreo);

		JLabel lblNewLabel = new JLabel("Modelo:");
		lblNewLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 26));
		lblNewLabel.setBounds(461, 74, 112, 32);
		contentPane.add(lblNewLabel);

		JLabel lblAno = new JLabel("Ano:");
		lblAno.setHorizontalAlignment(SwingConstants.RIGHT);
		lblAno.setForeground(Color.WHITE);
		lblAno.setFont(new Font("Tahoma", Font.PLAIN, 26));
		lblAno.setBounds(461, 117, 112, 32);
		contentPane.add(lblAno);

		JLabel lblCor = new JLabel("Cor:");
		lblCor.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCor.setForeground(Color.WHITE);
		lblCor.setFont(new Font("Tahoma", Font.PLAIN, 26));
		lblCor.setBounds(461, 160, 112, 32);
		contentPane.add(lblCor);

		JLabel lblMarca = new JLabel("Marca:");
		lblMarca.setHorizontalAlignment(SwingConstants.RIGHT);
		lblMarca.setForeground(Color.WHITE);
		lblMarca.setFont(new Font("Tahoma", Font.PLAIN, 26));
		lblMarca.setBounds(461, 203, 112, 32);
		contentPane.add(lblMarca);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(277, 309, 815, 274);
		contentPane.add(scrollPane);

		table = new JTable();
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int setar = table.getSelectedRow();
				textModelo.setText(table.getModel().getValueAt(setar, 0).toString());
				textAno.setText(table.getModel().getValueAt(setar, 1).toString());
				textCor.setText(table.getModel().getValueAt(setar, 2).toString());
				textMarca.setText(table.getModel().getValueAt(setar, 3).toString());
				textPreco.setText(table.getModel().getValueAt(setar, 4).toString());
			}
		});
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

		JButton btnNewButton_1 = new JButton("Voltar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaPrincipAdmin telaPrincipiAdm = new TelaPrincipAdmin();
				dispose();
				telaPrincipiAdm.setExtendedState(JFrame.MAXIMIZED_BOTH);
				telaPrincipiAdm.setVisible(true);
			}
		});
		btnNewButton_1.setBounds(10, 11, 131, 30);
		contentPane.add(btnNewButton_1);

		JButton btnVendidos = new JButton("Vendidos");
		btnVendidos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaListarComprasAdm telaComprados = new TelaListarComprasAdm();
				dispose();
				telaComprados.setExtendedState(JFrame.MAXIMIZED_BOTH);
				telaComprados.setVisible(true);
			}
		});
		btnVendidos.setBackground(new Color(255, 255, 255));
		btnVendidos.setBounds(1229, 15, 131, 30);
		contentPane.add(btnVendidos);
		carroDAO = CarroDAO.getInstancia();
	}
}
