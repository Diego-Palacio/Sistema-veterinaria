package logica;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Dueño {
	
	@Id
	@GeneratedValue(strategy= GenerationType.SEQUENCE)
	private int id_dueño;
	private String nombre;
	private String celular_dueño;
		
	
	public Dueño(int id_dueño, String nombre, String celular_dueño) {
		this.id_dueño = id_dueño;
		this.nombre = nombre;
		this.celular_dueño = celular_dueño;
	}
	
	
	public Dueño() {
		// TODO Auto-generated constructor stub
	}


	public int getId_dueño() {
		return id_dueño;
	}
	public void setId_dueño(int id_dueño) {
		this.id_dueño = id_dueño;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCelular_dueño() {
		return celular_dueño;
	}
	public void setCelular_dueño(String celDueño) {
		this.celular_dueño = celDueño;
	}
	
}
