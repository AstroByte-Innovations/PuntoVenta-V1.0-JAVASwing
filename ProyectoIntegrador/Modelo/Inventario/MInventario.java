package Inventario;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import General.ConexionBD;
import General.genericos;

public class MInventario {

	public static ArrayList getInventario() {
		ArrayList<String[]> listado = new ArrayList<String[]>();
		final String Query = "EXEC verInventario;";
		try (Connection conexion = ConexionBD.LocalConexion("LocalPuntoDeVenta", "MarcosFalcon", "halo0921177@");
				PreparedStatement stmt = conexion.prepareStatement(Query)) {

			try (ResultSet rs = stmt.executeQuery()) {
				while (rs.next()) {
					String[] dato = new String[7];
					dato[0] = rs.getString(1); // ID Producto
					dato[1] = rs.getString(5); // Codigo Producto
					dato[2] = rs.getString(6); // Nombre Producto
					dato[3] = rs.getString(2); // ID Almacen
					dato[4] = rs.getString(7); // Nombre almacen
					dato[5] = rs.getString(3); // Tipo
					switch (Integer.parseInt(dato[5])) {
					case 0:
						dato[5] = "Agotado";
						break;
					case 1:
						dato[5] = "Inventario limitado";
						break;
					case 2:
						dato[5] = "Disponible";
						break;
					}
					dato[6] = rs.getString(4); // Cantidad
					listado.add(dato);
				}
			}
		} catch (SQLException e) {
			System.out.println("Producto " + e.getMessage());
		}
		return listado;
	}

	public static void actualizar(String cantidad, String producto, String almacen, String tipo) {
		final String Query = "EXEC actualizarInventario " + cantidad + "," + producto + "," + almacen + "," + tipo
				+ ";";
		try (Connection conexion = ConexionBD.LocalConexion("LocalPuntoDeVenta", "MarcosFalcon", "halo0921177@");
				PreparedStatement stmt = conexion.prepareStatement(Query)) {
			stmt.execute();
			genericos.hecho("Se han agregado " + cantidad + " productos");
		} catch (SQLException e) {
			genericos.error("Error al agregar Productos\n" + e.getMessage());
		}
	}
}
