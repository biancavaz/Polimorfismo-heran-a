package herança;

import java.util.Scanner;

public class main {
	
	public static void main (String args[]) {
		
		Scanner sc = new Scanner (System.in); 
		
		chefe chefe1 = new chefe();
		Funcionario funcionario1 = new Funcionario(); 
		Professor professor1 = new Professor(); 
		Pessoa pessoa1 = new Pessoa ();
		
		chefe1.setNome("Bianca");
		chefe1.setIdade(16);
		chefe1.setSetor("bobinagem\n");
		
		System.out.println(chefe1.getNome());
		System.out.println(chefe1.getIdade());
		System.out.println(chefe1.getSetor());
		
		funcionario1.setNome("Gabriel");
		funcionario1.setIdade(17);
		funcionario1.setEmail("gabriellll@gmail.com\n");
		
		System.out.println(funcionario1.getNome());
		System.out.println(funcionario1.getIdade());
		System.out.println(funcionario1.getEmail());
		
		professor1.setNome("Cailombinho");
		professor1.setIdade(16);
		professor1.setMateria("Matemática");
		
		System.out.println(professor1.getNome());
		System.out.println(professor1.getIdade());
		System.out.println(professor1.getMateria());
		
		System.out.println("Informe o seu nome:");
		String nome = sc.next();

		do {
			if (professor1.setNome(nome)== true) {
				break; 
			} else {
				System.out.println(" informe o nome novamente: ");
				nome = sc.next();
			}
			
		} while (true);
		
		System.out.println("o nome do professor é: "+ professor1.getNome());
		
	}
}
