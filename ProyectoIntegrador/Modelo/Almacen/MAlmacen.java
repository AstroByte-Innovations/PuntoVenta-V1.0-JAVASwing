package Almacen;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import Categorias.MCategorias;
import General.ConexionBD;
import General.genericos;
import Inventario.Almacen;
import Productos.Categoria;
import Productos.Producto;
import Productos.SubCategoria;
import Usuario.MProveedor;
import Usuario.Proveedor;

public class MAlmacen {

	public static ArrayList getAlmacenes() {
		ArrayList<Almacen> listado = new ArrayList<Almacen>();
		final String Query = "SELECT * FROM Almacen;";
		try (Connection conexion = ConexionBD.LocalConexion("LocalPuntoDeVenta", "MarcosFalcon", "halo0921177@");
				PreparedStatement stmt = conexion.prepareStatement(Query)) {

			try (ResultSet rs = stmt.executeQuery()) {
				while (rs.next()) {
					listado.add(new Almacen(rs.getString(1), rs.getString(2)));
				}
			}
		} catch (SQLException e) {
			System.out.println("Producto " + e.getMessage());
		}
		return listado;
	}

	public static Almacen agregar(String nombre) {
		final String Query = "EXEC agregarAlmacen '" + nombre + "';";
		Almacen alm = null;
		try (Connection conexion = ConexionBD.LocalConexion("LocalPuntoDeVenta", "MarcosFalcon", "halo0921177@");
				PreparedStatement stmt = conexion.prepareStatement(Query)) {
			try (ResultSet rs = stmt.executeQuery()) {
				while (rs.next()) {
					alm = new Almacen(rs.getString(1), rs.getString(2));
				}
			}
			return alm;
		} catch (SQLException e) {
			genericos.error("Error al crear almacen:\n" + e.getMessage());
			return null;
		}
	}

	public static Almacen actualizar(String id, String nombre) {
		final String Query = "EXEC actualizarAlmacen " + id + ",'" + nombre + "';";
		Almacen alm = null;
		try (Connection conexion = ConexionBD.LocalConexion("LocalPuntoDeVenta", "MarcosFalcon", "halo0921177@");
				PreparedStatement stmt = conexion.prepareStatement(Query)) {
			try (ResultSet rs = stmt.executeQuery()) {
				while (rs.next()) {
					alm = new Almacen(rs.getString(1), rs.getString(2));
				}
			}
			return alm;
		} catch (SQLException e) {
			genericos.error("Error al actualizar almacen:\n" + e.getMessage());
			return null;
		}
	}

	private static int Contar(String id) {
		final String Query = "SELECT COUNT(*) AS TotalRegistros FROM Inventario WHERE Almacen = " + id + ";";
		int cant = 0;
		try (Connection conexion = ConexionBD.LocalConexion("LocalPuntoDeVenta", "MarcosFalcon", "halo0921177@");
				PreparedStatement stmt = conexion.prepareStatement(Query)) {
			try (ResultSet rs = stmt.executeQuery()) {
				while (rs.next()) {
					cant = rs.getInt(1);
				}
			}
		} catch (SQLException e) {
			genericos.error("Error al contar almacen:\n" + e.getMessage());
		}
		return cant;
	}

	public static boolean eliminar(String id) {
		final String Query = "DELETE FROM Almacen WHERE ID = " + id + ";";
		if (Contar(id) > 0) {
			genericos.error("No se puede eliminar este almacen\nYa que existen " + Contar(id)
					+ " productos guardados en este almacen");
			return false;
		} else {
			int result = JOptionPane.showConfirmDialog(null, "¿Seguro que quieres eliminar este almacen?",
					"ADVERTENCIA", JOptionPane.OK_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE);
			if (result == JOptionPane.OK_OPTION) {
				genericos.hecho("Almacen borrado");
				try (Connection conexion = ConexionBD.LocalConexion("LocalPuntoDeVenta", "MarcosFalcon","halo0921177@"); ){
					Statement statement = conexion.createStatement(); 
					int rowsAffected = statement.executeUpdate(Query);
					return true;
				} catch (SQLException e) {
					genericos.error("Error al eliminar almacen:\n" + e.getMessage());
					return false;
				}
			} else {
				return false;
			}
		}
	}
}
