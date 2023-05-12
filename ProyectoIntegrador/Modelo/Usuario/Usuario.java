package Usuario;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import General.ConexionBD;

public class Usuario {

	
	public static Direccion obtenerDireccion(int ID) {
		Connection conexion = ConexionBD.LocalConexion("LocalPuntoDeVenta", "MarcosFalcon", "halo0921177@");
		String query = "SELECT * FROM Direccion WHERE ID =" + ID;
		try {
			Direccion dir = null;
			Statement stmt = conexion.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			if(rs.next()) {
				String Id = String.valueOf(rs.getInt("ID"));
				String calle = rs.getString("Calle");
				String numeroInt = rs.getString("Numero_Interior");
				String numeroExt = rs.getString("Numero_Exterior");
				String colonia = rs.getString("Colonia");
				String codigo = rs.getString("Codigo_Postal");
				String ciudad = rs.getString("Ciudad");
				String estado = rs.getString("Estado");
				String pais = rs.getString("Pais");
				dir = new Direccion(Id, calle, numeroInt, numeroExt, colonia, codigo, ciudad, estado, pais);
				//System.out.println(dir.toString());
			}
			return dir;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Direccion " + e.getMessage());
			return null;
		}
	}
}
