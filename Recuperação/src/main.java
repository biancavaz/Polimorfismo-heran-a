import java.util.ArrayList;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in); 
		
		Filmes filme1 = new Filmes(); 
		SistemaFilmes sisFilme = new SistemaFilmes();
		Usuario user = new Usuario();
		
		ArrayList<Filmes> listaFilmes = new ArrayList();
		ArrayList<Usuario> filmesRegistradosUser = new ArrayList();
		
		int opcao;
		
		do {
		System.out.println("\nGERENCIAMENTO DE FILMES\n");
		
		System.out.println("1- Adicionar filme"
				+ "\n2- Ver meus filmes registrados"
				+ "\n3- Ver todos os filmes no sistema"
				+ "\n4- sair");
		opcao = sc.nextInt(); 
		
		switch (opcao) {
		case 1:
			filmesRegistradosUser.add(new Usuario());
			int b = filmesRegistradosUser.size()-1;
			
			do {
			System.out.println("Informe o seu nome:");
				if (filmesRegistradosUser.get(b).setNome(sc.next()) == true){
			break;
				}
			} while (true);
			
			listaFilmes.add(new Filmes());
			int a = listaFilmes.size()-1;
			
			System.out.println("\nCADASTRO DO FILME");
			
			do {
			System.out.println(" Informe o título do filme:");
				if (listaFilmes.get(a).setTitulo(sc.next()) ==true){
			break;
				}
			} while (true);
			
			do {
			System.out.println(" Informe o Diretor do filme:");
				if (listaFilmes.get(a).setDiretorFilme(sc.next()) ==true){
			break;
				}
			} while (true);
			
			do {
			System.out.println("Informe a data de lancamento do filme:");
				if (listaFilmes.get(a).setDataLancamento(sc.next())==true) {
			break;
				}
			} while (true);
			
			do {
			System.out.println("Informe a descricao do filme:");
				if (listaFilmes.get(a).setDescricao(sc.next())==true) {
			break;
				}
			} while (true);
		break;
			
		case 2: 
			
			System.out.println("\nFILMES REGISTRADOS POR USUÁRIO \n");
			for ( int cont=0; cont<filmesRegistradosUser.size(); cont++) {
				
				System.out.println("\nNome do usuário: " + filmesRegistradosUser.get(cont).getNome() );
				System.out.println("Nome do filme: "+ listaFilmes.get(cont).getTitulo());
				System.out.println("Data de lançamento: "+ listaFilmes.get(cont).getDataLancamento());
				System.out.println("Diretor do Filme: "+ listaFilmes.get(cont).getDiretorFilme());
				System.out.println("Descrição do filme: "+ listaFilmes.get(cont).getDescricao());
			
			}
		break;
			
		case 3: 
			
			System.out.println("\nFILMES REGISTRADOS");
			for ( int cont=0; cont<listaFilmes.size(); cont++) {
				System.out.println("\nNome do filme: "+ listaFilmes.get(cont).getTitulo());
				System.out.println("Data de lançamento: "+ listaFilmes.get(cont).getDataLancamento());
				System.out.println("Diretor do Filme: "+ listaFilmes.get(cont).getDiretorFilme());
				System.out.println("Descrição do filme: "+ listaFilmes.get(cont).getDescricao());
			}
		break;
			
		}
		
		}while (opcao !=4);
	}
}
