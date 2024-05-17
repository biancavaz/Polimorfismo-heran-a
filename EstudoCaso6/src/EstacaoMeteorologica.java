
public class EstacaoMeteorologica {
	
	DadosClimaticos dadosClima; 
	private String nome; 
		
	public EstacaoMeteorologica (String nome ) {
		this.nome = nome;
	}
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public DadosClimaticos getDadosClima() {
		return dadosClima;
	}

	public void setDadosClima(DadosClimaticos dadosClima) {
		this.dadosClima = dadosClima;
	}
	
	public EstacaoMeteorologica () {
		this.dadosClima = new DadosClimaticos ();
	} 

	public void mostrarEstacaoMeteorologica (DadosClimaticos dados) {
		System.out.println(" "+ dados.dadosClima());
	}
	
	
	public void atualizacoes ( DadosClimaticos dados ) {
		System.out.println("temperatura: " + this.dadosClima.getTemperatura());
		System.out.println("pressão: " + this.dadosClima.getPressao());
		System.out.println("umidade: " + this.dadosClima.getUmidade());
	}
	
	public String dadosClima () {
		String dados = "temperatura : " + this.dadosClima.getTemperatura() + "\n umidade:" + this.dadosClima.getUmidade() + "\n Pressao :"+ this.dadosClima.getPressao(); 
		return dados; 
	}
}
