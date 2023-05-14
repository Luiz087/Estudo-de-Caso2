package modelo;

import java.util.ArrayList;

public interface IUsuarioDAO {
	
	public boolean inserir(Usuario usuarioCad);
	
	public boolean alterar();
	
	public boolean excluir();
	
	public ArrayList<Usuario> listarUsuarios();

}
