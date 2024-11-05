package erronka;

import java.util.Scanner;

public class AdminKontsola {

	public void Gakoa(Scanner sc, String[] motak, String[] izenak, String[] kodeak, Double[] prezioak,
			String[] argazkiIzenak, int produktuKop) {

		String erabiltzailea = "";
		String pasahitza = "";
		boolean balidatuta = false;
		System.out.println("Ongi etorri admin menura");

			System.out.println("Erabiltzailea: ");
			erabiltzailea = sc.nextLine();
			System.out.println("Pasahitza: ");
			pasahitza = sc.nextLine();
			balidatuta = Balidazioak.balidatuGakoa(erabiltzailea, pasahitza);
			if (balidatuta == false) {
				OngiEtorri ongiEtorri = new OngiEtorri();
				ongiEtorri.show(); // Muestra la ventana gráfica
				return; // Evita que el flujo continúe ejecutándose
			}
			
		MenuAdmin.menu1(sc, motak, izenak, kodeak, prezioak, argazkiIzenak, produktuKop);

	}

}