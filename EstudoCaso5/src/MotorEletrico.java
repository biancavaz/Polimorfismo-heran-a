
public class MotorEletrico extends ProdutosWeg{

	private String tipoEnrolamento;
	private double eficiencia; // em porcentagem
	private double velocidade; // Velocidade atual em RPM
	private double potenciaSaida;
	
	public MotorEletrico (int codigo, String tipo, String tipoEnrolamento, double eficiencia) {
		super (codigo, tipo);
		this.tipoEnrolamento = tipoEnrolamento; 
		this.eficiencia = eficiencia;
	}

	public String getTipoEnrolamento() {
		return tipoEnrolamento;
	}

	public void setTipoEnrolamento(String tipoEnrolamento) {
		if(tipoEnrolamento.matches(".*[a-z].*"))
		this.tipoEnrolamento = tipoEnrolamento;
	}

	public double getEficiencia() {
		return eficiencia;
	}

	public void setEficiencia(double eficiencia) {
		
		if (eficiencia > 0)
			this.eficiencia = eficiencia;
	}
	
	public double calculareficiencia (double potencia, double potenciaSaida) {
		double eficienciaMotor;
		
		eficienciaMotor = (potencia/potenciaSaida) * 100;
		setEficiencia(eficienciaMotor);
		return eficienciaMotor;
	}

	public double getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(double velocidade) {
		if (velocidade > 0) 
		this.velocidade = velocidade;
	}

	public double getPotenciaSaida() {
		return potenciaSaida;
	}

	public void setPotenciaSaida(double potenciaSaida) {
		
		this.potenciaSaida = potenciaSaida;
	}

}
