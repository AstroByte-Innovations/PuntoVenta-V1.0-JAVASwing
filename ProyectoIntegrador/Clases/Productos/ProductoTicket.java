package Productos;

public class ProductoTicket {
	String cantidad;
	String Id;
	String Codigo;
	String Nombre;
	String Precio;
	String Subtotal;
	
	public ProductoTicket(String cantidad, String id, String codigo, String nombre, String precio, String subtotal) {
		super();
		this.cantidad = cantidad;
		Id = id;
		Codigo = codigo;
		Nombre = nombre;
		Precio = precio;
		Subtotal = subtotal;
	}

	public String getCantidad() {
		return cantidad;
	}

	public void setCantidad(String cantidad) {
		this.cantidad = cantidad;
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

	public String getPrecio() {
		return Precio;
	}

	public void setPrecio(String precio) {
		Precio = precio;
	}

	public String getSubtotal() {
		return Subtotal;
	}

	public void setSubtotal(String subtotal) {
		Subtotal = subtotal;
	}

	public String getId() {
		return Id;
	}
	
	
	
	
}
