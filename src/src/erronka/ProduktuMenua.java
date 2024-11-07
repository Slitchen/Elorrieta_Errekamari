package erronka;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.event.ActionListener;
import java.util.Scanner;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

import java.awt.Font;
import java.awt.Color;
import java.awt.SystemColor;

public class ProduktuMenua {

	public JFrame frame;
	private JPanel panelEdaria;
	private JPanel panelA;
	private JLabel lblIzenburua;
	private JPanel panelB;
	private JButton btnEdaria;
	private JPanel panelJanaria;
	private JButton btnJanaria;
	private JPanel panelSexshop;
	private JButton btnSex;
	private JPanel panelErretzaile;
	private JButton btnErretzaile;
	private JButton btnAtzera;
	private ImageIcon imageIcon1;
	private ImageIcon imageIcon2;
	private ImageIcon imageIcon3;
	private ImageIcon imageIcon4;
	String mota = "";

	public ProduktuMenua(Scanner sc, String[] motak, String[] izenak, String[] kodeak, Double[] prezioak,
			String[] argazkiIzenak, int produktuKop) {
		produktuMenua(sc, motak, izenak, kodeak, prezioak, argazkiIzenak, produktuKop);
	}

	private void produktuMenua(Scanner sc, String[] motak, String[] izenak, String[] kodeak, Double[] prezioak,
			String[] argazkiIzenak, int produktuKop) {
		frame = new JFrame();
		frame.getContentPane().setBackground(SystemColor.textHighlightText);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		panelA = new JPanel();
		panelA.setBounds(0, 0, 434, 70);
		frame.getContentPane().add(panelA);
		panelA.setLayout(null);

		lblIzenburua = new JLabel("Produktu Menua");
		lblIzenburua.setHorizontalAlignment(SwingConstants.CENTER);
		lblIzenburua.setFont(new Font("Colonna MT", Font.PLAIN, 39));
		lblIzenburua.setEnabled(false);
		lblIzenburua.setBounds(71, 11, 305, 48);
		panelA.add(lblIzenburua);

		panelB = new JPanel();
		panelB.setLayout(null);
		panelB.setBounds(0, 70, 434, 191);
		frame.getContentPane().add(panelB);

		panelEdaria = new JPanel();
		panelEdaria.setLayout(null);
		panelEdaria.setBackground(SystemColor.controlLtHighlight);
		panelEdaria.setBounds(10, 34, 81, 109);
		panelB.add(panelEdaria);

		btnEdaria = new JButton("");
		btnEdaria.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mota = "edaria";
				setMota(mota);
				Katalogo katalogo = new Katalogo(sc, motak, izenak, kodeak, prezioak, argazkiIzenak, produktuKop, mota);
				katalogo.frame.setVisible(true);
				frame.dispose();
			}
		});
		btnEdaria.setBounds(0, 0, 81, 109);
		panelEdaria.add(btnEdaria);

		panelJanaria = new JPanel();
		panelJanaria.setLayout(null);
		panelJanaria.setBackground(SystemColor.controlLtHighlight);
		panelJanaria.setBounds(114, 34, 81, 109);
		panelB.add(panelJanaria);

		btnJanaria = new JButton("");
		btnJanaria.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mota = "janaria";
				setMota(mota);
				Katalogo katalogo = new Katalogo(sc, motak, izenak, kodeak, prezioak, argazkiIzenak, produktuKop, mota);
				katalogo.frame.setVisible(true);
				frame.dispose();
			}
		});
		btnJanaria.setBounds(0, 0, 81, 109);
		panelJanaria.add(btnJanaria);

		panelSexshop = new JPanel();
		panelSexshop.setLayout(null);
		panelSexshop.setBackground(SystemColor.controlLtHighlight);
		panelSexshop.setBounds(233, 34, 81, 109);
		panelB.add(panelSexshop);

		btnSex = new JButton("");
		btnSex.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mota = "sexshop";
				setMota(mota);
				Katalogo katalogo = new Katalogo(sc, motak, izenak, kodeak, prezioak, argazkiIzenak, produktuKop, mota);
				katalogo.frame.setVisible(true);
				frame.dispose();
			}
		});
		btnSex.setBounds(0, 0, 81, 109);
		panelSexshop.add(btnSex);

		panelErretzaile = new JPanel();
		panelErretzaile.setLayout(null);
		panelErretzaile.setBackground(SystemColor.controlLtHighlight);
		panelErretzaile.setBounds(343, 34, 81, 109);
		panelB.add(panelErretzaile);

		btnErretzaile = new JButton("");
		btnErretzaile.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mota = "erretzaile";
				setMota(mota);
				Katalogo katalogo = new Katalogo(sc, motak, izenak, kodeak, prezioak, argazkiIzenak, produktuKop, mota);
				katalogo.frame.setVisible(true);
				frame.dispose();
			}
		});
		btnErretzaile.setBounds(0, 0, 81, 109);
		panelErretzaile.add(btnErretzaile);

		btnAtzera = new JButton("<-");
		btnAtzera.setForeground(new Color(255, 0, 0));
		btnAtzera.setBackground(new Color(255, 69, 0));
		btnAtzera.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				OngiEtorri ongiEtorri = new OngiEtorri();
				ongiEtorri.frame.setVisible(true);
				frame.dispose();
			}
		});
		btnAtzera.setBounds(10, 11, 45, 23);
		panelA.add(btnAtzera);

		imageIcon1 = new ImageIcon(this.getClass().getResource("/torolocoOpalo.jpg"));
		Image image1 = imageIcon1.getImage().getScaledInstance(btnEdaria.getWidth(), btnEdaria.getHeight(),
				Image.SCALE_SMOOTH);
		imageIcon1.setImage(image1);
		btnEdaria.setIcon(imageIcon1);

		imageIcon2 = new ImageIcon(this.getClass().getResource("/chocoBoombl.jpg"));
		Image image2 = imageIcon2.getImage().getScaledInstance(btnJanaria.getWidth(), btnJanaria.getHeight(),
				Image.SCALE_SMOOTH);
		imageIcon2.setImage(image2);
		btnJanaria.setIcon(imageIcon2);

		imageIcon3 = new ImageIcon(this.getClass().getResource("/fumarMata.jpg"));
		Image image3 = imageIcon3.getImage().getScaledInstance(btnErretzaile.getWidth(), btnErretzaile.getHeight(),
				Image.SCALE_SMOOTH);
		imageIcon3.setImage(image3);
		btnErretzaile.setIcon(imageIcon3);

		imageIcon4 = new ImageIcon(this.getClass().getResource("/condonesDurex1.jpg"));
		Image image4 = imageIcon4.getImage().getScaledInstance(btnSex.getWidth(), btnSex.getHeight(),
				Image.SCALE_SMOOTH);
		imageIcon4.setImage(image4);
		btnSex.setIcon(imageIcon4);

	}

	public static String setMota(String mota) {
		return mota;
	}

}
