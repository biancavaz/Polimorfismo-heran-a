/***
 * Subclasse que é extendida da classe ProdutosWEG. 
 * @author bianca_vaz
 *
 */

public class Gerador extends ProdutosWeg{
	
	 /** O tipo de combustível utilizado pelo gerador. */
	private String combustivel;
	 
    /** A autonomia do gerador (tempo de funcionamento em horas). */
	private int autonomia; // tempo
	
	 /** 
     * Construtor que inicializa um novo gerador.
     *
     * @param codigo O código do gerador.
     * @param tipo O tipo do gerador.
     * @param autonomia A autonomia do gerador em horas.
     */
	public Gerador( int codigo, String tipo, int autonomia) {
		super (codigo,tipo);
		setAutonomia (autonomia);
	}
	
	/**
     * Construtor de objetos com o método sobrecarga. 
     *
     * @param codigo O código do gerador.
     */
	public Gerador (int codigo) {
		super(codigo);
	}
	
	/**
     * Obtém o tipo de combustível utilizado pelo gerador.
     *
     * @return O tipo de combustível utilizado pelo gerador.
     */
	public String getCombustivel() {
		return combustivel;
	}

	 /**
     * Define o tipo de combustível utilizado pelo gerador.
     *
     * @param combustivel O tipo de combustível utilizado pelo gerador.
     * @return true se o tipo de combustível foi definido com sucesso, false caso contrário.
     */
	public boolean setCombustivel(String combustivel) {
		if (combustivel.length() > 0) {
		this.combustivel = combustivel;
		return true;
		} else {
			System.out.println(" Acabou o combustível!");
			return false;
		}
	}

	/**
     * Obtém a autonomia do gerador.
     *
     * @return A autonomia do gerador em horas.
     */
	public int getAutonomia() {
		return autonomia;
	}

	/**
     * Define a autonomia do gerador.
     *
     * @param autonomia A autonomia do gerador em horas.
     * @return true se a autonomia foi definida com sucesso, false caso contrário.
     */
	public boolean setAutonomia(int autonmomia) {
		if (autonomia >0) {
		this.autonomia = autonmomia;
		return true;
		} return false;
	}
}
