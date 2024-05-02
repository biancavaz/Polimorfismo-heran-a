import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int opcao;
		
		Scanner sc = new Scanner (System.in);
		ProdutosWeg produtosWeg1 = new ProdutosWeg (56890, "Motor");
		
		MotorEletrico motor = new MotorEletrico( 56, "lalal", 45);
		motor.setVelocidade(50);
		System.out.println(motor.getVelocidade());
		
		motor.setEficiencia(90);
		System.out.println(motor.getEficiencia());
		
		System.out.println(" informe a potencia de entrada ");
		double potencia = sc.nextInt();
		
		System.out.println(" informe a pontencia de saída ");
		double potenciaSaida = sc.nextInt();

		System.out.println(" o resultado é: "+ motor.calculareficiencia(potencia, potenciaSaida));
		
		System.out.println(" Interface de gerenciamento "+
				" 1- Cadastrar Motor Elétrico "+
				" 2- Cadastrar Inversor Frequencia "+
				" 3- Cadastrar Gerador");
		opcao = sc.nextInt();
	}

}
