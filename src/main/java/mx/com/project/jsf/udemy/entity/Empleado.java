package mx.com.project.jsf.udemy.entity;

public class Empleado {
	private String nombre;
	private String apellidoPaterno;
	private String apellidoMaterno;
	private String Puesto;
	private boolean status;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidoPaterno() {
		return apellidoPaterno;
	}
	public void setApellidoPaterno(String apellidoPaterno) {
		this.apellidoPaterno = apellidoPaterno;
	}
	public String getApellidoMaterno() {
		return apellidoMaterno;
	}
	public void setApellidoMaterno(String apellidoMaterno) {
		this.apellidoMaterno = apellidoMaterno;
	}
	public String getPuesto() {
		return Puesto;
	}
	public void setPuesto(String puesto) {
		Puesto = puesto;
	}
	public boolean getStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}

}
