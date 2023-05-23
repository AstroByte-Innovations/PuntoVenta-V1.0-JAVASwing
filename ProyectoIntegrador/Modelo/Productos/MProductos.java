package Productos;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import Categorias.MCategorias;
import General.ConexionBD;
import General.genericos;
import Usuario.MProveedor;
import Usuario.Proveedor;

public class MProductos {
	
	public static ArrayList<Producto> mostrarProductos(int page, int size) {
        ArrayList<Producto> listado = new ArrayList<Producto>();
        final String SELECT_PRODUCTOS = "SELECT Id, Codigo, Nombre, Precio, Costo, Tipo, Categoria, SubCategoria, Proveedor, Estado, Descripcion, Notas, Imagen FROM Producto ORDER BY Id OFFSET ? ROWS FETCH NEXT ? ROWS ONLY";


        try (Connection conexion = ConexionBD.LocalConexion("LocalPuntoDeVenta", "MarcosFalcon", "halo0921177@");
             PreparedStatement stmt = conexion.prepareStatement(SELECT_PRODUCTOS)) {
            int offset = (page - 1) * size;
            stmt.setInt(1, offset);
            stmt.setInt(2, size);

            try (ResultSet rs = stmt.executeQuery()) {
                while (rs.next()) {
                    String Id = String.valueOf(rs.getInt(1));
                    String codigo = rs.getString(2);
                    String nombre = rs.getString(3);
                    double precio = rs.getDouble(4);
                    double costo = rs.getDouble(5);
                    int tipo = rs.getInt(6);
                    Categoria cat = MCategorias.obtenerCategoria(rs.getInt(7));
                    SubCategoria sub = MCategorias.obtenerSubCategoria(rs.getInt(8));
                    Proveedor proveedor = MProveedor.obtenerProveedor(rs.getInt(9));
                    int estado = rs.getInt(10);
                    String des = rs.getString(11);
                    String notas = rs.getString(12);
                    String img = rs.getString(13);
                    Producto producto = new Producto(Id, codigo, nombre, precio, costo, tipo, cat, sub, proveedor, estado, des, notas, img);
                    listado.add(producto);
                }
            }
        } catch (SQLException e) {
            System.out.println("Producto " + e.getMessage());
        }

        return listado;
    }
	
	public static ArrayList<Producto> mostrarProductosByCategoria(int page, int size, int idCat) {
	    ArrayList<Producto> listado = new ArrayList<>();
	    String query = "EXEC mostrarProductosEntreyCategoria @PageNumber = ?, @PageSize = ?, @categoria = ?";
	    try (Connection conexion = ConexionBD.LocalConexion("LocalPuntoDeVenta", "MarcosFalcon", "halo0921177@");
	         PreparedStatement stmt = conexion.prepareStatement(query)) {
	        stmt.setInt(1, page);
	        stmt.setInt(2, size);
	        stmt.setInt(3, idCat);
	        try (ResultSet rs = stmt.executeQuery()) {
	            Categoria categoria;
	            SubCategoria subCategoria;
	            Proveedor proveedor;
	            while (rs.next()) {
	                String id = String.valueOf(rs.getInt("ID"));
	                String codigo = rs.getString("Codigo");
	                String nombre = rs.getString("Nombre");
	                double precio = rs.getDouble("Precio");
	                double costo = rs.getDouble("Costo");
	                int tipo = rs.getInt("Tipo");
	                categoria = MCategorias.obtenerCategoria(rs.getInt("Categoria"));
	                subCategoria = MCategorias.obtenerSubCategoria(rs.getInt("SubCategoria"));
	                proveedor = MProveedor.obtenerProveedor(rs.getInt("Proveedor"));
	                int estado = rs.getInt("Estado");
	                String des = rs.getString("Descripcion");
	                String notas = rs.getString("Notas");
	                String img = rs.getString("Imagen");
	                Producto producto = new Producto(id, codigo, nombre, precio, costo, tipo, categoria, subCategoria, proveedor, estado, des, notas, img);
	                listado.add(producto);
	            }
	        }
	    } catch (SQLException e) {
	        System.out.println("Producto " + e.getMessage());
	    }
	    return listado;
	}

	
	public static ArrayList<Producto> mostrarProductosByCategoriaAndSubcategorias(int page, int size, int IdCat, int IdSub) {
	    ArrayList<Producto> listado = new ArrayList<>();
	    String query = "EXEC mostrarProductosEntreCategoriaSubCategoria @PageNumber = ?, @PageSize = ?, @categoria = ?, @subcategoria = ?";
	    try (Connection conexion = ConexionBD.LocalConexion("LocalPuntoDeVenta", "MarcosFalcon", "halo0921177@");
	         PreparedStatement pstmt = conexion.prepareStatement(query)) {
	        int offset = (page - 1) * size;
	        pstmt.setInt(1, offset);
	        pstmt.setInt(2, size);
	        pstmt.setInt(3, IdCat);
	        pstmt.setInt(4, IdSub);
	        try (ResultSet rs = pstmt.executeQuery()) {
	            while (rs.next()) {
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
	        }
	    } catch (SQLException e) {
	        System.out.println("Producto " + e.getMessage());
	    }
	    return listado;
	}
	
	public static void agregar(String Codigo, String Nombre, String Precio, String Costo, String Tipo, String Categoria, String SubCategoria, String Proveedor, String Des, String Notas, String Imagen, String Almacen, String cantidad) {
		final String Query = "EXEC agregarProducto '" +
				Codigo + "', '" + Nombre + "', " + Precio + ", " + Costo + ", " + Tipo + ", " + Categoria + ", " +
				SubCategoria + ", " + Proveedor + ", '" + Des + "', '" + Notas + "', '" + Imagen + "', " + Almacen + ", " + cantidad;
		try (Connection conexion = ConexionBD.LocalConexion("LocalPuntoDeVenta", "MarcosFalcon", "halo0921177@");
				PreparedStatement stmt = conexion.prepareStatement(Query)) {
			stmt.execute();
			genericos.hecho("Se han agregado el producto");
		} catch (SQLException e) {
			genericos.error("Error al agregar Productos\n" + e.getMessage());
		}
	}

}
