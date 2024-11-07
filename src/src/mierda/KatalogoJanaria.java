package mierda;

import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.SwingConstants;

import java.awt.event.ActionListener;
import java.util.Scanner;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.SystemColor;

public class KatalogoJanaria {

	public JFrame frame;
	public static JTextField textselecnum;
	private JPanel panela;
	private JPanel panelb;
	private JPanel panelc;
	private JButton btn0;
	private JButton btn3;
	private JButton btnC;
	private JButton btnIntro;
	private JLabel lblVending;
	private JButton btn2;
	private JButton btn1;
	private JButton btn6;
	private JButton btn5;
	private JButton btn4;
	private JButton btn9;
	private JButton btn8;
	private JButton btn7;
	private JButton btnAtzera;
	public static JTextField txtPrezio;
	private JPanel panel1;
	private JPanel panel2;
	private JPanel panel3;
	private JPanel panel4;
	private JPanel panel5;
	private JPanel panel6;
	private JPanel panel7;
	private JPanel panel8;
	private JPanel panel9;
	private JLabel lbl1;
	private JLabel lbl2;
	private JLabel lbl3;
	private JLabel lbl6;
	private JLabel lbl5;
	private JLabel lbl4;
	private JLabel lbl9;
	private JLabel lbl8;
	private JLabel lbl7;
	private JLabel lblP1;
	private JLabel lblP2;
	private JLabel lblP3;
	private JLabel lblP4;
	private JLabel lblP5;
	private JLabel lblP6;
	private JLabel lblP7;
	private JLabel lblP8;
	private JLabel lblP9;
	private JLabel lbl4_1;
	private JLabel lbl4_2;
	private JLabel lbl4_3;
	private JLabel lbl4_4;
	private JLabel lbl4_5;
	private JLabel lbl4_6;
	private JLabel lbl4_7;
	private JLabel lbl4_8;
	private JLabel lbl4_9;
	private JLabel lblPrezioa;
	private JButton btnAurrera;

	public KatalogoJanaria(Scanner sc, String[] motak, String[] izenak, String[] kodeak, Double[] prezioak,
			String[] argazkiIzenak, int produktuKop) {
		katalogoJanaria(sc, motak, izenak, kodeak, prezioak, argazkiIzenak, produktuKop);;
	}

	private void katalogoJanaria(Scanner sc, String[] motak, String[] izenak, String[] kodeak, Double[] prezioak,
			String[] argazkiIzenak, int produktuKop) {
		frame = new JFrame();
		frame.setBounds(100, 100, 883, 640);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		// Configura tu GUI como lo tenías antes
		panela = new JPanel();
		panela.setBackground(SystemColor.controlLtHighlight);
		panela.setBounds(0, 0, 867, 93);
		frame.getContentPane().add(panela);
		panela.setLayout(null);

		panelb = new JPanel();
		panelb.setBackground(SystemColor.controlLtHighlight);
		panelb.setBounds(0, 92, 586, 509);
		frame.getContentPane().add(panelb);
		panelb.setLayout(null);

		panel1 = new JPanel();
		panel1.setBounds(55, 320, 113, 117);
		panelb.add(panel1);
		panel1.setLayout(null);

		lblP1 = new JLabel("No product");
		lblP1.setHorizontalAlignment(SwingConstants.CENTER);
		lblP1.setBounds(0, 0, 112, 117);
		panel1.add(lblP1);

		panel2 = new JPanel();
		panel2.setBounds(215, 320, 113, 117);
		panelb.add(panel2);
		panel2.setLayout(null);

		lblP2 = new JLabel("No product");
		lblP2.setHorizontalAlignment(SwingConstants.CENTER);
		lblP2.setBounds(0, 0, 113, 116);
		panel2.add(lblP2);

		panel3 = new JPanel();
		panel3.setBounds(380, 320, 113, 117);
		panelb.add(panel3);
		panel3.setLayout(null);

		lblP3 = new JLabel("No product");
		lblP3.setHorizontalAlignment(SwingConstants.CENTER);
		lblP3.setBounds(0, 0, 113, 117);
		panel3.add(lblP3);

		panel4 = new JPanel();
		panel4.setBounds(55, 163, 113, 117);
		panelb.add(panel4);
		panel4.setLayout(null);

		lblP4 = new JLabel("No product");
		lblP4.setHorizontalAlignment(SwingConstants.CENTER);
		lblP4.setBounds(0, 0, 113, 118);
		panel4.add(lblP4);

		panel5 = new JPanel();
		panel5.setBounds(215, 163, 113, 117);
		panelb.add(panel5);
		panel5.setLayout(null);

		lblP5 = new JLabel("No product");
		lblP5.setHorizontalAlignment(SwingConstants.CENTER);
		lblP5.setBounds(0, 0, 113, 117);
		panel5.add(lblP5);

		panel6 = new JPanel();
		panel6.setBounds(380, 163, 113, 117);
		panelb.add(panel6);
		panel6.setLayout(null);

		lblP6 = new JLabel("No product");
		lblP6.setHorizontalAlignment(SwingConstants.CENTER);
		lblP6.setBounds(0, 0, 113, 117);
		panel6.add(lblP6);

		panel7 = new JPanel();
		panel7.setBounds(55, 11, 113, 117);
		panelb.add(panel7);
		panel7.setLayout(null);

		lblP7 = new JLabel("No product");
		lblP7.setHorizontalAlignment(SwingConstants.CENTER);
		lblP7.setBounds(0, 0, 113, 117);
		panel7.add(lblP7);

		panel8 = new JPanel();
		panel8.setBounds(215, 11, 113, 117);
		panelb.add(panel8);
		panel8.setLayout(null);

		lblP8 = new JLabel("No product");
		lblP8.setHorizontalAlignment(SwingConstants.CENTER);
		lblP8.setBounds(0, 0, 113, 116);
		panel8.add(lblP8);

		panel9 = new JPanel();
		panel9.setBounds(380, 11, 113, 117);
		panelb.add(panel9);
		panel9.setLayout(null);

		lblP9 = new JLabel("No product");
		lblP9.setHorizontalAlignment(SwingConstants.CENTER);
		lblP9.setBounds(0, 0, 112, 117);
		panel9.add(lblP9);

		labelak(panelb, lbl1, lbl2, lbl3, lbl4, lbl5, lbl6, lbl7, lbl8, lbl9, motak, izenak, kodeak, prezioak,
				argazkiIzenak, produktuKop);
		argazkiak(lblP1, lblP2, lblP3, lblP4, lblP5, lblP6, lblP7, lblP8, lblP9, motak, izenak, kodeak, prezioak,
				argazkiIzenak, produktuKop);

		panelc = new JPanel();
		panelc.setBackground(SystemColor.controlLtHighlight);
		panelc.setBounds(586, 92, 281, 509);
		frame.getContentPane().add(panelc);
		panelc.setLayout(null);


		textselecnum = new JTextField();
		textselecnum.setFont(new Font("Tahoma", Font.PLAIN, 24));
		textselecnum.setBounds(65, 94, 133, 38);
		panelc.add(textselecnum);
		textselecnum.setColumns(10);
		textselecnum.setEditable(false);
		
		botoiak(panelc, btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, motak, izenak, kodeak, prezioak,
				argazkiIzenak, produktuKop);


		btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textselecnum.setText("");
				txtPrezio.setText("");
				textselecnum.setText(textselecnum.getText() + 0);
				txtPrezio.setText("No product");
			}
		});
		btn0.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btn0.setBounds(100, 269, 63, 38);
		panelc.add(btn0);

		btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textselecnum.setText("1");
				txtPrezio.setText("");
				txtPrezio.setText("No product");
			}
		});
		btn1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btn1.setBounds(32, 227, 63, 38);
		panelc.add(btn1);

		btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textselecnum.setText("2");
				txtPrezio.setText("");
				txtPrezio.setText("No product");
			}
		});
		btn2.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btn2.setBounds(100, 227, 63, 38);
		panelc.add(btn2);

		btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textselecnum.setText("3");
				txtPrezio.setText("");
				txtPrezio.setText("No product");
			}
		});
		btn3.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btn3.setBounds(166, 227, 63, 38);
		panelc.add(btn3);

		btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textselecnum.setText("4");
				txtPrezio.setText("");
				txtPrezio.setText("No product");
			}
		});
		btn4.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btn4.setBounds(32, 184, 63, 38);
		panelc.add(btn4);

		btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textselecnum.setText("5");
				txtPrezio.setText("");
				txtPrezio.setText("No product");
			}
		});
		btn5.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btn5.setBounds(100, 184, 63, 38);
		panelc.add(btn5);

		btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textselecnum.setText("6");
				txtPrezio.setText("");
				txtPrezio.setText("No product");
			}
		});
		btn6.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btn6.setBounds(166, 184, 63, 38);
		panelc.add(btn6);

		btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textselecnum.setText("7");
				txtPrezio.setText("");
				txtPrezio.setText("No product");
			}
		});
		btn7.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btn7.setBounds(32, 143, 63, 38);
		panelc.add(btn7);

		btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textselecnum.setText("8");
				txtPrezio.setText("");
				txtPrezio.setText("No product");
			}
		});
		btn8.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btn8.setBounds(100, 143, 63, 38);
		panelc.add(btn8);

		btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textselecnum.setText("9");
				txtPrezio.setText("");
				txtPrezio.setText("No product");
			}
		});
		btn9.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btn9.setBounds(166, 143, 63, 38);
		panelc.add(btn9);

		btnC = new JButton("C");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textselecnum.setText("");
				txtPrezio.setText("");
			}
		});
		btnC.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnC.setBounds(166, 269, 63, 38);
		panelc.add(btnC);

		btnIntro = new JButton("Intro");
		btnIntro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnIntro.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnIntro.setBounds(32, 269, 63, 38);
		panelc.add(btnIntro);

		txtPrezio = new JTextField();
		txtPrezio.setEditable(false);
		txtPrezio.setBounds(93, 336, 86, 20);
		panelc.add(txtPrezio);
		txtPrezio.setColumns(10);

		lblPrezioa = new JLabel("Prezioa");
		lblPrezioa.setHorizontalAlignment(SwingConstants.CENTER);
		lblPrezioa.setBounds(112, 318, 46, 14);
		panelc.add(lblPrezioa);

		btnAurrera = new JButton("->");
		btnAurrera.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Laburpena laburpena = new Laburpena();
				laburpena.show();
				frame.dispose();
			}
		});
		btnAurrera.setBounds(182, 475, 89, 23);
		panelc.add(btnAurrera);

		lblVending = new JLabel("Vending Makina");
		lblVending.setBounds(272, 0, 342, 87);
		panela.add(lblVending);
		lblVending.setFont(new Font("Cooper Black", Font.PLAIN, 41));

		btnAtzera = new JButton("<-");
		btnAtzera.setForeground(new Color(255, 0, 0));
		btnAtzera.setBackground(new Color(255, 69, 0));
		btnAtzera.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Crear la ventana de menú de productos
				ProduktuMenua produktuMenua = new ProduktuMenua(sc, motak, izenak, kodeak, prezioak, argazkiIzenak,
						produktuKop);
				produktuMenua.frame.setVisible(true); // Mostrar la ventana de producto
				frame.dispose(); // Cerrar la ventana actual
			}
		});
		btnAtzera.setBounds(10, 11, 45, 23);
		panela.add(btnAtzera);

		lbl4_1 = new JLabel("4");
		lbl4_1.setHorizontalAlignment(SwingConstants.CENTER);
		lbl4_1.setBounds(55, 304, 112, 14);
		panelb.add(lbl4_1);

		lbl4_2 = new JLabel("5");
		lbl4_2.setHorizontalAlignment(SwingConstants.CENTER);
		lbl4_2.setBounds(214, 304, 112, 14);
		panelb.add(lbl4_2);

		lbl4_3 = new JLabel("6");
		lbl4_3.setHorizontalAlignment(SwingConstants.CENTER);
		lbl4_3.setBounds(381, 303, 112, 14);
		panelb.add(lbl4_3);

		lbl4_4 = new JLabel("1");
		lbl4_4.setHorizontalAlignment(SwingConstants.CENTER);
		lbl4_4.setBounds(59, 459, 112, 14);
		panelb.add(lbl4_4);

		lbl4_5 = new JLabel("2");
		lbl4_5.setHorizontalAlignment(SwingConstants.CENTER);
		lbl4_5.setBounds(216, 458, 112, 14);
		panelb.add(lbl4_5);

		lbl4_6 = new JLabel("3");
		lbl4_6.setHorizontalAlignment(SwingConstants.CENTER);
		lbl4_6.setBounds(382, 457, 112, 14);
		panelb.add(lbl4_6);

		lbl4_7 = new JLabel("7");
		lbl4_7.setHorizontalAlignment(SwingConstants.CENTER);
		lbl4_7.setBounds(55, 145, 112, 14);
		panelb.add(lbl4_7);

		lbl4_8 = new JLabel("8");
		lbl4_8.setHorizontalAlignment(SwingConstants.CENTER);
		lbl4_8.setBounds(214, 148, 112, 14);
		panelb.add(lbl4_8);

		lbl4_9 = new JLabel("9");
		lbl4_9.setHorizontalAlignment(SwingConstants.CENTER);
		lbl4_9.setBounds(379, 147, 112, 14);
		panelb.add(lbl4_9);

		frame.setVisible(true);

	}
	
	public static void botoiak(JPanel panelc, JButton btn0, JButton btn1, JButton btn2, JButton btn3, JButton btn4, JButton btn5,
			JButton btn6, JButton btn7, JButton btn8, JButton btn9, String[] motak, String[] izenak, String[] kodeak,
			Double[] prezioak, String[] argazkiIzenak, int produktuKop) {

		int labelIndex = 1; // Empezamos desde el producto 1

		for (int i = 0; i < produktuKop; i++) {
			if (motak[i] != null && motak[i].equals("janaria") && prezioak[i] != null) {

				String prezio = Double.toString(prezioak[i]) + "€"; // Convertir el precio a cadena

				// Aquí asignamos el comportamiento de los botones
				switch (labelIndex) {
				case 1:
					btn1 = new JButton("1");
					btn1.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							textselecnum.setText("1"); // Mostrar el número del producto
							txtPrezio.setText(prezio);
						}
					});
					btn1.setBounds(32, 227, 63, 38);
					panelc.add(btn1);
					break;
				case 2:
					btn2 = new JButton("2");
					btn2.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							textselecnum.setText("2");
							txtPrezio.setText(prezio);
						}
					});
					btn2.setBounds(100, 227, 63, 38);
					panelc.add(btn2);
					break;
				case 3:
					btn3 = new JButton("3");
					btn3.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							textselecnum.setText("3");
							txtPrezio.setText(prezio);
						}
					});
					btn3.setBounds(166, 227, 63, 38);
					panelc.add(btn3);
					break;
				case 4:
					btn4 = new JButton("4");
					btn4.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							textselecnum.setText("4");
							txtPrezio.setText(prezio);
						}
					});
					btn4.setBounds(32, 227, 63, 38);
					panelc.add(btn4);
					break;
				case 5:
					btn5 = new JButton("5");
					btn5.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							textselecnum.setText("5");
							txtPrezio.setText(prezio);
						}

					});
					btn5.setBounds(32, 227, 63, 38);
					panelc.add(btn5);
					break;
				case 6:
					btn6 = new JButton("6");
					btn6.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							textselecnum.setText("6");
							txtPrezio.setText(prezio);
						}

					});
					btn6.setFont(new Font("Tahoma", Font.PLAIN, 11));
					btn6.setBounds(32, 227, 63, 38);
					panelc.add(btn6);
					break;
				case 7:
					btn7 = new JButton("7");
					btn7.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							textselecnum.setText("7");
							txtPrezio.setText(prezio);
						}

					});
					btn7.setFont(new Font("Tahoma", Font.PLAIN, 11));
					btn7.setBounds(32, 227, 63, 38);
					panelc.add(btn7);
					break;
				case 8:
					btn8 = new JButton("8");
					btn8.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							textselecnum.setText("8");
							txtPrezio.setText(prezio);
						}

					});
					btn8.setFont(new Font("Tahoma", Font.PLAIN, 11));
					btn8.setBounds(32, 227, 63, 38);
					panelc.add(btn8);
					break;
				case 9:
					btn9 = new JButton("9");
					btn9.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							textselecnum.setText("9");
							txtPrezio.setText(prezio);
						}

					});
					btn9.setFont(new Font("Tahoma", Font.PLAIN, 11));
					btn9.setBounds(32, 227, 63, 38);
					panelc.add(btn9);
					break;
				default: 
					txtPrezio.setText("no product");
					break;
				}
				labelIndex++; // Pasar al siguiente JLabel
				if (labelIndex > 9)
					break;
			}
		}
	}
	
	public static void argazkiak(JLabel lblP1, JLabel lblP2, JLabel lblP3, JLabel lblP4, JLabel lblP5, JLabel lblP6, JLabel lblP7, JLabel lblP8, JLabel lblP9, String[] motak,
			String[] izenak, String[] kodeak, Double[] prezioak, String[] argazkiIzenak, int produktuKop) {
		int labelIndex = 1; // Iniciamos con lblP1

// Iterar sobre todos los productos y buscar los de tipo "edaria"
		for (int i = 0; i < produktuKop; i++) {
// Verificar si el producto es de tipo "edaria" y tiene una imagen
			if (izenak[i] != null && motak[i] != null && motak[i].equals("janaria") && argazkiIzenak[i] != null) {
// Cargar y escalar la imagen
				ImageIcon imageIcon = new ImageIcon(ProduktuMenua.class.getResource(argazkiIzenak[i]));
				Image image = imageIcon.getImage().getScaledInstance(lblP1.getWidth(), lblP1.getHeight(),
						Image.SCALE_SMOOTH);
				imageIcon.setImage(image);

// Asignar la imagen al JLabel correspondiente según el labelIndex
				switch (labelIndex) {
				case 1:
					lblP1.setIcon(imageIcon);
					lblP1.setText(null);
					break;
				case 2:
					lblP2.setIcon(imageIcon);
					lblP2.setText(null);
					break;
				case 3:
					lblP3.setIcon(imageIcon);
					lblP3.setText(null);
					break;
				case 4:
					lblP4.setIcon(imageIcon);
					lblP4.setText(null);
					break;
				case 5:
					lblP5.setIcon(imageIcon);
					lblP5.setText(null);
					break;
				case 6:
					lblP6.setIcon(imageIcon);
					lblP6.setText(null);
					break;
				case 7:
					lblP7.setIcon(imageIcon);
					lblP7.setText(null);
					break;
				case 8:
					lblP8.setIcon(imageIcon);
					lblP8.setText(null);
					break;
				case 9:
					lblP9.setIcon(imageIcon);
					lblP9.setText(null);
					break;
				}

				labelIndex++; // Pasar al siguiente JLabel

// Si hemos asignado imágenes a los cuatro JLabel, salir del bucle
				if (labelIndex > 9)
					break;
			}
		}

// Limpiar los JLabel restantes si no se usaron todos
		if (labelIndex <= 2)
			lblP2.setIcon(null);
		if (labelIndex <= 3)
			lblP3.setIcon(null);
		if (labelIndex <= 4)
			lblP4.setIcon(null);
		if (labelIndex <= 5)
			lblP5.setIcon(null);
		if (labelIndex <= 6)
			lblP6.setIcon(null);
		if (labelIndex <= 7)
			lblP7.setIcon(null);
		if (labelIndex <= 8)
			lblP8.setIcon(null);
		if (labelIndex <= 9)
			lblP9.setIcon(null);
		
	}
	
	public static void labelak(JPanel panelb, JLabel lbl1, JLabel lbl2, JLabel lbl3, JLabel lbl4, JLabel lbl5, JLabel lbl6, JLabel lbl7, JLabel lbl8, JLabel lbl9, String[] motak,
			String[] izenak, String[] kodeak, Double[] prezioak, String[] argazkiIzenak, int produktuKop) {
		int labelIndex = 1;
		
		for (int i = 0; i < produktuKop; i++) {
		if (izenak[i] != null && motak[i] != null && motak[i].equals("janaria")){
			switch (labelIndex) {
			case 1:
				lbl1 = new JLabel(izenak[i]);
				lbl1.setHorizontalAlignment(SwingConstants.CENTER);
				lbl1.setBounds(56, 441, 112, 14);
				panelb.add(lbl1);
				break;
			case 2:
				lbl2 = new JLabel(izenak[i]);
				lbl2.setHorizontalAlignment(SwingConstants.CENTER);
				lbl2.setBounds(217, 441, 112, 14);
				panelb.add(lbl2);;
				break;
			case 3:
				lbl3 = new JLabel(izenak[i]);
				lbl3.setHorizontalAlignment(SwingConstants.CENTER);
				lbl3.setBounds(382, 441, 112, 14);
				panelb.add(lbl3);
				break;
			case 4:
				lbl4 = new JLabel(izenak[i]);
				lbl4.setHorizontalAlignment(SwingConstants.CENTER);
				lbl4.setBounds(56, 286, 112, 14);
				panelb.add(lbl4);
				break;
			case 5:
				lbl5 = new JLabel(izenak[i]);
				lbl5.setHorizontalAlignment(SwingConstants.CENTER);
				lbl5.setBounds(217, 286, 112, 14);
				panelb.add(lbl5);
				break;
			case 6:
				lbl6 = new JLabel(izenak[i]);
				lbl6.setHorizontalAlignment(SwingConstants.CENTER);
				lbl6.setBounds(382, 286, 112, 14);
				panelb.add(lbl6);
				break;
			case 7:
				lbl7 = new JLabel(izenak[i]);
				lbl7.setHorizontalAlignment(SwingConstants.CENTER);
				lbl7.setBounds(57, 136, 112, 14);
				panelb.add(lbl7);
				break;
			case 8:
				lbl8 = new JLabel(izenak[i]);
				lbl8.setHorizontalAlignment(SwingConstants.CENTER);
				lbl8.setBounds(218, 136, 112, 14);
				panelb.add(lbl8);
				break;
			case 9:
				lbl9 = new JLabel(izenak[i]);
				lbl9.setHorizontalAlignment(SwingConstants.CENTER);
				lbl9.setBounds(383, 136, 112, 14);
				panelb.add(lbl9);
				break;
			}

			labelIndex++; // Pasar al siguiente JLabel
			if (labelIndex > 9)
				break;
		}
	}
	}
}
