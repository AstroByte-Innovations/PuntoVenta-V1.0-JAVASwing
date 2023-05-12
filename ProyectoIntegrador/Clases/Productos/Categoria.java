package Productos;

public class Categoria {
	private String ID;
	private String Nombre;
	
	
	public Categoria(String ID, String nombre) {
		super();
		this.ID = ID;
		this.Nombre = nombre;
	}


	public String getNombre() {
		return Nombre;
	}


	public void setNombre(String nombre) {
		this.Nombre = nombre;
	}


	public String getId() {
		return ID;
	}


	@Override
	public String toString() {
		return ID + " " + Nombre;
	}
	
	
	
	
}
