
public class ServicoManutencao {
	
	private String descricao;
	private double custo;
	
	public ServicoManutencao (double custo){
		setCusto (custo);
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		if (descricao.length()>99) 
		this.descricao = descricao;
		
	}

	public double getCusto() {
		return custo;
	}

	public void setCusto(double custo) {
		if (custo >0)
		this.custo = custo;
	}
}
