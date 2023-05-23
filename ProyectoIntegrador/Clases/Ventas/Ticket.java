package Ventas;

import Productos.ProductoTicket;
public class Ticket {

	private String ID;
	private String Fecha;
	private double Subtotal;
	private double IVA;
	private double Total;
	private double Efectivo;
	private double Cambio;
	private int cantidad;
	private ProductoTicket producto;
	
	
	public Ticket(String iD, String fecha, double subtotal, double iVA, double total, double efectivo,
			double cambio,int cantidad,ProductoTicket producto) {
		super();
		ID = iD;
		Fecha = fecha;
		Subtotal = subtotal;
		IVA = iVA;
		Total = total;
		Efectivo = efectivo;
		Cambio = cambio;
		this.cantidad = cantidad;
		this.producto = producto;
	}
	
	
	
	
	public ProductoTicket getProducto() {
		return producto;
	}

	public void setProducto(ProductoTicket producto) {
		this.producto = producto;
	}




	public int getCantidad() {
		return cantidad;
	}



	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}



	public String getFecha() {
		return Fecha;
	}

	public void setFecha(String fecha) {
		Fecha = fecha;
	}

	public double getSubtotal() {
		return Subtotal;
	}

	public void setSubtotal(double subtotal) {
		Subtotal = subtotal;
	}

	public double getIVA() {
		return IVA;
	}

	public void setIVA(double iVA) {
		IVA = iVA;
	}

	public double getTotal() {
		return Total;
	}

	public void setTotal(double total) {
		Total = total;
	}

	public double getEfectivo() {
		return Efectivo;
	}

	public void setEfectivo(double efectivo) {
		Efectivo = efectivo;
	}

	public double getCambio() {
		return Cambio;
	}

	public void setCambio(double cambio) {
		Cambio = cambio;
	}

	public String getID() {
		return ID;
	}
	
	
	
}
