/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package validator;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

/**
 *
 * @author fredsonvieiracosta
 */
@FacesValidator("cpfValidator")
public class CPFValidator implements Validator{

  @Override
  public void validate(FacesContext fc, UIComponent uic, Object o) throws ValidatorException {
    if (o.toString().length() != 11)
    {
      FacesMessage mensagem = new FacesMessage("Tamanho incorreto do CPF");
      mensagem.setSeverity(FacesMessage.SEVERITY_FATAL);
      throw new ValidatorException(mensagem);
    }
  }
  
  
}