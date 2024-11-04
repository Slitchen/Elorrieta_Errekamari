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
	public static String[] motak;
	public static String[] izenak;
	public static String[] kodeak;
	public static Double[] prezioak;
	public static String[] argazkiIzenak;
	public static int produktuKop = 15;
	Scanner sc = new Scanner(System.in);

	public static void hasieratuArray() {
		
		motak = new String[30];
		izenak = new String[30];
		kodeak = new String[30];
		prezioak = new Double[30];
		argazkiIzenak = new String[30];

		motak[0] = "janaria";
		izenak[0] = "chocoboomWhite";
		kodeak[0] = "A001";
		prezioak[0] = 0.80;
		argazkiIzenak[0] = "chocoBoombl";

		motak[1] = "janaria";
		izenak[1] = "chocoboomBlack";
		kodeak[1] = "A002";
		prezioak[1] = 0.80;
		argazkiIzenak[1] = "chocoBoomng";

		motak[2] = "janaria";
		izenak[2] = "oreo";
		kodeak[2] = "A003";
		prezioak[2] = 1.0;
		argazkiIzenak[2] = "oreo";

		motak[3] = "janaria";
		izenak[3] = "ruflesjamon";
		kodeak[3] = "A004";
		prezioak[3] = 0.50;
		argazkiIzenak[3] = "ruflesjamon";

		motak[4] = "janaria";
		izenak[4] = "ruflesjoriginal";
		kodeak[4] = "A005";
		prezioak[4] = 0.50;
		argazkiIzenak[4] = "ruflesoriginal";

		motak[5] = "janaria";
		izenak[5] = "ruflesyork";
		kodeak[5] = "A006";
		prezioak[5] = 0.50;
		argazkiIzenak[5] = "ruflesyork";
		// edariak
		motak[6] = "edaria";
		izenak[6] = "torolocoopalo";
		kodeak[6] = "A007";
		prezioak[6] = 1.0;
		argazkiIzenak[6] = "torolocoopalo";

		motak[7] = "edaria";
		izenak[7] = "torolocooriginal";
		kodeak[7] = "A008";
		prezioak[7] = 1.0;
		argazkiIzenak[7] = "torolocooriginal";

		motak[8] = "edaria";
		izenak[8] = "torolocomango";
		kodeak[8] = "A009";
		prezioak[8] = 1.0;
		argazkiIzenak[8] = "torolocomango";

		motak[9] = "edaria";
		izenak[9] = "monsterzuria";
		kodeak[9] = "A010";
		prezioak[9] = 1.0;
		argazkiIzenak[9] = "monsterzuria";
		// erretzaile

		motak[10] = "erretzaile";
		izenak[10] = "malboro";
		kodeak[10] = "A011";
		prezioak[10] = 4.0;
		argazkiIzenak[10] = "fumarmata";

		motak[11] = "erretzaile";
		izenak[11] = "luckystrike";
		kodeak[11] = "A012";
		prezioak[11] = 3.0;
		argazkiIzenak[11] = "luckystrike";

		motak[12] = "erretzaile";
		izenak[12] = "camel";
		kodeak[12] = "A013";
		prezioak[12] = 6.0;
		argazkiIzenak[12] = "camel";
		// sexshop
		motak[13] = "sexshop";
		izenak[13] = "durexnormal";
		kodeak[13] = "A014";
		prezioak[13] = 12.0;
		argazkiIzenak[13] = "condonesdurex1";

		motak[14] = "sexshop";
		izenak[14] = "durexextrasensitive";
		kodeak[14] = "A015";
		prezioak[14] = 15.0;
		argazkiIzenak[14] = "extrasensitive";
	}

	JFrame frame;

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

	public void show() {
		OngiEtorria();
		frame.setVisible(true);// hace que el JFrame de esta pagina sea visible
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
				ProduktuMenua produktuMenua = new ProduktuMenua();
				produktuMenua.show();
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
