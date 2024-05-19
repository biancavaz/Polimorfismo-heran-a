
public class DadosClimaticos {
	
	private double temperatura;
	private double umidade;
	private double pressao;
	

	public double getTemperatura() {
		return temperatura;
	}
	public void setTemperatura(double temperatura) {
		if (temperatura <100)
		this.temperatura = temperatura;
	}
	public double getUmidade() {
		return umidade;
	}
	public void setUmidade(double umidade) {
		if (umidade>0 || umidade<100)
		this.umidade = umidade;
	}
	public double getPressao() {
		return pressao;
	}
	public void setPressao(double pressao) {
		if ( pressao > 300 || pressao <1300)
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
