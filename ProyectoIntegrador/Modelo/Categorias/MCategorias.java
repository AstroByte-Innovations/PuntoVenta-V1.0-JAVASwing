package Categorias;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import General.ConexionBD;
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
		listado.add(new Categoria("0","Sin Valor"));
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
	
	public static ArrayList obtenerSubCategoriasbyCategoriaID(int ID) {
		ArrayList<SubCategoria> listado = new ArrayList<SubCategoria>();
		Connection conexion = ConexionBD.LocalConexion("LocalPuntoDeVenta", "MarcosFalcon", "halo0921177@");
		String query = "SELECT * FROM SubCategoria WHERE Categoria = " + ID;
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
}
