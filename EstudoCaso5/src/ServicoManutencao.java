
public class ServicoManutencao {
	//terminar
	private String descricao;
	private double custo;
	private int codigo;
	
	public ServicoManutencao (int codigo){
		setCodigo (codigo);
	}

	
	public int getCodigo() {
		return this.codigo;
	}


	public boolean setCodigo(int codigo) {
		if(codigo >99) {
		this.codigo = codigo;
		return true;
		} return false;
	}


	public String getDescricao() {
		return descricao;
	}

	public boolean setDescricao(String descricao) {
		if (descricao.length()>99) {
		this.descricao = descricao;
		return true;
		} return false;
	}

	public double getCusto() {
		return custo;
	}

	public boolean setCusto(double custo) {
		if (custo >0) {
		this.custo = custo;
		return true;
		} return false;
	}
}
