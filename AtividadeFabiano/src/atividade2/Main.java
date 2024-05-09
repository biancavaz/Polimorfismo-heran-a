package atividade2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in); 
		
		int opcao, opcao1, opcao2; 
		
		Professor prof = new Professor();
		Aluno aluno1 = new Aluno();
		Disciplina disciplina = new Disciplina();
		
		ArrayList<Aluno> listaAlunos = new ArrayList(); 
		ArrayList<Professor> listaProfessores = new ArrayList(); 
		ArrayList<Disciplina> listaDisciplinas = new ArrayList(); 
		
		do {
		System.out.println("1-CADASTRAR\n 2-LISTAR");
		opcao = sc.nextInt();
		
		switch (opcao) {
		case 1: 
			System.out.println("1- ALUNOS\n2-PROFESSOR\n3-DISCIPLINA ");
			opcao1 = sc.nextInt();
			switch (opcao1) {
			case 1:
				listaAlunos.add(new Aluno());
				int b = listaAlunos.size()-1;
				
				System.out.println(" CADASTRO DE ALUNOS");
				
				System.out.println("Nome do aluno: ");
				listaAlunos.get(b).setNome(sc.next());
				
				System.out.println("Idade do aluno: ");
				listaAlunos.get(b).setIdade(sc.nextInt());
				
				System.out.println("Matrícula do aluno: ");
				listaAlunos.get(b).setMatricula(sc.nextInt());
			break; // para o caso 1 opcao1
			
			case 2: 
				listaProfessores.add(new Professor());
				int a = listaProfessores.size()-1; 
				
				System.out.println(" CADSTRO DE PROFESSORES ");
				
				System.out.println("Nome do Professor: ");
				listaProfessores.get(a).setNome(sc.next());
				
				System.out.println("Idade do Professor");
				listaProfessores.get(a).setIdade(sc.nextInt());
				
				System.out.println("Especialidade: ");
				listaProfessores.get(a).setEspecialidade(sc.next());
			break; // para o caso 2 da opcao1
				
			case 3:
				listaDisciplinas.add(new Disciplina());
				int c = listaDisciplinas.size()-1; 
				
				System.out.println(" CADASTRO DE DISCIPLINAS ");
				System.out.println("Nome da Disciplina: ");
				listaDisciplinas.get(c).setDisciplina(sc.next());
				break; // para o caso 3 opcao1
			}
			
				break; // para o caso 1
				
		case 2: 
			System.out.println(" 1- ALUNOS \n2- PROFESSOR \n3-DISCIPLINAS");
			opcao2 = sc.nextInt();
			
			switch (opcao2) {
			case 1:
				for ( int cont=0; cont<listaAlunos.size(); cont++) {
					System.out.println("Nome: "+ listaAlunos.get(cont).getNome());
					System.out.println("Idade: "+ listaAlunos.get(cont).getIdade());
					System.out.println("Matrícula: "+listaAlunos.get(cont).getMatricula());
					System.out.println("Disciplina: "+ listaDisciplinas.get(cont).getDisciplina());
					System.out.println("Professor: "+listaProfessores.get(cont).getNome());
					System.out.println("------------------");
				}
				break; // para o caso 1 opcao 2
				
			case 2: 
				for ( int cont=0; cont<listaProfessores.size(); cont++) {
					System.out.println("Nome: "+ listaProfessores.get(cont).getNome());
					System.out.println("Idade: "+ listaProfessores.get(cont).getIdade());
					System.out.println("especialidade: "+listaProfessores.get(cont).getEspecialidade());
					System.out.println("Disciplina: "+ listaDisciplinas.get(cont).getDisciplina());
					System.out.println("-------------------");
				}
				break; // para o caso 2 opcao 2
			
			case 3: 
				for ( int cont=0; cont<listaDisciplinas.size(); cont++) {
					System.out.println("Nome: "+ listaDisciplinas.get(cont).getDisciplina());
					System.out.println("Aluno: "+listaAlunos.get(cont).getNome());
					System.out.println("Professor: "+ listaProfessores.get(cont).getNome());
					System.out.println("--------------------");
				}
				break; // para o caso 3 opcao 2 
			}
			break; // para o caso 2
		}
		
		}while (opcao !=0);

	}

}
