package Lab.Sklep.Model;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class ProduktWMagazynie {
	private int identyfikator;
	private String nazwa;
	private String opis;
	private int sztuki;
	private double cena;

	public ProduktWMagazynie(int identyfikator, String nazwa, String opis, int sztuki, double cena) {
		this.identyfikator = identyfikator;
		this.nazwa = nazwa;
		this.opis = opis;
		this.sztuki = sztuki;
		this.cena = cena;
	}

	public int getIdentyfikator() {
		return identyfikator;
	}

	public void setIdentyfikator(int identyfikator) {
		this.identyfikator = identyfikator;
	}

	public String getNazwa() {
		return nazwa;
	}

	public void setNazwa(String nazwa) {
		this.nazwa = nazwa;
	}

	public String getOpis() {
		return opis;
	}

	public void setOpis(String opis) {
		this.opis = opis;
	}

	public int getSztuki() {
		return sztuki;
	}

	public void setSztuki(int sztuki) {
		if (sztuki >= 0 )
			this.sztuki = sztuki;
		else
			this.sztuki = 0;
	}

	public double getCena() {
		return cena;
	}

	public void setCena(double cena) {
		if (cena > 0 )
			this.cena = cena;
		else
			this.cena = 0.0;
	}

	@Override
	public String toString() {
		final StringBuffer sb = new StringBuffer("ProduktWMagazynie{");
		sb.append("id=").append(identyfikator);
		sb.append(", nazwa='").append(nazwa).append('\'');
		sb.append(", opis='").append(opis).append('\'');
		sb.append(", sztuki=").append(sztuki);
		sb.append(", cena=").append(cena);
		sb.append('}');
		return sb.toString();
	}

	public void zapiszDane(PrintWriter wy) throws IOException {
		wy.println(identyfikator + "|"
						+ nazwa + "|"
						+ opis + "|"
						+ sztuki + "|"
						+ cena
				);
	}

	public static ProduktWMagazynie czytajDane(String s) throws IOException {
		StringTokenizer t = new StringTokenizer(s, "|");
		int id = Integer.parseInt(t.nextToken());
		String nazwaProduktu = t.nextToken();
		String opisProduktu = t.nextToken();
		int liczbaSztuk = Integer.parseInt(t.nextToken());
		double cenaProduktu = Double.parseDouble(t.nextToken());
		return new ProduktWMagazynie(id, nazwaProduktu, opisProduktu, liczbaSztuk, cenaProduktu);
	}

}
