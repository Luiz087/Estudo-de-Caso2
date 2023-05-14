package modelo;

public class Funcionario extends Pessoa {

	private String usuarioFuncionario;
	private String senhaFuncionario;

	public String getUsuarioFuncionario() {
		return usuarioFuncionario;
	}

	public void setUsuarioFuncionario(String usuarioFuncionario) {
		this.usuarioFuncionario = usuarioFuncionario;
	}

	public String getSenhaFuncionario() {
		return senhaFuncionario;
	}

	public void setSenhaFuncionario(String senhaFuncionario) {
		this.senhaFuncionario = senhaFuncionario;
	}

	public String toString() {
		return "\nNome: " + super.getNome() + "\nCPF: " + super.getCpf() + "\nUsuario: " + this.usuarioFuncionario + "\n";
	}
}
