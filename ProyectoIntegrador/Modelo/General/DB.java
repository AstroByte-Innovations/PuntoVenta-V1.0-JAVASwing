package General;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DB {

	private Connection conexion;
	
	
	public DB(Connection conexion) {
		this.conexion = conexion;
	}
	
	
	public void insertar(String tabla,String[] campos, String[] valores) {
		String query = "INSERT INTO " + tabla + " (";
		for(String e: campos) query += e + ",";
		query = query.substring(0, query.length()-1) + ") VALUES (";
		for(int i = 0; i < valores.length; i++) {
			if(i < (valores.length-1))  query += "\'" + valores[i] + "\'" + ",";
			else query += "\'" + valores[i] + "\');";
		}
		System.out.println(query);
		try {
			PreparedStatement ps = conexion.prepareStatement(query);
			ps.executeUpdate();
		}catch(SQLException e) {
			
		}
	}
	
	public String insertarQuery(String tabla,String[] campos, String[] valores) {
		String query = "INSERT INTO " + tabla + " (";
		for(String e: campos) query += e + ",";
		query = query.substring(0, query.length()-1) + ") VALUES (";
		for(int i = 0; i < valores.length; i++) {
			if(i < (valores.length-1))  query += "\'" + valores[i] + "\'" + ",";
			else query += "\'" + valores[i] + "\');";
		}
		return query;	
	}
	
	public void eliminar(String tabla, String campo, String valor, String condicion) {
		String query = "DELETE FROM " + tabla + "WHERE " + campo + " = ? " + condicion;
		try {
			PreparedStatement ps = conexion.prepareStatement(query);
			ps.setString(1, valor);
			int res = ps.executeUpdate();
			if(res == 0) {
				
			}else {
				
			}
		}catch(SQLException e) {
			
		}
	}
	
	public String eliminarQuery(String tabla, String campo, String valor, String condicion) {
		String query = "DELETE FROM " + tabla + "WHERE " + campo + " = ? " + condicion;
		return query;
	}
	
	public void modificar(String tabla, String campoCondicion, String valorCampo, String campo, String valorActualizar) {
		String query = "UPDATE " + tabla + " SET " + campo + "= \'" + valorActualizar + "\' WHERE " + campoCondicion + "\'" + valorCampo + "\'";
		try {
			PreparedStatement ps = conexion.prepareStatement(query);
			ps.executeUpdate();
		}catch(SQLException e) {
			
		}
	}
	
	public String  modificarQuery(String tabla, String campoCondicion, String valorCampo, String campo, String valorActualizar) {
		String query = "UPDATE " + tabla + " SET " + campo + "= \'" + valorActualizar + "\' WHERE " + campoCondicion + "\'" + valorCampo + "\'";
		return query;
	}
	
}
