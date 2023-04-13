package controle;

import java.util.ArrayList;

import modelo.Usuario;

public class UsuarioDAO {

	private static UsuarioDAO instancia;
	private static ArrayList<Usuario> listaUsuario;

	public static UsuarioDAO getInstancia() {

		if (instancia == null) {
			instancia = new UsuarioDAO();
			listaUsuario = new ArrayList<>();
		}

		return instancia;
	}

	private UsuarioDAO() {

	}

	public boolean inserir(Usuario usuarioCad) {
		if (listaUsuario != null) {
			listaUsuario.add(usuarioCad);
			return true;
		}
		return false;
	}

	public ArrayList<Usuario> listarUsuarios() {
		return listaUsuario;
	}

}
