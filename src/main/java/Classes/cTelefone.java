package Classes;

public class cTelefone {

	int id;
	String numero;
	int ddd;
	String tipo;
	
	
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public int getDdd() {
		return ddd;
	}
	public void setDdd(int ddd) {
		this.ddd = ddd;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public int getId() {
		return id;
	}
	
	
	@Override
	public String toString() {
		return "cTelefone [id=" + id + ", numero=" + numero + ", ddd=" + ddd + ", tipo=" + tipo + "]";
	} 
	
	
}
