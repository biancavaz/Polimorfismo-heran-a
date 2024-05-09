package atividade2;

public class Professor extends Pessoa {
	
	private String especialidade;

	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		if (especialidade.matches(".*[a-z].*"))
		this.especialidade = especialidade;
	}
	
	public void apresentar () {
		
	}
	 

}
