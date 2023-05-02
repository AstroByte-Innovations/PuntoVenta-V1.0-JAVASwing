package Principal;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import PuntoDeVenta.CPuntoDeVenta;
import Categorias.VCategorias;
import Productos.CProductos;
import Productos.VProductos;
import Inventario.CInventario;

public class CPrincipal implements ActionListener{

	private Principal principal;
	
	
	public CPrincipal() {
		this.principal = new Principal();
		this.principal.setVisible(true);
		
		this.principal.navegacion.logo.grid.addActionListener(this);
		this.principal.centro.opciones.opciones[1].addActionListener(this);
		this.principal.centro.opciones.opciones[7].addActionListener(this);
		this.principal.centro.opciones.opciones[0].addActionListener(this);
		this.principal.centro.opciones.opciones[2].addActionListener(this);
		this.principal.navegacion.SMsalida.addActionListener(this);
		//this.principal.centro.

		for(int i = 0; i < 20; i++) {
			this.principal.centro.agenda.recordatorios.recordatorios.add(new Recordatorio("12/12/2023","Viene el proveedor","Hola soy un recordatorio\nLorem ipsum dolor sit amet, consectetur adipiscing elit. Praesent suscipit iaculis placerat. Pellentesque auctor erat mi, ac tincidunt nulla imperdiet vitae. Donec odio est, egestas ut malesuada eu, maximus nec dolor. Aliquam varius arcu non porta dignissim. Nulla dignissim rhoncus nunc, eu venenatis dolor malesuada vel. Morbi iaculis tincidunt aliquam. Suspendisse porttitor lectus vel consequat tempor. Integer ac elit quis justo dignissim pretium. Proin a mollis enim, vel interdum diam. Proin sed sem sit amet urna egestas fermentum eget vitae magna. Fusce non nisi at leo malesuada dapibus nec in ipsum. Phasellus lacus turpis, efficitur id posuere non, aliquam eu dolor."));
		}
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
		} if(e.getSource() == this.principal.centro.opciones.opciones[7]) {
			VCategorias categorias = new VCategorias();
			categorias.setVisible(true);
			this.principal.dispose();
		}else if(e.getSource() == this.principal.centro.opciones.opciones[0]) {
			CProductos productos = new CProductos();
			this.principal.dispose();
		}
	}

}
