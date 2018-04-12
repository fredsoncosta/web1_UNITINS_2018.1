/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;


/**
 *
 * @author fredsonvieiracosta
 */
public class Estado {

  private String sigla;
  private String nome;

  public Estado() {
    this.sigla = "";
    this.nome = "";
  }

  public Estado(String sigla, String nome) {
    this.sigla = sigla;
    this.nome = nome;
  }

  @Override
  public boolean equals(Object obj) {
    Estado outro = (Estado) obj;
    return(outro.sigla.equals(this.sigla) && outro.nome.equals(this.nome));
  }

  /**
   * @return the sigla
   */
  public String getSigla() {
    return sigla;
  }

  /**
   * @param sigla the sigla to set
   */
  public void setSigla(String sigla) {
    this.sigla = sigla;
  }

  /**
   * @return the nome
   */
  public String getNome() {
    return nome;
  }

  /**
   * @param nome the nome to set
   */
  public void setNome(String nome) {
    this.nome = nome;
  }
}
