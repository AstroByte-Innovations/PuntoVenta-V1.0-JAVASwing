package Libreria;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import java.util.ArrayList;

import Productos.ProductoTicket;
import Ventas.Ticket;
import java.util.*;
import net.sf.jasperreports.view.JasperViewer;
import net.sf.jasperreports.engine.export.JRPdfExporter;
import net.sf.jasperreports.export.SimpleExporterInput;
import net.sf.jasperreports.export.SimpleOutputStreamExporterOutput;

public class generarTicketPDF {
	
	public static void generarReporte(String id,String Fecha,  double subtotal, double iva,  double total, double efectivo, double cambio, int cantidad, ArrayList<ProductoTicket> a) {
		try {
			String userDir = System.getProperty("user.dir");
			JasperReport reporte = JasperCompileManager.compileReport(userDir+"/Reportes/Ticket.jrxml");
			
			ArrayList<Ticket> lista = new ArrayList<Ticket>();
			for(ProductoTicket e: a) {
				lista.add(new Ticket(id, Fecha, subtotal, iva, total, efectivo, cambio, cantidad, e));
			}
			Map<String, Object> parametros = new HashMap<String, Object>();
			JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(lista);
			JasperPrint print = JasperFillManager.fillReport(reporte,parametros, dataSource);
			JRPdfExporter exporter = new JRPdfExporter();
			exporter.setExporterInput(new SimpleExporterInput(print));
            exporter.setExporterOutput(new SimpleOutputStreamExporterOutput(userDir +"/src/Tickets/" + id + ".pdf"));
            exporter.exportReport();
            
			JasperViewer view = new JasperViewer(print,true);
			view.setVisible(true);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}