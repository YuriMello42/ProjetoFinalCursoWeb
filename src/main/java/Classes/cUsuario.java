package Classes;

import java.awt.List;

public class cUsuario {
	protected int id;
	protected String nome;
	protected String email;
	protected String senha;
	protected List telefone;
	

	public cUsuario(String nome, String email, String senha) {
		super();

		this.nome = nome;
		this.email = email;
		this.senha = senha;

	}

	public cUsuario() {
		// TODO Auto-generated constructor stub
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "cUsuario [id=" + id + ", nome=" + nome + ", email=" + email + ", senha=" + senha + ", telefone="
				+ telefone + "]";
	}

	
}
