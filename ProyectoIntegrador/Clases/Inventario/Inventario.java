package Inventario;
import Productos.Producto;

public class Inventario {
	private Producto Producto;
	private Almacen Almacen;
	private int Estado;
	private double Cantidad;
	
	public Inventario(Productos.Producto producto, Almacen almacen, int estado, double cantidad) {
		super();
		Producto = producto;
		Almacen = almacen;
		Estado = estado;
		Cantidad = cantidad;
	}

	public Producto getProducto() {
		return Producto;
	}

	public void setProducto(Producto producto) {
		Producto = producto;
	}

	public Almacen getAlmacen() {
		return Almacen;
	}

	public void setAlmacen(Almacen almacen) {
		Almacen = almacen;
	}

	public int getEstado() {
		return Estado;
	}

	public void setEstado(int estado) {
		Estado = estado;
	}

	public double getCantidad() {
		return Cantidad;
	}

	public void setCantidad(double cantidad) {
		Cantidad = cantidad;
	}
	
	
	
	
}
