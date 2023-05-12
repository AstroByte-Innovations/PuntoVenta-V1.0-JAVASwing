package Productos;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import Categorias.MCategorias;
import General.ConexionBD;
import Usuario.MProveedor;
import Usuario.Proveedor;

public class MProductos {
	
	public static ArrayList<Producto> mostrarProductos(int page, int size){
		ArrayList<Producto> listado = new ArrayList<Producto>();
		Connection conexion = ConexionBD.LocalConexion("LocalPuntoDeVenta", "MarcosFalcon", "halo0921177@");
		String query = "EXEC mostrarProductosEntre @PageNumber = " + page + " , @PageSize = " + size;
		
		try {
			Statement stmt = conexion.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			while(rs.next()) {
				String Id = String.valueOf(rs.getInt("ID"));
				String codigo = rs.getString("Codigo");
				String nombre = rs.getString("Nombre");
				double precio = rs.getDouble("Precio");
				double costo = rs.getDouble("Costo");
				int tipo = rs.getInt("Tipo");
				Categoria cat = MCategorias.obtenerCategoria(rs.getInt("Categoria"));
				SubCategoria sub = MCategorias.obtenerSubCategoria(rs.getInt("SubCategoria"));
				Proveedor proveedor = MProveedor.obtenerProveedor(rs.getInt("Proveedor"));
				int estado = rs.getInt("Estado");
				String des = rs.getString("Descripcion");
				String notas = rs.getString("Notas");
				String img = rs.getString("Imagen");
				Producto producto = new Producto(Id, codigo, nombre, precio, costo, tipo, cat, sub, proveedor, estado, des, notas, img);
				listado.add(producto);
				System.out.println(producto.toString());
			}
			return listado;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Producto " + e.getMessage());
		}
		return listado;
	}
	
	public static ArrayList<Producto> mostrarProductosByCategoria(int page, int size,int IdCat){
		ArrayList<Producto> listado = new ArrayList<Producto>();
		Connection conexion = ConexionBD.LocalConexion("LocalPuntoDeVenta", "MarcosFalcon", "halo0921177@");
		String query = "EXEC mostrarProductosEntreyCategoria @PageNumber =" + page + " , @PageSize = " + size + ", @categoria = " + IdCat;
		
		try {
			Statement stmt = conexion.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			while(rs.next()) {
				String Id = String.valueOf(rs.getInt("ID"));
				String codigo = rs.getString("Codigo");
				String nombre = rs.getString("Nombre");
				double precio = rs.getDouble("Precio");
				double costo = rs.getDouble("Costo");
				int tipo = rs.getInt("Tipo");
				Categoria cat = MCategorias.obtenerCategoria(rs.getInt("Categoria"));
				SubCategoria sub = MCategorias.obtenerSubCategoria(rs.getInt("SubCategoria"));
				Proveedor proveedor = MProveedor.obtenerProveedor(rs.getInt("Proveedor"));
				int estado = rs.getInt("Estado");
				String des = rs.getString("Descripcion");
				String notas = rs.getString("Notas");
				String img = rs.getString("Imagen");
				Producto producto = new Producto(Id, codigo, nombre, precio, costo, tipo, cat, sub, proveedor, estado, des, notas, img);
				listado.add(producto);
				System.out.println(producto.toString());
			}
			return listado;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Producto " + e.getMessage());
		}
		return listado;
	}
	
	public static ArrayList<Producto> mostrarProductosByCategoriaAndSubcategorias(int page, int size,int IdCat,int IdSub){
		ArrayList<Producto> listado = new ArrayList<Producto>();
		Connection conexion = ConexionBD.LocalConexion("LocalPuntoDeVenta", "MarcosFalcon", "halo0921177@");
		String query = "EXEC mostrarProductosEntreCategoriaSubCategoria @PageNumber =" + page + " , @PageSize = " + size + ", @categoria = " + IdCat + ", @subcategoria = " + IdSub;
		
		try {
			Statement stmt = conexion.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			while(rs.next()) {
				String Id = String.valueOf(rs.getInt("ID"));
				String codigo = rs.getString("Codigo");
				String nombre = rs.getString("Nombre");
				double precio = rs.getDouble("Precio");
				double costo = rs.getDouble("Costo");
				int tipo = rs.getInt("Tipo");
				Categoria cat = MCategorias.obtenerCategoria(rs.getInt("Categoria"));
				SubCategoria sub = MCategorias.obtenerSubCategoria(rs.getInt("SubCategoria"));
				Proveedor proveedor = MProveedor.obtenerProveedor(rs.getInt("Proveedor"));
				int estado = rs.getInt("Estado");
				String des = rs.getString("Descripcion");
				String notas = rs.getString("Notas");
				String img = rs.getString("Imagen");
				Producto producto = new Producto(Id, codigo, nombre, precio, costo, tipo, cat, sub, proveedor, estado, des, notas, img);
				listado.add(producto);
				System.out.println(producto.toString());
			}
			return listado;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Producto " + e.getMessage());
		}
		return listado;
	}
}
