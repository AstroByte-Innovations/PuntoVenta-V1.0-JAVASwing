package Usuario;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import General.ConexionBD;

public class MProveedor {

	public static Proveedor obtenerProveedor(int ID) {
		Connection conexion = ConexionBD.LocalConexion("LocalPuntoDeVenta", "MarcosFalcon", "halo0921177@");
		String query = "SELECT * FROM Proveedor WHERE ID =" + ID;
		try {
			Proveedor prov = null;
			
			Statement stmt = conexion.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			if(rs.next()) {
				String Id = String.valueOf(rs.getInt("ID"));
				String nombres = rs.getString("Nombres");
				String apellidos = rs.getString("Apellidos");
				String nombreComercial = rs.getString("Nombre_Comercial");
				String giroComercial = rs.getString("Giro_Comercial");
				String tel = rs.getString("Telefono");
				String correo = rs.getString("Correo");
				String sitioWeb = rs.getString("Sitio_Web");
				Direccion dir = Usuario.obtenerDireccion(rs.getInt("Direccion"));
				String rfc = rs.getString("RFC");
				
				prov = new Proveedor(Id, nombres, apellidos, nombreComercial, giroComercial, tel, correo, sitioWeb, dir, rfc);
				//System.out.println(prov.toString());
			}
			return prov;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Proveedor " + e.getMessage());
			return null;
		}
	}
	
}
