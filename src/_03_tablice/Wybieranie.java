package _03_tablice;

public class Wybieranie {

	public static void main(String[] args) {
		int n = 10;
		int[] t = new int[n];
		int zakres = 10000;
		int pom, k;
		
		// wypelniamy 
		for(int i = 0; i < n; i++){
			t[i] = (int)(Math.random()*	zakres);}
		//sortowanie
		for(int j = 0; j < n; j ++) System.out.print(t[j]+ "\t");
		System.out.println();
		long time1 = System.currentTimeMillis(); // czas poczatkowy
		for(int i = 0; i < n; i++){
			//if(i%1000 == 0) System.out.println(i);
			k = i;
			pom = t[i];
			for(int j = i; j < n; j++)
				if (t[j] < pom){
					k = j;
					pom = t[j];
				}
			pom = t[k];
			t[k] = t[i];
			t[i] = pom;
			for(int j = 0; j < n; j ++) System.out.print(t[j]+ "\t");
			System.out.println();
		}
		long time2 = System.currentTimeMillis(); // czas poczatkowy
		System.out.println("Czas: "+(time2-time1) +" milisekund");
	}

}
