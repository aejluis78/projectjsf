package mx.com.project.jsf.udemy;

import java.io.IOException;

import javax.faces.application.FacesMessage;
import javax.faces.application.FacesMessage.Severity;
import javax.faces.bean.ManagedBean;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;

@ManagedBean(name="loginController")
public class LoginController {
	
	private String usuario;
	private String password;
	
	public void ingresar() {
		validaUsuario();
		System.out.println("usuario ::" + usuario);
		System.out.println("password ::" + password);
	}
	
	private void validaUsuario() {
		if (usuario.equals("joseluis") && password.equals("asdfg")) {
			try {
				redirecciona("principal.xhtml");
			} catch (IOException e) {
				FacesContext.getCurrentInstance().addMessage("formLogin:textUsuario", new FacesMessage(FacesMessage.SEVERITY_FATAL, "No se encuenra la pagina", ""));
				e.printStackTrace();
			}
			
			
		} else {
			FacesContext.getCurrentInstance().addMessage("formLogin:textUsuario", new FacesMessage(FacesMessage.SEVERITY_ERROR, "Usuario o contraseña Incorrecta", ""));

		}
	}
	
	private void redirecciona(String pagina) throws IOException {
		ExternalContext externalContext = FacesContext.getCurrentInstance().getExternalContext();
		externalContext.redirect(pagina);
	}
	
	public String getUsuario() {
		return usuario;
	}
	
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

}
