package _01_instrukcje;

public class NWD {

	public static void main(String[] args) {
		int a = 997;
		int b = 1010;
		
		while (a != b){
			if (a > b)
				a = a - b;
			else
				b = b - a;
		}
		System.out.println(a);
	}
}
