import java.util.ArrayList;
import java.util.Scanner;

public class CentralDados {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		
		int opcao, opcao2, opcao3; 
		DadosClimaticos dados = new DadosClimaticos();
		ArrayList <EstacaoMeteorologica> estacao = new ArrayList(); 
		
		estacao.add(new EstacaoMeteorologica("Jaragua do sul"));
		estacao.add(new EstacaoMeteorologica("Blumenau "));
		estacao.add(new EstacaoMeteorologica("Guaramirim"));
	}

}
