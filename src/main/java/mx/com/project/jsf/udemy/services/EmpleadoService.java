package mx.com.project.jsf.udemy.services;

import java.util.ArrayList;
import java.util.List;

import mx.com.project.jsf.udemy.entity.Empleado;

public class EmpleadoService {
	
	public List<Empleado> empleadoAll(){
		List<Empleado> empleados = new ArrayList<>();
		Empleado empleadoIBM = new Empleado();
		empleadoIBM.setNombre("Carlos");
		empleadoIBM.setApellidoPaterno("Garcia");
		empleadoIBM.setApellidoMaterno("Perez");
		empleadoIBM.setPuesto("Arquitecto");
		empleadoIBM.setStatus(true);
		
		empleados.add(empleadoIBM);
		
		Empleado empleadoOracle = new Empleado();
		empleadoOracle.setNombre("Marco Antonio");
		empleadoOracle.setApellidoPaterno("Jaramillo");
		empleadoOracle.setApellidoMaterno("Lopez");
		empleadoOracle.setPuesto("Desarrollador");
		empleadoOracle.setStatus(true);
		empleados.add(empleadoOracle);
		
		Empleado empleadoAWS = new Empleado();
		empleadoAWS.setNombre("Laura Sarai");
		empleadoAWS.setApellidoPaterno("Hernandez");
		empleadoAWS.setApellidoMaterno("Trejo");
		empleadoAWS.setPuesto("DBA");
		empleadoAWS.setStatus(true);
		empleados.add(empleadoAWS);
		
		return empleados;
	}

}
