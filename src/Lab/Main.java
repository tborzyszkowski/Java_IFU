package Lab;

public class Main {
	public static void main(String[] args) {

		System.out.println("Homework #2");
		int n = 10;
		int sum = 0;
		boolean proste = true;
		String kvadrat = "";

		System.out.print("1) Suma = " + sum);
		for (int i = 1; i <= 10; i++) {
			sum += i;
			System.out.print(" + " + i);
			if ((n % 1) == 0) {
				proste = false;
			}
			if ((Math.sqrt(i) % 1) == 0) kvadrat = kvadrat + " " + i + ' ';
		}
		System.out.println();
		System.out.println("Suma = " + sum);

		System.out.print("2) " + n);
		if (proste) {
			System.out.println(" jest proste");
		} else {
			System.out.println(" nie jest proste");
		}

		System.out.println("3) Kvadraty: " + kvadrat);
	}
}