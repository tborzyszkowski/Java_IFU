package Lab.Sklep.Model;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;


public class ZamowienieTest {
	@Test
	void test_sumy_zamowienia() {
		ProduktWMagazynie produktLaptop =
				new ProduktWMagazynie(1,
						"Laptop",
						"dobry",
						5,
						2000
						);
		ProduktWMagazynie produktTelefon =
				new ProduktWMagazynie(1,
						"Telefon",
						"czerwony",
						10,
						1000
				);
		ElementZamowienia elementZamowieniaLaptop =
				new ElementZamowienia(produktLaptop,
						1,
						1800);
		ElementZamowienia elementZamowieniaTelefon =
				new ElementZamowienia(produktTelefon,
						2,
						800);
		Klient klient = new Klient(1,
				"58 123456",
				"kazik@wp.pl",
				"nowy");
		Magazyn magazyn = new Magazyn(new ArrayList<>());
		magazyn.addProduct(produktLaptop).addProduct(produktTelefon);
		Zamowienie zamowienie =
				new Zamowienie(111,
						klient,
						magazyn,
						"ul. Dluga 1, Gdansk",
						new ArrayList<>(),
						"zaplacone");
		zamowienie
				.addElementZamowienia(elementZamowieniaLaptop)
				.addElementZamowienia(elementZamowieniaTelefon);

		double sumaZamowienia = zamowienie.getKwotaZamowienia();

		assertEquals(3400, sumaZamowienia, 0.001);
	}

	@Test
	void test_zakup_jezeli_jest_w_magazynie() {
		ProduktWMagazynie produktLaptop =
				new ProduktWMagazynie(1,
						"Laptop",
						"dobry",
						1,
						2000
				);
		ElementZamowienia elementZamowieniaLaptop =
				new ElementZamowienia(produktLaptop,
						2,
						1800);
		Klient klient = new Klient(1,
				"58 123456",
				"kazik@wp.pl",
				"nowy");
		Magazyn magazyn = new Magazyn(new ArrayList<>());
		magazyn.getProduktyWMagazynie().add(produktLaptop);
		Zamowienie zamowienie =
				new Zamowienie(111,
						klient,
						magazyn,
						"ul. Dluga 1, Gdansk",
						new ArrayList<>(),
						"zaplacone");
		zamowienie.addElementZamowienia(elementZamowieniaLaptop);

		boolean result = zamowienie.getElementyZamowienia().contains(elementZamowieniaLaptop);
		assertFalse(result);
	}

}
