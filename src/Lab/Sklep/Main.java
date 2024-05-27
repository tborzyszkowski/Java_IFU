package Lab.Sklep;

import Lab.Sklep.Model.Klient;
import Lab.Sklep.Model.Magazyn;
import Lab.Sklep.Model.ProduktWMagazynie;
import Lab.Sklep.View.KlientView;
import Lab.Sklep.View.ProduktWMagazynieView;

import java.util.*;
import java.util.Scanner;

public class Main {

	private static int mainMenu() {
		Scanner scanner = new Scanner(System.in);
		int wybor = -1;
		do {
			System.out.println("1. Dodaj produkt do magazynu");
			System.out.println("2. Wypisz magazyn");
			System.out.println("3. Dodaj klienta");
			System.out.println("4. Wypisz klientow");
			System.out.println("0. Wyjscie");
			System.out.println("\tWybierz opcje: ");
			wybor = scanner.nextInt();
		} while (wybor < 0 || wybor > 4);
		return wybor;
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		Magazyn magazyn = new Magazyn(new ArrayList<>());
		List<Klient> listaKlientow = new ArrayList<>();

		int wybor = 0;
		boolean czyWyjscie = false;

		while (!czyWyjscie) {
			wybor = mainMenu();
			switch (wybor) {
				case 1:
					System.out.println("Podaj produkt do magazynu:");
					magazyn.addProduct(
							ProduktWMagazynieView.ProduktWMagazynieUserInput(scanner)
					);
					break;
				case 2:
					System.out.println("Wypisz magazyn:");
					System.out.println(magazyn);
					break;
				case 3:
					System.out.println("Dodaj klienta:");
					listaKlientow.add(
							KlientView.KlientUserInput(scanner)
					);
					break;
				case 4:
					System.out.println("Wypisz klientow:");
					for (Klient klient : listaKlientow) {
						System.out.println(klient);
					}
					break;
				case 0:
					System.out.println("Wyjscie");
					czyWyjscie = true;
					break;
				default:
					System.out.println("Nieznana opcja");
			}
		}

	}
}
