package _01_instrukcje;


public class Euklides {
	public static void main(String[] args) {
		int a = 6;
		int b = 9;

		while (a != b){
			if (a > b)
				a = a - b;
			else
				b = b - a;
		}

		System.out.println("a = " + a);
		System.out.println("b = " + b);
	}
}
