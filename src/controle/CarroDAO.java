package controle;

import java.util.ArrayList;

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
			if (textModelo == carro.getModelo() && textAno == carro.getAno() && textCor == carro.getCor() && textMarca == carro.getMarca() && textPreco == carro.getPreco()) {
				listaCarro.remove(carro);
				return true;
			}
		}
		return false;
	}
	
	public boolean alterar(String modelo1, Integer ano1, String cor1, String marca1, Double preco1) {
		for (Carro carro : CarroDAO.listarCarros()) {
			if (modelo1 == carro.getModelo() && ano1 == carro.getAno() && cor1 == carro.getCor() && marca1 == carro.getMarca() && preco1 == carro.getPreco()) {
				carro.setAno(ano1);
				carro.setCor(cor1);
				carro.setMarca(marca1);
				carro.setModelo(modelo1);
				carro.setPreco(preco1);
				return true;
			}
		}
		return false;
	}

	public static ArrayList<Carro> listarCarros() {
		return listaCarro;
	}
	
	

}
