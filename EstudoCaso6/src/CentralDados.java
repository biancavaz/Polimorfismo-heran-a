
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class CentralDados {
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        Random rand = new Random();
        
        int opcao;
        
		DadosClimaticos dados = new DadosClimaticos();
		ArrayList <EstacaoMeteorologica> estacao = new ArrayList(); 
		ArrayList <TelaEstatistica> estatisticas= new ArrayList();

		Scanner sc = new Scanner (System.in);
		
	
		System.out.println("SISTEMA DE MONITORAMENTO METEOROLOGICO");
		System.out.println("\n[ 0 ] - DADOS AUTOMATICOS ");
		opcao = sc.nextInt();
		
		switch (opcao) {
		case 0: 
				estacao.add(new EstacaoMeteorologica("dados"));
				estatisticas.add(new TelaEstatistica());

				do {
					
					System.out.println("\n\n\n\n");
					
					System.out.println("--------------");
					System.out.println("DADOS AUTOMATICOS (MÉDIA DE DADOS): ");
					
					double tempAleatoria = rand.nextDouble()*99;
			        double pressAleatoria = rand.nextDouble()* (1300 - 300) + 300;
			        double umidAleatoria = rand.nextDouble()*99;
			   	
				estacao.get(0).getDadosClima().add(new DadosClimaticos());
				estacao.get(0).getDadosClima().get(estacao.get(0).getDadosClima().size()-1).setPressao(pressAleatoria);
				estacao.get(0).getDadosClima().get(estacao.get(0).getDadosClima().size()-1).setTemperatura(tempAleatoria);
				estacao.get(0).getDadosClima().get(estacao.get(0).getDadosClima().size()-1).setUmidade(umidAleatoria);
				estatisticas.get(0).setEstacao(estacao.get(0));
							
				estatisticas.get(0).calculo();
				estatisticas.get(0).atualizacoes();
				System.out.println("-----------------");

				
				System.out.println("DADOS ATUAIS: "+ "\n");
				estacao.get(0).getDadosClima().get(estacao.get(0).getDadosClima().size()-1).mostrarInformacoes();
		
				Thread.sleep(5000);
				
				
				} while(true);	
		
		}
		
	}

}
