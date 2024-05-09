
public class Eventos {
	
	private String titulo;
	private String data;
	private String localizacao;
	private String descricao;
	
	
	public String getTitulo() {
		return titulo;
	}
	public boolean setTitulo(String titulo) {
		if (titulo.length()>=5) {
		this.titulo = titulo;
		return true;
		} return false;
	}
	public String getData() {
		return data;
	}
	public boolean setData(String data) {
		this.data = data;
		return true;
	}
	public String getLocalizacao() {
		return localizacao;
	}
	public boolean setLocalizacao(String localizacao) {
		if (localizacao.length()>5) {
		this.localizacao = localizacao;
		return true;
		} return false;
	}
	public String getDescricao() {
		return descricao;
	}
	public boolean setDescricao(String descricao) {
		if(descricao.length()>5) {
			this.descricao = descricao;
			return true; 
		} return false;
	}
	
	

}
