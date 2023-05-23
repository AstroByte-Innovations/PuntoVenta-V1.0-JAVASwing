package General;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;

import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class guardarImagen extends JPanel {

    private JLabel imagenLabel;
    private JButton cargarBoton;
    private JButton guardarBoton;
    private File archivoSeleccionado;
    public String nombreArchivo;
    public guardarImagen() {
    	this.setPreferredSize(new Dimension(400,200));
        // Crea los componentes
        imagenLabel = new JLabel();
        cargarBoton = new JButton("Cargar imagen");
        guardarBoton = new JButton("Guardar imagen");

        // Agrega el ActionListener al botón de cargar imagen
        cargarBoton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Abre el JFileChooser y obtiene el archivo seleccionado
                JFileChooser fileChooser = new JFileChooser();
        		fileChooser.setFileFilter(new FileNameExtensionFilter("Imágenes", "jpg", "jpeg", "png", "bmp", "gif"));
                fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
                int seleccion = fileChooser.showOpenDialog(null);
                if (seleccion == JFileChooser.APPROVE_OPTION) {
                    archivoSeleccionado = fileChooser.getSelectedFile();

                    // Carga la imagen y la redimensiona
                    try {
                        ImageIcon imagenOriginal = new ImageIcon(archivoSeleccionado.getAbsolutePath());
                        int anchoDeseado = 200; // especifica el ancho deseado en px
                        int altoDeseado = 200; // especifica el alto deseado en px
                        Image imagenRedimensionada = imagenOriginal.getImage().getScaledInstance(anchoDeseado, altoDeseado, Image.SCALE_SMOOTH);
                        ImageIcon imagenIcono = new ImageIcon(imagenRedimensionada);

                        // Actualiza el JLabel con la imagen redimensionada
                        imagenLabel.setIcon(imagenIcono);
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
                }
            }
        });

        // Agrega el ActionListener al botón de guardar imagen
        guardarBoton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Verifica que se haya cargado una imagen
                if (archivoSeleccionado != null) {
                    // Crea el archivo de salida
                    nombreArchivo = archivoSeleccionado.getName();
                    String rutaArchivo = "src/Assets/imgProductos/" + nombreArchivo;
                    File archivoSalida = new File(rutaArchivo);
                    String extension = getFileExtension(nombreArchivo);
                    // Copia la imagen del archivo seleccionado al archivo de salida
                    try {
                        ImageIO.write(ImageIO.read(archivoSeleccionado), extension, archivoSalida);
                        genericos.hecho("Imagen Guardada Correctamente");
                    } catch (IOException ex) {
                        ex.printStackTrace();
                        genericos.error("Error al guardar la imagen");
                    }
                }
            }
        });
        setLayout(new BorderLayout(0, 0));

        // Agrega los componentes al JPanel
        add(imagenLabel,BorderLayout.CENTER);
        add(cargarBoton,BorderLayout.EAST);
        add(guardarBoton,BorderLayout.SOUTH);
    }
    
	private static String getFileExtension(String nombreArchivo) {
		int index = nombreArchivo.lastIndexOf('.');
		if (index > 0 && index < nombreArchivo.length() - 1) {
			return nombreArchivo.substring(index + 1).toLowerCase();
		}
		return "";
	}
}
