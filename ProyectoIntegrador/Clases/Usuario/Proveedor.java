package Usuario;

public class Proveedor {

	private String ID;
	private String Nombres;
	private String Apellidos;
	private String Nombre_Comercial;
	private String Giro_Comercial;
	private String Telefono;
	private String Correo;
	private String Sitio_Web;
	private Direccion Direccion;
	private String RFC;
	public Proveedor(String iD, String nombres, String apellidos, String nombre_Comercial, String giro_Comercial,
			String telefono, String correo, String sitio_Web, Usuario.Direccion direccion, String rFC) {
		super();
		ID = iD;
		Nombres = nombres;
		Apellidos = apellidos;
		Nombre_Comercial = nombre_Comercial;
		Giro_Comercial = giro_Comercial;
		Telefono = telefono;
		Correo = correo;
		Sitio_Web = sitio_Web;
		Direccion = direccion;
		RFC = rFC;
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
	public String getNombre_Comercial() {
		return Nombre_Comercial;
	}
	public void setNombre_Comercial(String nombre_Comercial) {
		Nombre_Comercial = nombre_Comercial;
	}
	public String getGiro_Comercial() {
		return Giro_Comercial;
	}
	public void setGiro_Comercial(String giro_Comercial) {
		Giro_Comercial = giro_Comercial;
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
	public String getID() {
		return ID;
	}
	
	
}
