import java.util.ArrayList;
import java.util.Scanner;

public class Weg {
	
	public static void main (String args []) {
		Scanner sc = new Scanner (System.in);
		
	
	ArrayList<Gerador> listaDeGeradores = new ArrayList<>();
	ArrayList<MotorEletrico> listaDeMotores = new ArrayList<>();
	ArrayList<InversorFrequencia> listaDeInversores = new ArrayList<>();
	ArrayList<ServicoManutencao> listaServicoManutencao = new ArrayList<>();
	
	int opcao;
	
	do {
		
		MotorEletrico m1 = new MotorEletrico( 1234, "lala", 60 );
		InversorFrequencia inversor1 = new InversorFrequencia (345, "hahaha", 56);
		Gerador gerador1 = new Gerador (789, "kakkaa", 48);
		
	System.out.println(" Interface de gerenciamento "+
	"\n0 Sair do sistema "+
	"\n1- Cadastrar Motor Elétrico "+
	"\n2- Cadastrar Inversor Frequencia "+
	"\n3- Cadastrar Gerador"+
	"\n4- Listar Motores Eletricos"+
	"\n5- Listar Inversores de Frequencia "+
	"\n6- Listar Geradores ");
	opcao = sc.nextInt();	 
	
	switch (opcao) {
	case 1:
		listaDeMotores.add(new MotorEletrico(listaDeMotores.size()));
		int b = listaDeMotores.size()-1;
		System.out.println("\n-- Cadastro do Motor Eletrico");
		
		do {
		System.out.println("\nInsira o tipo do motor: ");
		if(listaDeMotores.get(b).setTipo(sc.next()) == true)
		break;
		} while (true);
		
		do {
		System.out.println("Insira a potencia do motor:");
		if (listaDeMotores.get(b).setPotencia(sc.nextDouble())==true);
		break;
		} while (true);
		
		do {
		System.out.println("Insira a eficiencia do motor: ");
		if (listaDeMotores.get(b).setEficiencia(sc.nextDouble())==true);
		break;
		} while (true);
		
		do {
		System.out.println("Insira a velocidade do motor ");
		if (listaDeMotores.get(b).setVelocidade(sc.nextDouble())== true);
		break;
		} while (true);
		
		do {
		System.out.println("Insira a tensão do motor:");
		if (listaDeMotores.get(b).setTensao(sc.nextDouble())==true);
		break;
		}while (true);
		
		do {
		System.out.println("Insira a capacidade do motor:");
		if (listaDeMotores.get(b).setCapacidade(sc.next())==true);
		break;
		} while (true);
		
		do {
		System.out.println("Insira o tipo de enrolamento do motor: ");
		if (listaDeMotores.get(b).setTipoEnrolamento(sc.next ())==true);
		break;
		} while (true);
		
		do {
		System.out.println("Insira o preço do Motor:");
		if (listaDeMotores.get(b).setPreco(sc.nextDouble())== true);
		break;
		} while (true);

		// tambem precisa fazer o calculo da eficiencia do motor e apresentar. 
		break; // acabou o caso 1
		
	case 2:
		listaDeInversores.add(new InversorFrequencia(listaDeInversores.size()));
		int a = listaDeInversores.size()-1;
		System.out.println("\n-- Cadastro do Inversor de frequencia");
		
		do {
		System.out.println("\nInsira o tipo de Inversor:");
		if (listaDeInversores.get(a).setTipo(sc.next()) == true);
		break;
		} while (true);
		
		do {
		System.out.println("Insira a potencia do inversor: ");
		if (listaDeInversores.get(a).setPotencia(sc.nextDouble())==true);
		break;
		} while (true);
		
		do {
		System.out.println("Insira a tensão do inversor: ");
		if (listaDeInversores.get(a).setTensao(sc.nextDouble())==true);
		break;
		} while (true);
		
		do {
		System.out.println("Insira a capacidde do inversor:");
		if (listaDeInversores.get(a).setCapacidade(sc.next())==true);
		break;
		} while (true);
		
		do {
		System.out.println("Insira a capacidade de frequencia do Inversor: ");
		if (listaDeInversores.get(a).setCapacidade(sc.next())==true);
		break;
		} while(true);
		
		do {
		System.out.println("Insira o numero de fases do Inversor: ");
		if (listaDeInversores.get(a).setNumFases(sc.nextInt())==true);
		break;
		} while (true);
		
		do {
		System.out.println("Insira o preço do inversor de frequencia: ");
		if (listaDeInversores.get(a).setPreco(sc.nextDouble()) == true);
		break;
		} while (true);
		
		break; // acaba o caso 2
		
	case 3:
		listaDeGeradores.add(new Gerador(listaDeGeradores.size()));
		int i = listaDeGeradores.size()-1;
		System.out.println("\n -- Cadastro do Gerador ");
		
		do {
		System.out.println("\nInsira o tipo de gerador: ");
		if (listaDeGeradores.get(i).setTipo(sc.next()) == true)
		break;
		} while (true);
		
		do {
		System.out.println("Insira a Autonomia do gerador:");
		if (listaDeGeradores.get(i).setAutonomia(sc.nextInt()) == true)
		break;
		} while (true);
		
		do {
		System.out.println("Insira a Capacidade do gerador:");
		if (listaDeGeradores.get(i).setCapacidade(sc.next())== true);
		break;
		} while (true);
		
		do {
		System.out.println("Insira a qual o conbustível do gerador: :");
		if (listaDeGeradores.get(i).setCombustivel(sc.next())== true);
		break;
		} while (true);
		
		do {
		System.out.println("Insira a potencia do gerador:");
		if (listaDeGeradores.get(i).setPotencia(sc.nextDouble()) == true);
		break;
		} while (true); 
		
		do {
		System.out.println("Insira a tensao do gerador:");
		if (listaDeGeradores.get(i).setTensao(sc.nextDouble())== true);
		break;
		} while (true); 
		
		do {
		System.out.println("Insira o preço do gerador:");
		if (listaDeGeradores.get(i).setPreco(sc.nextDouble())== true);
		break;
		} while (true); 

		break; // acaba o caso 3 
		
	case 4: 
		for ( int cont=0; cont<listaDeMotores.size(); cont++) {
			
			System.out.println(" Motor (n°) cadastrado: ");
			System.out.println(" Código:" + listaDeMotores.get(cont).getCodigo());
			System.out.println(" Tipo: "+ listaDeMotores.get(cont).getTipo());
			System.out.println(" Potencia: "+ listaDeMotores.get(cont).getPotencia());
			System.out.println(" Eficiencia: "+ listaDeMotores.get(cont).getEficiencia());
			System.out.println(" Velocidade: "+ listaDeMotores.get(cont).getVelocidade());
			System.out.println(" Tensão: "+ listaDeMotores.get(cont).getTensao());
			System.out.println(" Capacidade: "+ listaDeMotores.get(cont).getCapacidade());
			System.out.println(" Tipo de Enrolamento: "+ listaDeMotores.get(cont).getTipoEnrolamento());
			System.out.println(" Preço: "+ listaDeMotores.get(cont).getPreco());
			System.out.println("_______________________________________________________________");
		} break;
		
	case 5:
		for ( int cont=0; cont<listaDeInversores.size(); cont++) {
			System.out.println(" Inversor de Frequencia (n°) cadastrado: ");
			System.out.println(" Código:" + listaDeInversores.get(cont).getCodigo());
			System.out.println(" Tipo: "+ listaDeInversores.get(cont).getTipo());
			System.out.println(" Potencia: "+ listaDeInversores.get(cont).getPotencia());
			System.out.println(" Tensão: "+ listaDeInversores.get(cont).getTensao());
			System.out.println(" Capacidade: "+ listaDeInversores.get(cont).getCapacidade());
			System.out.println(" Capacidade de frequencia: "+ listaDeInversores.get(cont).getCapacidadeFrequencia());
			System.out.println(" Número de fases: "+ listaDeInversores.get(cont).getNumFases());
			System.out.println(" Preço: "+ listaDeInversores.get(cont).getPreco());
			System.out.println("_______________________________________________________________");
		} break;
		
	case 6:
		for ( int cont=0; cont<listaDeGeradores.size(); cont++) {
			System.out.println(" Gerador (n°) cadastrado: ");
			System.out.println(" Código:" + listaDeGeradores.get(cont).getCodigo());
			System.out.println(" Tipo: "+  listaDeGeradores.get(cont).getTipo());
			System.out.println(" Potencia: "+ listaDeGeradores.get(cont).getPotencia());
			System.out.println(" Tensão: "+  listaDeGeradores.get(cont).getTensao());
			System.out.println(" Capacidade: "+  listaDeGeradores.get(cont).getCapacidade());
			System.out.println(" Autonomia: "+  listaDeGeradores.get(cont).getAutonomia());
			System.out.println(" Combuistível: "+  listaDeGeradores.get(cont).getCombustivel());
			System.out.println(" Preço: "+  listaDeGeradores.get(cont).getPreco());
			System.out.println("_______________________________________________________________");
		} break;
		
		// fazer o serviço de manutencao
			}
		} while (opcao !=0);
	}
}
