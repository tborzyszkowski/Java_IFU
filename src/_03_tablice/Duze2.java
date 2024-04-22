package _03_tablice;

public class Duze2 {

	public static void main(String[] args) {
		int n = 10000;
		Obywatel t[] = new Obywatel[n];
		int zakres = 10000;
		int pom;
		int j;
		
		// wypelniamy 
		for(int i = 0; i < n; i++){
			j = (int)(Math.random()* zakres);
			t[i] = new Obywatel("AAA"+j, "BBB"+j, "CCC"+j, j, "DDD"+j, j%2==0, j/2);
		}
		// tablica indeksow elementow z t[]
		int ind[] = new int[n];
		for(int i = 0; i < n; i++) ind[i] = i;
		
		//sortowanie
		//for(int v = 0; v < n; v ++) System.out.print(t[ind[v]]+ "\t");
		//System.out.println();
		long time1 = System.currentTimeMillis(); // czas poczatkowy
		for(int i = 1; i < n; i++){
			pom = ind[i];
			j = i;
			while(j > 0){
				if (t[pom].wiek < t[ind[j-1]].wiek){
					ind[j] = ind[j-1];
					j = j - 1;
				}
				else break;
			}
			ind[j] = pom;
			//for(int v = 0; v < n; v ++) System.out.print(t[ind[v]]+ "\t");
			//System.out.println();
		}
		long time2 = System.currentTimeMillis(); // czas poczatkowy
		System.out.println("Czas: "+(time2-time1) +" milisekund");

	}

}
