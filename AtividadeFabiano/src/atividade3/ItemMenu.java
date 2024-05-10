package atividade3;

public class ItemMenu {
	
	public String _str_ (String nome, int preco) {
		String dados = this.nome + " "+ this.preco;
		return dados;
		
	}
	
	private String nome;
	private int preco;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		if (nome.matches(".*[a-z].*"))
		this.nome = nome;
	}
	public int getPreco() {
		return preco;
	}
	public void setPreco(int preco) {
		if (preco > 0)
		this.preco = preco;
	}
	
}
