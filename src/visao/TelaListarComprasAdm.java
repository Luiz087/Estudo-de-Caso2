package visao;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.SystemColor;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import controle.CarroDAO;
import controle.CarrovendidoDAO;
import modelo.Carro;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class TelaListarComprasAdm extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private CarrovendidoDAO vendidoDAO = CarrovendidoDAO.getInstancia();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaListarComprasAdm frame = new TelaListarComprasAdm();
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
	public TelaListarComprasAdm() {

		setTitle("Tela de Carros Comprados");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1386, 1034);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(41, 124, 122));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel carroCad = new JLabel("Nenhum carro cadastrado!");
		carroCad.setFont(new Font("Tahoma", Font.BOLD, 18));
		carroCad.setForeground(new Color(255, 0, 0));
		carroCad.setBounds(564, 65, 242, 27);
		contentPane.add(carroCad);
		if (vendidoDAO.listarCarros().isEmpty()) {
			carroCad.setVisible(true);
		} else {
			carroCad.setVisible(false);
		}

		JLabel lblNewLabel_2_5 = new JLabel("Lista de Comprados");
		lblNewLabel_2_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_5.setForeground(new Color(255, 255, 255));
		lblNewLabel_2_5.setFont(new Font("Segoe UI Black", Font.BOLD, 38));
		lblNewLabel_2_5.setBounds(445, 0, 479, 72);
		contentPane.add(lblNewLabel_2_5);

		JButton btnVoltarTelaLogin = new JButton("Voltar");
		btnVoltarTelaLogin.setIcon(new ImageIcon(TelaListarComprasAdm.class.getResource("/visao/voltar (1).png")));
		btnVoltarTelaLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaCompraCarros telaCompras = new TelaCompraCarros();
				dispose();
				telaCompras.setExtendedState(JFrame.MAXIMIZED_BOTH);
				telaCompras.setVisible(true);
			}
		});
		btnVoltarTelaLogin.setBackground(SystemColor.info);
		btnVoltarTelaLogin.setBounds(10, 15, 131, 30);
		contentPane.add(btnVoltarTelaLogin);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(245, 102, 880, 577);
		contentPane.add(scrollPane);

		table = new JTable();
		table.setModel(
				new DefaultTableModel(new Object[][] {}, new String[] { "Modelo", "Ano", "Cor", "Marca", "Pre\u00E7o" }

				));

		scrollPane.setViewportView(table);

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(TelaListarComprasAdm.class.getResource("/visao/vendido (1).png")));
		lblNewLabel.setBounds(1112, 251, 300, 313);
		contentPane.add(lblNewLabel);
		if (vendidoDAO == null) {
			vendidoDAO = CarrovendidoDAO.getInstancia();
		}
		for (Carro qtdCarro : vendidoDAO.listarCarros()) {
			DefaultTableModel tblModel = (DefaultTableModel) table.getModel();
			String ano = String.valueOf(qtdCarro.getAno());
			String preco = String.valueOf(qtdCarro.getPreco());

			String data[] = { qtdCarro.getModelo(), ano, qtdCarro.getCor(), qtdCarro.getMarca(), preco };
			tblModel.addRow(data);
		}
	}
}
