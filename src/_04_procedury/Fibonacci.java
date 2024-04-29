package _04_procedury;

public class Fibonacci {
	static long fib1(long n) {
		if ((n == 0) || (n == 1)) return n;
		else return fib1(n - 1) + fib1(n - 2);
	}

	static long fib2(long n) {
		int i, w = 0, f0 = 0, f1 = 1;

		for (i = 2; i < n + 1; i++) {
			w = f0 + f1;
			f0 = f1;
			f1 = w;
		}
		return w;
	}

	public static void main(String args[]) {
		int n;

		for (n = 1; n < 45; n++) {
			System.out.print("Fib2(" + n + ") = " + fib2(n) + "\t");
			long time1 = System.currentTimeMillis();
			System.out.print("Fib(" + n + ") = " + fib1(n));
			long time2 = System.currentTimeMillis();
			System.out.println("\t Milis = " + (time2 - time1));
		}
	}
}
