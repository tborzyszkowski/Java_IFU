package _02_typy;

import java.util.*;

public class WyborLosowy {
	public static void main(String[] args) {
		int k = 5;
		int n = 20;

		int[] liczby = new int[n];
		for (int i = 0; i < liczby.length; i++)
			liczby[i] = i + 1;

		int[] wynik = new int[k];
		for (int i = 0; i < wynik.length; i++) {
			int index = (int) (Math.random() * n);
			wynik[i] = liczby[index];
			liczby[index] = liczby[n - 1];
			n--;
		}

		Arrays.sort(wynik);
		System.out.println("Postaw na następującą kombinację, a będziesz bogaty!");
		for (int j : wynik) System.out.println(j);
	}
}
