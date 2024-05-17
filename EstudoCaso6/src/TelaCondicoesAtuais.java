
public class TelaCondicoesAtuais extends TelaExibicao {
	
	public void atualizacoes ( DadosClimaticos dados ) {
		System.out.println("temperatura: " + this.dadosEstacao.getDadosClima().getTemperatura());
		System.out.println("pressão: " + this.dadosEstacao.getDadosClima().getPressao());
		System.out.println("umidade: " + this.dadosEstacao.getDadosClima().getUmidade());
	}
}
