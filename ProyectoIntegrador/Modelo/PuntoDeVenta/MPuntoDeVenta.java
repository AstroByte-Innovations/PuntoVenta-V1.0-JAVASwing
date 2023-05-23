package PuntoDeVenta;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import General.ConexionBD;
import General.genericos;

public class MPuntoDeVenta {

	public static ArrayList<String[]> getInventario() {
		ArrayList<String[]> listado = new ArrayList<String[]>();
		final String Query = "EXEC obtenerProductosPV";
		try (Connection conexion = ConexionBD.LocalConexion("LocalPuntoDeVenta", "MarcosFalcon", "halo0921177@");
				PreparedStatement stmt = conexion.prepareStatement(Query)) {

			try (ResultSet rs = stmt.executeQuery()) {
				while (rs.next()) {
					String[] dato = new String[7];
					dato[0] = rs.getString(1); // ID Producto
					dato[1] = rs.getString(2); // Cantidad
					dato[2] = rs.getString(3); // Codigo
					dato[3] = rs.getString(4); // Nombre
					dato[4] = rs.getString(5); // Precio
					dato[5] = rs.getString(6); // Costo
					dato[6] = rs.getString(7); // Imagen
					listado.add(dato);
				}
			}
		} catch (SQLException e) {
			System.out.println("Producto " + e.getMessage());
		}
		return listado;
	}
	
	public static int getNextTicket() {
		final String Query = "SELECT COUNT(*) AS Tickets FROM Tickets;";
		int cant = 0;
		try (Connection conexion = ConexionBD.LocalConexion("LocalPuntoDeVenta", "MarcosFalcon", "halo0921177@");
				PreparedStatement stmt = conexion.prepareStatement(Query)) {
			try (ResultSet rs = stmt.executeQuery()) {
				while (rs.next()) {
					cant = rs.getInt(1);
				}
			}
		} catch (SQLException e) {
			genericos.error("Error al contar Tickets:\n" + e.getMessage());
		}
		return cant + 1;
	}
	
	public static String agregarTicket(String almacen, String subtotal, String Iva, String Total, String Efectivo, String Cambio) {
		final String Query = "EXEC agregarTicket " + almacen + ", " + subtotal + ", " + Iva + ", " + Total + ", " + Efectivo + " , " + Cambio + ";";
		String ticket = null;
		try (Connection conexion = ConexionBD.LocalConexion("LocalPuntoDeVenta", "MarcosFalcon", "halo0921177@");
				PreparedStatement stmt = conexion.prepareStatement(Query)) {
			try (ResultSet rs = stmt.executeQuery()) {
				while (rs.next()) {
					ticket = rs.getString(1);
					System.out.println(ticket);
				}
			}
		} catch (SQLException e) {
			genericos.error("Error al agregar Ticket" + e.getMessage());
		}
		return ticket;
	}
	
	public static void agregarProductoTicket(String Ticket, String Producto, String Cantidad, String subtotal, String Precio) {
		final String Query = "EXEC agregarVentaProducto "  + Ticket + ", " + Producto + ", " + Cantidad + ", " + subtotal + ", " + Precio + ";";
		try (Connection conexion = ConexionBD.LocalConexion("LocalPuntoDeVenta", "MarcosFalcon", "halo0921177@");
				PreparedStatement stmt = conexion.prepareStatement(Query)) {
				stmt.execute();
		} catch (SQLException e) {
			genericos.error("Error Al agregar Producto Ticket:\n" + e.getMessage());
		}
	}
}
