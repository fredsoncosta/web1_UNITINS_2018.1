/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.HashMap;
import java.util.Map;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import beans.Estado;
import beans.EstadoBD;

/**
 *
 * @author fredsonvieiracosta
 */
@ManagedBean(name="estadomb")
@SessionScoped
public class EstadoMB {
  private Estado estado;
  private Map<String, Estado> estados;
  private String cpf;

  public EstadoMB() {
    this.estado = new Estado();
    EstadoBD estadoBD = new EstadoBD();
    this.estados = new HashMap<String, Estado>() {};
    this.cpf = "";
    for(Estado e : estadoBD.getEstados())
    {
      this.estados.put(e.getNome(), e);
    }
  }

  /**
   * @return the estado
   */
  public Estado getEstado() {
    return estado;
  }

  /**
   * @param estado the estado to set
   */
  public void setEstado(Estado estado) {
    this.estado = estado;
  }

  
  public String salvar()
  {
//    EstadoBD estado = new EstadoBD();
//    this.estado.setNome(estado.buscaNome(this.estado.getSigla()));
    return("salvar");
  }

  /**
   * @return the estados
   */
  public Map<String, Estado> getEstados() {
    return estados;
  }

  /**
   * @param estados the estados to set
   */
  public void setEstados(Map<String, Estado> estados) {
    this.estados = estados;
  }

  /**
   * @return the cpf
   */
  public String getCpf() {
    return cpf;
  }

  /**
   * @param cpf the cpf to set
   */
  public void setCpf(String cpf) {
    this.cpf = cpf;
  }
}
