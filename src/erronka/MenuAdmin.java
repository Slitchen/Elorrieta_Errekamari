package erronka;

import java.util.Scanner;

public class MenuAdmin {
	// Produktuen datuak gordetzeko arrayak

	public static void menu1(Scanner sc, String[] motak, String[] izenak, String[] kodeak, Double[] prezioak, String[] argazkiIzenak, int produktuKop) {
		int aukera = 0;
		String saukera = "";
		boolean error = true;
		boolean gora = true;
		
		do {
			do {
				System.out.println("***********************************");
				System.out.println("Menu nagusi");
				System.out.println("***********************************");
				System.out.println("1. Gehitu produktuak: ");
				System.out.println("2. Ezabatu produktuak: ");
				System.out.println("3. Modifikatu produktuak: ");
				System.out.println("4.Atera: ");
				System.out.println("");
				saukera = sc.nextLine();
				Balidazioak.balidazio1(aukera, saukera);
				error = Balidazioak.balidazio1(aukera, saukera);
			} while (error);
			aukera = Integer.parseInt(saukera);
			switch (aukera) {
			
			case 1: //produktuak gehitzeko menua, datuak eskatuko ditu , eta behin balidatutak gordeko ditu arrayan, arrayaren azken atalean
				Metodoak.case1(sc, motak, izenak, kodeak, prezioak, argazkiIzenak, produktuKop);
				break;
			case 2:
				Metodoak.case2(sc, motak, izenak, kodeak, prezioak, argazkiIzenak, produktuKop);
				break;
			case 3:
				Metodoak.case3(sc, motak, izenak, kodeak, prezioak, argazkiIzenak, produktuKop);
				break;
			case 4:
				Metodoak.case4();
			default:
			}
		} while (gora);// beti buklean egoteko
	}


}