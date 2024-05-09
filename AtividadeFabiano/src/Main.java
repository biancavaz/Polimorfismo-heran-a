import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int opcao; 
		
		Diretor diretor1 = new Diretor();
		Gerente gerente1 = new Gerente(); 
		
		ArrayList<Diretor> listaDiretores = new ArrayList<>();
		
		do {
		System.out.println(" Entrar como: \n1- Diretor \n2- Gerente \n0- Sair");
		opcao = sc.nextInt();
			
		switch (opcao) {
		case 1:
			
			listaDiretores.add(new Diretor());
			int b = listaDiretores.size()-1; 
			
			System.out.println("Informe seu nome: ");
			listaDiretores.get(b).setNome(sc.next());
			
			System.out.println("Informe sua idade: ");
			listaDiretores.get(b).setIdade(sc.nextInt());
			
			System.out.println("Informe seu salário: ");
			listaDiretores.get(b).setSalario(sc.nextDouble()); 
			
			System.out.println("Informe a quantidade de ações: ");
			listaDiretores.get(b).setAcoes(sc.nextDouble());
			
			listaDiretores.get(b).cacularSalario();
			
			System.out.println("\nDIRETOR ");
			System.out.println("NOME: "+ listaDiretores.get(b).getNome());
			System.out.println("IDADE: "+ listaDiretores.get(b).getIdade());
			System.out.println("SALÁRIO: "+ listaDiretores.get(b).getSalario());
			System.out.println("AÇÕES: "+ listaDiretores.get(b).getAcoes());
			System.out.println("SALÁRIO TOTAL: "+listaDiretores.get(b).getTotalSalario());
			System.out.println("\n");
			
			
			break;
			
		case 2:
			System.out.println("Informe seu nome: ");
			gerente1.setNome(sc.next());
			
			System.out.println("Informe sua idade: ");
			gerente1.setIdade(sc.nextInt());
			
			System.out.println("Informe seu salário: ");
			gerente1.setSalario(sc.nextDouble()); 
			
			System.out.println(" GERENTE ");
			System.out.println("NOME: "+ gerente1.getNome());
			System.out.println("IDADE: "+ gerente1.getIdade());
			System.out.println(" SALÁRIO: "+ gerente1.getSalario());
			System.out.println("BONUS: "+ gerente1.getBonus());		
			System.out.println("\n");
			
			break; 
		}
		
		} while (opcao !=0);
		

	}

}
