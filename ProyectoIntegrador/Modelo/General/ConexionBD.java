package General;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBD {
	
	private static final String urlSQLServer = "jdbc:sqlserver://";
	private static final String CloudServer = "puntodeventamarcosfalcon.database.windows.net";
	private static final String LocalServer = "localhost";
	public Connection connection;
	
	public static Connection CloudConexion(String DB,String user,String password) {
		String database = DB;
		if(database.isEmpty()) database = "PuntoDeVenta";
		String urlConexion = urlSQLServer + CloudServer + ":1433;database=" + database + ";encrypt=true;trustServerCertificate=false;hostNameInCertificate=*.database.windows.net;loginTimeout=15;";
		try {
			Connection conexion = DriverManager.getConnection(urlConexion,user,password);
			return conexion;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			return null;
		}
    }
	
	public static Connection LocalConexion(String DB, String user, String password) {
		String urlConexion = urlSQLServer + LocalServer + ":1433;database="+ DB +";loginTimeout=15;TrustServerCertificate=True;";;
		try {
			Connection conexion = DriverManager.getConnection(urlConexion,user,password);
			return conexion;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			return null;
		}
    }
}
