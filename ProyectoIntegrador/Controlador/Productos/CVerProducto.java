package Productos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CVerProducto implements ActionListener{

	private VerProducto produc;
	
	public CVerProducto(Producto producto) {
		produc = new VerProducto(producto);
		this.produc.BtnGuardar.addActionListener(this);
		this.produc.BtnGuardar.addActionListener(this);
		this.produc.cancelButton.addActionListener(this);
		if(producto != null) {
			this.produc.ID.setText(producto.getID());
			this.produc.Codigo.setText(producto.getCodigo());
			this.produc.NombreProducto.setText(producto.getNombre());
			this.produc.Precio.setText("$ " + producto.getPrecio());
			this.produc.Costo.setText("$ " + producto.getCosto());
			
			switch(producto.getTipo()) {
				case 1: this.produc.Tipo.setText("Pieza"); break;
				case 2: this.produc.Tipo.setText("Granel");break;
				case 3: this.produc.Tipo.setText("Paquete");break;
			}
			
			switch(producto.getEstado()) {
				case 1: this.produc.Estado.setText("Activo");break;
				case 2: this.produc.Estado.setText("Descontinuado");break;
			}
			
			this.produc.NombreProveedor.setText(producto.getProveedor().getNombres());
			this.produc.ApellidoProveedor.setText(producto.getProveedor().getApellidos());
			this.produc.NombreComercial.setText(producto.getProveedor().getNombre_Comercial());
			this.produc.GiroComercial.setText(producto.getProveedor().getGiro_Comercial());
			this.produc.Telefono.setText(producto.getProveedor().getTelefono());
			this.produc.Correo.setText(producto.getProveedor().getCorreo());
			this.produc.WEB.setText(producto.getProveedor().getSitio_Web());
			
			this.produc.Descripcion.setText(producto.getDescripcion());
			this.produc.Notas.setText(producto.getNotas());
			
			this.produc.Categoria.setText(producto.getCategoria().getNombre());
			this.produc.SubCategoria.setText(producto.getSubCategoria().getNombre());
		}
		
		produc.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == this.produc.cancelButton) {
			this.produc.dispose();;
		}
	}

}
