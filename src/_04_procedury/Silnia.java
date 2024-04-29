package _04_procedury;

public class Silnia {

	static long silnia(long i){
		if (i == 0) return 1;
		else return silnia(i-1) * i;
	}

	public static void main(String[] args) {

		for(int i = 0; i < 24; i++){
			System.out.println("i = " + i + "\t Silnia = " + silnia(i));
		}
	}
}
