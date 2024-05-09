package atividade2;

public class Aluno extends Pessoa {

	private int matricula;

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		if ( matricula > 0)
		this.matricula = matricula;
	}
	
	public void apresentar () {
		
	}
	
}
