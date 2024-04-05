package herança;

public class Professor extends Pessoa {

	private String materia;

	public String getMateria() {
		return materia;
	}

	public void setMateria(String materia) {
		if (materia.matches(".*[a-z].*") || materia.matches(".*[A-Z].*")) {
			this.materia = materia;
		}
	}
}
