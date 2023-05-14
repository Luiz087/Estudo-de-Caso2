package modelo;

import java.util.ArrayList;

public interface ICarroDAO {
	
	public boolean inserir(Carro carroCad);
	
	public boolean alterar();
	
	public boolean excluir();
	
	public ArrayList<Carro> listarCarros();

}
