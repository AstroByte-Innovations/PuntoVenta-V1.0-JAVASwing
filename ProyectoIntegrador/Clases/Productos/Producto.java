package Productos;
import Usuario.Proveedor;
public class Producto {
	private String ID;
	private String Codigo;
	private String Nombre;
	private double Precio;
	private double Costo;
	private int Tipo;
	private Categoria Categoria;
	private SubCategoria SubCategoria;
	private Proveedor Proveedor;
	private int Estado;
	private String Descripcion;
	private String Notas;
	private String Imagen;
	
	public Producto(String iD, String codigo, String nombre, double precio, double costo, int tipo,
			Categoria categoria, SubCategoria subCategoria, Usuario.Proveedor proveedor, int estado,
			String descripcion, String notas, String imagen) {
		super();
		ID = iD;
		Codigo = codigo;
		Nombre = nombre;
		Precio = precio;
		Costo = costo;
		Tipo = tipo;
		Categoria = categoria;
		SubCategoria = subCategoria;
		Proveedor = proveedor;
		Estado = estado;
		Descripcion = descripcion;
		Notas = notas;
		Imagen = imagen;
	}

	public String getCodigo() {
		return Codigo;
	}

	public void setCodigo(String codigo) {
		Codigo = codigo;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public double getPrecio() {
		return Precio;
	}

	public void setPrecio(double precio) {
		Precio = precio;
	}

	public double getCosto() {
		return Costo;
	}

	public void setCosto(double costo) {
		Costo = costo;
	}

	public int getTipo() {
		return Tipo;
	}

	public void setTipo(int tipo) {
		Tipo = tipo;
	}

	public Categoria getCategoria() {
		return Categoria;
	}

	public void setCategoria(Categoria categoria) {
		Categoria = categoria;
	}

	public SubCategoria getSubCategoria() {
		return SubCategoria;
	}

	public void setSubCategoria(SubCategoria subCategoria) {
		SubCategoria = subCategoria;
	}

	public Proveedor getProveedor() {
		return Proveedor;
	}

	public void setProveedor(Proveedor proveedor) {
		Proveedor = proveedor;
	}

	public int getEstado() {
		return Estado;
	}

	public void setEstado(int estado) {
		Estado = estado;
	}

	public String getDescripcion() {
		return Descripcion;
	}

	public void setDescripcion(String descripcion) {
		Descripcion = descripcion;
	}

	public String getNotas() {
		return Notas;
	}

	public void setNotas(String notas) {
		Notas = notas;
	}

	public String getImagen() {
		return Imagen;
	}

	public void setImagen(String imagen) {
		Imagen = imagen;
	}

	public String getID() {
		return ID;
	}
	
	
	
	
}
