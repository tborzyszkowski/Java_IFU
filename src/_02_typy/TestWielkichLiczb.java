package _02_typy;

import java.math.*;

public class TestWielkichLiczb {
	public static void main(String[] args) {
		int k = 60;
		int n = 490;
       /* 
          Oblicz dwumian Newtona
          n * (n - 1) * (n - 2) * . . . * (n - k + 1)
          -------------------------------------------
          1 * 2 * 3 * . . . * k
       */

		BigInteger szansaNaLoterii = BigInteger.valueOf(1);

		for (int i = 1; i <= k; i++)
			szansaNaLoterii = szansaNaLoterii
					.multiply(BigInteger.valueOf(n - i + 1))
					.divide(BigInteger.valueOf(i));

		System.out.println("Masz szansę 1 do " + szansaNaLoterii +
				". Powodzenia!");
	}
}
