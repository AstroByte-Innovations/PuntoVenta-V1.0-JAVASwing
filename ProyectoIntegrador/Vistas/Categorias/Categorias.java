package Categorias;

import javax.swing.JPanel;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;

import General.Table;
import javax.swing.JSplitPane;
import java.awt.BorderLayout;
import javax.swing.SwingConstants;
import java.awt.FlowLayout;
import javax.swing.border.EmptyBorder;

public class Categorias extends JPanel {
	private JTextField BuscarCategoria;
	private JTextField SubCategoria;
	public JButton btnSalida;
	public Table tablaCategorias;
	public Table tablaSubCategorias;
	public JButton BtnAgregarSub;
	public JButton BtnAgregarCat;
	public JButton btnActualizarSub;
	public JButton btnEliminarSub;
	public JButton btnActualizarCat;
	public JButton btnEliminarCat;
	
	public Categorias() {
		setBorder(new EmptyBorder(10, 10, 10, 10));
		this.setBounds(0, 0, 1200, 750);
		setLayout(new BorderLayout(0, 0));
		
		JSplitPane splitPane = new JSplitPane();
		splitPane.setResizeWeight(0.5);
		add(splitPane);
		
		JPanel Categorias = new JPanel();
		splitPane.setLeftComponent(Categorias);
		Categorias.setPreferredSize(new Dimension(500,900));
		GridBagLayout gbl_Categorias = new GridBagLayout();
		gbl_Categorias.columnWidths = new int[]{0, 0, 0, 0, 0, 0};
		gbl_Categorias.rowHeights = new int[]{0, 0, 0, 0, 0, 0};
		gbl_Categorias.columnWeights = new double[]{1.0, 1.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_Categorias.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		Categorias.setLayout(gbl_Categorias);
		
		JLabel lblNewLabel = new JLabel("Categorias");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 0;
		Categorias.add(lblNewLabel, gbc_lblNewLabel);
		
		JLabel lblCategoria = new JLabel("Categoria:");
		GridBagConstraints gbc_lblCategoria = new GridBagConstraints();
		gbc_lblCategoria.anchor = GridBagConstraints.EAST;
		gbc_lblCategoria.insets = new Insets(0, 0, 5, 5);
		gbc_lblCategoria.gridx = 0;
		gbc_lblCategoria.gridy = 2;
		Categorias.add(lblCategoria, gbc_lblCategoria);
		
		BuscarCategoria = new JTextField();
		GridBagConstraints gbc_BuscarCategoria = new GridBagConstraints();
		gbc_BuscarCategoria.insets = new Insets(0, 0, 5, 5);
		gbc_BuscarCategoria.fill = GridBagConstraints.HORIZONTAL;
		gbc_BuscarCategoria.gridx = 1;
		gbc_BuscarCategoria.gridy = 2;
		Categorias.add(BuscarCategoria, gbc_BuscarCategoria);
		BuscarCategoria.setColumns(10);
		
		JButton btnBuscarCA = new JButton("Buscar");
		GridBagConstraints gbc_btnBuscarCA = new GridBagConstraints();
		gbc_btnBuscarCA.insets = new Insets(0, 0, 5, 5);
		gbc_btnBuscarCA.gridx = 2;
		gbc_btnBuscarCA.gridy = 2;
		Categorias.add(btnBuscarCA, gbc_btnBuscarCA);
		
		JButton btnFiltroBuscarCa = new JButton("Filtro");
		GridBagConstraints gbc_btnFiltroBuscarCa = new GridBagConstraints();
		gbc_btnFiltroBuscarCa.insets = new Insets(0, 0, 5, 5);
		gbc_btnFiltroBuscarCa.gridx = 3;
		gbc_btnFiltroBuscarCa.gridy = 2;
		Categorias.add(btnFiltroBuscarCa, gbc_btnFiltroBuscarCa);
		
		btnActualizarCat = new JButton("Actualizar");
		btnActualizarCat.setEnabled(false);
		GridBagConstraints gbc_btnActualizarCat = new GridBagConstraints();
		gbc_btnActualizarCat.insets = new Insets(0, 0, 5, 5);
		gbc_btnActualizarCat.gridx = 2;
		gbc_btnActualizarCat.gridy = 3;
		Categorias.add(btnActualizarCat, gbc_btnActualizarCat);
		
		btnEliminarCat = new JButton("Eliminar");
		btnEliminarCat.setEnabled(false);
		GridBagConstraints gbc_btnEliminarCat = new GridBagConstraints();
		gbc_btnEliminarCat.insets = new Insets(0, 0, 5, 5);
		gbc_btnEliminarCat.gridx = 3;
		gbc_btnEliminarCat.gridy = 3;
		Categorias.add(btnEliminarCat, gbc_btnEliminarCat);
		
		BtnAgregarCat = new JButton("Agregar");
		GridBagConstraints gbc_BtnAgregarCat = new GridBagConstraints();
		gbc_BtnAgregarCat.insets = new Insets(0, 0, 5, 0);
		gbc_BtnAgregarCat.gridx = 4;
		gbc_BtnAgregarCat.gridy = 3;
		Categorias.add(BtnAgregarCat, gbc_BtnAgregarCat);
		
		this.tablaCategorias = new Table();
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.gridwidth = 5;
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridx = 0;
		gbc_scrollPane.gridy = 4;
		Categorias.add(this.tablaCategorias, gbc_scrollPane);
		
		JPanel SubCategorias = new JPanel();
		splitPane.setRightComponent(SubCategorias);
		SubCategorias.setPreferredSize(new Dimension(500,900));
		GridBagLayout gbl_SubCategorias = new GridBagLayout();
		gbl_SubCategorias.columnWidths = new int[]{0, 0, 0, 0, 0, 0};
		gbl_SubCategorias.rowHeights = new int[]{0, 0, 0, 0, 0, 0};
		gbl_SubCategorias.columnWeights = new double[]{1.0, 1.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_SubCategorias.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		SubCategorias.setLayout(gbl_SubCategorias);
		
		JLabel lblNewLabel_1 = new JLabel("SubCategorias");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 0;
		gbc_lblNewLabel_1.gridy = 0;
		SubCategorias.add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		JLabel lblSubCategorias = new JLabel("SubCategoria:");
		GridBagConstraints gbc_lblSubCategorias = new GridBagConstraints();
		gbc_lblSubCategorias.insets = new Insets(0, 0, 5, 5);
		gbc_lblSubCategorias.anchor = GridBagConstraints.EAST;
		gbc_lblSubCategorias.gridx = 0;
		gbc_lblSubCategorias.gridy = 2;
		SubCategorias.add(lblSubCategorias, gbc_lblSubCategorias);
		
		SubCategoria = new JTextField();
		GridBagConstraints gbc_SubCategoria = new GridBagConstraints();
		gbc_SubCategoria.insets = new Insets(0, 0, 5, 5);
		gbc_SubCategoria.fill = GridBagConstraints.HORIZONTAL;
		gbc_SubCategoria.gridx = 1;
		gbc_SubCategoria.gridy = 2;
		SubCategorias.add(SubCategoria, gbc_SubCategoria);
		SubCategoria.setColumns(10);
		
		JButton btnBuscarSC = new JButton("Buscar");
		GridBagConstraints gbc_btnBuscarSC = new GridBagConstraints();
		gbc_btnBuscarSC.insets = new Insets(0, 0, 5, 5);
		gbc_btnBuscarSC.gridx = 2;
		gbc_btnBuscarSC.gridy = 2;
		SubCategorias.add(btnBuscarSC, gbc_btnBuscarSC);
		
		JButton btnFiltroSC = new JButton("Filtro");
		GridBagConstraints gbc_btnFiltroSC = new GridBagConstraints();
		gbc_btnFiltroSC.insets = new Insets(0, 0, 5, 5);
		gbc_btnFiltroSC.gridx = 3;
		gbc_btnFiltroSC.gridy = 2;
		SubCategorias.add(btnFiltroSC, gbc_btnFiltroSC);
		
		btnActualizarSub = new JButton("Actualizar");
		btnActualizarSub.setEnabled(false);
		GridBagConstraints gbc_btnActualizarSub = new GridBagConstraints();
		gbc_btnActualizarSub.insets = new Insets(0, 0, 5, 5);
		gbc_btnActualizarSub.gridx = 2;
		gbc_btnActualizarSub.gridy = 3;
		SubCategorias.add(btnActualizarSub, gbc_btnActualizarSub);
		
		btnEliminarSub = new JButton("Eliminar");
		btnEliminarSub.setEnabled(false);
		GridBagConstraints gbc_btnEliminarSub = new GridBagConstraints();
		gbc_btnEliminarSub.insets = new Insets(0, 0, 5, 5);
		gbc_btnEliminarSub.gridx = 3;
		gbc_btnEliminarSub.gridy = 3;
		SubCategorias.add(btnEliminarSub, gbc_btnEliminarSub);
		
		BtnAgregarSub = new JButton("Agregar");
		BtnAgregarSub.setEnabled(false);
		GridBagConstraints gbc_BtnAgregarSub = new GridBagConstraints();
		gbc_BtnAgregarSub.insets = new Insets(0, 0, 5, 0);
		gbc_BtnAgregarSub.gridx = 4;
		gbc_BtnAgregarSub.gridy = 3;
		SubCategorias.add(BtnAgregarSub, gbc_BtnAgregarSub);
		
		this.tablaSubCategorias = new Table();
		GridBagConstraints gbc_scrollPane_1 = new GridBagConstraints();
		gbc_scrollPane_1.gridwidth = 5;
		gbc_scrollPane_1.fill = GridBagConstraints.BOTH;
		gbc_scrollPane_1.gridx = 0;
		gbc_scrollPane_1.gridy = 4;
		SubCategorias.add(this.tablaSubCategorias, gbc_scrollPane_1);
		
		JLabel lblTitulo = new JLabel("Categorias y SubCategorias");
		lblTitulo.setFont(new Font("Tahoma", Font.PLAIN, 18));
		add(lblTitulo, BorderLayout.NORTH);
		
		JPanel panel = new JPanel();
		FlowLayout flowLayout = (FlowLayout) panel.getLayout();
		flowLayout.setAlignment(FlowLayout.RIGHT);
		add(panel, BorderLayout.SOUTH);
		
		btnSalida = new JButton("Salida");
		btnSalida.setFont(new Font("Tahoma", Font.PLAIN, 12));
		panel.add(btnSalida);
		
	}

}
