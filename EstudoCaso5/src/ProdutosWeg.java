/***
 * Classe base para a criação de outros produtos.
 * @author bianca_vaz
 *
 */
public class ProdutosWeg {
	
	 /** O código do produto Weg. */
	private int codigo;
	  /** O tipo do produto Weg. */
	private String tipo;
	/** A potência do produto Weg (medida em cavalos). */
	private double potencia; // maior que 0 (medida em cavalos)
	/** A tensão do produto Weg (medida em volts). */
	private double tensao; // > que 0 ( medida em volts)
	 /** A capacidade do produto Weg. */
	private String capacidade;
	 /** O preço do produto Weg. */
	private double preco;
	
	/** 
     * Construtor que inicializa um novo produto Weg.
     *
     * @param codigo O código do produto Weg.
     * @param tipo O tipo do produto Weg.
     */
	public ProdutosWeg (int codigo, String tipo) { // construtor
		setCodigo(codigo);
		setTipo(tipo);
	}
	
	 /**
     * Construtor de objetos com o método sobrecarga. 
     *
     * @param codigo O código do produto Weg.
     */
	public ProdutosWeg (int codigo) {
		setCodigo(codigo);
	}
	
	/**
     * Obtém o código do produto Weg.
     *
     * @return O código do produto Weg.
     */
	public int getCodigo() {
		return this.codigo;
	}
	
	/**
     * Define o código do produto Weg.
     *
     * @param codigo O código do produto Weg.
     * @return true se o código foi definido com sucesso, false caso contrário.
     */
	public boolean setCodigo(int codigo) {
		if (codigo >99) {
		this.codigo = codigo;
		return true;
		} return false;
	}
	
	/**
     * Obtém o tipo do produto Weg.
     *
     * @return O tipo do produto Weg.
     */
	public String getTipo() {
		return this.tipo;
	}
	
	/**
     * Define o tipo do produto Weg.
     *
     * @param tipo O tipo do produto Weg.
     * @return true se o tipo foi definido com sucesso, false caso contrário.
     */
	public boolean setTipo(String tipo) {
		if (tipo.matches(".*[0-9].*")) {
		return false;
		} this.tipo = tipo;
		return true;
	}
	
	 /**
     * Obtém a potência do produto Weg.
     *
     * @return A potência do produto Weg em cavalos.
     */
	public double getPotencia() {
		return this.potencia;
	}
	
	/**
     * Define a potência do produto Weg.
     *
     * @param potencia A potência do produto Weg em cavalos.
     * @return true se a potência foi definida com sucesso, false caso contrário.
     */
	public boolean setPotencia(double potencia) {
		if (potencia > 0 ) {
		this.potencia = potencia;
		return true;
		} return false;
	}
	
	  /**
     * Obtém a tensão do produto Weg.
     *
     * @return A tensão do produto Weg em volts.
     */
	public double getTensao() {
		return this.tensao;
	}
	
	 /**
     * Define a tensão do produto Weg.
     *
     * @param tensao A tensão do produto Weg em volts.
     * @return true se a tensão foi definida com sucesso, false caso contrário.
     */
	public boolean setTensao(double tensao) {
		if (tensao > 0) {
		this.tensao = tensao;
		return true;
		} return false;
	}
	
	/**
     * Obtém a capacidade do produto Weg.
     *
     * @return A capacidade do produto Weg.
     */
	public String getCapacidade() {
		return this.capacidade;
	}
	
	/**
     * Define a capacidade do produto Weg.
     *
     * @param capacidade A capacidade do produto Weg.
     * @return true se a capacidade foi definida com sucesso, false caso contrário.
     */
	public boolean setCapacidade(String capacidade) {
		if (capacidade.length() > 0) {
		this.capacidade = capacidade;
		return true;
		} return false;
	}
	
	   /**
     * Obtém o preço do produto Weg.
     *
     * @return O preço do produto Weg.
     */
	public double getPreco() {
		return this.preco;
	}
	
	/**
     * Define o preço do produto Weg.
     *
     * @param preco O preço do produto Weg.
     * @return true se o preço foi definido com sucesso, false caso contrário.
     */
	public boolean setPreco(double preco) {
		if (preco >10) {
		this.preco = preco;
		return true; 
		} return false;
	}
}
