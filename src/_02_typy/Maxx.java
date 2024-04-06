package _02_typy;

public class Maxx {

	public static void main(String[] args) {
		float max = Float.MAX_VALUE;

		float odcinek = 1;
		long licznik = 0;

		while (max - odcinek == max) {
			odcinek *= 2;
			licznik++;
		}
		System.out.println("max - 1 = " + (max - odcinek));
		System.out.println("Licznik = " + licznik);
	}
}
