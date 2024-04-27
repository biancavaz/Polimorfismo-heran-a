
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
	
	public ProdutosWeg (int codigo) {
		setCodigo(codigo);
	}
	
	public int getCodigo() {
		return this.codigo;
	}
	public boolean setCodigo(int codigo) {
		if (codigo >99) {
		this.codigo = codigo;
		return true;
		} return false;
		
	}
	public String getTipo() {
		return this.tipo;
	}
	public boolean setTipo(String tipo) {
		if (tipo.matches(".*[0-9].*")) {
		return false;
		} this.tipo = tipo;
		return true;
	}
	public double getPotencia() {
		return this.potencia;
	}
	public boolean setPotencia(double potencia) {
		if (potencia > 0 ) {
		this.potencia = potencia;
		return true;
		} return false;
	}
	public double getTensao() {
		return this.tensao;
	}
	public boolean setTensao(double tensao) {
		if (tensao > 0) {
		this.tensao = tensao;
		return true;
		} return false;
	}
	public String getCapacidade() {
		return this.capacidade;
	}
	public boolean setCapacidade(String capacidade) {
		if (capacidade.length() > 0) {
		this.capacidade = capacidade;
		return true;
		} return false;
	}
	
	public double getPreco() {
		return this.preco;
	}
	public boolean setPreco(double preco) {
		if (preco >99) {
		this.preco = preco;
		return true; 
		} return false;
	}
}
