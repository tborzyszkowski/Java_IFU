package _03_tablice;

import java.util.Arrays;


public class GdzieB11 {

	public static void main(String[] args) {
		int n = 10000000;
		int t[] = new int[n];
		int zakres = 10000000;
		
		// wypelniamy 
		for(int i = 0; i < n; i++){
			t[i] = (int)(Math.random()*	zakres);
		}
		long sort_t1 = System.currentTimeMillis(); // czas poczatkowy
		// sortujemy
		Arrays.sort(t);
		long sort_t2 = System.currentTimeMillis(); // czas koncowy
		//szukamy
		long time1 = System.currentTimeMillis(); // czas poczatkowy
		int to = 51; // tego szukamy
		int i = 0; // od
		int j = n-1; // do
		int m = -1; // srodek
		
		boolean jest = false;
		while(i < j && !jest){
			m = (i+j)/2; // srodek
			if (t[m]  == to) jest = true;
			else if (t[m]  < to) i = m + 1;
			else j = m - 1;
		}
		long time2 = System.currentTimeMillis(); // czas koncowy
		// wynik
		if (jest)
			System.out.println("t["+m+"] = "+t[m] );
		else
			System.out.println("NIE MA");
		System.out.println("Czas szukania  : "+(time2-time1) +" milisekund");
		System.out.println("Czas sortowania: "+(sort_t2-sort_t1) +" milisekund");
	}

}
