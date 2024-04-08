package _01_instrukcje;

public class Trojmian {
	public static void main(String[] args) {
		int a = 1;
		int b = 4;
		int c = 3;
		int d = b * b - 4 * a * c;
		
		if (d < 0){
//			System.out.println("x1 = " + (-1) * b/(2*a)+ " - i " + Math.sqrt((-1)*d)/ (2 * a));
//			System.out.println("x2 = " + (-1) * b/(2*a)+ " + i " + Math.sqrt((-1)*d)/ (2 * a));
			System.out.println("Brak rozwiązań");
		}else
			if (d == 0)
				System.out.println("x = " + (-1) * b / (2 * a));
			else{
				System.out.println("x1 = " + (((-1) * b - Math.sqrt(d))/ (2 * a)));
				System.out.println("x2 = " + (((-1) * b + Math.sqrt(d))/ (2 * a)));
			}
	}
}
