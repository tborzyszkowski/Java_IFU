package _01_instrukcje;

public class Silnia {

	public static void main(String[] args) {
		int n = 24;
		int i = 0;
		long s = 1;
		
		while (i < n){
			i += 1;
			s *= i;
		}
		System.out.println("Silnia = " + s);
		
		s = 1;
		for(i = 1;i <= n; i++)
			s*=i;

		System.out.println("Silnia = " + s);
	}
}
