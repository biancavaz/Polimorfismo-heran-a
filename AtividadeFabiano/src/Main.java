import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int opcao; 
		
		Diretor diretor1 = new Diretor();
		Gerente gerente1 = new Gerente(); 
		
		ArrayList<Diretor> listaDiretores = new ArrayList<>();
		ArrayList<Gerente> listaGerentes = new ArrayList<>();
		
		do {
		System.out.println(" Entrar como: \n1- Diretor \n2- Gerente \n0- Sair");
		opcao = sc.nextInt();
			
		switch (opcao) {
		case 1:
			
			listaDiretores.add(new Diretor());
			int b = listaDiretores.size()-1; 
			
			do {
			System.out.println("Informe seu nome: ");
			if (listaDiretores.get(b).setNome(sc.next())==true){
			break;
				}
			} while (true); 
	
			do {
			System.out.println("Informe sua idade: ");
			if (listaDiretores.get(b).setIdade(sc.nextInt())==true){
				break; 
				}
			} while (true);
			 
			do {
			System.out.println("Informe seu salário: ");
			if (listaDiretores.get(b).setSalario(sc.nextDouble()) ==true) {
				break; 
				}
			}while (true);
			
			do {
			System.out.println("Informe a quantidade de ações: ");
			if (listaDiretores.get(b).setAcoes(sc.nextDouble()) == true) {
				break;
				}
			} while (true); 
			
			listaDiretores.get(b).cacularSalario();
			for ( int cont=0; cont<listaDiretores.size(); cont++) {
			System.out.println("\nDIRETOR ");
			System.out.println("NOME: "+ listaDiretores.get(b).getNome());
			System.out.println("IDADE: "+ listaDiretores.get(b).getIdade());
			System.out.println("SALÁRIO: "+ listaDiretores.get(b).getSalario());
			System.out.println("AÇÕES: "+ listaDiretores.get(b).getAcoes());
			System.out.println("SALÁRIO TOTAL: "+listaDiretores.get(b).getTotalSalario());
			System.out.println("------------------");
			}
			break;
			
		case 2:
			listaGerentes.add(new Gerente());
			int a = listaGerentes.size()-1; 
			
			do {
			System.out.println("Informe seu nome: ");
			if (gerente1.setNome(sc.next())==true) {
				break;
				}
			} while (true);
			
			
			do {
			System.out.println("Informe sua idade: ");
			if(gerente1.setIdade(sc.nextInt())==true);{
				break;
				}
			}while(true);
			
			do {
			System.out.println("Informe seu salário: ");
			if (gerente1.setSalario(sc.nextDouble())==true) {
				break;
				}
			} while (true);
			
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
