import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
		int opcao, opcao2;
		
		ArrayList<Usuario> usuariosRegistrados = new ArrayList<>();
		ArrayList<Eventos> ListaEventos = new ArrayList<>();
		
		do {
			Usuario user = new Usuario();
			Eventos evento = new Eventos();
			SistemaEventos sisEventos = new SistemaEventos();
			
		System.out.println("\nBem-Vido ao sistema de Eventos!"+
		"\n1- Login"+
		"\n2- Cadastro"+
		"\n0- sair do sistema");
		opcao = sc.nextInt();
		
		switch (opcao) {
		case 1: 
			usuariosRegistrados.add(new Usuario());
			int b = usuariosRegistrados.size()-1;
			
			do {
				System.out.println(" Nome (mais de 3 caracter) :");
				if (usuariosRegistrados.get(b).setNome(sc.next()) == true) {
					break;
				}
			} while (true);
			
			do {
			System.out.println(" Email (usar @): ");
			if (usuariosRegistrados.get(b).setEmail(sc.next()) == true){
				break;
			}
		} while (true);
			
			do {
			System.out.println(" Senha (mais de 5 caracter) : ");
			if (usuariosRegistrados.get(b).setSenha(sc.next()) ==true ) {
				break;
			}
		} while (true);
			break;
			
		case 2: 
			usuariosRegistrados.add(new Usuario());
			int c = usuariosRegistrados.size()-1;
			
			do {
			System.out.println(" Nome (mais de 3 caracter) : t"
					+ "");
			if (usuariosRegistrados.get(c).setNome(sc.next()) == true) {
				break;
			}
		}while(true);
			
			do {
			System.out.println(" Email (usar @): ");
			if (usuariosRegistrados.get(c).setEmail(sc.next())==true) {
				break;
			}
		} while (true);
			
			do {
			System.out.println("Senha (mais de 5 caracter) :");
			if (usuariosRegistrados.get(c).setSenha(sc.next())==true){
				break;
			}
		} while (true);
			
			System.out.println("cadastro realizado!");
			break;	
		}
		
		System.out.println("\n--- Pagina principal ---\n"+
		"\n1- Cadastrar evento"+
		"\n2- listar eventos"+ 
		"\n3- Listar usuários");
		opcao2 = sc.nextInt();
		
		switch (opcao2) {
		case 1:
			ListaEventos.add(new Eventos());
			int d = ListaEventos.size()-1;
			
			System.out.println("CADASTRO DE EVENTOS");
			
			do {
				System.out.println("Titulo do evento: ");
				if (ListaEventos.get(d).setTitulo(sc.next())==true) {
					break;
				}
			} while (true);
			
			do {
				System.out.println("Data (toda junta): ");
				if (ListaEventos.get(d).setData(sc.next())==true) {
					break;
				}
			} while(true);
			
			do {
				System.out.println("Localização: ");
				if (ListaEventos.get(d).setLocalizacao(sc.next())==true) {
					break;
				}
			}while (true);
			
			do {
				System.out.println("Descrição do evento: ");
				if (ListaEventos.get(d).setDescricao(sc.next())==true) {
					break;
				}
			} while(true);
			
			
		break;
		
		case 2:
				System.out.println(" LISTA DE EVENTOS ");
				for ( int cont=0; cont<ListaEventos.size(); cont++) {
				System.out.println(" Titulo do evento: "+ ListaEventos.get(cont).getTitulo());
				System.out.println(" Data: "+ ListaEventos.get(cont).getData());
				System.out.println(" Localização: "+ ListaEventos.get(cont).getLocalizacao());
				System.out.println(" Descrição: "+ ListaEventos.get(cont).getDescricao());
			}
		break;
		
		case 3: 
			System.out.println("LISTA DE USUARIOS");
			for ( int cont=0; cont<usuariosRegistrados.size(); cont++) {
				System.out.println("Nome: "+ usuariosRegistrados.get(cont).getNome());
				System.out.println("Email: "+ usuariosRegistrados.get(cont).getEmail() );
			}
		break;
			
		}
		
		} while (opcao !=0);
	}

}


