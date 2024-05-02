/***
 * Subclasse Inversor que é extendida da classe ProdutosWEG
 * @author bianca_vaz
 *
 */
public class InversorFrequencia extends ProdutosWeg{
	
	/** A capacidade de frequência do inversor (em Hz). */
	private int capacidadeFrequencia; // hz
	 /** O número de fases do inversor. */
	private int numFases; 
	
	 /** 
     * Construtor de objetos da classe ProdutosWEG
     *
     * @param codigo O código do inversor.
     * @param tipo O tipo do inversor.
     * @param capacidadeFrequencia A capacidade de frequência do inversor em Hz.
     */
	public InversorFrequencia(int codigo, String tipo,int capacidadeFrequencia ) {
		// TODO Auto-generated constructor stub
		super(codigo, tipo);
		setCapacidadeFrequencia (capacidadeFrequencia);
		
	}
	
	/**
     * Construtor de objetos com o método sobrecarga. 
     *
     * @param codigo O código do inversor.
     */
	public InversorFrequencia (int codigo) {
		super(codigo);
	}
	
	
	/**
     * Obtém a capacidade de frequência do inversor.
     *
     * @return A capacidade de frequência do inversor em Hz.
     */
	public int getCapacidadeFrequencia() {
		return this.capacidadeFrequencia;
	}

	
	 /**
     * Define a capacidade de frequência do inversor.
     *
     * @param capacidadeFrequencia A capacidade de frequência do inversor em Hz.
     * @return true se a capacidade de frequência foi definida com sucesso, false caso contrário.
     */
	public boolean setCapacidadeFrequencia(int capacidadeFrequencia) {
		if (capacidadeFrequencia >0) {
		this.capacidadeFrequencia = capacidadeFrequencia;
		return true;
		}return false;
	}
	
	/**
     * Obtém o número de fases do inversor.
     *
     * @return O número de fases do inversor.
     */
	public int getNumFases() {
		return this.numFases;
	}
	
	/**
     * Define o número de fases do inversor.
     *
     * @param numFases O número de fases do inversor.
     * @return true se o número de fases foi definido com sucesso, false caso contrário.
     */
	public boolean setNumFases(int numFases) {
		if (numFases > 0) {
		this.numFases = numFases;
		return true; 
		} return false;
	}
	

}
