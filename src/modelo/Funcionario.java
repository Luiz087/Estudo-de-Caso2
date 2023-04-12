package modelo;

public class Funcionario extends Pessoa {

	private String matricula;
	private String usuarioFuncionario;
	private String senhaFuncionario;

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

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

}
