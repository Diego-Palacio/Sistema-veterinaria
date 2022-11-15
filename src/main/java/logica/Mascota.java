package logica;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

//Mapeo una clase como entidad para transformar como tabla en bdd 
@Entity
public class Mascota {
	
	//primary key , se genera de forma automatica
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private String id_cliente;
	private String nombre_perro;
	private String raza;
	private String color;
	private String alergico;
	private String atencion_especial;
	private String observaciones;
	
	//anotacion para declarar relacion uno a uno
	@OneToOne
	private Dueño unDueño;
	
	
	public Mascota(String nombre_perro, String raza, String color, String alergico, String atencion_especial, String observaciones,Dueño unDueño) {	
		this.nombre_perro = nombre_perro;
		this.raza = raza;
		this.color = color;
		this.alergico = alergico;
		this.atencion_especial = atencion_especial;
		this.observaciones = observaciones;
		this.unDueño= unDueño;
	}
	
	
	public String getNombre_perro() {
		return nombre_perro;
	}
	public void setNombre_perro(String nombre_perro) {
		this.nombre_perro = nombre_perro;
	}
	public String getRaza() {
		return raza;
	}
	public void setRaza(String raza) {
		this.raza = raza;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getAlergico() {
		return alergico;
	}
	public void setAlergico(String alergico) {
		this.alergico = alergico;
	}
	public String getAtencion_especial() {
		return atencion_especial;
	}
	public void setAtencion_especial(String atencion_especial) {
		this.atencion_especial = atencion_especial;
	}
	public String getObservaciones() {
		return observaciones;
	}
	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}
	
	
	
	
}
