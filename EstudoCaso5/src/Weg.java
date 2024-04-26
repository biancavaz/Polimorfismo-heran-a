import java.util.ArrayList;
import java.util.Scanner;

public class Weg {
	
	public static void main (String args []) {
		Scanner sc = new Scanner (System.in);
		
	
	ArrayList<String> listaDeProdutos = new ArrayList<>();
	ArrayList<String> listaServicoManutencao = new ArrayList<>();
	
	MotorEletrico m1 = new MotorEletrico( 1234, "lala", 60 );
	InversorFrequencia inversor1 = new InversorFrequencia (345, "hahaha", 56);
	Gerador gerador1 = new Gerador (789, "kakkaa", 48);
	
	int opcao;
	
	do {
	System.out.println(" Interface de gerenciamento "+
	"\n1- Cadastrar Motor Elétrico "+
	"\n2- Cadastrar Inversor Frequencia "+
	"\n3- Cadastrar Gerador"+
	"\n0- Sair do sistema ");
	opcao = sc.nextInt();	 
	
	switch (opcao) {
	case 1:
		System.out.println("\n-- Cadastro do Motor Eletrico");
		System.out.println("\nInsira o código do motor: ");
		m1.setCodigo(sc.nextInt());
		// precisa fazer a validação
		System.out.println("Insira o tipo do motor: ");
		m1.setTipo(sc.next());
		// fazer validação 
		System.out.println("Insira a potencia do motor:");
		m1.setPotencia(sc.nextDouble());
		// fazer a validação
		System.out.println("Insira a eficiencia do motor: ");
		m1.setEficiencia(sc.nextDouble());
		// fazer validação
		System.out.println("Insira a velocidade do motor ");
		m1.setVelocidade(sc.nextDouble());
		// fazer a validação
		System.out.println("Insira a tensão do motor:");
		m1.setTensao(sc.nextDouble());
		// fazer a validação 
		System.out.println("Insira a capacidade do motor:");
		m1.setCapacidade(sc.next());
		//fazer a validação
		System.out.println("Insira o tipo de enrolamento do motor: ");
		m1.setTipoEnrolamento(sc.next ());
		// fazer validação
		System.out.println("Insira o preço do Motor:");
		m1.setPreco(sc.nextDouble());
	
		
		// colocar o motor no array list, e talves fazer um for para conseguir cadastrar vários motores,
		// tambem precisa fazer o calculo da eficiencia do motor e apresentar. 
		// no final do cadastro mostrar todas as informações cadastradas. (feito)
		// tavez fazer um for com a quantidade de motores que serão cadastrados, e pedir ao usuario essa qauntidade, ai talvez tenha ue ser um vetor.
		
		System.out.println(" Motor (n°) cadastrado: ");
		System.out.println(" Código:" + m1.getCodigo());
		System.out.println(" Tipo: "+ m1.getTipo());
		System.out.println(" Potencia: "+ m1.getPotencia());
		System.out.println(" Eficiencia: "+ m1.getEficiencia());
		System.out.println(" Velocidade: "+ m1.getVelocidade());
		System.out.println(" Tensão: "+ m1.getTensao());
		System.out.println(" Capacidade: "+ m1.getCapacidade());
		System.out.println(" Tipo de Enrolamento: "+ m1.getTipoEnrolamento());
		System.out.println(" Preço: "+ m1.getPreco());
		break; // acabou o caso 1
		
	case 2:
		System.out.println("\n-- Cadastro do Inversor de frequencia");
		System.out.println("Insira o código do Inversor: ");
		inversor1.setCodigo(sc.nextInt());
		// fazer a validação
		System.out.println("Insira o tipo de Inversor:");
		inversor1.setTipo(sc.next());
		//fazer a validação
		System.out.println("Insira a potencia do inversor: ");
		inversor1.setPotencia(sc.nextDouble());
		//fazer a validação
		System.out.println("Insira a tensão do inversor: ");
		inversor1.setTensao(sc.nextDouble());
		//fazer a validação 
		System.out.println("Insira a capacidde do inversor:");
		inversor1.setCapacidade(sc.next());
		//fazer a validação
		System.out.println("Insira a capacidade de frequencia do Inversor: ");
		inversor1.setCapacidade(sc.next());
		// fazer a validação
		System.out.println("Insira o numero de fases do Inversor: ");
		inversor1.setNumFases(sc.nextInt());
		//fazer a validação
		System.out.println("Insira o preço do inversor de frequencia: ");
		inversor1.setPreco(sc.nextDouble());
		// fazer a validação
		
		// fazer a validação de todos; mesma ideias do motor.
		
		System.out.println(" Inversor de Frequencia (n°) cadastrado: ");
		System.out.println(" Código:" + inversor1.getCodigo());
		System.out.println(" Tipo: "+ inversor1.getTipo());
		System.out.println(" Potencia: "+ inversor1.getPotencia());
		System.out.println(" Tensão: "+ inversor1.getTensao());
		System.out.println(" Capacidade: "+ inversor1.getCapacidade());
		System.out.println(" Capacidade de frequencia: "+ inversor1.getCapacidadeFrequencia());
		System.out.println(" Número de fases: "+ inversor1.getNumFases());
		System.out.println(" Preço: "+ inversor1.getPreco());
		break; // acaba o caso 2
		
	case 3:
		System.out.println("\n -- Cadastro do Gerador ");
		System.out.println("Insira o código do gerador:");
		gerador1.setCodigo(sc.nextInt());
		//falta a validação
		System.out.println("Insira o tipo de gerador: ");
		gerador1.setTipo(sc.next());
		//fazer a validaçao
		System.out.println("Insira a Autonomia do gerador:");
		gerador1.setAutonomia(sc.nextInt());
		// fazer a validação
		System.out.println("Insira a Capacidade do gerador:");
		gerador1.setCapacidade(sc.next());
		//fazer a validação
		System.out.println("Insira a qual o conbustível do gerador: :");
		gerador1.setCombustivel(sc.next());
		// fazer a validação
		System.out.println("Insira a potencia do gerador:");
		gerador1.setPotencia(sc.nextDouble());
		// fazer a validação
		System.out.println("Insira a tensao do gerador:");
		gerador1.setTensao(sc.nextDouble());
		// fazer a validação
		System.out.println("Insira o preço do gerador:");
		gerador1.setPreco(sc.nextDouble());
		
		// fazer o array list e mostrar(mesmos esquemas do motor e inversor)
		
		System.out.println(" Gerador (n°) cadastrado: ");
		System.out.println(" Código:" + gerador1.getCodigo());
		System.out.println(" Tipo: "+ gerador1.getTipo());
		System.out.println(" Potencia: "+ gerador1.getPotencia());
		System.out.println(" Tensão: "+ gerador1.getTensao());
		System.out.println(" Capacidade: "+ gerador1.getCapacidade());
		System.out.println(" Autonomia: "+ gerador1.getAutonomia());
		System.out.println(" Combuistível: "+ gerador1.getCombustivel());
		System.out.println(" Preço: "+ gerador1.getPreco());
		break; // acaba o caso 3 
		
			}
		} while (opcao !=0);
	}
}
