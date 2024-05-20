package Lab.Sklep.Model;

import java.util.List;

public class Magazyn {
	private List<ProduktWMagazynie> produktyWMagazynie;

	public Magazyn(List<ProduktWMagazynie> produktyWMagazynie) {
		this.produktyWMagazynie = produktyWMagazynie;
	}

	public List<ProduktWMagazynie> getProduktyWMagazynie() {
		return produktyWMagazynie;
	}

	public void setProduktyWMagazynie(List<ProduktWMagazynie> produktyWMagazynie) {
		this.produktyWMagazynie = produktyWMagazynie;
	}

	public ProduktWMagazynie findProduktWMagazynie(int id) {
		for (ProduktWMagazynie p : produktyWMagazynie) {
			if (p.getIdentyfikator() == id)
				return p;
		}
		return null;
	}
	public Magazyn addProduct(ProduktWMagazynie p) {
		this.produktyWMagazynie.add(p);
		return this;
	}

	@Override
	public String toString() {
		final StringBuffer sb = new StringBuffer("Magazyn:");
		for(var produkt : produktyWMagazynie){
			sb.append('\n').append(produkt);
		}
		sb.append('\n');
		return sb.toString();
	}
}
