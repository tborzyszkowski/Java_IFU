package Lab;

import java.io.*;
import java.util.*;

public class Pracownik {
	private String nazwisko;
	private double pensja;
	private Date dzienZatrudnienia;

	public Pracownik() {
	}

	public Pracownik(String n, double s,
	                 int rok, int miesiac, int dzien) {
		nazwisko = n;
		pensja = s;
		GregorianCalendar kalendarz
				= new GregorianCalendar(rok, miesiac - 1, dzien);
		// GregorianCalendar zaczyna liczenie miesiecy od 0
		dzienZatrudnienia = kalendarz.getTime();
	}

	public String pobierzNazw() {
		return nazwisko;
	}

	public double pobierzPensje() {
		return pensja;
	}

	public Date pobierzDzienZatrudnienia() {
		return dzienZatrudnienia;
	}

	public void podniesPensje(double oProcent) {
		double podwyzka = pensja * oProcent / 100;
		pensja += podwyzka;
	}

	public String toString() {
		return getClass().getName()
				+ "[nazwisko=" + nazwisko
				+ ",pensja=" + pensja
				+ ",dzienZatrudnienia=" + dzienZatrudnienia
				+ "]";
	}

	public void zapiszDane(PrintWriter wy) throws IOException {
		GregorianCalendar kalendarz = new GregorianCalendar();
		kalendarz.setTime(dzienZatrudnienia);
		wy.println(nazwisko + "|"
				+ pensja + "|"
				+ kalendarz.get(Calendar.YEAR) + "|"
				+ (kalendarz.get(Calendar.MONTH) + 1) + "|"
				+ kalendarz.get(Calendar.DAY_OF_MONTH));
	}

	public void czytajDane(BufferedReader we) throws IOException {
		String s = we.readLine();
		StringTokenizer t = new StringTokenizer(s, "|");
		nazwisko = t.nextToken();
		pensja = Double.parseDouble(t.nextToken());
		int y = Integer.parseInt(t.nextToken());
		int m = Integer.parseInt(t.nextToken());
		int d = Integer.parseInt(t.nextToken());
		GregorianCalendar kalendarz
				= new GregorianCalendar(y, m - 1, d);
		dzienZatrudnienia = kalendarz.getTime();
	}
}