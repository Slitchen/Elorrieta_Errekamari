package erronka;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Scanner;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.SystemColor;

public class OngiEtorri {
	public JFrame frame;
	private JButton btnAdmin;
	private JButton btnOngiEtorri;
	// Moten arrayak sortuko ditugu main-ean beste klasetan erabiltzeko
	private static String[] motak;
	private static String[] izenak;
	private static String[] kodeak;
	private static Double[] prezioak;
	private static String[] argazkiIzenak;
	private int produktuKop = 14;
	private static boolean arraysInicializados = false; // Indicador de inicialización
	Scanner sc = new Scanner(System.in);

	/*
	 * Arrayak hasieratuko ditugu
	 */
	public static void hasieratuArray() {
		if (!arraysInicializados) {
			motak = new String[30];
			izenak = new String[30];
			kodeak = new String[30];
			prezioak = new Double[30];
			argazkiIzenak = new String[30];
			motak = KudeatuArray.hasieratuMotak(motak);
			izenak = KudeatuArray.hasieratuIzenak(izenak);
			kodeak = KudeatuArray.hasieratuKodeak(kodeak);
			prezioak = KudeatuArray.hasieratuPrezioak(prezioak);
			argazkiIzenak = KudeatuArray.hasieratuArgazkiIzenak(argazkiIzenak);
			arraysInicializados = true;
		}

	}

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OngiEtorri window = new OngiEtorri();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public OngiEtorri() {
		OngiEtorria();
	}

	
	private void OngiEtorria() {
		
		
		frame = new JFrame();
		frame.getContentPane().setBackground(SystemColor.controlLtHighlight);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		hasieratuArray();

		btnOngiEtorri = new JButton("ONGI ETORRI");
		btnOngiEtorri.setFont(new Font("Leelawadee", Font.BOLD, 28));
		btnOngiEtorri.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ProduktuMenua produktuMenua = new ProduktuMenua(sc, motak, izenak, kodeak, prezioak, argazkiIzenak, produktuKop);
				produktuMenua.frame.setVisible(true);
				frame.dispose();
			}
		});
		btnOngiEtorri.setBounds(84, 43, 314, 182);
		frame.getContentPane().add(btnOngiEtorri);

		btnAdmin = new JButton("");
		btnAdmin.setBackground(frame.getContentPane().getBackground());
		btnAdmin.setBorderPainted(false);
		btnAdmin.setContentAreaFilled(false);
		btnAdmin.setOpaque(false);
		btnAdmin.setFont(new Font("Sitka Small", Font.PLAIN, 5));
		btnAdmin.setBounds(0, 0, 33, 23);
		frame.getContentPane().add(btnAdmin);
		btnAdmin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				AdminKontsola admin = new AdminKontsola();
				admin.Gakoa(sc, motak, izenak, kodeak, prezioak, argazkiIzenak, produktuKop);
			}
		});
	}
}