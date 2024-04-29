package Lab;

public class SvorynIrina {
	public static void main(String[] args) {
		String[] imiona = {"Iryna", "Maksim", "Ala", "Oksana", "Aneta", "Hermenegilda"};
		int max = 0;
		for(int i = 1; i<imiona.length; i++) {
			if (imiona[i].length() > imiona[max].length())
				max=i;

			System.out.println("Max: " + imiona[max] + "   Current: " + imiona[i]);
		}
		System.out.println("Max imie: " + imiona[max]);

//		System.out.println("imiona w tablicy");
//		for (String imie: imiona) {
//			System.out.println(imie);}
	}
}
