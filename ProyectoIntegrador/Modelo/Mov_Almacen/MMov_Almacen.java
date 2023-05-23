package Mov_Almacen;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import General.ConexionBD;
import Inventario.Almacen;

public class MMov_Almacen {

	public static ArrayList getAlmacenes() {
		ArrayList<String[]> listado = new ArrayList<String[]>();
		final String Query = "EXEC verMovimientosAlmacen;";
		try (Connection conexion = ConexionBD.LocalConexion("LocalPuntoDeVenta", "MarcosFalcon", "halo0921177@");
				PreparedStatement stmt = conexion.prepareStatement(Query)) {

			try (ResultSet rs = stmt.executeQuery()) {
				while (rs.next()) {
					String[] dato = new String[9];
					dato[0] = rs.getString(1); //ProductoID
					dato[1] = rs.getString(8);  //Codigo
					dato[2] = rs.getString(2); // Fecha
					dato[3] = rs.getString(3);//AlmacenID
					dato[4] = rs.getString(9);//AlmacenNombre
					dato[5] = rs.getString(4);//tipo
					if(dato[5].equals("1")) dato[5] = "ALTA";
					else dato[5] = "BAJA";
					dato[6] = rs.getString(5);//cantA
					dato[7] = rs.getString(6);//cant
					dato[8] = rs.getString(7);//cantF
					listado.add(dato);
				}
			}
		} catch (SQLException e) {
			System.out.println("Producto " + e.getMessage());
		}
		return listado;
	}
}
