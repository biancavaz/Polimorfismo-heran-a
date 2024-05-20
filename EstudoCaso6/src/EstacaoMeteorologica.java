import java.util.ArrayList;

public class EstacaoMeteorologica {
	
	ArrayList <DadosClimaticos> dadosClima = new ArrayList();
	TelaCondicoesAtuais condicoes = new TelaCondicoesAtuais ();
	
	private String nome;
		
	public EstacaoMeteorologica (String nome ) {
		this.nome = nome;
	}
	public EstacaoMeteorologica () {
	}
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public ArrayList<DadosClimaticos> getDadosClima() {
		return this.dadosClima;
	}
	public void setDadosClima(ArrayList<DadosClimaticos> dadosClima) {
		this.dadosClima = dadosClima;
	}
	
	
	public void mostrarEstacaoMeteorologica (DadosClimaticos dados) {
		System.out.println(" "+ dados.dadosClima());
	}
	
	
	public void atualizacoe ( ) {
		System.out.println("temperatura: " + this.dadosClima.get(dadosClima.size()-1).getTemperatura());
		System.out.println("pressão: " + this.dadosClima.get(dadosClima.size()-1).getPressao());
		System.out.println("umidade: " + this.dadosClima.get(dadosClima.size()-1).getUmidade());
	}
	
	public String dadosClima () {
		String dados = "temperatura : " + this.dadosClima.get(dadosClima.size()-1).getTemperatura() + "\n umidade:" + this.dadosClima.get(dadosClima.size()-1).getUmidade() + "\n Pressao :"+ this.dadosClima.get(dadosClima.size()-1).getPressao(); 
		return dados; 
	}
	
	public TelaCondicoesAtuais getCondicoes() {
		return condicoes;
	}
	public void setCondicoes(TelaCondicoesAtuais condicoes) {
		
		this.condicoes = condicoes;
	}
	
	
}
