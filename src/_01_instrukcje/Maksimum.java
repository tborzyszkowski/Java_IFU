package _01_instrukcje;

public class Maksimum {
	public static void main(String[] args) {
		int a = 1, b = 1, c = 1;
		int w = 0;

		if (a > b) {
			w = a;
		} else {
			w = b;
		}
		if (w <= c) {
			w = c;
		}

		System.out.println(w);
	}
}
