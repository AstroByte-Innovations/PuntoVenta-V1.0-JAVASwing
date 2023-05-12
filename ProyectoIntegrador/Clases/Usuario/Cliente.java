package Usuario;

public class Cliente {
	
	private String ID;
	private String Nombres;
	private String Apellidos;
	private String Correo;
	private String Telefono;
	private String RFC;
	private Direccion Direccion;
	public Cliente(String iD, String nombres, String apellidos, String correo, String telefono, String rFC,
			Direccion direccion) {
		super();
		ID = iD;
		Nombres = nombres;
		Apellidos = apellidos;
		Correo = correo;
		Telefono = telefono;
		RFC = rFC;
		Direccion = direccion;
	}
	public String getNombres() {
		return Nombres;
	}
	public void setNombres(String nombres) {
		Nombres = nombres;
	}
	public String getApellidos() {
		return Apellidos;
	}
	public void setApellidos(String apellidos) {
		Apellidos = apellidos;
	}
	public String getCorreo() {
		return Correo;
	}
	public void setCorreo(String correo) {
		Correo = correo;
	}
	public String getTelefono() {
		return Telefono;
	}
	public void setTelefono(String telefono) {
		Telefono = telefono;
	}
	public String getRFC() {
		return RFC;
	}
	public void setRFC(String rFC) {
		RFC = rFC;
	}
	public Direccion getDireccion() {
		return Direccion;
	}
	public void setDireccion(Direccion direccion) {
		Direccion = direccion;
	}
	public String getID() {
		return ID;
	}
	
	
}
