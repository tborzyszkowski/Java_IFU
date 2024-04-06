package _02_typy;

import java.util.*;

public class WyborLosowy {
	public static void main(String[] args) {
		// Ile liczb musisz wybrać?
		int k = 5;
		// Ile jest liczb do wyboru?
		int n = 20;

		// wypełnij tablicę liczbami 1 2 3 . . . n
		int[] liczby = new int[n];
		for (int i = 0; i < liczby.length; i++)
			liczby[i] = i + 1;

		// wybierz k liczb i wstaw je do drugiej tablicy
		int[] wynik = new int[k];
		for (int i = 0; i < wynik.length; i++) {
			// wylosuj indeks z przedziału 0 i n - 1
			int l = (int) (Math.random() * n);
			// wybierz element z wylosowanym indeksem
			wynik[i] = liczby[l];
			// przesuń ostatni element pod wylosowany indeks
			liczby[l] = liczby[n - 1];
			n--;
		}

		Arrays.sort(wynik);
		System.out.println("Postaw na następującą kombinację, a będziesz bogaty!");
		for (int i = 0; i < wynik.length; i++)
			System.out.println(wynik[i]);
	}
}
