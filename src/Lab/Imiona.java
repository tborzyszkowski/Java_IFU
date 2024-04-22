package Lab;


public class Imiona {
	public static void main(String[] args) {
		int N = 10;
		String[] imiona = new String[N];

		for(int i = 0; i < N; i++)
			imiona[i] = i + "Ala" + (i+1);

		int maks = 0;
		for(int i = 1; i < N; i++)
			if (imiona[i].length() > imiona[maks].length()){
				maks = i;
			}
		System.out.println(imiona[maks]);
	}
}
