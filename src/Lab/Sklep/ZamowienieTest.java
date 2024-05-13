package Lab.Sklep;

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
		Zamowienie zamowienie =
				new Zamowienie(111,
						klient,
						"ul. Dluga 1, Gdansk",
						new ArrayList<>(),
						"zaplacone");
		zamowienie
				.addElementZamowienia(elementZamowieniaLaptop)
				.addElementZamowienia(elementZamowieniaTelefon);

		double sumaZamowienia = zamowienie.getKwotaZamowienia();

		assertEquals(3400, sumaZamowienia, 0.001);
	}
}
