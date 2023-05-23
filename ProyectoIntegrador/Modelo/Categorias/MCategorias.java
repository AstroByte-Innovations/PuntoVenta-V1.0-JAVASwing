package Categorias;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import General.ConexionBD;
import General.genericos;
import Inventario.Almacen;
import Productos.Categoria;
import Productos.SubCategoria;
import Usuario.Proveedor;

public class MCategorias {

	public static Categoria obtenerCategoria(int ID) {
		Connection conexion = ConexionBD.LocalConexion("LocalPuntoDeVenta", "MarcosFalcon", "halo0921177@");
		String query = "SELECT * FROM Categoria WHERE ID =" + ID;
		try {
			Statement stmt = conexion.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			Categoria cat = null;
			if(rs.next()) {
				cat = new Categoria(String.valueOf(rs.getInt("ID")),rs.getString("Nombre"));
				//System.out.println(cat.toString());
			}
			return cat;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Categoria " + e.getMessage());
			return null;
		}
	}
	
	public static SubCategoria obtenerSubCategoria(int ID) {
		Connection conexion = ConexionBD.LocalConexion("LocalPuntoDeVenta", "MarcosFalcon", "halo0921177@");
		String query = "SELECT * FROM SubCategoria WHERE ID =" + ID;
		try {
			Statement stmt = conexion.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			SubCategoria sub = null;
			if(rs.next()) {
				sub = new SubCategoria(String.valueOf(rs.getInt("ID")),rs.getString("Nombre"),obtenerCategoria(rs.getInt("Categoria")));
				//System.out.println(sub.toString());
			}
			return sub;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("SubCategoria " + e.getMessage());
			return null;
		}
	}
	
	public static ArrayList obtenerCategorias() {
		ArrayList<Categoria> listado = new ArrayList<Categoria>();
		Connection conexion = ConexionBD.LocalConexion("LocalPuntoDeVenta", "MarcosFalcon", "halo0921177@");
		String query = "SELECT * FROM Categoria";
		try {
			Statement stmt = conexion.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			Categoria cat = null;
			while(rs.next()) {
				cat = new Categoria(String.valueOf(rs.getInt("ID")),rs.getString("Nombre"));
				listado.add(cat);
			}
			return listado;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Categoria " + e.getMessage());
			return null;
		}
	}
	
	public static ArrayList obtenerSubCategorias() {
		ArrayList<SubCategoria> listado = new ArrayList<SubCategoria>();
		Connection conexion = ConexionBD.LocalConexion("LocalPuntoDeVenta", "MarcosFalcon", "halo0921177@");
		String query = "SELECT * FROM SubCategoria";
		listado.add(new SubCategoria("0","Sin Valor",null));
		try {
			Statement stmt = conexion.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			SubCategoria cat = null;
			while(rs.next()) {
				cat = new SubCategoria(String.valueOf(rs.getInt("ID")),rs.getString("Nombre"),obtenerCategoria(rs.getInt("Categoria")));
				listado.add(cat);
			}
			return listado;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Categoria " + e.getMessage());
			return null;
		}
	}
	
	public static ArrayList<SubCategoria> obtenerSubCategoriasbyCategoriaID(int ID) {
		ArrayList<SubCategoria> listado = new ArrayList<SubCategoria>();
		Connection conexion = ConexionBD.LocalConexion("LocalPuntoDeVenta", "MarcosFalcon", "halo0921177@");
		String query = "SELECT * FROM SubCategoria WHERE Categoria = " + ID;
		try {
			Statement stmt = conexion.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			SubCategoria cat = null;
			while(rs.next()) {
				cat = new SubCategoria(String.valueOf(rs.getInt("ID")),rs.getString("Nombre"),obtenerCategoria(rs.getInt("Categoria")));
				listado.add(cat);
			}
			return listado;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Categoria " + e.getMessage());
			return null;
		}
	}
	
	public static SubCategoria agregarSubCategoria(int id, String nombre) {
		final String Query = "EXEC agregarSubCategoria " + id + ", '" + nombre + "';";
		SubCategoria sub = null;
		try (Connection conexion = ConexionBD.LocalConexion("LocalPuntoDeVenta", "MarcosFalcon", "halo0921177@");
				PreparedStatement stmt = conexion.prepareStatement(Query)) {
			try (ResultSet rs = stmt.executeQuery()) {
				while (rs.next()) {
					sub = new SubCategoria(rs.getString(1), rs.getString(2), obtenerCategoria(id));
				}
			}
			genericos.hecho("SubCategoria " + nombre + " agregada correctamente");
			return sub;
		} catch (SQLException e) {
			genericos.error("Error al agregar la subcategoria\n" + e.getMessage());
			return null;
		}
	}
	
	public static Categoria agregarCategoria(String nombre) {
		final String Query = "EXEC agregarCategoria '" + nombre + "';";
		Categoria sub = null;
		try (Connection conexion = ConexionBD.LocalConexion("LocalPuntoDeVenta", "MarcosFalcon", "halo0921177@");
				PreparedStatement stmt = conexion.prepareStatement(Query)) {
			try (ResultSet rs = stmt.executeQuery()) {
				while (rs.next()) {
					sub = new Categoria(rs.getString(1), rs.getString(2));
				}
			}
			genericos.hecho("Categoria " + nombre + " agregada correctamente");
			return sub;
		} catch (SQLException e) {
			genericos.error("Error al agregar la categoria\n" + e.getMessage());
			return null;
		}
	}
	
	public static Categoria actualizarCategoria(String id, String nombre) {
		final String Query =  "actualizarCategoria " + id + ",'" + nombre + "';";
		Categoria sub = null;
		try (Connection conexion = ConexionBD.LocalConexion("LocalPuntoDeVenta", "MarcosFalcon", "halo0921177@");
				PreparedStatement stmt = conexion.prepareStatement(Query)) {
			try (ResultSet rs = stmt.executeQuery()) {
				while (rs.next()) {
					sub = new Categoria(rs.getString(1), rs.getString(2));
				}
			}
			genericos.hecho("Categoria " + nombre + " actualizada correctamente");
			return sub;
		} catch (SQLException e) {
			genericos.error("Error al agregar la categoria\n" + e.getMessage());
			return null;
		}
	}
	
	private static int ContarCat(String id) {
		final String Query = "SELECT COUNT(*) AS TotalRegistros FROM Producto WHERE Categoria = " + id + ";";
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

	public static boolean eliminarCat(String id) {
		final String Query = "DELETE FROM Categoria WHERE ID = " + id + ";";
		if (ContarCat(id) > 0) {
			genericos.error("No se puede eliminar esta categoria\nYa que existen " + ContarCat(id)
					+ " productos con esta categoria asignada");
			return false;
		} else {
			int result = JOptionPane.showConfirmDialog(null, "¿Seguro que quieres eliminar esta categoria? Este movimiento es irreversible",
					"ADVERTENCIA", JOptionPane.OK_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE);
			if (result == JOptionPane.OK_OPTION) {
				genericos.hecho("Categoria borrado");
				try (Connection conexion = ConexionBD.LocalConexion("LocalPuntoDeVenta", "MarcosFalcon","halo0921177@"); ){
					Statement statement = conexion.createStatement(); 
					int rowsAffected = statement.executeUpdate(Query);
					return true;
				} catch (SQLException e) {
					genericos.error("Error al eliminar categoria:\n" + e.getMessage());
					return false;
				}
			} else {
				return false;
			}
		}
	}
}
