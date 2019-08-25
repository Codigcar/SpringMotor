package pe.edu.upc.conexion;
import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {
	protected static Connection oCn;

	public static Connection AbrirConexion() {
		if (oCn != null) {
			return oCn;
		}
		try {
			String usuario = "root";
			String password = "QWEasd123!";
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("conexion1");
			oCn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sem2db?useSSL=false&serverTimezone=UTC",
					usuario, password);
			System.out.println("conexion2");
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println("error al conectar");
		}
		return oCn;
	}

	public static void CerrarConexion() {
		try {
			if (oCn != null) {
				oCn.close();
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
