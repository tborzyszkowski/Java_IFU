package _02_typy;

import java.text.*;
import javax.swing.*;

public class PrzyrostOdsetek {
	public static void main(String[] args) {
		final int STOPAPOCZATKOWA = 10;
		final int LSTOP = 6;
		final int LLAT = 10;

		// ustaw stopy odsetek w przedziale 10 . . . 15%
		double[] stopaOdsetek = new double[LSTOP];
		for (int j = 0; j < stopaOdsetek.length; j++)
			stopaOdsetek[j] = (STOPAPOCZATKOWA + j) / 100.0;

		double[][] stan = new double[LLAT][LSTOP];

		// początkowy stan konta wynosi 10000
		for (int j = 0; j < stan[0].length; j++)
			stan[0][j] = 10000;

		// oblicz odsetki dla przyszłych lat

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

		// wydrukuj jeden rząd ze stopami odsetek

		NumberFormat formater = NumberFormat.getPercentInstance();

		for (int j = 0; j < stopaOdsetek.length; j++) {
			System.out.print("        \t");
			System.out.print(formater.format(stopaOdsetek[j]));
		}
		System.out.println();

		// wydrukuj tabelę stanów konta

		formater = NumberFormat.getCurrencyInstance();

		for (int i = 0; i < stan.length; i++) {
			// wydrukuj jeden rząd
			for (int j = 0; j < stan[i].length; j++) {
				System.out.print(" \t");
				System.out.print(formater.format(stan[i][j]));
			}
			System.out.println();
		}
	}
}
