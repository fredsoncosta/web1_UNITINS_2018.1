/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seguranca;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author fredsonvieiracosta
 */
@ManagedBean(name = "usuario")
@SessionScoped
public class Usuario {
	private String login;
	private String senha;
	private String mensagem;
	
	public Usuario() {
		this.inicializar();
	}

	private void inicializar() {
		this.login = "";
		this.senha = "";
		this.mensagem = "";
	}

	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}

	public String autenticar() {
		if (this.login.equals("fredson") && this.senha.equals("123")) {
			return ("sucesso");
		}
		this.mensagem = "Login e/ou senha inválidos!";
		return ("falha");
	}

	public String logout() {
		this.inicializar();
		return("logout");
	}
	
	public String cadlivro() {
		return("cadlivro");
	}

	/**
	 * @return the login
	 */
	public String getLogin() {
		return login;
	}

	/**
	 * @param login
	 *            the login to set
	 */
	public void setLogin(String login) {
		this.login = login;
	}

	/**
	 * @return the senha
	 */
	public String getSenha() {
		return senha;
	}

	/**
	 * @param senha
	 *            the senha to set
	 */
	public void setSenha(String senha) {
		this.senha = senha;
	}

}