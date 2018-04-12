/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import java.util.ArrayList;

/**
 *
 * @author fredsonvieiracosta
 */
public class EstadoBD {
  private ArrayList<Estado> estados;

  public EstadoBD() {
    this.estados = new ArrayList<Estado>();
    this.estados.add(new Estado("TO", "Tocantins"));
    this.estados.add(new Estado("MA", "Maranhão"));
    this.estados.add(new Estado("PI", "Piauí"));
    this.estados.add(new Estado("BA", "Bahia"));
    this.estados.add(new Estado("RO", "Rondônia"));
    this.estados.add(new Estado("PA", "Pará"));
    this.estados.add(new Estado("PR", "Paraná"));
  }
  
  public String buscaNome(String sigla)
  {
    for (Estado e : this.estados)
    {
      if (e.getSigla().equals(sigla))
      {
        return(e.getNome());
      }
    }
    return("");
  }

  /**
   * @return the estados
   */
  public ArrayList<Estado> getEstados() {
    return estados;
  }

  /**
   * @param estados the estados to set
   */
  public void setEstados(ArrayList<Estado> estados) {
    this.estados = estados;
  }
  
  
}
