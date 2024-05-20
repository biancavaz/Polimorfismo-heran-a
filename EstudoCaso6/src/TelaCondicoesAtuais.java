
public class TelaCondicoesAtuais extends TelaExibicao {
	
	public void atualizacoes ( DadosClimaticos dados ) {
		System.out.println(" Temperatura: " + this.dadosEstacao.getDadosClima().get(0).getTemperatura());
		System.out.println(" Pressão: " + this.dadosEstacao.getDadosClima().get(0).getPressao());
		System.out.println(" Umidade: " + this.dadosEstacao.getDadosClima().get(0).getUmidade());
	}
}
