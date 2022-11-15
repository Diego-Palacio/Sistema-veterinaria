package persistencia;

import java.sql.DriverManager;
import java.sql.SQLException;

public class controladoraPersistencia {
	
	
	public static void main(String[] args) {
		
		try {
			//driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			//localhost + nombre bdd + user + contraseña
			DriverManager.getConnection("jdbc:mysql://localhost:3306/peluqueria_animal?useSSL=false","root","2Minutos2Minutos");
			
			System.out.println("Conexion realizada con exito!");
		
		} catch (ClassNotFoundException e) {
			System.out.println("Error conexion 1");
			e.printStackTrace();
		}
		catch(SQLException e) {
			System.out.println("Error conexion 2");
			e.printStackTrace();
		}
	}

}
