package General;

import javax.swing.JPanel;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Font;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.border.EmptyBorder;

public class Visualizar extends JPanel {
	private JTextField buscar;
	public Table tabla;
	public JButton btnSalida;
	public JButton btnBuscar;
	public JButton btnFiltro;

	/**
	 * Create the panel.
	 */
	public Visualizar(String titulo,String subTitulo) {
		this.setBounds(0, 0, 900, 700);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{150, 0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 1.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JLabel lblTitulo = new JLabel(titulo);
		lblTitulo.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GridBagConstraints gbc_lblTitulo = new GridBagConstraints();
		gbc_lblTitulo.insets = new Insets(5, 10, 5, 10);
		gbc_lblTitulo.gridx = 0;
		gbc_lblTitulo.gridy = 0;
		add(lblTitulo, gbc_lblTitulo);
		
		JLabel lblNewLabel = new JLabel(subTitulo);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel.insets = new Insets(5, 10, 5, 10);
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 2;
		add(lblNewLabel, gbc_lblNewLabel);
		
		buscar = new JTextField();
		buscar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_buscar = new GridBagConstraints();
		gbc_buscar.insets = new Insets(5, 10, 5, 10);
		gbc_buscar.fill = GridBagConstraints.HORIZONTAL;
		gbc_buscar.gridx = 1;
		gbc_buscar.gridy = 2;
		add(buscar, gbc_buscar);
		buscar.setColumns(10);
		
		btnBuscar = new JButton("Buscar");
		btnBuscar.setFont(new Font("Tahoma", Font.PLAIN, 16));
		GridBagConstraints gbc_btnBuscar = new GridBagConstraints();
		gbc_btnBuscar.insets = new Insets(5, 10, 5, 10);
		gbc_btnBuscar.gridx = 2;
		gbc_btnBuscar.gridy = 2;
		add(btnBuscar, gbc_btnBuscar);
		
		btnFiltro = new JButton("Filtro");
		btnFiltro.setFont(new Font("Tahoma", Font.PLAIN, 16));
		GridBagConstraints gbc_btnFiltro = new GridBagConstraints();
		gbc_btnFiltro.insets = new Insets(5, 10, 5, 10);
		gbc_btnFiltro.gridx = 3;
		gbc_btnFiltro.gridy = 2;
		add(btnFiltro, gbc_btnFiltro);
		
		this.tabla = new Table();
		GridBagConstraints gbc_tabla = new GridBagConstraints();
		gbc_tabla.fill = GridBagConstraints.BOTH;
		gbc_tabla.gridwidth = 4;
		gbc_tabla.insets = new Insets(5, 10, 5, 10);
		gbc_tabla.gridx = 0;
		gbc_tabla.gridy = 4;
		add(tabla, gbc_tabla);
		
		
		btnSalida = new JButton("Salida");
		btnSalida.setFont(new Font("Tahoma", Font.PLAIN, 16));
		GridBagConstraints gbc_btnSalida = new GridBagConstraints();
		gbc_btnSalida.gridx = 3;
		gbc_btnSalida.gridy = 5;
		gbc_btnSalida.insets = new Insets(5, 10, 0, 10);
		add(btnSalida, gbc_btnSalida);
	}

}
