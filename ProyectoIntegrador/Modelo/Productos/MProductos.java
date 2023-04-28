package Productos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import General.ConexionBD;

public class MProductos {

	static public ArrayList CargarProductos() {
		ArrayList<Producto> productos = new ArrayList<Producto>();
			ConexionBD conexion = new ConexionBD();
			System.out.println("User" + conexion.user + " Password" + conexion.password);
	       Connection connection = null;
	       Statement statement = null;
	       ResultSet resultSet = null;
		try {
			//Establecer
			connection = DriverManager.getConnection(conexion.url, conexion.user, conexion.password);
			// Crear la declaración y realizar la consulta
	           statement = connection.createStatement();
	           String query = "SELECT * FROM [dbo].[Producto];";
	           resultSet = statement.executeQuery(query);

	           // Procesar los resultados
	           while (resultSet.next()) {
	               String id = resultSet.getString("ID");
	               String codigo = resultSet.getString("Codigo");
	               String nombre = resultSet.getString("Nombre");
	               Double precio = resultSet.getDouble("Precio");
	               Double costo = resultSet.getDouble("Costo");
	               int tipo = resultSet.getInt("Tipo");
	               int categoria = resultSet.getInt("Categoria");
	               int subCategoria = resultSet.getInt("SubCategoria");
	               int proveedor = resultSet.getInt("Proveedor");
	               int estado = resultSet.getInt("Estado");
	               String descrip = resultSet.getString("Descripcion");
	               String notas = resultSet.getString("Notas");
	               String imagen = resultSet.getString("Imagen");
	               System.out.println(id + " " + nombre + " " + imagen);
	               productos.add(new Producto(id, codigo, nombre, precio, costo, tipo, null, null, null, estado, descrip, notas, imagen));
	           }
	           return productos;
	       } catch (SQLException e) {
	           System.out.println("Error al realizar la consulta: " + e.getMessage());
	       } finally {
	           // Cerrar los recursos
	           if (resultSet != null) {
	               try {
	                   resultSet.close();
	               } catch (SQLException e) {
	                   System.out.println("Error al cerrar el result set: " + e.getMessage());
	               }
	           }
	           if (statement != null) {
	               try {
	                   statement.close();
	               } catch (SQLException e) {
	                   System.out.println("Error al cerrar el statement: " + e.getMessage());
	               }
	           }
	           if (connection != null) {
	               try {
	                   connection.close();
	               } catch (SQLException e) {
	                   System.out.println("Error al cerrar la conexión: " + e.getMessage());
	               }
	           }
	       }
		return productos;
	}
}
