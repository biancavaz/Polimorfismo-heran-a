import java.util.ArrayList;

public class Usuario {

	private String nome;
	private String email;
	private String senha;
	ArrayList<SistemaEventos> eventosRegistradosUser = new ArrayList<>();
	
	
	public String getNome() {
		return this.nome;
	}
	public boolean setNome(String nome) {
		if (nome.length()>3) {
		this.nome = nome;
		return true;
		} return false;
	}
	
	public String getEmail() {
		return email;
	}
	public boolean setEmail(String email) {
		if (email.matches(".*[@].*")) {
			this.email = email;
			return true;
		} return false;
	}
	public String getSenha() {
		return senha;
	}
	public boolean setSenha(String senha) {
		if (senha.length()>=4) {
		this.senha = senha;
		return true;
		} return false;
	}
	
	public ArrayList<SistemaEventos> getEventosRegistradosUser() {
		return this.eventosRegistradosUser;
	}
	public void setEventosRegistradosUser(ArrayList<SistemaEventos> eventosRegistradosUser) {
		this.eventosRegistradosUser = eventosRegistradosUser;
	}
	
}
