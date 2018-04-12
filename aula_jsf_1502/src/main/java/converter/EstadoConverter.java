/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package converter;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;
import beans.Estado;
import beans.EstadoBD;

/**
 *
 * @author fredsonvieiracosta
 */
@FacesConverter(value = "estadoConverter", forClass = Estado.class)
public class EstadoConverter implements Converter {

  @Override
  public Object getAsObject(FacesContext fc, UIComponent uic, String string) {
    EstadoBD bd = new EstadoBD();
    Estado e = new Estado(string, bd.buscaNome(string));
    return(e);
  }

  @Override
  public String getAsString(FacesContext fc, UIComponent uic, Object o) {
    return(((Estado)o).getSigla());
  }
}
