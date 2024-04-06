package _01_instrukcje;

public class Fib {
	public static void main(String[] args) {
		int n = 201;
		
		if (n ==0 || n==1)
			System.out.println(n);
		else {
			long f0 = 0;
			long f1 = 1;
			long qq;

			int i = 1;
			while (i < n) {
				System.out.println(i + "   " + f1);
				qq = f1;
				f1 = f1 + f0;
				f0 = qq;
				i++;
			}
			System.out.println(f1);
		}
	}
}
