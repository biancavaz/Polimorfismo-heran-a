/***
 * A classe Weg é a classe principal que gerencia o sistema de cadastro e listagem de produtos e serviços da WEG.
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Weg {
	
	/**
     * Método principal que inicia o sistema de gerenciamento.
     * Permite o cadastro e listagem de produtos e serviços.
     * @param args os argumentos de linha de comando (não utilizados)
     */
	public static void main (String args []) {
		Scanner sc = new Scanner (System.in);
		
	/** Listas para armazenar os produtos e serviços*/
	ArrayList<Gerador> listaDeGeradores = new ArrayList<>();
	ArrayList<MotorEletrico> listaDeMotores = new ArrayList<>();
	ArrayList<InversorFrequencia> listaDeInversores = new ArrayList<>();
	ArrayList<ServicoManutencao> listaServicoManutencao = new ArrayList<>();
	
	/** variaveis do código*/
	int opcao = 0, opcao1, opcao2, opcaoSM = 0;
	Double potenciaSaida=0.0, potencia=0.0;
	
	/**
	 * Loop principal que executa as funcionalidades do sistema de gerenciamento.
	 */
	do {
		
		MotorEletrico m1 = new MotorEletrico( 1234, "lala", 60 );
		InversorFrequencia inversor1 = new InversorFrequencia (345, "hahaha", 56);
		Gerador gerador1 = new Gerador (789, "kakkaa", 48);
		
		System.out.println("\nInterface de Gerenciamento \n"+
		"\n1- Cadastro de produtos"+
		"\n2- Lista de produtos e serviços "+
		"\n0- sair do sistema ");
		opcao1 = sc.nextInt();
		 
		/**
		 * Realiza o cadastro de produtos ou serviços conforme a escolha do usuário.
		 */
	switch (opcao1) {
	case 1:
		System.out.println(" -- Cadastros  -- \n"+
				"\n1- Cadastrar Motor Elétrico "+
				"\n2- Cadastrar Inversor Frequencia "+
				"\n3- Cadastrar Gerador"+
				"\n4- Cadastrar Serviço de Manutenção ");
				opcao = sc.nextInt();	
		/**
		 * Realiza o cadastro de um motor elétrico.
		*/	
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
			System.out.println("Insira a potencia do motor de entrada:");
			potencia = sc.nextDouble();
			if (listaDeMotores.get(b).setPotencia(potencia)==true)
			break;
			} while (true);
			
			do {
			System.out.println("Insira a pontencia de saída ");
			potenciaSaida = sc.nextDouble();
			if (listaDeMotores.get(b).setPotenciaSaida(potenciaSaida)==true) 
			break;
			} while (true);
			
			do {
			System.out.println("Insira a velocidade do motor ");
			if (listaDeMotores.get(b).setVelocidade(sc.nextDouble())== true)
			break;
			} while (true);
			
			do {
			System.out.println("Insira a tensão do motor:");
			if (listaDeMotores.get(b).setTensao(sc.nextDouble())==true)
			break;
			}while (true);
			
			do {
			System.out.println("Insira a capacidade do motor:");
			if (listaDeMotores.get(b).setCapacidade(sc.next())==true)
			break;
			} while (true);
			
			do {
			System.out.println("Insira o tipo de enrolamento do motor: ");
			if (listaDeMotores.get(b).setTipoEnrolamento(sc.next ())==true)
			break;
			} while (true);
			
			do {
			System.out.println("Insira o preço do Motor:");
			if (listaDeMotores.get(b).setPreco(sc.nextDouble())== true)
			break;
			} while (true);
			// tambem precisa fazer o calculo da eficiencia do motor e apresentar. 
		break; // acabou o caso 1
		
		/**
		 * Realiza o cadastro de um Inversor de Frequencia.
		 */
		case 2:
			listaDeInversores.add(new InversorFrequencia(listaDeInversores.size()));
			int a = listaDeInversores.size()-1;
			System.out.println("\n-- Cadastro do Inversor de frequencia");
			
			do {
			System.out.println("\nInsira o tipo de Inversor:");
			if (listaDeInversores.get(a).setTipo(sc.next()) == true)
			break;
			} while (true);
			
			do {
			System.out.println("Insira a potencia do inversor: ");
			if (listaDeInversores.get(a).setPotencia(sc.nextDouble())==true)
			break;
			} while (true);
			
			do {
			System.out.println("Insira a tensão do inversor: ");
			if (listaDeInversores.get(a).setTensao(sc.nextDouble())==true)
			break;
			} while (true);
			
			do {
			System.out.println("Insira a capacidde do inversor:");
			if (listaDeInversores.get(a).setCapacidade(sc.next())==true)
			break;
			} while (true);
			
			do {
			System.out.println("Insira a capacidade de frequencia do Inversor: ");
			if (listaDeInversores.get(a).setCapacidade(sc.next())==true)
			break;
			} while(true);
			
			do {
			System.out.println("Insira o numero de fases do Inversor: ");
			if (listaDeInversores.get(a).setNumFases(sc.nextInt())==true)
			break;
			} while (true);
			
			do {
			System.out.println("Insira o preço do inversor de frequencia: ");
			if (listaDeInversores.get(a).setPreco(sc.nextDouble()) == true)
			break;
			} while (true);
		break; // acaba o caso 2
		
		/**
		 * Realiza o cadastro de um Gerador.
		 */
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
			if (listaDeGeradores.get(i).setCapacidade(sc.next())== true)
			break;
			} while (true);
			
			do {
			System.out.println("Insira a qual o conbustível do gerador: :");
			if (listaDeGeradores.get(i).setCombustivel(sc.next())== true)
			break;
			} while (true);
			
			do {
			System.out.println("Insira a potencia do gerador:");
			if (listaDeGeradores.get(i).setPotencia(sc.nextDouble()) == true)
			break;
			} while (true); 
			
			do {
			System.out.println("Insira a tensao do gerador:");
			if (listaDeGeradores.get(i).setTensao(sc.nextDouble())== true)
			break;
			} while (true); 
			
			do {
			System.out.println("Insira o preço do gerador:");
			if (listaDeGeradores.get(i).setPreco(sc.nextDouble())== true)
			break;
			} while (true); 
		break; // acaba o caso 3 
		
		/**
		 * Realiza o cadastro de um serviço de manutenção para um produto específico.
		 */
		case 4: 
			// fazer o serviço de manutencao
			listaServicoManutencao.add(new ServicoManutencao(listaServicoManutencao.size()));
			int c = listaServicoManutencao.size()-1;
			
			System.out.println(" Cadastrar serviço de manutenção para:"+
			"\n1- Motor Elétrico"+
			"\n2- Inversor de Frequencia"+
			"\n3- Gerador ");
			opcaoSM = sc.nextInt();
			
			switch (opcaoSM) {
			/**
			 * Realiza o cadastro de um serviço de manutenção para um motor elétrico.
			 */
			case 1:
				System.out.println("\n-- Serviço de manutenção do Motor elétrico  ");
				
				do {
				System.out.println("\nDescrição do Serviço: ");
				if (listaServicoManutencao.get(c).setDescricao(sc.next())==true){
					break;
					}
				} while (true);
				
				do {
				System.out.println("Informe o custo do serviço: ");
				if (listaServicoManutencao.get(c).setCusto(sc.nextDouble())==true)
				break;
				} while (true);
				
			break;
			/**
			 * Realiza o cadastro de um serviço de manutenção para um Inversor de Frequencia.
			 */
			case 2:
				System.out.println("\n-- Serviço de manutenção do Inversor de Frequencia ");
				
				do {
				System.out.println("\nDescrição do Serviço: ");
				if (listaServicoManutencao.get(c).setDescricao(sc.next())==true){
					break;
					}
				} while (true);
				
				do {
				System.out.println("Informe o custo do serviço: ");
				if (listaServicoManutencao.get(c).setCusto(sc.nextDouble())==true)
				break;
				} while (true);
				
			break;
			/**
			 * Realiza o cadastro de um serviço de manutenção para um Gerador.
			 */
			case 3:
				System.out.println("\n-- Serviço de manutenção do Gerador  ");
				
				do {
				System.out.println("\nDescrição do Serviço: ");
				if (listaServicoManutencao.get(c).setDescricao(sc.next())==true){
					break;
					}
				} while (true);
				
				do {
				System.out.println("Informe o custo do serviço: ");
				if (listaServicoManutencao.get(c).setCusto(sc.nextDouble())==true)
				break;
				} while (true);
			break;
			
			}// final do case de SM
			break;
		}
		break;
		
	/**
	* Exibe a lista de produtos e serviços disponíveis para consulta.
	*/
	case 2: 
		System.out.println(" - Lista de produtos e serviços - "+
		"\n1- Listar Motores Eletricos"+
		"\n2- Listar Inversores de Frequencia "+
		"\n3- Listar Geradores " +
		"\n4- Listar serviço de manutenção");
		opcao2 = sc.nextInt();
		
		/**
		 * Lista os motores elétricos cadastrados.
		 */
		switch (opcao2) {
		case 1: 
			for ( int cont=0; cont<listaDeMotores.size(); cont++) {
		
				System.out.println(" LISTA DE MOTORES ELÉTRICOS ");
				System.out.println("\nCódigo:" + listaDeMotores.get(cont).getCodigo());
				System.out.println(" Tipo: "+ listaDeMotores.get(cont).getTipo());
				System.out.println(" Potencia de entrada: "+ listaDeMotores.get(cont).getPotencia());
				System.out.println(" Potencia de saída: "+ listaDeMotores.get(cont).getPotenciaSaida());
				System.out.println(" Eficiencia: "+ listaDeMotores.get(cont).calculareficiencia(potencia, potenciaSaida));
				System.out.println(" Velocidade: "+ listaDeMotores.get(cont).getVelocidade());
				System.out.println(" Tensão: "+ listaDeMotores.get(cont).getTensao());
				System.out.println(" Capacidade: "+ listaDeMotores.get(cont).getCapacidade());
				System.out.println(" Tipo de Enrolamento: "+ listaDeMotores.get(cont).getTipoEnrolamento());
				System.out.println(" Preço: "+ listaDeMotores.get(cont).getPreco());
				System.out.println("_______________________________________________________________");
			} break;
			
		/**
		* Lista os Inversores de Frequencia cadastrados.
		*/
		case 2:
			for ( int cont=0; cont<listaDeInversores.size(); cont++) {
				System.out.println(" LISTA DE INVERSORES DE FREQUENCIA ");
				System.out.println("\nCódigo:" + listaDeInversores.get(cont).getCodigo());
				System.out.println(" Tipo: "+ listaDeInversores.get(cont).getTipo());
				System.out.println(" Potencia: "+ listaDeInversores.get(cont).getPotencia());
				System.out.println(" Tensão: "+ listaDeInversores.get(cont).getTensao());
				System.out.println(" Capacidade: "+ listaDeInversores.get(cont).getCapacidade());
				System.out.println(" Capacidade de frequencia: "+ listaDeInversores.get(cont).getCapacidadeFrequencia());
				System.out.println(" Número de fases: "+ listaDeInversores.get(cont).getNumFases());
				System.out.println(" Preço: "+ listaDeInversores.get(cont).getPreco());
				System.out.println("_______________________________________________________________");
			} break;
			
		/**
		* Lista os Geradores cadastrados.
		*/
		case 3:
			for ( int cont=0; cont<listaDeGeradores.size(); cont++) {
				System.out.println(" LISTA DE GERADORES: ");
				System.out.println("\nCódigo:" + listaDeGeradores.get(cont).getCodigo());
				System.out.println(" Tipo: "+  listaDeGeradores.get(cont).getTipo());
				System.out.println(" Potencia: "+ listaDeGeradores.get(cont).getPotencia());
				System.out.println(" Tensão: "+  listaDeGeradores.get(cont).getTensao());
				System.out.println(" Capacidade: "+  listaDeGeradores.get(cont).getCapacidade());
				System.out.println(" Autonomia: "+  listaDeGeradores.get(cont).getAutonomia());
				System.out.println(" Combuistível: "+  listaDeGeradores.get(cont).getCombustivel());
				System.out.println(" Preço: "+  listaDeGeradores.get(cont).getPreco());
				System.out.println("_______________________________________________________________");
			} break;
		
		/**
		* Lista os serviços de manutenção cadastrados para o tipo específico de produto.
		*/
		case 4: 
			/**
			 * Lista os serviços de manutenção cadastrados para motores elétricos.
			 */
			System.out.println("\nLISTA DE SERVIÇOS DE MANUTENÇÃO  ");
			for ( int cont=0; cont<listaServicoManutencao.size(); cont++) {
			if (opcaoSM == 1) {
				System.out.println("\nServico de manutencao Motores");
				System.out.println(" Código:" + listaServicoManutencao.get(cont).getCodigo());
				System.out.println(" Custo: "+  listaServicoManutencao.get(cont).getCusto());
				System.out.println(" Descrição: "+ listaServicoManutencao.get(cont).getDescricao());
				System.out.println("____________________________________________");
			}
			
			/**
			 * Lista os serviços de manutenção cadastrados para inversores de frequência.
			 */
			if (opcaoSM == 2) {
				System.out.println("\nServiço manutenção Inversores");
				System.out.println(" Código:" + listaServicoManutencao.get(cont).getCodigo());
				System.out.println(" Custo: "+  listaServicoManutencao.get(cont).getCusto());
				System.out.println(" Descrição: "+ listaServicoManutencao.get(cont).getDescricao());
				System.out.println("____________________________________________");
			}
			
			/**
			 * Lista os serviços de manutenção cadastrados para geradores.
			 */
			if (opcaoSM == 3) {
				System.out.println("\nServiço de manutencao Geradores ");
				System.out.println(" Código:" + listaServicoManutencao.get(cont).getCodigo());
				System.out.println(" Custo: "+  listaServicoManutencao.get(cont).getCusto());
				System.out.println(" Descrição: "+ listaServicoManutencao.get(cont).getDescricao());
				System.out.println("____________________________________________");
				}
			}
		}
		
			}
	
		} while (opcao1 !=0);
	}
}
