package _02_typy;

import java.text.*;
import java.util.Arrays;

public class PrzyrostOdsetek {
	public static void main(String[] args) {
		final int STOPA_POCZATKOWA = 10;
		final int LICZBA_STOP = 6;
		final int LICZBA_LAT = 10;

		double[] stopaOdsetek = new double[LICZBA_STOP];
		for (int j = 0; j < stopaOdsetek.length; j++)
			stopaOdsetek[j] = (STOPA_POCZATKOWA + j) / 100.0;

		double[][] stan = new double[LICZBA_LAT][LICZBA_STOP];

		Arrays.fill(stan[0], 10000);

		for (int i = 1; i < stan.length; i++) {
			for (int j = 0; j < stan[i].length; j++) {
				// stan z ostatniego roku pobierz z poprzedniego rzędu
				double dawnyStan = stan[i - 1][j];

				// oblicz odsetki
				double odsetki = dawnyStan * stopaOdsetek[j];

				// oblicz tegoroczny stan konta
				stan[i][j] = dawnyStan + odsetki;
			}
		}

		NumberFormat formater = NumberFormat.getPercentInstance();

		for (int j = 0; j < stopaOdsetek.length; j++) {
			System.out.print("        \t");
			System.out.print(formater.format(stopaOdsetek[j]));
		}
		System.out.println();

		// wydrukuj tabelę stanów konta

		formater = NumberFormat.getCurrencyInstance();

		for (int i = 0; i < stan.length; i++) {
			for (int j = 0; j < stan[i].length; j++) {
				System.out.print(" \t");
				System.out.print(formater.format(stan[i][j]));
			}
			System.out.println();
		}
	}
}
