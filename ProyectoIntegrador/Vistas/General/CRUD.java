package General;

import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Font;
import java.awt.Insets;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.SwingConstants;
import java.awt.FlowLayout;

public class CRUD extends JPanel {
	public JTextField buscar;
	public Table tablaInventario;
	public JPanel Centro, Encabezado, Pie;
	public JButton btnSalida;

	public CRUD(String titulo,String etiqueta) {
		setBounds(100, 100, 900, 600);
		this.setBorder(new EmptyBorder(5,5,5,5));
		setLayout(new BorderLayout(0, 0));
		
		Encabezado = new JPanel();
		add(Encabezado, BorderLayout.NORTH);
		GridBagLayout gbl_Encabezado = new GridBagLayout();
		gbl_Encabezado.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_Encabezado.rowHeights = new int[]{0, 0, 0, 0};
		gbl_Encabezado.columnWeights = new double[]{0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_Encabezado.rowWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		Encabezado.setLayout(gbl_Encabezado);
		
		JLabel Titulo = new JLabel(titulo);
		Titulo.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GridBagConstraints gbc_Titulo = new GridBagConstraints();
		gbc_Titulo.insets = new Insets(0, 0, 5, 5);
		gbc_Titulo.gridx = 0;
		gbc_Titulo.gridy = 0;
		Encabezado.add(Titulo, gbc_Titulo);
		
		JLabel lblEtiqueta = new JLabel(etiqueta);
		lblEtiqueta.setFont(new Font("Tahoma", Font.PLAIN, 12));
		GridBagConstraints gbc_lblEtiqueta = new GridBagConstraints();
		gbc_lblEtiqueta.insets = new Insets(0, 0, 0, 5);
		gbc_lblEtiqueta.anchor = GridBagConstraints.EAST;
		gbc_lblEtiqueta.gridx = 0;
		gbc_lblEtiqueta.gridy = 2;
		Encabezado.add(lblEtiqueta, gbc_lblEtiqueta);
		
		buscar = new JTextField();
		buscar.setFont(new Font("Tahoma", Font.PLAIN, 12));
		GridBagConstraints gbc_buscar = new GridBagConstraints();
		gbc_buscar.insets = new Insets(0, 0, 0, 5);
		gbc_buscar.fill = GridBagConstraints.HORIZONTAL;
		gbc_buscar.gridx = 1;
		gbc_buscar.gridy = 2;
		Encabezado.add(buscar, gbc_buscar);
		buscar.setColumns(10);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.setFont(new Font("Tahoma", Font.PLAIN, 12));
		GridBagConstraints gbc_btnBuscar = new GridBagConstraints();
		gbc_btnBuscar.insets = new Insets(0, 0, 0, 5);
		gbc_btnBuscar.gridx = 3;
		gbc_btnBuscar.gridy = 2;
		Encabezado.add(btnBuscar, gbc_btnBuscar);
		
		JButton btnFiltro = new JButton("Filtro");
		btnFiltro.setFont(new Font("Tahoma", Font.PLAIN, 12));
		GridBagConstraints gbc_btnFiltro = new GridBagConstraints();
		gbc_btnFiltro.insets = new Insets(0, 0, 0, 5);
		gbc_btnFiltro.gridx = 5;
		gbc_btnFiltro.gridy = 2;
		Encabezado.add(btnFiltro, gbc_btnFiltro);
		
		JButton btnAgregar = new JButton("Agregar");
		btnAgregar.setFont(new Font("Tahoma", Font.PLAIN, 12));
		GridBagConstraints gbc_btnAgregar = new GridBagConstraints();
		gbc_btnAgregar.gridx = 7;
		gbc_btnAgregar.gridy = 2;
		Encabezado.add(btnAgregar, gbc_btnAgregar);
		
		Centro = new JPanel();
		add(Centro, BorderLayout.CENTER);
		Centro.setLayout(new BorderLayout(0, 0));
		
		this.tablaInventario = new Table();
		this.Centro.add(tablaInventario);
		
		Pie = new JPanel();
		FlowLayout flowLayout = (FlowLayout) Pie.getLayout();
		flowLayout.setAlignment(FlowLayout.RIGHT);
		add(Pie, BorderLayout.SOUTH);
		
		btnSalida = new JButton("Salir");
		btnSalida.setFont(new Font("Tahoma", Font.PLAIN, 14));
		Pie.add(btnSalida);
		
	}

}
