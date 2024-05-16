import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in); 
		
		
		DadosClimaticos dados = new DadosClimaticos();
		EstacaoMeteorologica estacao = new EstacaoMeteorologica();
			
		System.out.println("informe temp: ");
		dados.setTemperatura(sc.nextInt()); 
		
		System.out.println("informe a pressão: ");
		dados.setPressao(sc.next());
		
		System.out.println("Umidade: ");
		dados.setUmidade(sc.next());	
		
		
		System.out.println("Informações registradas ");
		dados.mostrarInformacoes();
		
		System.out.println("\n lallala");
		estacao.mostrarEstacaoMeteorologica(dados);
		
	}

}
