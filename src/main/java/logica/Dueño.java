package logica;

public class Dueño {
	private int id_dueño;
	private String nombre;
	private int celular_dueño;
		
	
	
	public Dueño(int id_dueño, String nombre, int celular_dueño) {
		this.id_dueño = id_dueño;
		this.nombre = nombre;
		this.celular_dueño = celular_dueño;
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
	public int getCelular_dueño() {
		return celular_dueño;
	}
	public void setCelular_dueño(int celular_dueño) {
		this.celular_dueño = celular_dueño;
	}
	
}
