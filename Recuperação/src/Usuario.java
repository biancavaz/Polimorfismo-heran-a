import java.util.ArrayList;

public class Usuario {

	private String nome;
	ArrayList<Usuario> filmesRegistradosUser = new ArrayList();
	
	public String getNome() {
		return nome;
	}
	public boolean setNome(String nome) {
		if (nome.length()>3) {
			this.nome = nome;
			return true;
		}return false;
	}
	
	public void registraFilme () {
		
	}
	
	public ArrayList<Usuario> getfilmesRegistradosUser() {
		return this.filmesRegistradosUser;
	}
	public void setfilmesRegistradosUser(Usuario filmesRegistradosUser) {
		this.filmesRegistradosUser.add(filmesRegistradosUser);
	}
}

