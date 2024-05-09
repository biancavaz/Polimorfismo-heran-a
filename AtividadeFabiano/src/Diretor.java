
public class Diretor extends Funcionario {
	
	private double acoes; 
	private double totalAcoes;
	private double totalSalario;
	
	public double getTotalSalario() {
		return this.totalSalario;
	}

	public void setTotalSalario(double totalSalario) {	
		this.totalSalario = totalSalario;
	}

	public double cacularSalario () {
		this.totalAcoes = acoes * 6.54; 
		this.totalSalario = this.totalSalario + this.totalAcoes;
		return this.totalSalario; 
	}
	
	public String mostrarInformacoes (double totalAcoes, double totalSalario) {
		String dadosDir = this.totalAcoes+ " "+ this.totalSalario;
		return dadosDir; 
				
	}

	public double getAcoes() {
		return this.acoes;
	}

	public boolean setAcoes(double acoes) {
		if (acoes > 0) {
			this.acoes = acoes;
			return true;
		} return false;
	}
	
	

}
