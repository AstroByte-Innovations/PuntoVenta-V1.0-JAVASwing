package General;

import java.awt.Component;

import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

public class RenderTable extends DefaultTableCellRenderer{

    public Component getTableCellRendererComponent(JTable table, Object object,boolean isSelected, boolean hasFocus, int row, int column) {
    	if(object  instanceof JButton) {
    		return (JButton) object;
    	}
    	
    	return super.getTableCellRendererComponent(table, object, isSelected, hasFocus, row, column);
    }
	
	
}
