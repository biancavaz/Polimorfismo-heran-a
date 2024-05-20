
public class DadosClimaticos {
	
	private double temperatura;
	private double umidade;
	private double pressao;
	

	public double getTemperatura() {
		return temperatura;
	}
	public void setTemperatura(double temperatura) {
		if (temperatura <100)
		this.temperatura = Math.round(temperatura*100)/100;
	}
	public double getUmidade() {
		return umidade;
	}
	public void setUmidade(double umidade) {
		if (umidade>0 || umidade<100)
		this.umidade = Math.round(umidade*100)/100;
	}
	public double getPressao() {
		return pressao;
	}
	public void setPressao(double pressao) {
		if ( pressao > 300 || pressao <1300)
		this.pressao =  Math.round(pressao*100)/100;
	} 
	
	public void mostrarInformacoes () {
		System.out.println("Temperatura: "+ this.temperatura);
		System.out.println("Umidade: "+ this.umidade);
		System.out.println("Pressão: "+ this.pressao);
		
	}
	
	public String dadosClima () {
		String dados = "temperatura : " + this.temperatura + "\n umidade:" + this.umidade + "\n Pressao :"+ this.pressao; 
		return dados; 
	}
}
