package Lab.Sklep.View;

import Lab.Sklep.Model.Klient;

import java.util.List;
import java.util.Scanner;

public class KlientView {
	private static int nextID = 1;
	public static void KlientPrint(Klient klient) {
		System.out.println(klient);
	}
	private static int getNextID(){
		return nextID++;
	}

	public static Klient KlientUserInput(Scanner scanner) {
		System.out.print("Telefon: ");
		String telefon = scanner.nextLine();
		System.out.print("Email: ");
		String email = scanner.nextLine();
		System.out.print("Status: ");
		String status = scanner.nextLine();
		scanner.nextLine();

		return new Klient(
				getNextID(),
				telefon,
				email,
				status
			);
	}
	public static Klient findKlientById(int idKlienta, List<Klient> listaKlientow){
		return listaKlientow
				.stream()
				.filter(k -> k.getIdentyfikator() == idKlienta)
				.findFirst()
				.orElse(null);
	}
}
