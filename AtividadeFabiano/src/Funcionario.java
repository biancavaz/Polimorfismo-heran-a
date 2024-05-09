
public class Funcionario {
	
	private int idade;
	private String nome; 
	protected double salario;
	
	public int getIdade() {
		return idade;
	}
	public boolean setIdade(int idade) {
		if( idade > 18 ) {
			this.idade = idade;
			return true;
		} else {
			return false; 
		}
	}
	public String getNome() {
		return nome;
	}
	public boolean setNome(String nome) {
		if (nome.matches(".*[1-9].*")) {
			return false;
		} else {
			this.nome = nome;
			return true;
		}
	}
	public double getSalario() {
		return salario;
	}
	public boolean setSalario(double salario) {
		if (salario > 0) {
			this.salario = salario;
			return true;
		} else {
			return false;
		}
	} 
	
	public double cacularSalario (double salario ) {
		return salario; 
	}
	
	public void mostrarInformacoes () {
				
	}

}
