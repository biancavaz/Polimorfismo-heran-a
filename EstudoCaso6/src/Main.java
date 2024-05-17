import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in); 
	
		DadosClimaticos dados = new DadosClimaticos();
		TelaExibicao display = new TelaExibicao ();
		TelaCondicoesAtuais condicoes = new TelaCondicoesAtuais();
		EstacaoMeteorologica estacao = new EstacaoMeteorologica (); 
		
		// ArrayList <EstacaoMeteorologica> estacao = new ArrayList(); 
	

		System.out.println("informe temp: ");
		dados.setTemperatura(sc.nextInt()); 
		
		System.out.println("informe a pressão: ");
		dados.setPressao(sc.next());
		
		System.out.println("Umidade: ");
		dados.setUmidade(sc.next());	
		
		System.out.println("\n lallala");
		estacao.mostrarEstacaoMeteorologica(dados);
		
	//////////////////////////////////	
		
		condicoes.setDadosEstacao(estacao);
		
		System.out.println(" atualizar dados:  ");
	
		System.out.println("temp:");
		condicoes.getDadosEstacao().getDadosClima().setTemperatura(sc.nextInt());;
		
		System.out.println("umid:");
		condicoes.getDadosEstacao().getDadosClima().setUmidade(sc.next());;
		
		System.out.println("press:");
		condicoes.getDadosEstacao().getDadosClima().setPressao(sc.next());;
		
	//	estacao.atualizacoes(dados);
		condicoes.atualizacoes(dados);
		
	}

}
