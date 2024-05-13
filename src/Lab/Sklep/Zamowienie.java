package Lab.Sklep;

import java.util.List;

public class Zamowienie {
	private int identyfikator;
	private Klient klient;
	private Magazyn magazyn;
	private String adresDostawy;
	private List<ElementZamowienia> elementyZamowienia;
	private String stan;

	public Zamowienie(int identyfikator, Klient klient, Magazyn magazyn, String adresDostawy, List<ElementZamowienia> elementyZamowienia, String stan) {
		this.identyfikator = identyfikator;
		this.klient = klient;
		this.magazyn = magazyn;
		this.adresDostawy = adresDostawy;
		this.elementyZamowienia = elementyZamowienia;
		this.stan = stan;
	}

	public int getIdentyfikator() {
		return identyfikator;
	}

	public void setIdentyfikator(int identyfikator) {
		this.identyfikator = identyfikator;
	}

	public Magazyn getMagazyn() {
		return magazyn;
	}

	public void setMagazyn(Magazyn magazyn) {
		this.magazyn = magazyn;
	}

	public Klient getKlient() {
		return klient;
	}

	public void setKlient(Klient klient) {
		this.klient = klient;
	}

	public String getAdresDostawy() {
		return adresDostawy;
	}

	public void setAdresDostawy(String adresDostawy) {
		this.adresDostawy = adresDostawy;
	}

	public List<ElementZamowienia> getElementyZamowienia() {
		return elementyZamowienia;
	}

	public void setElementyZamowienia(List<ElementZamowienia> elementyZamowienia) {
		this.elementyZamowienia = elementyZamowienia;
	}

	public String getStan() {
		return stan;
	}

	public void setStan(String stan) {
		this.stan = stan;
	}

	public double getKwotaZamowienia(){
		double sumaZamowienia = 0.0;
		for (ElementZamowienia e : elementyZamowienia) {
			sumaZamowienia += e.getSztuki() * e.getCena();
		}
		return sumaZamowienia;
	}
	public Zamowienie addElementZamowienia(ElementZamowienia elementZamowienia){
		ProduktWMagazynie produkt = magazyn.findProduktWMagazynie(elementZamowienia.getProdukt().getIdentyfikator());
		if (produkt != null) {
			if (elementZamowienia.getSztuki() <= produkt.getSztuki()) {
				produkt.setSztuki(produkt.getSztuki() - elementZamowienia.getSztuki());
				this.elementyZamowienia.add(elementZamowienia);
			}
		}
		return this;
	}
}
