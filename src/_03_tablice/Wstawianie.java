package _03_tablice;

public class Wstawianie {

	public static void main(String[] args) {
		int n = 10;
		int t[] = new int[n];
		int zakres = 100;
		int pom, j;
		
		// wypelniamy 
		for(int i = 0; i < n; i++){
			t[i] = (int)(Math.random()*	zakres);
		}
		//sortowanie
		for(int v = 0; v < n; v++) System.out.print(t[v]+ "\t");
		System.out.println();
		long time1 = System.currentTimeMillis(); // czas poczatkowy
		for(int i = 1; i < n; i++){
			if(i%1000 == 0) System.out.println(i);
			pom = t[i];
			j = i;
			while(j > 0){
				if (pom < t[j-1]){
					t[j] = t[j-1];
					j = j - 1;
				}
				else break;
			}
			t[j] = pom;
			for(int v = 0; v < n; v++) System.out.print(t[v]+ "\t");
			System.out.println();
		}
		long time2 = System.currentTimeMillis(); // czas poczatkowy
		System.out.println("Czas: "+(time2-time1) +" milisekund");

	}

}
