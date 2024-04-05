package herança;

public class Pessoa {

	private int idade;
	private String nome;

	public int getIdade() {
		return (int) idade;
	}

	public boolean setIdade(int idade) {
		if (idade < 0 || idade > 150) {
			return false;
		} else {
			this.idade = idade;
			return true;
		}
	}

	public String getNome() {
		return nome;
	}

	public boolean setNome(String nome) {
		if (nome.matches("[1-9]")) {
			return false;
		} else {
			this.nome = nome;
			return true;
		}
	}

}
