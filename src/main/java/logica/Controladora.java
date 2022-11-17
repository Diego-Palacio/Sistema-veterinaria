package logica;

import persistencia.controladoraPersistencia;

public class Controladora {
	
	controladoraPersistencia control= new controladoraPersistencia();	
	
	public void guardar(String nombre, String raza, String color, String nombreDueño, String alergia,
			String atencionEspecial, String celDueño, String observaciones) {
		
			Dueño dueño= new Dueño();
			//seteo los datos del dueño
			dueño.setNombre(nombreDueño);
			dueño.setCelular_dueño(celDueño);
			
			Mascota mascota= new Mascota();
			//seteo los datos de la mascota
			mascota.setColor(color);
			mascota.setNombre_perro(nombre);
			mascota.setAlergico(alergia);
			mascota.setAtencion_especial(atencionEspecial);
			mascota.setRaza(raza);
			mascota.setObservaciones(observaciones);
			mascota.setUnDueño(dueño);
			
			
			//control.guardar(dueño,mascota);
		
	}

}
