
public class MotorEletrico extends ProdutosWeg{

	private String tipoEnrolamento;
	private double eficiencia; // em porcentagem
	private double velocidade; // Velocidade atual em RPM
	private double potenciaSaida;
	
	public MotorEletrico (int codigo, String tipo, double eficiencia) {
		super (codigo, tipo); 
		setEficiencia (eficiencia);
	}
	
	public MotorEletrico (int codigo) {
		super(codigo);
	}

	public String getTipoEnrolamento() {
		return tipoEnrolamento;
	}

	public boolean setTipoEnrolamento(String tipoEnrolamento) {
		if(tipoEnrolamento.matches(".*[a-z].*")) {
		this.tipoEnrolamento = tipoEnrolamento;
		return true;
		} return false;
	}

	public double getEficiencia() {
		return eficiencia;
	}

	public boolean setEficiencia(double eficiencia) {
		if (eficiencia > 0) {
			this.eficiencia = eficiencia;
			return true;
		} return false;
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

	public boolean setVelocidade(double velocidade) {
		if (velocidade > 0) {
		this.velocidade = velocidade;
		return true;
		} return false;
	}

	public double getPotenciaSaida() {
		return potenciaSaida;
	}

	public void setPotenciaSaida(double potenciaSaida) {
		this.potenciaSaida = potenciaSaida;
	}
	
}
