
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class CentralDados {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Random rand = new Random();
        
        int opcao, opcao2, opcao3; 
		DadosClimaticos dados = new DadosClimaticos();
		ArrayList <EstacaoMeteorologica> estacao = new ArrayList(); 
		
		ArrayList <TelaEstatistica> estatisticas= new ArrayList();

		Scanner sc = new Scanner (System.in);
		System.out.println("[ 0 ] para dados automaticos");
		int x= sc.nextInt();
		if(x==0) {
			System.out.println("dados automaticos");
			
			estacao.add(new EstacaoMeteorologica("dados"));
			estatisticas.add(new TelaEstatistica());

			do {
				double tempAleatoria = rand.nextDouble()*99;
		        double pressAleatoria = rand.nextDouble()*99;
		        double umidAleatoria = rand.nextDouble()*99;
			estacao.get(0).getDadosClima().add(new DadosClimaticos());
			estacao.get(0).getDadosClima().get(estacao.get(0).getDadosClima().size()-1).setPressao(pressAleatoria);
			estacao.get(0).getDadosClima().get(estacao.get(0).getDadosClima().size()-1).setTemperatura(tempAleatoria);
			estacao.get(0).getDadosClima().get(estacao.get(0).getDadosClima().size()-1).setUmidade(umidAleatoria);
			estatisticas.get(0).setEstacao(estacao.get(0));

			estatisticas.get(0).calculo();
			estatisticas.get(0).atualizacoes();
			sc.next();
			
			}while(true);

					
			
		}
		

		estacao.add(new EstacaoMeteorologica("JARAGUA DO SUL"));
		estacao.add(new EstacaoMeteorologica("BLUMENAU "));
		estacao.add(new EstacaoMeteorologica("GUARAMIRIM"));
		
		
		// set jaragua do sul 
		///criando novo dado climatico
		estacao.get(0).getDadosClima().add(new DadosClimaticos());
		estacao.get(0).getDadosClima().get(0).setTemperatura(99);
		estacao.get(0).getDadosClima().get(0).setPressao(100);
		estacao.get(0).getDadosClima().get(0).setUmidade(50);
		
		//pegando a posição atual dele

		int b = estacao.get(0).getDadosClima().size()-1;

		System.out.println(estacao.get(0).getNome());
		System.out.println("\nTemperatura: " +estacao.get(0).getDadosClima().get(b).getTemperatura()+ "° ");
		System.out.println("Pressao: " +estacao.get(0).getDadosClima().get(b).getPressao());
		System.out.println("Umidade: " +estacao.get(0).getDadosClima().get(b).getUmidade()+ "%"+ "\n"+"---------------"+"\n");
		
		

		
		
		// set blumenau 
		estacao.get(1).getDadosClima().add(new DadosClimaticos());
		//pegando a posição atual dele
		int a = estacao.get(1).getDadosClima().size()-1;
		
		estacao.get(1).getDadosClima().get(a).setTemperatura(40);
		estacao.get(1).getDadosClima().get(a).setPressao(1010);
		estacao.get(1).getDadosClima().get(a).setUmidade(60);
		
		System.out.println(estacao.get(1).getNome());
		System.out.println("\nTemperatura: "+ estacao.get(1).getDadosClima().get(a).getTemperatura()+ "°");
		System.out.println("Pressao: " +estacao.get(1).getDadosClima().get(a).getPressao());
		System.out.println("Umidade: " +estacao.get(1).getDadosClima().get(a).getUmidade()+ "%"+ "\n"+"---------------"+"\n");
		
		// set guaramirim
		estacao.get(2).getDadosClima().add(new DadosClimaticos());
		//pegando a posição atual dele
		int c = estacao.get(2).getDadosClima().size()-1;
		estacao.get(2).getDadosClima().get(c).setTemperatura(60);
		estacao.get(2).getDadosClima().get(c).setPressao(1020);
		estacao.get(2).getDadosClima().get(c).setUmidade(23);
		
		System.out.println(estacao.get(2).getNome());
		System.out.println("\nTemperatura: " + estacao.get(2).getDadosClima().get(c).getTemperatura()+ "°");
		System.out.println("Pressao: " +estacao.get(2).getDadosClima().get(c).getPressao());
		System.out.println("Umidade: " +estacao.get(2).getDadosClima().get(c).getUmidade()+ "%"+ "\n"+"---------------"+"\n");
		
		
	}

}
