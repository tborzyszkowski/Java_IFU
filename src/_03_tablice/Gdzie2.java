package _03_tablice;

public class Gdzie2 {

	public static void main(String[] args) {
		int n = 10000000;
		int t[] = new int[n];
		int zakres = 10000000;
		
		// wypelniamy 
		for(int i = 0; i < n; i++){
			t[i] = (int)(Math.random()*	zakres);
		}
		//szukamy wszystkich
		long time1 = System.currentTimeMillis(); // czas poczatkowy
		int to = 13; // tego szukamy
		int i = -1;
		boolean w[] = new boolean[n]; // tu wynik poszukiwan
		int jest = 0; // zliczamy wystapienia
		
		while(i < n-1){
			if (t[++i] == to){
				jest++;
				w[i] = true;
			}
			else w[i] = false;
		}
		long time2 = System.currentTimeMillis(); // czas koncowy
		// wynik
		long time3 = System.currentTimeMillis(); // czas koncowy
		if (jest > 0){
			System.out.println("JEST = " + jest);
			for(int j = 0; j < n; j++){ 
				if(w[j]) System.out.println("t["+j+"] = "+t[j] );
			}
		}
		else
			System.out.println("NIE MA");

		long time4 = System.currentTimeMillis(); // czas koncowy
		System.out.println("Czas1: "+(time2-time1) +" milisekund");
		System.out.println("Czas2: "+(time4-time3) +" milisekund");
	}

}
