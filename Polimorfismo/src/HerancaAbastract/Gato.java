package HerancaAbastract;

	public class Gato extends Animal {
	
	   public Gato(String nome) {
	        super(nome);
	    }

	    @Override
	    public void fazerBarulho() {
	        System.out.println("Miau!");
	    }
	}
