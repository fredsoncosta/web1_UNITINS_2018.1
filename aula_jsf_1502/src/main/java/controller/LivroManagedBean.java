package controller;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.SessionScoped;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;

import beans.Livro;
@ManagedBean(name="livrobd")
@SessionScoped
public class LivroManagedBean {
	private List<Livro> livros;
	private Livro livro;
	private int indiceEdicao;
	
	public LivroManagedBean() {
		this.livros = new ArrayList<Livro>();
		this.inicializar();
	}
	
	private void inicializar() {
		this.livro = new Livro();
	}

	public String inserir() {
		if (this.livros.add(this.livro)) {
			this.inicializar();
			return("sucesso");
		}
		return ("falha");
	}
	
	public String excluir(Livro livro) {
		this.livros.remove(livro);
		return("principal");
	}
	
	public String editar(Livro livro) {
		this.indiceEdicao = this.livros.indexOf(livro);
		this.livro = livro;
		return("editar");
	}
	
	public String editar() {
		this.livros.set(this.indiceEdicao, this.livro);
		this.inicializar();
		return("principal");
	}
	
	public String principal() {
		this.inicializar();
		return "principal";
	}
	
	public List<Livro> getLivros(){
		return(this.livros);
	}
	
	public void setLivros(List<Livro> livros) {
		this.livros = livros;
	}
	
	public Livro getLivro() {
		return livro;
	}

	public void setLivro(Livro livro) {
		this.livro = livro;
	}

	
}
