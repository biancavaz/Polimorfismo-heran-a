package herança;

public class chefe extends Pessoa {
	
	private String setor;


	public String getSetor() {
		return setor;
	}

	public boolean setSetor(String setor) {
		if (setor.contains("@") || setor.contains("*") || setor.matches(".*(1-9).*")) {
		return false;	
		} else {
			this.setor = setor;
			return true; 
		}
	}
}
