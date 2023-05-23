package Ventas;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import General.ConexionBD;

public class MVentas {

	public static ArrayList<String[]> getInventario() {
		ArrayList<String[]> listado = new ArrayList<String[]>();
		final String Query = "SELECT * FROM Tickets";
		try (Connection conexion = ConexionBD.LocalConexion("LocalPuntoDeVenta", "MarcosFalcon", "halo0921177@");
				PreparedStatement stmt = conexion.prepareStatement(Query)) {

			try (ResultSet rs = stmt.executeQuery()) {
				while (rs.next()) {
					String[] dato = new String[8];
					dato[0] = rs.getString(1); // ID Producto
					dato[1] = rs.getString(2); // Cantidad
					dato[2] = rs.getString(3); // Codigo
					dato[3] = rs.getString(4); // Nombre
					dato[4] = rs.getString(5); // Precio
					dato[5] = rs.getString(6); // Costo
					dato[6] = rs.getString(7);
					dato[7] = rs.getString(8);
					listado.add(dato);
				}
			}
		} catch (SQLException e) {
			System.out.println("Producto " + e.getMessage());
		}
		return listado;
	}
}
