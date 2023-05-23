package Principal;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import Almacen.CAlmacen;
import PuntoDeVenta.CPuntoDeVenta;
import Roles.CRoles;
import Ventas.CVentas;
import Categorias.CCategorias;
import Categorias.VCategorias;
import Clientes.CClientes;
import Empleado.CEmpleado;
import Productos.CProductos;
import Productos.VProductos;
import Proveedores.CProveedor;
import Inventario.CInventario;
import Mov_Almacen.CMovAlmacen;

public class CPrincipal implements ActionListener{

	private Principal principal;
	
	
	public CPrincipal() {
		this.principal = new Principal();
		for(int i = 0; i < 20; i++) {
			this.principal.centro.agenda.recordatorios.recordatorios.add(new Recordatorio("12/12/2023","Viene el proveedor","Hola soy un recordatorio\nLorem ipsum dolor sit amet, consectetur adipiscing elit. Praesent suscipit iaculis placerat. Pellentesque auctor erat mi, ac tincidunt nulla imperdiet vitae. Donec odio est, egestas ut malesuada eu, maximus nec dolor. Aliquam varius arcu non porta dignissim. Nulla dignissim rhoncus nunc, eu venenatis dolor malesuada vel. Morbi iaculis tincidunt aliquam. Suspendisse porttitor lectus vel consequat tempor. Integer ac elit quis justo dignissim pretium. Proin a mollis enim, vel interdum diam. Proin sed sem sit amet urna egestas fermentum eget vitae magna. Fusce non nisi at leo malesuada dapibus nec in ipsum. Phasellus lacus turpis, efficitur id posuere non, aliquam eu dolor."));
		}
		this.principal.setVisible(true);
		
		this.principal.navegacion.logo.grid.addActionListener(this);
		this.principal.centro.opciones.opciones[0].addActionListener(this);
		this.principal.centro.opciones.opciones[1].addActionListener(this);
		this.principal.centro.opciones.opciones[2].addActionListener(this);
		this.principal.centro.opciones.opciones[3].addActionListener(this);
		this.principal.centro.opciones.opciones[4].addActionListener(this);
		this.principal.centro.opciones.opciones[5].addActionListener(this);
		this.principal.centro.opciones.opciones[6].addActionListener(this);
		this.principal.centro.opciones.opciones[7].addActionListener(this);
		this.principal.centro.opciones.opciones[8].addActionListener(this);
		/*
		this.principal.centro.opciones.opciones[9].addActionListener(this);
		this.principal.centro.opciones.opciones[10].addActionListener(this);
		this.principal.centro.opciones.opciones[11].addActionListener(this);
		this.principal.centro.opciones.opciones[12].addActionListener(this);
		this.principal.centro.opciones.opciones[13].addActionListener(this);
		this.principal.centro.opciones.opciones[14].addActionListener(this);*/
		this.principal.navegacion.SMsalida.addActionListener(this);
		//this.principal.centro.

	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == this.principal.navegacion.SMsalida) {
			this.principal.dispose();
		}else if(e.getSource() == this.principal.centro.opciones.opciones[1]) {
			CPuntoDeVenta puntoventa = new CPuntoDeVenta();
			this.principal.dispose();
		}else if(e.getSource() == this.principal.centro.opciones.opciones[2]){
			CInventario inventario = new CInventario();
			this.principal.dispose();
		}else if(e.getSource() == this.principal.centro.opciones.opciones[3]) {
			CMovAlmacen movimientos_almacen = new CMovAlmacen();
			this.principal.dispose();
		}else if(e.getSource() == this.principal.centro.opciones.opciones[5]){
			CAlmacen almacen = new CAlmacen();
			this.principal.dispose();
		}else if(e.getSource() == this.principal.centro.opciones.opciones[6]) {
			CCategorias categorias = new CCategorias();
			this.principal.dispose();
		}else if(e.getSource() == this.principal.centro.opciones.opciones[0]) {
			CProductos productos = new CProductos();
			this.principal.dispose();
		}else if(e.getSource() == this.principal.centro.opciones.opciones[8]) {
			CProveedor proveedor = new CProveedor();
			this.principal.dispose();
		}else if(e.getSource() == this.principal.centro.opciones.opciones[4]) {
			CVentas ventas = new CVentas();
			this.principal.dispose();
		}
	}

}
