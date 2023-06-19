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
	
	public boolean alterar() {
		return false;
	}

	public static ArrayList<Carro> listarCarros() {
		return listaCarro;
	}
	
	

}
