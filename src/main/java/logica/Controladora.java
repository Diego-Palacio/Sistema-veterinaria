package logica;

import persistencia.controladoraPersistencia;

public class Controladora {
	
	controladoraPersistencia control= new controladoraPersistencia();	
	
	public void guardar(String nombre, String raza, String color, String nombreDue�o, String alergia,
			String atencionEspecial, String celDue�o, String observaciones) {
		
			Due�o due�o= new Due�o();
			//seteo los datos del due�o
			due�o.setNombre(nombreDue�o);
			due�o.setCelular_due�o(celDue�o);
			
			Mascota mascota= new Mascota();
			//seteo los datos de la mascota
			mascota.setColor(color);
			mascota.setNombre_perro(nombre);
			mascota.setAlergico(alergia);
			mascota.setAtencion_especial(atencionEspecial);
			mascota.setRaza(raza);
			mascota.setObservaciones(observaciones);
			mascota.setUnDue�o(due�o);
			
			
			//control.guardar(due�o,mascota);
		
	}

}
