package Usuario;

public class Direccion {

	private String ID;
	private String Calle;
	private String Numero_Interior;
	private String Numero_Exterior;
	private String Colonia;
	private String Codigo_Postal;
	private String Ciudad;
	private String Estado;
	private String Pais;
	public Direccion(String iD, String calle, String numero_Interior, String numero_Exterior, String colonia,
			String codigo_Postal, String ciudad, String estado, String pais) {
		super();
		ID = iD;
		Calle = calle;
		Numero_Interior = numero_Interior;
		Numero_Exterior = numero_Exterior;
		Colonia = colonia;
		Codigo_Postal = codigo_Postal;
		Ciudad = ciudad;
		Estado = estado;
		Pais = pais;
	}
	public String getCalle() {
		return Calle;
	}
	public void setCalle(String calle) {
		Calle = calle;
	}
	public String getNumero_Interior() {
		return Numero_Interior;
	}
	public void setNumero_Interior(String numero_Interior) {
		Numero_Interior = numero_Interior;
	}
	public String getNumero_Exterior() {
		return Numero_Exterior;
	}
	public void setNumero_Exterior(String numero_Exterior) {
		Numero_Exterior = numero_Exterior;
	}
	public String getColonia() {
		return Colonia;
	}
	public void setColonia(String colonia) {
		Colonia = colonia;
	}
	public String getCodigo_Postal() {
		return Codigo_Postal;
	}
	public void setCodigo_Postal(String codigo_Postal) {
		Codigo_Postal = codigo_Postal;
	}
	public String getCiudad() {
		return Ciudad;
	}
	public void setCiudad(String ciudad) {
		Ciudad = ciudad;
	}
	public String getEstado() {
		return Estado;
	}
	public void setEstado(String estado) {
		Estado = estado;
	}
	public String getPais() {
		return Pais;
	}
	public void setPais(String pais) {
		Pais = pais;
	}
	public String getID() {
		return ID;
	}
	
	
}
