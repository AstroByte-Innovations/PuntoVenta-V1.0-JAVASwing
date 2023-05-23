package Principal;

import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.GridLayout;

public class Opciones extends JPanel {

	public Opcion[] opciones = {
			new Opcion("Productos","src/Assets/img/imagenop.png",20),
			new Opcion("Punto de Venta","src/Assets/img/imagenop.png",20),
			new Opcion("Inventario","src/Assets/img/imagenop.png",20),
			new Opcion("Movimientos en Almacen","src/Assets/img/imagenop.png",20),
			new Opcion("Ventas","src/Assets/img/imagenop.png",20),
			//new Opcion("Tienda","src/Assets/img/imagenop.png",20),
			new Opcion("Almacenes","src/Assets/img/imagenop.png",20),
			new Opcion("Categorias","src/Assets/img/imagenop.png",20),
			new Opcion("Reportes","src/Assets/img/imagenop.png",20),
			new Opcion("Proveedores","src/Assets/img/imagenop.png",20),
			//new Opcion("Empleados","src/Assets/img/imagenop.png",20),
			//new Opcion("Clientes","src/Assets/img/imagenop.png",20),
			//new Opcion("Roles","src/Assets/img/imagenop.png",20),
			//new Opcion("Auditoria","src/Assets/img/imagenop.png",20),
			//new Opcion("Configuracion","src/Assets/img/imagenop.png",20),
	};
	
	public Opciones() {
		this.setBounds(0, 0, 800, 500);
		this.setBorder(new EmptyBorder(10,10,10,10));
		setLayout(new GridLayout(3, 5, 10, 10));
		
		for(Opcion e: opciones) {
			this.add(e);
		}
		
	}
	
	

}
