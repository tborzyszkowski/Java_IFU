package Lab.Sklep.View;

import Lab.Sklep.Model.ProduktWMagazynie;

import java.util.Scanner;

public class ProduktWMagazynieView {
	private static int nextID = 1;
	public static void ProduktWMagazyniePrint(ProduktWMagazynie produktWMagazynie) {
		System.out.println(produktWMagazynie);
	}

	private static int getNextID(){
		return nextID++;
	}
	public static ProduktWMagazynie ProduktWMagazynieUserInput(Scanner scanner) {
		System.out.print("Nazwa: ");
		String nazwa = scanner.nextLine();
		System.out.print("Opis: ");
		String opis = scanner.nextLine();
		System.out.print("Liczba sztuk: ");
		int sztuk = scanner.nextInt();
		System.out.print("Cena: ");
		double cena = scanner.nextDouble();
		scanner.nextLine();

		return new ProduktWMagazynie(
				getNextID(),
				nazwa,
				opis,
				sztuk,
				cena
			);
	}
}
