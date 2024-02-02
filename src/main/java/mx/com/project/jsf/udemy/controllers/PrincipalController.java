/**
 * 
 */
package mx.com.project.jsf.udemy.controllers;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import mx.com.project.jsf.udemy.entity.Empleado;
import mx.com.project.jsf.udemy.services.EmpleadoService;

/**
 * Autor: JLAE
 * Clase controladora de la pantalla principal
 */

@ManagedBean(name = "principalController")
@ViewScoped
public class PrincipalController {
	private List<Empleado> empleados;
	private EmpleadoService empleadoService=new EmpleadoService();
	
	@PostConstruct
	public void init() {
		getEmpleadoAll();
	}
	
	public void getEmpleadoAll() {
		this.empleados = empleadoService.empleadoAll();
		
	}


	public List<Empleado> getEmpleados() {
		return empleados;
	}


	public void setEmpleados(List<Empleado> empleados) {
		this.empleados = empleados;
	}

	
}
