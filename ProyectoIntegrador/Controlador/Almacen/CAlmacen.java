package Almacen;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import General.genericos;
import Principal.CPrincipal;
import Inventario.Almacen;
public class CAlmacen implements ActionListener, ListSelectionListener{

	private VAlmacen ventana;
	private Almacen alm;
	
	public CAlmacen() {
		this.ventana = new VAlmacen();
		this.ventana.centro.btnActualizar.addActionListener(this);;
		this.ventana.centro.btnAgregar.addActionListener(this);
		this.ventana.centro.btnBuscar.addActionListener(this);
		this.ventana.centro.btnEliminar.addActionListener(this);
		this.ventana.centro.btnFiltro.addActionListener(this);
		this.ventana.centro.btnSalida.addActionListener(this);
		this.ventana.navegacion.SMsalida.addActionListener(this);
		this.ventana.navegacion.logo.grid.addActionListener(this);
		
        DefaultTableModel model = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                // Devolver false para todas las celdas, evitando la edición
                return false;
            }
        };
        // Agregar las columnas al modelo de la tabla
        model.addColumn("ID");
        model.addColumn("NOMBRE");
        
        ArrayList<Almacen> lista = MAlmacen.getAlmacenes();
        for(Almacen e: lista) {
        	String[] data = {e.getID(), e.getNombre()};
        	model.addRow(data);
        }
        
        this.ventana.centro.tabla.table.setModel(model);
        this.ventana.centro.tabla.table.getColumnModel().getColumn(0).setPreferredWidth(10);
        this.ventana.centro.tabla.table.getSelectionModel().addListSelectionListener(this);
        
		this.ventana.setVisible(true);
	}
	
	private void change(boolean s) {
		this.ventana.centro.btnEliminar.setEnabled(s);
		this.ventana.centro.btnActualizar.setEnabled(s);
		this.ventana.centro.btnAgregar.setEnabled(!s);
	}
	
	private void agregar() {
	    AlmacenNombre almNombre = new AlmacenNombre();
	    int result = JOptionPane.showConfirmDialog(null, almNombre, "Agregar Almacen", JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE);
	    if (result == JOptionPane.OK_OPTION) {
	        if (almNombre.Nombre.getText().isEmpty()) {
	            genericos.error("El nombre del almacén no debe estar vacío");
	        } else {
	            String nombre = almNombre.Nombre.getText();
	            Almacen almacen = MAlmacen.agregar(nombre);
	            if (almacen != null) {
	                TableModel model = this.ventana.centro.tabla.table.getModel();
	                Object[] newRow = {almacen.getID(), almacen.getNombre()};
	                ((DefaultTableModel) model).addRow(newRow);
	            }
	        }
	    }
	}
	
	private void actualizar() {
		if(this.ventana.centro.Nombre.getText().isEmpty()) {
			genericos.error("El nombre del almacén no debe estar vacío");
		}else {
			String nombre = this.ventana.centro.Nombre.getText();
			Almacen almacen = MAlmacen.actualizar(alm.getID(),nombre);
            if (almacen != null) {
            	int selectedRow = this.ventana.centro.tabla.table.getSelectedRow();
                if (selectedRow >= 0 && selectedRow < this.ventana.centro.tabla.table.getRowCount()) {
                    DefaultTableModel model = (DefaultTableModel) this.ventana.centro.tabla.table.getModel();
                    model.setValueAt(almacen.getNombre(), selectedRow, 1);
                }
            }
		}
	}
	
	private void eliminar() {
		int selectedRow = this.ventana.centro.tabla.table.getSelectedRow();
		String ID = this.ventana.centro.tabla.table.getValueAt(selectedRow, 0).toString();
		if(MAlmacen.eliminar(ID)) {
	        if (selectedRow >= 0 && selectedRow < this.ventana.centro.tabla.table.getRowCount()) {
	            DefaultTableModel model = (DefaultTableModel) this.ventana.centro.tabla.table.getModel();
	            model.removeRow(selectedRow);
	            this.ventana.centro.tabla.table.repaint();
	        }
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
		}else if(e.getSource() == this.ventana.centro.btnActualizar) {
			this.actualizar();
		}else if(e.getSource() == this.ventana.centro.btnEliminar) {
			this.eliminar();
		}
	}

	@Override
	public void valueChanged(ListSelectionEvent e) {
		// TODO Auto-generated method stub
		int selectedRow = this.ventana.centro.tabla.table.getSelectedRow();
		if(selectedRow != -1) {
			this.change(true);
			String ID = this.ventana.centro.tabla.table.getValueAt(selectedRow, 0).toString();
			String Nombre = this.ventana.centro.tabla.table.getValueAt(selectedRow, 1).toString();
			this.ventana.centro.Nombre.setText(Nombre);
			this.alm = new Almacen(ID,Nombre);
		}else {
			this.change(false);
		}
	}

}
