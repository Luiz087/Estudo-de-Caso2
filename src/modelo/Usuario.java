package modelo;

public class Usuario extends Pessoa {

	private String usuarioCliente;
	private String senhaCliente;

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

}
