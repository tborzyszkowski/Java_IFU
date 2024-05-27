package Lab;

import java.io.*;

public class TestPlikuDanych {
	public static void main(String[] args) {
		Pracownik[] obsluga = new Pracownik[3];

		obsluga[0] = new Pracownik("Karol Kraker", 75000,
				1987, 12, 15);
		obsluga[1] = new Pracownik("Henryk Haker", 50000,
				1989, 10, 1);
		obsluga[2] = new Pracownik("Tomasz Tester", 40000,
				1990, 3, 15);

		try {
			PrintWriter wy = new PrintWriter(new
					FileWriter("pracownik.dat"));
			zapiszDane(obsluga, wy);
			wy.close();

			BufferedReader we = new BufferedReader(new
					FileReader("pracownik.dat"));
			Pracownik[] nowaObsluga = czytajDane(we);
			we.close();

			for (int i = 0; i < nowaObsluga.length; i++)
				System.out.println(nowaObsluga[i]);
		} catch (IOException wyjatek) {
			wyjatek.printStackTrace();
		}
	}

	static void zapiszDane(Pracownik[] p, PrintWriter wy)
			throws IOException {
		wy.println(p.length);

		for (int i = 0; i < p.length; i++)
			p[i].zapiszDane(wy);
	}

	static Pracownik[] czytajDane(BufferedReader we)
			throws IOException {
		int n = Integer.parseInt(we.readLine());

		Pracownik[] p = new Pracownik[n];
		for (int i = 0; i < n; i++) {
			p[i] = new Pracownik();
			p[i].czytajDane(we);
		}
		return p;
	}
}

