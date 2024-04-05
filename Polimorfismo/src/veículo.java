import java.util.Set;

public class veículo {

		double velocidade;

	
		public double getVelocidade() {
			return velocidade;
		}
		
		public void setVelocidade(double velocidade) {
			this.velocidade = velocidade;
		}
		
		public void mudarVelocidade () {
			this.velocidade = velocidade * 1.05;
		}  

		
		

}
