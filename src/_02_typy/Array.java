package _02_typy;

// Demonstracja tablicy jednowymiarowej
class Array {
	public static void main(String[] args) {
		int[] monthDays;
		monthDays = new int[13];
		// nadajemy wartosci
		monthDays[0] = 31;    // styczen
		monthDays[1] = 28;    // luty
		monthDays[2] = 31;    // marzec
		monthDays[3] = 30;    // kwiecien
		monthDays[4] = 31;    // maj
		monthDays[5] = 30;    // czerwiec
		monthDays[6] = 31;    // lipiec
		monthDays[7] = 31;    // sierpien
		monthDays[8] = 30;    // wrzesien
		monthDays[9] = 31;    // pazdziernik
		monthDays[10] = 30;    // listopad
		monthDays[11] = 31;    // grudzien
		monthDays[12] = 3000; // premia
		// korzystanie z tablicy
		System.out.println("Kwiecień ma " + monthDays[12] + " dni");
	}
}
