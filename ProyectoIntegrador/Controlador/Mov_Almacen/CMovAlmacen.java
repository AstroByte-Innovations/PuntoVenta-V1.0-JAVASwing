package Mov_Almacen;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.table.DefaultTableModel;

import Almacen.MAlmacen;
import Inventario.Almacen;
import Principal.CPrincipal;

public class CMovAlmacen implements ActionListener {

	private VMovAlmacen ventana;
	
	public CMovAlmacen() {
		this.ventana = new VMovAlmacen();
		
		DefaultTableModel model = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                // Devolver false para todas las celdas, evitando la edición
                return false;
            }
        };
        // Agregar las columnas al modelo de la tabla
        model.addColumn("ID PRODUCTO");
        model.addColumn("CODIGO");
        model.addColumn("FECHA");
        model.addColumn("ALMACEN ID");
        model.addColumn("ALMACEN");
        model.addColumn("TIPO");
        model.addColumn("CANTIDAD ANTERIOR");
        model.addColumn("CANTIDAD");
        model.addColumn("CANTIDAD NUEVA");
        
        ArrayList<String[]> lista = MMov_Almacen.getAlmacenes();
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
