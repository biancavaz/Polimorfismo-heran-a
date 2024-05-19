
public class TelaEstatistica {
	
	private double mediaTemperatura;
	private double mediaPressao;
	private double mediaUmidade;
	private EstacaoMeteorologica estacao = new EstacaoMeteorologica();
	
	public void calculo () {
		double temp=0,pres=0,umid=0;
		for(int i=0; i < estacao.getDadosClima().size(); i++) {
			temp= temp+estacao.getDadosClima().get(i).getTemperatura();
			pres = pres+estacao.getDadosClima().get(i).getPressao();
			umid = umid+estacao.getDadosClima().get(i).getUmidade();
		}
		this.mediaTemperatura = temp/estacao.getDadosClima().size();
		this.mediaPressao = pres/estacao.getDadosClima().size();
		this.mediaUmidade = umid/estacao.getDadosClima().size();

	}
	public void atualizacoes ( ) {
		System.out.println("temperatura media: " + this.mediaTemperatura);
		System.out.println("pressão media: " + this.mediaPressao);
		System.out.println("umidade media: " + this.mediaUmidade);
	}

	public double getMediaTemperatura() {
		return this.mediaTemperatura;
	}

	public void setMediaTemperatura(double mediaTemperatura) {
		this.mediaTemperatura = mediaTemperatura;
	}

	public double getMediaPressao() {
		return mediaPressao;
	}

	public void setMediaPressao(double mediaPressao) {
		this.mediaPressao = mediaPressao;
	}

	public double getMediaUmidade() {
		return mediaUmidade;
	}

	public void setMediaUmidade(double mediaUmidade) {
		this.mediaUmidade = mediaUmidade;
	}

	public EstacaoMeteorologica getEstacao() {
		return estacao;
	}

	public void setEstacao(EstacaoMeteorologica estacao) {
		this.estacao = estacao;
	}


}
