package _02_typy;

class MacierzInt {
	long[][] tab;
	int n;

	MacierzInt(int n) {
		tab = new long[n][n];
		this.n = n;
		//losuj(0, 10);
	}

	void losuj(int a, int b) {
		for (int i = 0; i < n; i++)
			for (int j = 0; j < n; j++) {
				tab[i][j] = (int) (Math.random() * (b - a) + a);
			}
	}

	void mnoz(int a) {
		for (int i = 0; i < n; i++)
			for (int j = 0; j < n; j++) {
				tab[i][j] = a * tab[i][j];
			}
	}

	void wyswietl() {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++)
				System.out.print(tab[i][j] + "\t");
			System.out.println();
		}
	}

	MacierzInt mult(MacierzInt m) {
		MacierzInt w = new MacierzInt(n);
		for (int i = 0; i < n; i++)
			for (int j = 0; j < n; j++)
				for (int k = 0; k < n; k++)
					w.tab[i][j] += tab[i][k] * m.tab[k][j];
		return w;
	}


}

class MacierzTest {
	public static void main(String[] a) {
		MacierzInt mm = new MacierzInt(1000);
		MacierzInt nn = new MacierzInt(1000);

		mm.losuj(0, 10);
		mm.wyswietl();
		System.out.println();
		nn.losuj(0, 10);
		nn.wyswietl();
		System.out.println();

		(mm.mult(nn)).wyswietl();
		//mm.wyswietl();

	}
}