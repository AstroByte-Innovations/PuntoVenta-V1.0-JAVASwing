package General;

import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTable;

public class Table extends JScrollPane {
	public JTable table;

	public Table(DefaultTableModel modelo) {
		setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		table = new JTable();
		
		this.table.setDefaultRenderer(Object.class, new RenderTable());
		this.table.setModel(modelo);
		
		setViewportView(table);

	}
	
	public Table() {
		setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		table = new JTable();
		this.table.setDefaultRenderer(Object.class, new RenderTable());
		setViewportView(table);
	}

}
