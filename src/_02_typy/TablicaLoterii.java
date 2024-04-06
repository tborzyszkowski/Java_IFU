package _02_typy;

public class TablicaLoterii {
	public static void main(String[] args) {
		final int NMAX = 49;

		int[][] szanse = new int[NMAX + 1][];
		for (int n = 0; n <= NMAX; n++)
			szanse[n] = new int[n + 1];

		for (int n = 0; n < szanse.length; n++)
			for (int k = 0; k < szanse[n].length; k++) {
             /*
                oblicz dwumian Newtona
                n * (n - 1) * (n - 2) * . . . * (n - k + 1)
                -------------------------------------------
                1 * 2 * 3 * . . . * k
             */
				int szanseNaLoterii = 1;
				for (int i = 1; i <= k; i++)
					szanseNaLoterii = szanseNaLoterii * (n - i + 1) / i;

				szanse[n][k] = szanseNaLoterii;
			}

		for (int n = 0; n < szanse.length; n++) {
			for (int k = 0; k < szanse[n].length; k++) {
				String wyjscie = "    " + szanse[n][k];
				//wyjscie = wyjscie.substring(wyjscie.length() - 4);
				System.out.print(wyjscie);
			}
			System.out.println();
		}
	}
}
 
