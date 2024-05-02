/***
 * 
 * A classe ServicoManutencao representa um serviço de manutenção oferecido aos produtos.
 * 
 * @author bianca_vaz
 *
 */
public class ServicoManutencao {
	
	/** A descrição do serviço de manutenção. */
	private String descricao;
	 /** O custo do serviço de manutenção. */
	private double custo;
	 /** O código do serviço de manutenção. */
	private int codigo;
	
	/** 
     * Construtor que inicializa um novo serviço de manutenção .
     *
     * @param codigo O código do serviço de manutenção.
     */
	public ServicoManutencao (int codigo){
		setCodigo (codigo);
	}

	/**
     * Obtém o código do serviço de manutenção.
     *
     * @return O código do serviço de manutenção.
     */
	public int getCodigo() {
		return this.codigo;
	}

	
	/**
     * Define o código do serviço de manutenção.
     *
     * @param codigo O código do serviço de manutenção.
     * @return true se o código foi definido com sucesso, false caso contrário.
     */
	public boolean setCodigo(int codigo) {
		if(codigo >0) {
		this.codigo = codigo;
		return true;
		} return false;
	}

	/**
     * Obtém a descrição do serviço de manutenção.
     *
     * @return A descrição do serviço de manutenção.
     */
	public String getDescricao() {
		return descricao;
	}

	 /**
     * Define a descrição do serviço de manutenção.
     *
     * @param descricao A descrição do serviço de manutenção.
     * @return true se a descrição foi definida com sucesso, false caso contrário.
     */
	public boolean setDescricao(String descricao) {
		if (descricao.length()>5) {
		this.descricao = descricao;
		return true;
		} return false;
	}

	  /**
     * Obtém o custo do serviço de manutenção.
     *
     * @return O custo do serviço de manutenção.
     */
	public double getCusto() {
		return custo;
	}

	 /**
     * Define o custo do serviço de manutenção.
     *
     * @param custo O custo do serviço de manutenção.
     * @return true se o custo foi definido com sucesso, false caso contrário.
     */
	public boolean setCusto(double custo) {
		if (custo >0) {
		this.custo = custo;
		return true;
		} return false;
	}
}
