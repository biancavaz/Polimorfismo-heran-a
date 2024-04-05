package herança;

import java.util.Scanner;

public class Apresentação {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		Professor professor1 = new Professor();
		Pessoa pessoa1 = new Pessoa();

		professor1.setNome("Willeman");
		professor1.setIdade(34);
		professor1.setMateria("POO");

		System.out.println(professor1.getNome());
		System.out.println(professor1.getIdade());
		System.out.println(professor1.getMateria());

	}
}
