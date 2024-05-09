package atividade2;

public class Pessoa {
	
	private String nome;
	private int idade;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		if (nome.matches(".*[a-z].*"))
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		if (idade > 0)
		this.idade = idade;
	}
	
	public void apresentar () {
		
	}
	

}
