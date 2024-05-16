
public class EstacaoMeteorologica {
	
	DadosClimaticos dadosClima; 
	
	public EstacaoMeteorologica () {
		this.dadosClima = new DadosClimaticos ();
	} 

	public void mostrarEstacaoMeteorologica (DadosClimaticos dados) {
		System.out.println(" "+ dados.dadosClima());
	}
	
	public void atualizacoes ( ) {
		
	}
	
	
}
