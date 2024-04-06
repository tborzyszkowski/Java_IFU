package _02_typy;

// Demonstracja tablicy jednowymiarowej
class Array {
	public static void main(String[] args) {
		int[] month_days;
		month_days = new int[12];
		// nadajemy wartosci
		month_days[0] = 31;    // styczen
		month_days[1] = 28;    // luty
		month_days[2] = 31;    // marzec
		month_days[3] = 30;    // kwiecien
		month_days[4] = 31;    // maj
		month_days[5] = 30;    // czerwiec
		month_days[6] = 31;    // lipiec
		month_days[7] = 31;    // sierpien
		month_days[8] = 30;    // wrzesien
		month_days[9] = 31;    // pazdziernik
		month_days[10] = 30;    // listopad
		month_days[11] = 31;    // grudzien
		// korzystanie z tablicy
		System.out.println("Kwiecień ma " + month_days[3] + " dni");
	}
}
