package _02_typy;

// Obliczamy odleglosc jaka przebedzie swiatlo w zadanym czasie
// uzywajac zmiennych typu long
class Light {
	public static void main(String[] args) {
		int lightSpeed = 299792; // km/s
		long days = 1000;        // badana liczba dni
		long seconds = days * 24 * 60 * 60;   // tyle to sekund
		long distance = lightSpeed * seconds; // tyle przebedzie swiatlo

		// teraz odpowiedz
		System.out.print("W ciagu " + days);
		System.out.print(" dni swiatlo przebedzie okolo ");
		System.out.println(distance + " kilometrow");

		seconds = Long.MAX_VALUE / lightSpeed;
		days = seconds / (24 * 60 * 60);

		System.out.println("Sec = " + seconds + " Dni = " + days + " Lat = " + days / 365);

	}
}
