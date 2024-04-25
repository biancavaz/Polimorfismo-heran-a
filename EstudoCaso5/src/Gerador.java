
public class Gerador extends ProdutosWeg{
	
	private String combustivel;
	private int autonomia; // tempo
	
	public Gerador( int codigo, String tipo, int autonomia) {
		super (codigo,tipo);
		setAutonomia (autonomia);
	}

	public String getCombustivel() {
		return combustivel;
	}

	public void setCombustivel(String combustivel) {
		if (combustivel.length() > 0) {
		this.combustivel = combustivel;
		} else {
			System.out.println(" Acabou o combustível!");
		}
	}

	public int getAutonomia() {
		return autonomia;
	}

	public void setAutonomia(int autonmomia) {
		if (autonomia >0)
		this.autonomia = autonmomia;
	}
}
