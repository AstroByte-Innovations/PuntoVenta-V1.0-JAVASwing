package Productos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class CAgregarProductos implements ActionListener{

	AgregarProducto producto;
	
	public CAgregarProductos() {
		 producto= new AgregarProducto();
		 this.producto.BtnAgregar.addActionListener(this);
	}
	
	private void agregarProducto() {
		String Codigo = this.producto.Codigo.getText();
		String Nombre = this.producto.NombreProducto.getText();
		String Precio = this.producto.Precio.getText();
		String Costo = this.producto.Costo.getText();
		String Tipo = "1";
		String Categoria = "1";
		String SubCategoria = "1";
		String Proveedor = "1";
		String Des = this.producto.Descripcion.getText();
		String Notas = this.producto.Notas.getText();
		String cantidad = this.producto.Cantidad.getValue().toString();
		MProductos.agregar(Codigo, Nombre, Precio, Costo, Tipo, Categoria, SubCategoria, Proveedor, Des, Notas, "NULL", "1", cantidad);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
