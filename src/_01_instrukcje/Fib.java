package _01_instrukcje;

public class Fib {
	public static void main(String[] args) {
		int n = 20;
		
		if (n ==0 || n==1)
			System.out.println(n);
		else {
			long f0 = 0;
			long f1 = 1;
			long wynik;

			int i = 1;
			while (i < n) {
				System.out.println(i + "   " + f1);
				wynik = f1;
				f1 = f1 + f0;
				f0 = wynik;
				i++;
			}
			System.out.println(f1);
			System.out.println(Long.MAX_VALUE);
		}
	}
}
