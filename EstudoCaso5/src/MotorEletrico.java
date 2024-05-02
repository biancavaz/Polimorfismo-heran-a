
public class MotorEletrico extends ProdutosWeg{

	private String tipoEnrolamento;
	private double eficiencia; // em porcentagem
	private double velocidade; // Velocidade atual em RPM
	private double potenciaSaida;
	
<<<<<<< HEAD
	public MotorEletrico (int codigo, String tipo, String tipoEnrolamento, double eficiencia) {
		super (codigo, tipo);
		setTipoEnrolamento (tipoEnrolamento); 
		setEficiencia (eficiencia);
=======
	public MotorEletrico (int codigo, String tipo, double eficiencia) {
		super (codigo, tipo); 
		setEficiencia (eficiencia);
	}
	
	public MotorEletrico (int codigo) {
		super(codigo);
>>>>>>> 1baad9c2011a1418ab9358bd6984d64231c9a621
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
<<<<<<< HEAD
		if (potenciaSaida >0)
=======
>>>>>>> 1baad9c2011a1418ab9358bd6984d64231c9a621
		this.potenciaSaida = potenciaSaida;
	}
	
}
