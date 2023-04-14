package Ventas;

import Tienda.Tienda;
import Inventario.Almacen;
import Usuario.Empleado;
import Usuario.Cliente;

public class Ticket {

	private String ID;
	private String Fecha;
	private Tienda Tienda;
	private Almacen Almacen;
	private Empleado Cajero;
	private Cliente Cliente;
	private double Subtotal;
	private double Descuentos;
	private double IVA;
	private double Total;
	private double Efectivo;
	private double Cambio;
	
	public Ticket(String iD, String fecha, Tienda tienda, Inventario.Almacen almacen, Empleado cajero,
			Usuario.Cliente cliente, double subtotal, double descuentos, double iVA, double total, double efectivo,
			double cambio) {
		super();
		ID = iD;
		Fecha = fecha;
		Tienda = tienda;
		Almacen = almacen;
		Cajero = cajero;
		Cliente = cliente;
		Subtotal = subtotal;
		Descuentos = descuentos;
		IVA = iVA;
		Total = total;
		Efectivo = efectivo;
		Cambio = cambio;
	}

	public String getFecha() {
		return Fecha;
	}

	public void setFecha(String fecha) {
		Fecha = fecha;
	}

	public Tienda getTienda() {
		return Tienda;
	}

	public void setTienda(Tienda tienda) {
		Tienda = tienda;
	}

	public Almacen getAlmacen() {
		return Almacen;
	}

	public void setAlmacen(Almacen almacen) {
		Almacen = almacen;
	}

	public Empleado getCajero() {
		return Cajero;
	}

	public void setCajero(Empleado cajero) {
		Cajero = cajero;
	}

	public Cliente getCliente() {
		return Cliente;
	}

	public void setCliente(Cliente cliente) {
		Cliente = cliente;
	}

	public double getSubtotal() {
		return Subtotal;
	}

	public void setSubtotal(double subtotal) {
		Subtotal = subtotal;
	}

	public double getDescuentos() {
		return Descuentos;
	}

	public void setDescuentos(double descuentos) {
		Descuentos = descuentos;
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
