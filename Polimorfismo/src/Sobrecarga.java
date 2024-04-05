import java.util.Scanner;

public class Sobrecarga {
	public static void main (String args[]) {
		
		Scanner scanner = new Scanner (System.in);
		
		double velocidade;
		
		System.out.println(" informe a velocidade: ");
		velocidade = scanner.nextDouble();
		
		car car1 = new car ();
		Bike bike1 = new Bike(); 
		veículo veiculo1 = new veículo(); 
		
		bike1.setVelocidade(velocidade);
		car1.setVelocidade(velocidade);
		veiculo1.setVelocidade(velocidade);
		
		bike1.mudarVelocidade();
		car1.mudarVelocidade();	
		
	}
}
