package Lab.Sklep;

import Lab.Pracownik;
import Lab.Sklep.Model.Klient;
import Lab.Sklep.Model.Magazyn;
import Lab.Sklep.Model.ProduktWMagazynie;
import Lab.Sklep.View.KlientView;
import Lab.Sklep.View.ProduktWMagazynieView;

import java.io.*;
import java.util.*;
import java.util.Scanner;

public class Main {

	private static int mainMenu() {
		Scanner scanner = new Scanner(System.in);
		int wybor = -1;
		do {
			System.out.println("1. Dodaj produkt do magazynu");
			System.out.println("2. Wypisz magazyn");
			System.out.println("3. Zapisz magazyn");
			System.out.println("4. Odczytaj magazyn");
			System.out.println("5. Dodaj klienta");
			System.out.println("6. Wypisz klientow");
			System.out.println("0. Wyjscie");
			System.out.println("\tWybierz opcje: ");
			wybor = scanner.nextInt();
		} while (wybor < 0 || wybor > 6);
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
					System.out.println("Zapisz magazyn:");
					try {
						PrintWriter wy = new PrintWriter(
								new FileWriter("magazyn.dat"));
						magazyn.zapiszDane(wy);
						wy.close();
						System.out.println("Zapisz magazyn: OK");
					} catch (IOException wyjatek) {
						System.out.println("Zapisz magazyn: " + wyjatek.getMessage());
					}
					break;
				case 4:
					System.out.println("Odczytaj magazyn:");
					try {
						BufferedReader we = new BufferedReader(
								new FileReader("magazyn.dat"));
						magazyn.czytajDane(we);
						we.close();
						System.out.println("Odczytaj magazyn: OK");
					} catch (IOException wyjatek) {
						System.out.println("Odczytaj magazyn: " + wyjatek.getMessage());
					}
					break;
				case 5:
					System.out.println("Dodaj klienta:");
					listaKlientow.add(
							KlientView.KlientUserInput(scanner)
					);
					break;
				case 6:
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
