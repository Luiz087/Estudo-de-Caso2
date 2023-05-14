package modelo;

import java.util.ArrayList;

public interface IFuncionarioDAO {
	
	public boolean inserir(Funcionario funcionarioCad);
	
	public boolean alterar();
	
	public boolean excluir();
	
	public ArrayList<Funcionario> listarFuncionarios();

}
