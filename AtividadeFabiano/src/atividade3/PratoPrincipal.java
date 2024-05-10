package atividade3;

public class PratoPrincipal extends ItemMenu {
	
	private String descricao;

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		if (descricao.matches(".*[a-z].*"))
		this.descricao = descricao;
	}
	
	public String _str_ (String nome, int preco, String descricao) {
		String dados = nome + " "+ preco +" "+ this.descricao;
		return dados;
		
	}

}
