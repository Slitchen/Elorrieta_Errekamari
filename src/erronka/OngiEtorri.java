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
	private JButton btnAdmin;
	private JButton btnOngiEtorri;
    private String[] motak = new String[30];
    private String[] izenak = new String[30];
    private String[] kodeak = new String[30];
    private Double[] prezioak = new Double[30];
    private String[] argazkiIzenak = new String[30];
    private int produktuKop = 11;
    private Scanner sc = new Scanner(System.in);
    public JFrame frame;

    // Inicialización de arrays
    public static void hasieratuArray(String[] motak, String[] izenak, String[] kodeak, Double[] prezioak, String[] argazkiIzenak) {
 
		motak[0] = "janaria";
		izenak[0] = "Choco Boom Zuria";
		kodeak[0] = "A001";
		prezioak[0] = 0.80;
		argazkiIzenak[0] = "/chocoBoombl.jpg";

		motak[1] = "janaria";
		izenak[1] = "Choco Boom Beltza";
		kodeak[1] = "A002";
		prezioak[1] = 0.80;
		argazkiIzenak[1] = "/chocoBoomng.jpg";

		motak[2] = "janaria";
		izenak[2] = "Oreo";
		kodeak[2] = "A003";
		prezioak[2] = 1.0;
		argazkiIzenak[2] = "/oreo.jpg";

		motak[3] = "janaria";
		izenak[3] = "Ruffles Jamon";
		kodeak[3] = "A004";
		prezioak[3] = 0.50;
		argazkiIzenak[3] = "/ruflesJamon.jpg";

		motak[4] = "janaria";
		izenak[4] = "Ruffles Original";
		kodeak[4] = "A005";
		prezioak[4] = 0.50;
		argazkiIzenak[4] = "/ruflesOriginal.jpg";

		// edariak
		motak[5] = "edaria";
		izenak[5] = "Toroloco Opalo";
		kodeak[5] = "A006";
		prezioak[5] = 1.0;
		argazkiIzenak[5] = "/torolocoOpalo.jpg";

		motak[6] = "edaria";
		izenak[6] = "Toroloco Original";
		kodeak[6] = "A007";
		prezioak[6] = 1.0;
		argazkiIzenak[6] = "/torolocoOriginal.jpg";

		motak[7] = "edaria";
		izenak[7] = "Toroloco Mango";
		kodeak[7] = "A008";
		prezioak[7] = 1.0;
		argazkiIzenak[7] = "/torolocoMango.jpg";

		// erretzaile

		motak[8] = "erretzaile";
		izenak[8] = "Malboro";
		kodeak[8] = "A09";
		prezioak[8] = 4.0;
		argazkiIzenak[8] = "/fumarMata.jpg";

		motak[9] = "erretzaile";
		izenak[9] = "Lucky Strike";
		kodeak[9] = "A010";
		prezioak[9] = 3.0;
		argazkiIzenak[9] = "/luckyStrike.jpg";

		// sexshop
		motak[10] = "sexshop";
		izenak[10] = "Durex Urdina";
		kodeak[10] = "A011";
		prezioak[10] = 12.0;
		argazkiIzenak[10] = "/condonesDurex1.jpg";
		
		

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
		hasieratuArray(motak, izenak, kodeak, prezioak, argazkiIzenak);
		frame = new JFrame();
		frame.getContentPane().setBackground(SystemColor.controlLtHighlight);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		

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
				AdminKontsola admin = new AdminKontsola();
				admin.Gakoa(sc, motak, izenak, kodeak, prezioak, argazkiIzenak, produktuKop);
			}
		});
	}
}