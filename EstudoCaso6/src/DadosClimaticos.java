
public class DadosClimaticos {
	
	private int temperatura;
	private String umidade;
	private String pressao;
	

	public int getTemperatura() {
		return temperatura;
	}
	public void setTemperatura(int temperatura) {
		if (temperatura <100)
		this.temperatura = temperatura;
	}
	public String getUmidade() {
		return umidade;
	}
	public void setUmidade(String umidade) {
		if (umidade.length()>0)
		this.umidade = umidade;
	}
	public String getPressao() {
		return pressao;
	}
	public void setPressao(String pressao) {
		this.pressao = pressao;
	} 
	
	public void mostrarInformacoes () {
		System.out.println(" temp: "+ this.temperatura);
		System.out.println(" umi: "+ this.umidade);
		System.out.println(" pre: "+ this.pressao);
		
	}
	
	public String dadosClima () {
		String dados = "temperatura : " + this.temperatura + "\n umidade:" + this.umidade + "\n Pressao :"+ this.pressao; 
		return dados; 
	}
}
