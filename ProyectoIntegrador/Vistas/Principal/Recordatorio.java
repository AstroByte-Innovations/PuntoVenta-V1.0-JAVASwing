package Principal;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;
import javax.swing.border.EmptyBorder;

public class Recordatorio extends JPanel {

    private JLabel fecha;
    private JLabel asunto;
    private JTextArea texto;
    private JPanel encabezado;
    private JScrollPane scrollPane;

    public Recordatorio(String Fecha, String Asunto, String Texto) {
        setPreferredSize(new Dimension(200, 100));
        setBorder(new EmptyBorder(5, 0, 5, 0));
        setLayout(new BorderLayout());
        setMaximumSize(new Dimension(200, 100));
        encabezado = new JPanel();
        encabezado.setLayout(new BorderLayout());

        fecha = new JLabel(Fecha);
        fecha.setFont(new Font("Tahoma", Font.PLAIN, 16));
        encabezado.add(fecha, BorderLayout.NORTH);

        asunto = new JLabel(Asunto);
        asunto.setFont(new Font("Tahoma", Font.PLAIN, 14));
        encabezado.add(asunto, BorderLayout.CENTER);

        add(encabezado, BorderLayout.NORTH);

        scrollPane = new JScrollPane();
        scrollPane.setMaximumSize(new Dimension(200, 100));
        scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        add(scrollPane, BorderLayout.CENTER);
        texto = new JTextArea(Texto);
        texto.setEditable(false);
        texto.setLineWrap(true);
        texto.setFont(new Font("Tahoma", Font.PLAIN, 12));
        scrollPane.setViewportView(texto);
    }
}
