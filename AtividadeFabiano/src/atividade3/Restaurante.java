package atividade3;

import java.util.ArrayList;
import java.util.Scanner;

import atividade2.Aluno;
import atividade2.Professor;

public class Restaurante {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		
		int opcao, opcao1, opcao2;
		
		PratoPrincipal prato = new PratoPrincipal();
		Sobremesa sobresesa = new Sobremesa (); 
		
		ArrayList<PratoPrincipal> listaPratos = new ArrayList(); 
		ArrayList<Sobremesa> listaSobremesas = new ArrayList(); 
		
		do {
		System.out.println("\n1- CADASTRAR ITEM \n2- LISTAR ITEM \n0- SAIR");
		opcao = sc.nextInt(); 
		
		switch (opcao) {
		
		case 1: 
			System.out.println("\n1- PRATO PRINCIPAL \n2-SOBREMESA ");
			opcao1 = sc.nextInt();
			
			switch (opcao1) {
			
			case 1:
				listaPratos.add(new PratoPrincipal());
				int b = listaPratos.size()-1;
				
				System.out.println("CADASTRO PRATO PRINCIPAL ");
				
				System.out.println("Nome:");
				listaPratos.get(b).setNome(sc.next());
				
				System.out.println("Preço: ");
				listaPratos.get(b).setPreco(sc.nextInt());
				
				System.out.println("Descricao: ");
				listaPratos.get(b).setDescricao(sc.next());
				break;// opcao 1
			case 2:
				listaSobremesas.add(new Sobremesa());
				int c = listaSobremesas.size()-1;
				
				System.out.println(" CADASTRO DE SOBREMESAS ");
				
				System.out.println("Nome: ");
				listaSobremesas.get(c).setNome(sc.next());
				
				System.out.println("Preço: ");
				listaSobremesas.get(c).setPreco(sc.nextInt());
				
				System.out.println("Tipo ");
				listaSobremesas.get(c).setTipo(sc.next());
				
				break;// opcao 2
			}
			break; // opcao 1 
		case 2:
			System.out.println("\n1- ITENS MENU \n2- PRATOS \n3-SOBREMESAS");
			opcao2 = sc.nextInt(); 
			
			switch (opcao2) {
			case 1:
				for (int cont =0; cont<listaPratos.size(); cont++) {
				System.out.println(" ITENS MENU ");
				System.out.println("Prato principal: "+ listaPratos.get(cont).getNome());
				System.out.println("Descrição: "+listaPratos.get(cont).getDescricao());
				System.out.println("preço: "+listaPratos.get(cont).getPreco());
				System.out.println("\nSobremesa: "+ listaSobremesas.get(cont).getNome());
				System.out.println("Tipo: "+ listaSobremesas.get(cont).getTipo());
				System.out.println("Preço: "+ listaSobremesas.get(cont).getPreco());
				System.out.println("--------------------");
				
				} break; // opcao 1 da opcao 2
			case 2:
				for (int cont1 =0; cont1<listaPratos.size(); cont1++) {
					System.out.println(" PRATOS PRINCIPAIS ");
					System.out.println("Prato principal: "+ listaPratos.get(cont1).getNome());
					System.out.println("Descrição: "+listaPratos.get(cont1).getDescricao());
					System.out.println("preço: "+listaPratos.get(cont1).getPreco());
					System.out.println("--------------------");
					
					} break; // opcao 1 da opcao 2
			case 3: 
				for (int cont2 =0; cont2<listaSobremesas.size(); cont2++) {
					System.out.println(" SOBREMESAS ");
					System.out.println("Sobremesa: "+ listaSobremesas.get(cont2).getNome());
					System.out.println("Tipo: "+ listaSobremesas.get(cont2).getTipo());
					System.out.println("Preço: "+ listaSobremesas.get(cont2).getPreco());
					System.out.println("----------------------");
					
					} break; // opcao 1 da opcao 2
			}
			
			break; // opcao 2 da opcao
		}
		
		} while (opcao !=0);

	}

}
