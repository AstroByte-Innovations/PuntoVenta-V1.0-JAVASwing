package Ventas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.table.DefaultTableModel;

import Mov_Almacen.MMov_Almacen;
import Mov_Almacen.VMovAlmacen;
import Principal.CPrincipal;

public class CVentas implements ActionListener {

	private VVentas ventana;
	
	public CVentas() {
		this.ventana = new VVentas();
		
		DefaultTableModel model = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                // Devolver false para todas las celdas, evitando la edición
                return false;
            }
        };
        // Agregar las columnas al modelo de la tabla
        model.addColumn("ID TICKET");
        model.addColumn("FECHA");
        model.addColumn("ID ALMACEN");
        model.addColumn("SUBTOTAL");
        model.addColumn("IVA");
        model.addColumn("TOTAL");
        model.addColumn("EFECTIVO");
        model.addColumn("CAMBIO");
        
        ArrayList<String[]> lista = MVentas.getInventario();
        for(String[] e: lista) {
        	model.addRow(e);
        }
        
        this.ventana.centro.tabla.table.setModel(model);
        //this.ventana.centro.tabla.table.getColumnModel().getColumn(0).setPreferredWidth(10);
        
		
		
		this.ventana.setVisible(true);
		
		this.ventana.navegacion.SMsalida.addActionListener(this);
		this.ventana.navegacion.logo.grid.addActionListener(this);
		this.ventana.centro.btnSalida.addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == this.ventana.navegacion.SMsalida) {
			this.ventana.dispose();
		}else if(e.getSource() == this.ventana.centro.btnSalida || e.getSource() == this.ventana.navegacion.logo.grid) {
			CPrincipal principal = new CPrincipal();
			this.ventana.dispose();
		}
	}

}
