package Productos;

public class SubCategoria {

	private String ID;
	private String Nombre;
	private Categoria Categoria;
	
	public SubCategoria(String iD, String nombre, Categoria categoria) {
		super();
		ID = iD;
		Nombre = nombre;
		Categoria = categoria;
	}
	
	

	public String getNombre() {
		return Nombre;
	}



	public void setNombre(String nombre) {
		Nombre = nombre;
	}



	public Categoria getCategoria() {
		return Categoria;
	}



	public void setCategoria(Categoria categoria) {
		Categoria = categoria;
	}



	public String getID() {
		return ID;
	}



	@Override
	public String toString() {
		return ID + " " + Nombre;
	}
	
	
	
	
}
