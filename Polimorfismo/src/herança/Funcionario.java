package herança;

public class Funcionario extends Pessoa {
	
	private String email;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		if(email.contains("@")) {
			this.email = email;
		}
	}
}
