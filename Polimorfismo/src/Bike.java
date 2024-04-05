
public class Bike extends veículo {
	
	double velocidade;
	
	
	
	public double getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(double velocidade) {
		this.velocidade = velocidade;
	}

	@Override
	public void mudarVelocidade () {
		this.velocidade = velocidade * 1.20;
		System.out.println(velocidade);
	}
	
	
	

}
