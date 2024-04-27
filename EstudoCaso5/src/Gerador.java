
public class Gerador extends ProdutosWeg{
	
	private String combustivel;
	private int autonomia; // tempo
	
	public Gerador( int codigo, String tipo, int autonomia) {
		super (codigo,tipo);
		setAutonomia (autonomia);
	}
	
	public Gerador (int codigo) {
		super(codigo);
	}

	public String getCombustivel() {
		return combustivel;
	}

	public boolean setCombustivel(String combustivel) {
		if (combustivel.length() > 0) {
		this.combustivel = combustivel;
		return true;
		} else {
			System.out.println(" Acabou o combustível!");
			return false;
		}
	}

	public int getAutonomia() {
		return autonomia;
	}

	public boolean setAutonomia(int autonmomia) {
		if (autonomia >0) {
		this.autonomia = autonmomia;
		return true;
		} return false;
	}
}
