package controle;

import java.util.ArrayList;

import modelo.Carro;


public class CarrovendidoDAO {
	
	private static CarrovendidoDAO instancia;
	private static ArrayList<Carro> listaCarroVendido;

	public static CarrovendidoDAO getInstancia() {

		if (instancia == null) {
			instancia = new CarrovendidoDAO();
			listaCarroVendido = new ArrayList<>();
		}

		return instancia;
	}

	private CarrovendidoDAO() {

	}

	public boolean inserir(Carro carroVend) {
		if (carroVend != null) {
			listaCarroVendido.add(carroVend);
			return true;
		}
		return false;
	}
	
	public boolean excluir() {
		return false;
	}

	public ArrayList<Carro> listarCarros() {
		return listaCarroVendido;
	}

}
