package Inventario;

public class Almacen {

	private String ID;
	private String Nombre;
	
	public Almacen(String iD, String nombre) {
		super();
		ID = iD;
		Nombre = nombre;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getID() {
		return ID;
	}
	
	
}
