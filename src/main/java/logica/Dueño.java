package logica;

public class Due�o {
	private int id_due�o;
	private String nombre;
	private int celular_due�o;
		
	
	
	public Due�o(int id_due�o, String nombre, int celular_due�o) {
		this.id_due�o = id_due�o;
		this.nombre = nombre;
		this.celular_due�o = celular_due�o;
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
	public int getCelular_due�o() {
		return celular_due�o;
	}
	public void setCelular_due�o(int celular_due�o) {
		this.celular_due�o = celular_due�o;
	}
	
}
