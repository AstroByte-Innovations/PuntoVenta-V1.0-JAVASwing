package Inventario;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

import General.genericos;
import Mov_Almacen.MMov_Almacen;
import Principal.CPrincipal;

public class CInventario implements ActionListener, ListSelectionListener{

	public VInventario ventana;
	private String[] datos;
	public CInventario() {
		this.ventana = new VInventario();
		this.datos = new String[7];
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
        model.addColumn("NOMBRE DEL PRODUCTO");
        model.addColumn("ALMACEN ID");
        model.addColumn("ALMACEN");
        model.addColumn("ESTADO");
        model.addColumn("CANTIDAD");
        
        ArrayList<String[]> lista = MInventario.getInventario();
        for(String[] e: lista) {
        	model.addRow(e);
        }
        
        this.ventana.centro.tablaInventario.table.setModel(model);
        //this.ventana.centro.tablaInventario.table.getColumnModel().getColumn(0).setWidth(10);;
        
		this.ventana.centro.btnAgregar.setEnabled(false);
        this.ventana.centro.tablaInventario.table.getSelectionModel().addListSelectionListener(this);
		this.ventana.setVisible(true);
		this.ventana.centro.btnAgregar.addActionListener(this);
		this.ventana.navegacion.SMsalida.addActionListener(this);
		this.ventana.navegacion.logo.grid.addActionListener(this);
		this.ventana.centro.btnSalida.addActionListener(this);
	}
	
	private void change(boolean s) {
		this.ventana.centro.btnAgregar.setEnabled(s);
	}
	
	private void agregar() {
		agregarInventario add = new agregarInventario(this.datos);
		int result = JOptionPane.showConfirmDialog(null, add, "Agregar Productos al Inventario", JOptionPane.OK_CANCEL_OPTION);
		if(result == JOptionPane.OK_OPTION) {
			int cantidad = Integer.parseInt(add.nuevaCantidad.getModel().getValue().toString());
			if(cantidad > 0) { 
				MInventario.actualizar(add.nuevaCantidad.getModel().getValue().toString(), add.ID.getText(), add.IDA.getText(), "1");
            	int selectedRow = this.ventana.centro.tablaInventario.table.getSelectedRow();
                if (selectedRow >= 0 && selectedRow < this.ventana.centro.tablaInventario.table.getRowCount()) {
                    DefaultTableModel model = (DefaultTableModel) this.ventana.centro.tablaInventario.table.getModel();
                    model.setValueAt(Integer.parseInt(add.Cantidad.getText()) + cantidad, selectedRow, 6);
                    if((Integer.parseInt(add.Cantidad.getText()) + cantidad) < 0) model.setValueAt("Agotado", selectedRow, 5);
                    else if((Integer.parseInt(add.Cantidad.getText()) + cantidad) > 5) model.setValueAt("Disponible", selectedRow, 5);
                    else model.setValueAt("Inventario limitado", selectedRow, 5);
                }
			}else genericos.error("No se puede agregar valores menores a 0 en el inventario");
		}
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == this.ventana.navegacion.SMsalida) {
			this.ventana.dispose();
		}else if(e.getSource() == this.ventana.centro.btnSalida || e.getSource() == this.ventana.navegacion.logo.grid) {
			CPrincipal principal = new CPrincipal();
			this.ventana.dispose();
		}else if(e.getSource() == this.ventana.centro.btnAgregar) {
			this.agregar();
		}
	}
	
	
	@Override
	public void valueChanged(ListSelectionEvent e) {
		// TODO Auto-generated method stub
		int selectedRow = this.ventana.centro.tablaInventario.table.getSelectedRow();
		if(selectedRow != -1) {
			this.change(true);
			this.datos[0] = this.ventana.centro.tablaInventario.table.getValueAt(selectedRow, 0).toString();
			this.datos[1] = this.ventana.centro.tablaInventario.table.getValueAt(selectedRow, 1).toString();
			this.datos[2] = this.ventana.centro.tablaInventario.table.getValueAt(selectedRow, 2).toString();
			this.datos[3] = this.ventana.centro.tablaInventario.table.getValueAt(selectedRow, 3).toString();
			this.datos[4] = this.ventana.centro.tablaInventario.table.getValueAt(selectedRow, 4).toString();
			this.datos[5] = this.ventana.centro.tablaInventario.table.getValueAt(selectedRow, 5).toString();
			this.datos[6] = this.ventana.centro.tablaInventario.table.getValueAt(selectedRow, 6).toString();
		}else {
			this.change(false);
		}
	}

}
