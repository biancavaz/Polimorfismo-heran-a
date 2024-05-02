/***
 * Subclasse que é extendida da classe ProdutosWEG
 * @author bianca_vaz
 *
 */
public class MotorEletrico extends ProdutosWeg{

	/** O tipo de enrolamento do motor elétrico. */
	private String tipoEnrolamento;
	/** A eficiência do motor elétrico (em porcentagem). */
	private double eficiencia; // em porcentagem
	/** A velocidade atual do motor elétrico em rotações por minuto (RPM). */
	private double velocidade; // Velocidade atual em RPM
	 /** A potência de saída do motor elétrico. */
	private double potenciaSaida;
	
	 /** 
     * Construtor que inicializa um novo motor elétrico.
     *
     * @param codigo O código do motor elétrico.
     * @param tipo O tipo do motor elétrico.
     * @param tipoEnrolamento O tipo de enrolamento do motor elétrico.
     * @param eficiencia A eficiência do motor elétrico em porcentagem.
     */
	public MotorEletrico (int codigo, String tipo, String tipoEnrolamento, double eficiencia) {
		super (codigo, tipo);
		setTipoEnrolamento (tipoEnrolamento); 
		setEficiencia (eficiencia);
	}

	 /**
     * Construtor de objetos com o método sobrecarga. 
     * @param codigo O código do motor elétrico.
     * @param tipo O tipo do motor elétrico.
     * @param eficiencia A eficiência do motor elétrico em porcentagem.
     */
	public MotorEletrico (int codigo, String tipo, double eficiencia) {
		super (codigo, tipo); 
		setEficiencia (eficiencia);
	}
	
	  /**
     * Construtor de objetos com o método sobrecarga. 
     *
     * @param codigo O código do motor elétrico.
     */
	public MotorEletrico (int codigo) {
		super(codigo);
	}

	 /**
     * Obtém o tipo de enrolamento do motor elétrico.
     *
     * @return O tipo de enrolamento do motor elétrico.
     */
	public String getTipoEnrolamento() {
		return tipoEnrolamento;
	}

	/**
     * Define o tipo de enrolamento do motor elétrico.
     *
     * @param tipoEnrolamento O tipo de enrolamento do motor elétrico.
     * @return true se o tipo de enrolamento foi definido com sucesso, false caso contrário.
     */
	public boolean setTipoEnrolamento(String tipoEnrolamento) {
		if(tipoEnrolamento.matches(".*[a-z].*")) {
		this.tipoEnrolamento = tipoEnrolamento;
		return true;
		} return false;
	}

	 /**
     * Obtém a eficiência do motor elétrico.
     *
     * @return A eficiência do motor elétrico em porcentagem.
     */
	public double getEficiencia() {
		return eficiencia;
	}

	 /**
     * Define a eficiência do motor elétrico.
     *
     * @param eficiencia A eficiência do motor elétrico em porcentagem.
     * @return true se a eficiência foi definida com sucesso, false caso contrário.
     */
	public boolean setEficiencia(double eficiencia) {
		if (eficiencia > 0) {
			this.eficiencia = eficiencia;
			return true;
		} return false;
	}
	
	 /**
     * Calcula a eficiência do motor elétrico com base na potência de entrada e de saída.
     *
     * @param potencia A potência de entrada do motor elétrico.
     * @param potenciaSaida A potência de saída do motor elétrico.
     * @return A eficiência do motor elétrico em porcentagem.
     */
	public double calculareficiencia (double potencia, double potenciaSaida) {
		double eficienciaMotor;
		
		eficienciaMotor = (potencia/potenciaSaida) * 100;
		setEficiencia(eficienciaMotor);
		return eficienciaMotor;
	}

	 /**
     * Obtém a velocidade atual do motor elétrico em RPM.
     *
     * @return A velocidade atual do motor elétrico em RPM.
     */
	public double getVelocidade() {
		return velocidade;
	}

	 /**
     * Define a velocidade atual do motor elétrico em RPM.
     *
     * @param velocidade A velocidade atual do motor elétrico em RPM.
     * @return true se a velocidade foi definida com sucesso, false caso contrário.
     */
	public boolean setVelocidade(double velocidade) {
		if (velocidade > 0) {
		this.velocidade = velocidade;
		return true;
		} return false;
	}

	 /**
     * Obtém a potência de saída do motor elétrico.
     *
     * @return A potência de saída do motor elétrico.
     */
	public double getPotenciaSaida() {
		return potenciaSaida;
	}

	/**
     * Define a potência de saída do motor elétrico.
     *
     * @param potenciaSaida A potência de saída do motor elétrico.
     * @return true se a potência de saída foi definida com sucesso, false caso contrário.
     */
	public boolean setPotenciaSaida(double potenciaSaida) {
		if (potenciaSaida >0) {
		this.potenciaSaida = potenciaSaida;
		return true;
		} return false;
	}
	
}
