package logica;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Due�o {
	
	@Id
	@GeneratedValue(strategy= GenerationType.SEQUENCE)
	private int id_due�o;
	private String nombre;
	private String celular_due�o;
		
	
	public Due�o(int id_due�o, String nombre, String celular_due�o) {
		this.id_due�o = id_due�o;
		this.nombre = nombre;
		this.celular_due�o = celular_due�o;
	}
	
	
	public Due�o() {
		// TODO Auto-generated constructor stub
	}


	public int getId_due�o() {
		return id_due�o;
	}
	public void setId_due�o(int id_due�o) {
		this.id_due�o = id_due�o;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCelular_due�o() {
		return celular_due�o;
	}
	public void setCelular_due�o(String celDue�o) {
		this.celular_due�o = celDue�o;
	}
	
}
