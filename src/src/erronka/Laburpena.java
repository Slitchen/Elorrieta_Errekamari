package erronka;

	import java.awt.Color;
	import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener;
	import javax.swing.JButton;
	import javax.swing.JFrame;
	import javax.swing.JPanel;
	import javax.swing.JScrollPane;
	import javax.swing.JTable;
	import javax.swing.table.DefaultTableModel;

public class Laburpena {
	private JButton btnAtzera;
	private JFrame frame;
	private JTable table;
	private JScrollPane scrollPane;
	String[][] datuak;

	int kont = 0;

	/**
	 * @wbp.parser.entryPoint
	 */
	public void show() {
		Laburpena();
		frame.setVisible(true);// hace que el JFrame de esta pagina sea visible
	}

	private void Laburpena() {

		String kantitateak = "";
		String produktuak = "";
		String prezioak = "";
		
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		btnAtzera = new JButton("<-");
		btnAtzera.setForeground(new Color(255, 0, 0));
		btnAtzera.setBackground(new Color(255, 69, 0));
		btnAtzera.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ProduktuMenua produktuMenua = new ProduktuMenua();
				produktuMenua.show();
				frame.dispose();
			}
		});
		btnAtzera.setBounds(10, 11, 45, 23);

		scrollPane = new JScrollPane();
		scrollPane.setBounds(42, 67, 356, 183);
		frame.getContentPane().add(scrollPane);

		table = new JTable();
		table.setModel(new DefaultTableModel(
				new Object[][] { { null, null, null }, { null, null, null }, { null, null, null }, { null, null, null },
						{ null, null, null }, { null, null, null }, { null, null, null }, { null, null, null },
						{ null, null, null }, { null, null, null }, },
				new String[] { "Izena", "Kantitatea", "Prezioa" }));

		datuak = new String[30][3];
		datuak[0][0] = produktuak;

		gehitu();
		
		scrollPane.setViewportView(table);
	}

	public void gehitu() {
		/*
		datuak[kont][0] = produktuak;
		datuak[kont][1] = kantitateak;
		datuak[kont][2] = prezioak;
		kont++;
		*/

		scrollPane.remove(table);
		
		// añadir tabla pero sin la matriz vacia
		table = new JTable();
		table.setModel(new DefaultTableModel(datuak, new String[] { "Produktuak", "Kantitatea", "Prezioa"}));

		// añadir la tabla al scroll
		scrollPane.setViewportView(table);

		((JPanel) frame.getContentPane()).updateUI();
	}

}
