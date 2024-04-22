package _03_tablice;

public class Gdzie1 {

	public static void main(String[] args) {
		int n = 10000000;
		int t[] = new int[n];
		int zakres = 10000000;
		
		// wypelniamy 
		for(int i = 0; i < n; i++){
			t[i] = (int)(Math.random()*	zakres);
		}
		//szukamy
		long time1 = System.currentTimeMillis(); // czas poczatkowy
		int to = 1111; // tego szukamy
		int i = -1;
		boolean jest = false;
		while(i < n-1 &&  !jest){
			if (t[++i] == to) jest = true;
		}
		long time2 = System.currentTimeMillis(); // czas koncowy
		// wynik
		if (jest)
			System.out.println("t["+i+"] = "+t[i] );
		else
			System.out.println("NIE MA");
		System.out.println("Czas: "+(time2-time1) +" milisekund");
	}

}
