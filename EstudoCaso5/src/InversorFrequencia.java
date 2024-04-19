
public class InversorFrequencia extends ProdutosWeg{
	
	private int capacidadeFrequencia; // hz
	private int numFases; 

	public InversorFrequencia(int codigo, String tipo,int capacidadeFrequencia ) {
		// TODO Auto-generated constructor stub
		super(codigo, tipo);
		setCapacidadeFrequencia (capacidadeFrequencia);
		
	}

	public int getCapacidadeFrequencia() {
		return capacidadeFrequencia;
	}

	public void setCapacidadeFrequencia(int capacidadeFrequencia) {
		this.capacidadeFrequencia = capacidadeFrequencia;
	}

	public int getNumFases() {
		return numFases;
	}

	public void setNumFases(int numFases) {
		this.numFases = numFases;
	}
	

}
