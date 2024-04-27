
public class InversorFrequencia extends ProdutosWeg{
	
	private int capacidadeFrequencia; // hz
	private int numFases; 

	public InversorFrequencia(int codigo, String tipo,int capacidadeFrequencia ) {
		// TODO Auto-generated constructor stub
		super(codigo, tipo);
		setCapacidadeFrequencia (capacidadeFrequencia);
		
	}
	
	public InversorFrequencia (int codigo) {
		super(codigo);
	}

	public int getCapacidadeFrequencia() {
		return this.capacidadeFrequencia;
	}

	public boolean setCapacidadeFrequencia(int capacidadeFrequencia) {
		if (capacidadeFrequencia >0) {
		this.capacidadeFrequencia = capacidadeFrequencia;
		return true;
		}return false;
	}

	public int getNumFases() {
		return this.numFases;
	}

	public boolean setNumFases(int numFases) {
		if (numFases > 0) {
		this.numFases = numFases;
		return true; 
		} return false;
	}
	

}
