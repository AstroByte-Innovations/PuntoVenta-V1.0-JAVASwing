package General;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBD {
	
	public Connection connection;
    public String url;
    public String user;
    public String password;
	public ConexionBD() {
		this.Conexion();
	}
	
	public void Conexion() {
        String server = "puntodeventamarcosfalcon.database.windows.net";
        String database = "PuntoDeVenta";
        this.url = "jdbc:sqlserver://" + server + ":1433;database=" + database + ";encrypt=true;trustServerCertificate=false;hostNameInCertificate=*.database.windows.net;loginTimeout=15;";
        this.user = "MarcosFalcon";
        this.password = "PAMarcos@092";
    }
}
