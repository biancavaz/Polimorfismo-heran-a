
public class TelaEstatistica {
	
	private double mediaTemperatura;
	private double mediaPressao;
	private double mediaUmidade;
	private EstacaoMeteorologica estacao = new EstacaoMeteorologica();
	
	public void calculo () {
		double temp=0,pres=0,umid=0;
		for(int i=0; i < estacao.getDadosClima().size(); i++) {
			temp = temp+estacao.getDadosClima().get(i).getTemperatura();
			pres = pres+estacao.getDadosClima().get(i).getPressao();
			umid = umid+estacao.getDadosClima().get(i).getUmidade();
		}
		this.mediaTemperatura = Math.round(temp/estacao.getDadosClima().size()*1000)/1000;
		this.mediaPressao = Math.round(pres/estacao.getDadosClima().size()*1000)/1000;
		this.mediaUmidade = Math.round(umid/estacao.getDadosClima().size()*1000)/1000;

	}
	public void atualizacoes ( ) {
		System.out.println("\nTemperatura Média: " + this.mediaTemperatura);
		System.out.println("Pressão Média: " + this.mediaPressao);
		System.out.println("Umidade Média: " + this.mediaUmidade);
	}

	public double getMediaTemperatura() {
		return this.mediaTemperatura;
	}

	public void setMediaTemperatura(double mediaTemperatura) {
		this.mediaTemperatura = Math.round(mediaTemperatura*100)/100;
	}

	public double getMediaPressao() {
		return mediaPressao;
	}

	public void setMediaPressao(double mediaPressao) {
		this.mediaPressao = Math.round(mediaPressao*100)/100;
	}

	public double getMediaUmidade() {
		return mediaUmidade;
	}

	public void setMediaUmidade(double mediaUmidade) {
		this.mediaUmidade = Math.round(mediaUmidade*100)/100;
	}

	public EstacaoMeteorologica getEstacao() {
		return estacao;
	}

	public void setEstacao(EstacaoMeteorologica estacao) {
		this.estacao = estacao;
	}


}
