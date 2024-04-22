package _03_tablice;

class Obywatel{
	String imie;
	String nazwisko;
	String stanowisko;
	int wiek;
	String adres;
	boolean plec;
	long nrButa;
	
	Obywatel(){
		// pusty obywatel
	}
	
	Obywatel(String i, String n, String s, int w, String a, boolean p, long nb){
		imie = i;
		nazwisko = n;
		stanowisko = s;
		wiek = w;
		adres = a;
		plec = p;
		nrButa = nb;
	}
	
	void kopiuj(Obywatel o){
		imie = new String(o.imie);
		nazwisko = new String(o.nazwisko);
		stanowisko = new String(o.stanowisko);
		wiek = o.wiek;
		adres = new String(o.adres);
		plec = o.plec;
		nrButa = o.nrButa;
	}
	public String toString(){
		return "["+imie +", "+nazwisko+", "+stanowisko+", "+wiek+", "+adres+", "+plec+", "+nrButa+" ]";
	}
}
public class Duze1 {

	public static void main(String[] args) {
		int n = 10000;
		Obywatel t[] = new Obywatel[n];
		int zakres = 10000;
		Obywatel pom = new Obywatel();
		int j;
		
		// wypelniamy 
		for(int i = 0; i < n; i++){
			j = (int)(Math.random()* zakres);
			t[i] = new Obywatel("AAA"+j, "BBB"+j, "CCC"+j, j, "DDD"+j, j%2==0, j/2);
		}
		//sortowanie
		//for(int v = 0; v < n; v++) System.out.print(t[v]+ "\t");
		//System.out.println();
		long time1 = System.currentTimeMillis(); // czas poczatkowy
		for(int i = 1; i < n; i++){
			pom.kopiuj(t[i]);
			j = i;
			while(j > 0){
				if (pom.wiek < t[j-1].wiek){
					t[j].kopiuj(t[j-1]);
					j = j - 1;
				}
				else break;
			}
			t[j].kopiuj(pom);
			//for(int v = 0; v < n; v++) System.out.print(t[v]+ "\t");
			//System.out.println();
		}
		long time2 = System.currentTimeMillis(); // czas poczatkowy
		System.out.println("Czas: "+(time2-time1) +" milisekund");
	}

}
