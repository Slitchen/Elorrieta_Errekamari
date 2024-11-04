	package erronka;
	
	import javax.swing.JFrame;
	import javax.swing.ImageIcon;
	import javax.swing.JLabel;
	import java.awt.Font;
	import java.awt.Image;
	import javax.swing.JPanel;
	import javax.swing.JButton;
	import javax.swing.SwingConstants;
	import java.awt.event.ActionListener;
	import java.awt.event.ActionEvent;
	import javax.swing.JTextField;
	import java.awt.Color;
	import java.awt.SystemColor;
	
	public class KatalogoJanaria {
	
		private JFrame frame;
		private JTextField textselecnum;
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
		private JTextField txtPrezio;
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
		private JLabel lblP4;
		private JLabel lblP5;
		private JLabel lblP3;
		private JLabel lblP6;
		private JLabel lblP7;
		private JLabel lblP8;
		private JLabel lblP9;
		private ImageIcon imageIcon1;
		private ImageIcon imageIcon2;
		private ImageIcon imageIcon3;
		private ImageIcon imageIcon4;
		private ImageIcon imageIcon5;
		private ImageIcon imageIcon6;
		private JLabel lblNewLabel_1;
		private JLabel lblNewLabel_2;
		private JLabel lblNewLabel_3;
		private JLabel lblNewLabel_4;
		private JLabel lblNewLabel_5;
		private JLabel lblNewLabel_6;
		private JLabel lblNewLabel_7;
		private JLabel lblNewLabel_8;
		private JLabel lblNewLabel_9;
		private JLabel lblPrezioa;
	
		/**
		 * @wbp.parser.entryPoint
		 */
		public void show() {
			katalogoJanaria();
			frame.setVisible(true);// hace que el JFrame de esta pagina sea visible
		}
	
		/**
		 * Initialize the contents of the frame.
		 */
		// Método de inicialización de la GUI
		private void katalogoJanaria() {
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
			panel1.setBounds(55, 324, 113, 117);
			panelb.add(panel1);
			panel1.setLayout(null);
			
			lblP1 = new JLabel("New label");
			lblP1.setBounds(0, 0, 112, 117);
			panel1.add(lblP1);
			
			panel2 = new JPanel();
			panel2.setBounds(215, 324, 113, 117);
			panelb.add(panel2);
			panel2.setLayout(null);
			
			lblP2 = new JLabel("New label");
			lblP2.setBounds(0, 0, 113, 116);
			panel2.add(lblP2);
			
			panel3 = new JPanel();
			panel3.setBounds(380, 324, 113, 117);
			panelb.add(panel3);
			panel3.setLayout(null);
			
			lblP3 = new JLabel("New label");
			lblP3.setBounds(0, 0, 113, 117);
			panel3.add(lblP3);
			
			panel4 = new JPanel();
			panel4.setBounds(55, 167, 113, 117);
			panelb.add(panel4);
			panel4.setLayout(null);
			
			lblP4 = new JLabel("New label");
			lblP4.setBounds(0, 0, 113, 118);
			panel4.add(lblP4);
			
			panel5 = new JPanel();
			panel5.setBounds(215, 167, 113, 117);
			panelb.add(panel5);
			panel5.setLayout(null);
			
			lblP5 = new JLabel("New label");
			lblP5.setBounds(0, 0, 113, 117);
			panel5.add(lblP5);
			
			panel6 = new JPanel();
			panel6.setBounds(380, 167, 113, 117);
			panelb.add(panel6);
			panel6.setLayout(null);
			
			lblP6 = new JLabel("New label");
			lblP6.setBounds(0, 0, 113, 117);
			panel6.add(lblP6);
			
			panel7 = new JPanel();
			panel7.setBounds(54, 11, 113, 117);
			panelb.add(panel7);
			panel7.setLayout(null);
			
			lblP7 = new JLabel("No product");
			lblP7.setHorizontalAlignment(SwingConstants.CENTER);
			lblP7.setBounds(0, 0, 113, 117);
			panel7.add(lblP7);
			
			panel8 = new JPanel();
			panel8.setBounds(214, 11, 113, 117);
			panelb.add(panel8);
			panel8.setLayout(null);
			
			lblP8 = new JLabel("No product");
			lblP8.setHorizontalAlignment(SwingConstants.CENTER);
			lblP8.setBounds(0, 0, 113, 116);
			panel8.add(lblP8);
			
			panel9 = new JPanel();
			panel9.setBounds(379, 11, 113, 117);
			panelb.add(panel9);
			panel9.setLayout(null);
			
			lblP9 = new JLabel("No product");
			lblP9.setHorizontalAlignment(SwingConstants.CENTER);
			lblP9.setBounds(0, 0, 112, 117);
			panel9.add(lblP9);
			
			lbl1 = new JLabel("Choco Boom White");
			lbl1.setHorizontalAlignment(SwingConstants.CENTER);
			lbl1.setBounds(56, 445, 112, 14);
			panelb.add(lbl1);
			
			lbl2 = new JLabel("Choco Boom Black");
			lbl2.setHorizontalAlignment(SwingConstants.CENTER);
			lbl2.setBounds(217, 445, 112, 14);
			panelb.add(lbl2);
			
			lbl3 = new JLabel("Oreo");
			lbl3.setHorizontalAlignment(SwingConstants.CENTER);
			lbl3.setBounds(382, 445, 112, 14);
			panelb.add(lbl3);
			
			lbl4 = new JLabel("Ruffles Jamon");
			lbl4.setHorizontalAlignment(SwingConstants.CENTER);
			lbl4.setBounds(58, 290, 112, 14);
			panelb.add(lbl4);
			
			lbl5 = new JLabel("Ruffles Original");
			lbl5.setHorizontalAlignment(SwingConstants.CENTER);
			lbl5.setBounds(219, 290, 112, 14);
			panelb.add(lbl5);
			
			lbl6 = new JLabel("Ruffles York");
			lbl6.setHorizontalAlignment(SwingConstants.CENTER);
			lbl6.setBounds(384, 290, 112, 14);
			panelb.add(lbl6);
			
			lbl7 = new JLabel("");
			lbl7.setBounds(56, 136, 112, 14);
			panelb.add(lbl7);
			
			lbl8 = new JLabel("");
			lbl8.setHorizontalAlignment(SwingConstants.CENTER);
			lbl8.setBounds(217, 136, 112, 14);
			panelb.add(lbl8);
			
			lbl9 = new JLabel("");
			lbl9.setHorizontalAlignment(SwingConstants.CENTER);
			lbl9.setBounds(382, 136, 112, 14);
			panelb.add(lbl9);
			
			panelc = new JPanel();
			panelc.setBackground(SystemColor.controlLtHighlight);
			panelc.setBounds(586, 92, 281, 509);
			frame.getContentPane().add(panelc);
			panelc.setLayout(null);
	
			textselecnum = new JTextField();
			textselecnum.setFont(new Font("Tahoma", Font.PLAIN, 24));
			textselecnum.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
	
				}
			});
			textselecnum.setBounds(65, 94, 133, 38);
			panelc.add(textselecnum);
			textselecnum.setColumns(10);
			textselecnum.setEditable(false);
	
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
					textselecnum.setText("");
					txtPrezio.setText("");
					textselecnum.setText(textselecnum.getText() + 1);
					txtPrezio.setText("0,8€");
				}
			});
			btn1.setFont(new Font("Tahoma", Font.PLAIN, 11));
			btn1.setBounds(32, 227, 63, 38);
			panelc.add(btn1);
	
			btn2 = new JButton("2");
			btn2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					textselecnum.setText("");
					txtPrezio.setText("");
					textselecnum.setText(textselecnum.getText() + 2);
					txtPrezio.setText("0,8€");
				}
			});
			btn2.setFont(new Font("Tahoma", Font.PLAIN, 11));
			btn2.setBounds(100, 227, 63, 38);
			panelc.add(btn2);
	
			btn3 = new JButton("3");
			btn3.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					textselecnum.setText("");
					txtPrezio.setText("");
					textselecnum.setText(textselecnum.getText() + 3);
					txtPrezio.setText("1€");
				}
			});
			btn3.setFont(new Font("Tahoma", Font.PLAIN, 11));
			btn3.setBounds(166, 227, 63, 38);
			panelc.add(btn3);
	
			btn4 = new JButton("4");
			btn4.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					textselecnum.setText("");
					txtPrezio.setText("");
					textselecnum.setText(textselecnum.getText() + 4);
					txtPrezio.setText("0,5€");
				}
			});
			btn4.setFont(new Font("Tahoma", Font.PLAIN, 11));
			btn4.setBounds(32, 184, 63, 38);
			panelc.add(btn4);
	
			btn5 = new JButton("5");
			btn5.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					textselecnum.setText("");
					txtPrezio.setText("");
					textselecnum.setText(textselecnum.getText() + 5);
					txtPrezio.setText("0,5€");
				}
			});
			btn5.setFont(new Font("Tahoma", Font.PLAIN, 11));
			btn5.setBounds(100, 184, 63, 38);
			panelc.add(btn5);
	
			btn6 = new JButton("6");
			btn6.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					textselecnum.setText("");
					txtPrezio.setText("");
					textselecnum.setText(textselecnum.getText() + 6);
					txtPrezio.setText("0,5€");
				}
			});
			btn6.setFont(new Font("Tahoma", Font.PLAIN, 11));
			btn6.setBounds(166, 184, 63, 38);
			panelc.add(btn6);
	
			btn7 = new JButton("7");
			btn7.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					textselecnum.setText("");
					txtPrezio.setText("");
					textselecnum.setText(textselecnum.getText() + 7);
					txtPrezio.setText("No product");
				}
			});
			btn7.setFont(new Font("Tahoma", Font.PLAIN, 11));
			btn7.setBounds(32, 143, 63, 38);
			panelc.add(btn7);
	
			btn8 = new JButton("8");
			btn8.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					textselecnum.setText("");
					txtPrezio.setText("");
					textselecnum.setText(textselecnum.getText() + 8);
					txtPrezio.setText("No product");
				}
			});
			btn8.setFont(new Font("Tahoma", Font.PLAIN, 11));
			btn8.setBounds(100, 143, 63, 38);
			panelc.add(btn8);
	
			btn9 = new JButton("9");
			btn9.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					textselecnum.setText("");
					txtPrezio.setText("");
					textselecnum.setText(textselecnum.getText() + 9);
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
	
			lblVending = new JLabel("Vending Makina");
			lblVending.setBounds(272, 0, 342, 87);
			panela.add(lblVending);
			lblVending.setFont(new Font("Cooper Black", Font.PLAIN, 41));
			
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
			panela.add(btnAtzera);
			
			imageIcon1 = new ImageIcon(this.getClass().getResource("/chocoBoombl.jpg"));
			Image image1 = imageIcon1.getImage().getScaledInstance(lblP1.getWidth(), lblP1.getHeight(),
					Image.SCALE_SMOOTH);
			imageIcon1.setImage(image1);
			lblP1.setIcon(imageIcon1);
			
			imageIcon2 = new ImageIcon(this.getClass().getResource("/chocoBoomng.jpg"));
			Image image2 = imageIcon2.getImage().getScaledInstance(lblP2.getWidth(), lblP2.getHeight(),
					Image.SCALE_SMOOTH);
			imageIcon2.setImage(image2);
			lblP2.setIcon(imageIcon2);
			
			imageIcon3 = new ImageIcon(this.getClass().getResource("/oreo.jpg"));
			Image image3 = imageIcon3.getImage().getScaledInstance(lblP3.getWidth(), lblP3.getHeight(),
					Image.SCALE_SMOOTH);
			imageIcon3.setImage(image3);
			lblP3.setIcon(imageIcon3);
			
			imageIcon4 = new ImageIcon(this.getClass().getResource("/ruflesJamon.jpg"));
			Image image4 = imageIcon4.getImage().getScaledInstance(lblP4.getWidth(), lblP4.getHeight(),
					Image.SCALE_SMOOTH);
			imageIcon4.setImage(image4);
			lblP4.setIcon(imageIcon4);
			
			imageIcon5 = new ImageIcon(this.getClass().getResource("/ruflesOriginal.jpg"));
			Image image5 = imageIcon5.getImage().getScaledInstance(lblP5.getWidth(), lblP5.getHeight(),
					Image.SCALE_SMOOTH);
			imageIcon5.setImage(image5);
			lblP5.setIcon(imageIcon5);
			
			imageIcon6 = new ImageIcon(this.getClass().getResource("/ruflesYork.jpg"));
			Image image6 = imageIcon6.getImage().getScaledInstance(lblP6.getWidth(), lblP6.getHeight(),
					Image.SCALE_SMOOTH);
			imageIcon6.setImage(image6);
			lblP6.setIcon(imageIcon6);
			
			lblNewLabel_1 = new JLabel("4");
			lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_1.setBounds(90, 306, 46, 14);
			panelb.add(lblNewLabel_1);
			
			lblNewLabel_2 = new JLabel("5");
			lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_2.setBounds(253, 307, 46, 14);
			panelb.add(lblNewLabel_2);
			
			lblNewLabel_3 = new JLabel("6");
			lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_3.setBounds(417, 304, 46, 14);
			panelb.add(lblNewLabel_3);
			
			lblNewLabel_4 = new JLabel("1");
			lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_4.setBounds(90, 460, 46, 14);
			panelb.add(lblNewLabel_4);
			
			lblNewLabel_5 = new JLabel("2");
			lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_5.setBounds(247, 460, 46, 14);
			panelb.add(lblNewLabel_5);
			
			lblNewLabel_6 = new JLabel("3");
			lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_6.setBounds(417, 460, 46, 14);
			panelb.add(lblNewLabel_6);
			
			lblNewLabel_7 = new JLabel("7");
			lblNewLabel_7.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_7.setBounds(87, 151, 46, 14);
			panelb.add(lblNewLabel_7);
			
			lblNewLabel_8 = new JLabel("8");
			lblNewLabel_8.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_8.setBounds(248, 151, 46, 14);
			panelb.add(lblNewLabel_8);
			
			lblNewLabel_9 = new JLabel("9");
			lblNewLabel_9.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_9.setBounds(415, 151, 46, 14);
			panelb.add(lblNewLabel_9);
	
			frame.setVisible(true);
		}
	}
