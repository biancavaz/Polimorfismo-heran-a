import java.util.ArrayList;
import java.util.Scanner;

public class CentralDados {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		
		int opcao, opcao2, opcao3; 
		DadosClimaticos dados = new DadosClimaticos();
		ArrayList <EstacaoMeteorologica> estacao = new ArrayList(); 
		
		estacao.add(new EstacaoMeteorologica("JARAGUA DO SUL"));
		estacao.add(new EstacaoMeteorologica("Blumenau "));
		estacao.add(new EstacaoMeteorologica("Guaramirim"));
		
		
		// set jaragua do sul 
		int b = estacao.size()-1;	
		estacao.get(0).getDadosClima().setTemperatura(35);
		estacao.get(1).getDadosClima().setPressao("20");
		estacao.get(2).getDadosClima().setUmidade("24");
	
		System.out.println(estacao.get(0).getNome());
		System.out.println("\ntemperatura: " +estacao.get(0).getDadosClima().getTemperatura()+ "° ");
		System.out.println("pressao: " +estacao.get(1).getDadosClima().getPressao());
		System.out.println("Umidade: " +estacao.get(2).getDadosClima().getUmidade()+ "\n"+"---------------"+"\n");
		
		// set blumenau 
		int a = estacao.size()-1;
		estacao.get(a).getDadosClima().setTemperatura(40);
		
		System.out.println(estacao.get(a).getNome());
		System.out.println(estacao.get(a).getDadosClima().getTemperatura()+ "°");
	}

}
