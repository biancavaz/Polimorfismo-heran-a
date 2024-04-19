
public class ProdutosWeg {
	
	private int codigo;
	private String tipo;
	private double potencia; // maior que 0 (medida em cavalos)
	private double tensao; // > que 0 ( medida em volts)
	private String capacidade; 
	private double preco;
	
	public ProdutosWeg (int codigo, String tipo) { // construtor
		setCodigo(codigo);
		setTipo(tipo);
	}
	
	public int getCodigo() {
		return this.codigo;
	}
	public void setCodigo(int codigo) {
		if (codigo >99)
		this.codigo = codigo;
	}
	public String getTipo() {
		return this.tipo;
	}
	public void setTipo(String tipo) {
		if (tipo.matches(".*[0-9].*"))
		this.tipo = tipo;
	}
	public double getPotencia() {
		return this.potencia;
	}
	public void setPotencia(double potencia) {
		if (potencia > 0 )
		this.potencia = potencia;
	}
	public double getTensao() {
		return this.tensao;
	}
	public void setTensao(double tensao) {
		if (tensao > 0)
		this.tensao = tensao;
	}
	public String getCapacidade() {
		return this.capacidade;
	}
	public void setCapacidade(String capacidade) {
		if (capacidade.length() > 0)
		this.capacidade = capacidade;
	}
	
	public double getPreco() {
		return this.preco;
	}
	public void setPreco(double preco) {
		if (preco >99)
		this.preco = preco;
	}
}
