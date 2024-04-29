package Lab;

public class Exersize{
	public static void main(String[] args) {
		int n=9;

		//zadanie a
//		int sum,j;
//		sum=0;
//		j = 1;
//		while(j <= n){
//			sum += j;
//			j++;
//		}
//		System.out.println(sum);



//		zadanie b
		int reszta;
		boolean pierwsza = true;

		for (int i = 2; i <= n / 2; i++) {
			reszta = n % i;
			System.out.println(n + " Podzielone przez " + i + " daje reszte " + reszta);
			if (reszta == 0) {
				pierwsza = false;
				break;
			}
		}

		if (pierwsza)
			System.out.println(n + " jest pierwsza");
		else
			System.out.println(n + " nie jest pierwsza");
	}

}
