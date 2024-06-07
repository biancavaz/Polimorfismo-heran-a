
public class Filmes {

	private String titulo;
	private String diretorFilme;
	private String dataLancamento;
	private String Descricao;
	
	public String getTitulo() {
		return titulo;
	}
	public boolean setTitulo(String titulo) {
		if(titulo.length()>3) {
			this.titulo = titulo;
		return true;
		} return false;
	}
	public String getDiretorFilme() {
		return diretorFilme;
	}
	public boolean setDiretorFilme(String diretorFilme) {
		if(diretorFilme.length()>3) {
			this.diretorFilme = diretorFilme;
		return true;
		} return false;
	}
	public String getDataLancamento() {
		return dataLancamento;
	}
	public boolean setDataLancamento(String dataLancamento) {
		if (dataLancamento.matches("\\d{2}/\\d{2}/\\d{4}")) {
			this.dataLancamento = dataLancamento;
			return true; 
		}return false;

	}
	public String getDescricao() {
		return this.Descricao;
	}
	public boolean setDescricao(String descricao) {
		if (descricao.length() > 5) {
			this.Descricao = descricao;
			return true;
		}
		return false;
	}
	
	
}
