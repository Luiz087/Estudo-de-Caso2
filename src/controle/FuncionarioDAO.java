package controle;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import modelo.Funcionario;

public class FuncionarioDAO {

	private static FuncionarioDAO instancia;
	private static ArrayList<Funcionario> listaFuncionario;

	public static FuncionarioDAO getInstancia() {

		if (instancia == null) {
			instancia = new FuncionarioDAO();
			listaFuncionario = new ArrayList<>();
		}

		return instancia;
	}

	private FuncionarioDAO() {

	}

	public Funcionario efetuarLogin(String login, String senha) {
		Funcionario fun = null;

		for (Funcionario funcionario : listaFuncionario) {
			if (funcionario.getUsuarioFuncionario().equals(login) && funcionario.getSenhaFuncionario().equals(senha)) {
				fun = funcionario;
				return fun; // existe
			}
		}

		// digitou errado ou nao existe
		return fun;
	}

	public boolean inserir(Funcionario funcionarioCad) {
		if (listaFuncionario != null) {
			listaFuncionario.add(funcionarioCad);
			return true;
		}
		return false;
	}

	public boolean excluir(String usuario) {
		for (Funcionario funcionario : listaFuncionario) {
			if (funcionario.getUsuarioFuncionario().equals(usuario)) {
				listaFuncionario.remove(funcionario);
				return true;
			}
		}
		return false;
	}

	public boolean alterar(String nome, String usuario, Long cpf) {
		for (Funcionario funcionario : listaFuncionario) {
			if (funcionario.getCpf().equals(cpf)) {
				funcionario.setNome(nome);
				funcionario.setUsuarioFuncionario(usuario);
				JOptionPane.showMessageDialog(null, "Funcionário atualizado!");
				return true;
			}
		}
		return false;
	}

	public ArrayList<Funcionario> listarFuncionarios() {
		return listaFuncionario;
	}


}
