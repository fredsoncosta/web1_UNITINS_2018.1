package beans;

public class Livro {
	private String titulo;
	private String editora;
	private int edicao;
	
	public Livro() {
		this.titulo = "";
		this.editora = "";
		this.edicao = 1;
	}

	public Livro(String titulo, String editora, int edicao) {
		this.titulo = titulo;
		this.editora = editora;
		this.edicao = edicao;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getEditora() {
		return editora;
	}

	public void setEditora(String editora) {
		this.editora = editora;
	}

	public int getEdicao() {
		return edicao;
	}

	public void setEdicao(int edicao) {
		this.edicao = edicao;
	}
	
	
}
