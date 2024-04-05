
package HerancaAbastract;

abstract class Animal {
	
	    private String nome;

	    public Animal(String nome) {
	        this.nome = nome;
	    }

	    public String getNome() {
	        return nome;
	    }

	    // Método abstrato
	    public abstract void fazerBarulho();
	}
