package Lab.Sklep;

public class ElementZamowienia {
	private ProduktWMagazynie produkt;
	private int sztuki;
	private double cena;

	public ElementZamowienia(ProduktWMagazynie produkt, int sztuki, double cena) {
		this.produkt = produkt;
		this.sztuki = sztuki;
		this.cena = cena;
	}

	public ProduktWMagazynie getProdukt() {
		return produkt;
	}

	public void setProdukt(ProduktWMagazynie produkt) {
		this.produkt = produkt;
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
}
