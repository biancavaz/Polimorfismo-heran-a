package Expliacacao2;

public class Teste {
	
	public void main (String[] args ) {
	Cachorro doguinho = new Cachorro();
	doguinho.setNome("fifi");
	doguinho.latir();
	
	Animal bicho;
	bicho = new Cachorro ();
	bicho.setNome("Doguinho");
	((Cachorro)bicho).latir();
	
	
	}
}
