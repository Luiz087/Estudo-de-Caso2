package modelo;

public class Usuario extends Pessoa {

	private String usuarioCliente;
	private String senhaCliente;
	private Long cep;

	public Long getCep() {
		return cep;
	}

	public void setCep(Long cep) {
		this.cep = cep;
	}

	public String getUsuarioCliente() {
		return usuarioCliente;
	}

	public void setUsuarioCliente(String usuarioCliente) {
		this.usuarioCliente = usuarioCliente;
	}

	public String getSenhaCliente() {
		return senhaCliente;
	}

	public void setSenhaCliente(String senhaCliente) {
		this.senhaCliente = senhaCliente;
	}
	
	public String toString() {
		return "\nNome: " + super.getNome() + "\nCPF: " + super.getCpf() + "\nCEP: " + this.cep + "\nUsuario: " + this.usuarioCliente + "\n";
	}

}
