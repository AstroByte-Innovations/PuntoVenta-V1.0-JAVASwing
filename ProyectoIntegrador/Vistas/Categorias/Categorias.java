package Categorias;

import javax.swing.JPanel;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;

import General.Table;

public class Categorias extends JPanel {
	private JTextField BuscarCategoria;
	private JTextField SubCategoriaBuscar;
	private Table tablaCategorias;
	public Table tablaSubCatgorias;

	
	public Categorias() {
		this.setBounds(0, 0, 1200, 750);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 300, 0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 300, 0, 0, 0, 0, 0, 200, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		this.tablaCategorias = new Table();
		this.tablaSubCatgorias = new Table();
		
		JLabel lblCatTitulo = new JLabel("Categorias");
		lblCatTitulo.setFont(new Font("Tahoma", Font.PLAIN, 25));
		GridBagConstraints gbc_lblCatTitulo = new GridBagConstraints();
		gbc_lblCatTitulo.insets = new Insets(0, 0, 5, 5);
		gbc_lblCatTitulo.gridx = 1;
		gbc_lblCatTitulo.gridy = 1;
		add(lblCatTitulo, gbc_lblCatTitulo);
		
		JLabel lblNewLabel_1 = new JLabel("Categoria");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_1.gridx = 1;
		gbc_lblNewLabel_1.gridy = 3;
		add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		BuscarCategoria = new JTextField();
		BuscarCategoria.setFont(new Font("Tahoma", Font.PLAIN, 16));
		GridBagConstraints gbc_BuscarCategoria = new GridBagConstraints();
		gbc_BuscarCategoria.insets = new Insets(0, 0, 5, 5);
		gbc_BuscarCategoria.fill = GridBagConstraints.HORIZONTAL;
		gbc_BuscarCategoria.gridx = 2;
		gbc_BuscarCategoria.gridy = 3;
		add(BuscarCategoria, gbc_BuscarCategoria);
		BuscarCategoria.setColumns(10);
		
		JButton btnBuscarCat = new JButton("Buscar");
		btnBuscarCat.setFont(new Font("Tahoma", Font.PLAIN, 16));
		GridBagConstraints gbc_btnBuscarCat = new GridBagConstraints();
		gbc_btnBuscarCat.insets = new Insets(0, 0, 5, 5);
		gbc_btnBuscarCat.gridx = 4;
		gbc_btnBuscarCat.gridy = 3;
		add(btnBuscarCat, gbc_btnBuscarCat);
		
		JButton btnFiltrosCat = new JButton("Filtro");
		btnFiltrosCat.setFont(new Font("Tahoma", Font.PLAIN, 16));
		GridBagConstraints gbc_btnFiltrosCat = new GridBagConstraints();
		gbc_btnFiltrosCat.insets = new Insets(0, 0, 5, 5);
		gbc_btnFiltrosCat.gridx = 5;
		gbc_btnFiltrosCat.gridy = 3;
		add(btnFiltrosCat, gbc_btnFiltrosCat);
		
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.insets = new Insets(0, 0, 5, 0);
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridx = 1;
		gbc_scrollPane.gridy = 5;
		gbc_scrollPane.gridwidth = 6;
		add(this.tablaCategorias, gbc_scrollPane);
		
		JLabel lblSCatTitulo = new JLabel("SubCategorias");
		lblSCatTitulo.setFont(new Font("Tahoma", Font.PLAIN, 25));
		GridBagConstraints gbc_lblSCatTitulo = new GridBagConstraints();
		gbc_lblSCatTitulo.insets = new Insets(0, 0, 5, 5);
		gbc_lblSCatTitulo.gridx = 1;
		gbc_lblSCatTitulo.gridy = 7;
		add(lblSCatTitulo, gbc_lblSCatTitulo);
		
		JLabel lblNewLabel_3 = new JLabel("SubCategoria");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
		gbc_lblNewLabel_3.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_3.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_3.gridx = 1;
		gbc_lblNewLabel_3.gridy = 9;
		add(lblNewLabel_3, gbc_lblNewLabel_3);
		
		SubCategoriaBuscar = new JTextField();
		SubCategoriaBuscar.setFont(new Font("Tahoma", Font.PLAIN, 16));
		GridBagConstraints gbc_SubCategoriaBuscar = new GridBagConstraints();
		gbc_SubCategoriaBuscar.insets = new Insets(0, 0, 5, 5);
		gbc_SubCategoriaBuscar.fill = GridBagConstraints.HORIZONTAL;
		gbc_SubCategoriaBuscar.gridx = 2;
		gbc_SubCategoriaBuscar.gridy = 9;
		add(SubCategoriaBuscar, gbc_SubCategoriaBuscar);
		SubCategoriaBuscar.setColumns(10);
		
		JButton btnBuscarSub = new JButton("Buscar");
		btnBuscarSub.setFont(new Font("Tahoma", Font.PLAIN, 16));
		GridBagConstraints gbc_btnBuscarSub = new GridBagConstraints();
		gbc_btnBuscarSub.insets = new Insets(0, 0, 5, 5);
		gbc_btnBuscarSub.gridx = 4;
		gbc_btnBuscarSub.gridy = 9;
		add(btnBuscarSub, gbc_btnBuscarSub);
		
		JButton btnFiltroSub = new JButton("Filtro");
		btnFiltroSub.setFont(new Font("Tahoma", Font.PLAIN, 16));
		GridBagConstraints gbc_btnFiltroSub = new GridBagConstraints();
		gbc_btnFiltroSub.insets = new Insets(0, 0, 5, 5);
		gbc_btnFiltroSub.gridx = 5;
		gbc_btnFiltroSub.gridy = 9;
		add(btnFiltroSub, gbc_btnFiltroSub);
		
		GridBagConstraints gbc_scrollPane_1 = new GridBagConstraints();
		gbc_scrollPane_1.insets = new Insets(0, 0, 5, 0);
		gbc_scrollPane_1.fill = GridBagConstraints.BOTH;
		gbc_scrollPane_1.gridx = 1;
		gbc_scrollPane_1.gridy = 11;
		gbc_scrollPane_1.gridwidth = 6;
		add(this.tablaSubCatgorias, gbc_scrollPane_1);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.setFont(new Font("Tahoma", Font.PLAIN, 22));
		GridBagConstraints gbc_btnSalir = new GridBagConstraints();
		gbc_btnSalir.anchor = GridBagConstraints.EAST;
		gbc_btnSalir.insets = new Insets(0, 0, 5, 0);
		gbc_btnSalir.gridx = 6;
		gbc_btnSalir.gridy = 12;
		add(btnSalir, gbc_btnSalir);
	}

}
