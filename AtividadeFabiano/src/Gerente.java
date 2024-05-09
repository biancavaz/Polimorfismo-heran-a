
public class Gerente extends Funcionario {
	
	private double bonus; 
	
	public double getBonus() {
		return bonus;
	}

	public String mostrarInformacoes(double bonus) {
		String dados = this.bonus+" "+this.salario;
		return dados;
	}

	public double cacularSalario (double salario, double bonus) {
		bonus = salario + 1500;
		return bonus; 
	}

}
