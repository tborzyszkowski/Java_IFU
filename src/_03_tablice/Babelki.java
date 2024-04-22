package _03_tablice;

public class Babelki {
	public static void main(String[] args) {
		int n = 100000;
		int[] t = new int[n];
		int zakres = 100000;
		int pom;
		
		// wypelniamy 
		for(int i = 0; i < n; i++){
			t[i] = (int)(Math.random()*	zakres);
		}
		//sortowanie
		//for(int k = 0; k < n; k ++) System.out.print(t[k]+ "\t");
		//System.out.println();
		long time1 = System.currentTimeMillis(); // czas poczatkowy
		for(int i = 0; i < n; i++){
			if(i%1000 == 0) System.out.println(i);
			for(int j = n-1; j > i; j--)
				if (t[j-1] > t[j]){
					//int pom = t[j-1];				
					pom = t[j-1];
					t[j-1] = t[j];
					t[j] = pom;
				}
			//for(int k = 0; k < n; k ++) System.out.print(t[k]+ "\t");
			//System.out.println();
		}
		long time2 = System.currentTimeMillis(); // czas poczatkowy
		System.out.println("Czas: "+(time2-time1) +" milisekund");
	}

}
