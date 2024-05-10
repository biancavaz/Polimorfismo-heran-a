package atividade3;

public class Sobremesa extends ItemMenu{

	private String tipo;

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		if (tipo.matches(".*[a-z].*"))
		this.tipo = tipo;
	}
	
	public String _str_ (String nome, int preco, String tipo) {
		String dados = nome + " "+ preco+ " "+ this.tipo; 
		return dados;
		
	}
}
