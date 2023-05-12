package Usuario;

public class Empleado {

	private String ID;
	private String Nombres;
	private String Apellidos;
	private String Telefono;
	private String Correo;
	private String RFC;
	private String Cargo;
	private Role Role;
	private Direccion Direccion;
	private String Fecha;
	
	public Empleado(String iD, String nombres, String apellidos, String telefono, String correo, String rFC,
			String cargo, Role role, Direccion direccion, String fecha) {
		super();
		ID = iD;
		Nombres = nombres;
		Apellidos = apellidos;
		Telefono = telefono;
		Correo = correo;
		RFC = rFC;
		Cargo = cargo;
		Role = role;
		Direccion = direccion;
		Fecha = fecha;
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

	public String getRFC() {
		return RFC;
	}

	public void setRFC(String rFC) {
		RFC = rFC;
	}

	public String getCargo() {
		return Cargo;
	}

	public void setCargo(String cargo) {
		Cargo = cargo;
	}

	public Role getRole() {
		return Role;
	}

	public void setRole(Role role) {
		Role = role;
	}

	public Direccion getDireccion() {
		return Direccion;
	}

	public void setDireccion(Direccion direccion) {
		Direccion = direccion;
	}

	public String getFecha() {
		return Fecha;
	}

	public void setFecha(String fecha) {
		Fecha = fecha;
	}

	public String getID() {
		return ID;
	}
	
	
	
}
