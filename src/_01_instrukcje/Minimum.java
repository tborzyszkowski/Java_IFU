package _01_instrukcje;

public class Minimum {

	public static void main(String[] args) {
		int a = 10;
		int b = 2;
		int c = 3;
		int d = 4;
		
		if (a < b){
			if (a < c)
				if (a < d)
					System.out.println("a = " + a);
				else
					System.out.println("d = " + d);
			else
				if (c < d)
					System.out.println("c = " + c);
				else
					System.out.println("d = " + d);
			
		} else {
			if (b < c)
				if (b < d)
					System.out.println("b = " + b);
				else
					System.out.println("d = " + d);
			else
				if (c < d)
					System.out.println("c = " + c);
				else
					System.out.println("d = " + d);
		}
	}

}
