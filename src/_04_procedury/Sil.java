package _04_procedury;

public class Sil {

	static long sil(long i){
		if (i == 0) return 1;
		else return sil(i-1)*i;
	}
	public static void main(String[] args) {

		for(int i = 0; i < 24; i++){
			System.out.println("i = " + i + "\t Sil = " + sil(i));
		}
	}
}
