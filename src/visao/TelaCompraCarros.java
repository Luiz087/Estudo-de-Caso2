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

public class TelaCompraCarros extends JFrame {

	private JPanel contentPane;
	private JTextField textModelo;
	private JTextField textAno;
	private JTextField textCor;
	private JTextField textMarca;
	private JTextField textPreco;
	private JTable table;
	private CarrovendidoDAO vendido;
	private CarroDAO qtdCarro;

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
		table.setModel(new DefaultTableModel(new Object[][] {},
				new String[] { "Modelo", "Ano", "Cor", "Marca", "Pre\u00E7o" }));
		scrollPane.setViewportView(table);
		
		JButton btnNewButton_1 = new JButton("Voltar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setBounds(10, 11, 131, 30);
		contentPane.add(btnNewButton_1);
		
		JButton btnVendidos = new JButton("Vendidos");
		btnVendidos.setBackground(new Color(0, 255, 0));
		btnVendidos.setBounds(1229, 15, 131, 30);
		contentPane.add(btnVendidos);
		
		JButton btnNewButton_2 = new JButton("");
		qtdCarro = CarroDAO.getInstancia();
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel tblModel = (DefaultTableModel) table.getModel();
				for (Carro carro : qtdCarro.listarCarros()) {
					String ano = String.valueOf(carro.getAno());
					String preco = String.valueOf(carro.getPreco());
					
					String data[] = {carro.getModelo(), ano, carro.getCor(), carro.getMarca(), preco};
					tblModel.addRow(data);
				}
			}
		});
		btnNewButton_2.setIcon(new ImageIcon(TelaCompraCarros.class.getResource("/visao/NicePng_refresh-icon-png_2047577 (1).png")));
		btnNewButton_2.setBounds(221, 310, 46, 46);
		contentPane.add(btnNewButton_2);
	}
}
