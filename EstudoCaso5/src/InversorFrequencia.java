
public class InversorFrequencia extends ProdutosWeg{
	
	private int capacidadeFrequencia; // hz
	private int numFases; 

	public InversorFrequencia(int codigo, String tipo,int capacidadeFrequencia ) {
		// TODO Auto-generated constructor stub
		super(codigo, tipo);
		setCapacidadeFrequencia (capacidadeFrequencia);
		
	}

	public int getCapacidadeFrequencia() {
		return this.capacidadeFrequencia;
	}

	public void setCapacidadeFrequencia(int capacidadeFrequencia) {
		if (capacidadeFrequencia >0)
		this.capacidadeFrequencia = capacidadeFrequencia;
	}

	public int getNumFases() {
		return this.numFases;
	}

	public void setNumFases(int numFases) {
		if (numFases > 0)
		this.numFases = numFases;
	}
	

}
