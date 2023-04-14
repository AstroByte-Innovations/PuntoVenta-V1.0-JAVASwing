package Tienda;

import Usuario.Direccion;

public class Tienda {
	private int ID;
	private String Nombre;
	private Direccion Direccion;
	private String RFC;
	private String Telefono;
	private String Correo;
	private String Sitio_Web;
	
	public Tienda(int iD, String nombre, Usuario.Direccion direccion, String rFC, String telefono, String correo,
			String sitio_Web) {
		super();
		ID = iD;
		Nombre = nombre;
		Direccion = direccion;
		RFC = rFC;
		Telefono = telefono;
		Correo = correo;
		Sitio_Web = sitio_Web;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public Direccion getDireccion() {
		return Direccion;
	}

	public void setDireccion(Direccion direccion) {
		Direccion = direccion;
	}

	public String getRFC() {
		return RFC;
	}

	public void setRFC(String rFC) {
		RFC = rFC;
	}

	public String getTelefono() {
		return Telefono;
	}

	public void setTelefono(String telefono) {
		Telefono = telefono;
	}

	public String getCorreo() {
		return Correo;
	}

	public void setCorreo(String correo) {
		Correo = correo;
	}

	public String getSitio_Web() {
		return Sitio_Web;
	}

	public void setSitio_Web(String sitio_Web) {
		Sitio_Web = sitio_Web;
	}

	public int getID() {
		return ID;
	}
	
	
	
}
