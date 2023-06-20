package controle;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import modelo.Carro;

public class CarroDAO {

	private static CarroDAO instancia;
	private static ArrayList<Carro> listaCarro;

	public static CarroDAO getInstancia() {
		if (instancia == null) {
			instancia = new CarroDAO();
			listaCarro = new ArrayList<>();
		}

		return instancia;
	}

	private CarroDAO() {

	}

	public boolean inserir(Carro carroCad) {
		if (listaCarro != null) {
			listaCarro.add(carroCad);
			return true;
		}
		return false;
	}

	public boolean excluir(String textModelo, Integer textAno, String textCor, String textMarca, Double textPreco) {
		for (Carro carro : CarroDAO.listarCarros()) {
			if (carro.getModelo().equals(textModelo) && carro.getAno().equals(textAno) && carro.getCor().equals(textCor)
					&& carro.getMarca().equals(textMarca) && carro.getPreco().equals(textPreco)) {
				listaCarro.remove(carro);
				return true;
			}
		}
		return false;
	}

	public boolean alterar(String Modelo, String Marca, Integer ano, String cor, Double preco) {
		for (Carro carro : listaCarro) {
			if (carro.getModelo().equals(Modelo) && carro.getMarca().equals(Marca)) {
				carro.setAno(ano);
				carro.setCor(cor);
				carro.setPreco(preco);
				return true;
			}
		}
		return false;
	}

	public static ArrayList<Carro> listarCarros() {
		return listaCarro;
	}

}
