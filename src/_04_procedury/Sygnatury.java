package _04_procedury;

class Syg {

// dwie metody w tej samej przestrzeni nazw o r�nych sygnaturach
	int next(int i){
		return i+1;
	}
	byte next(byte b){
		return (byte)(b * 5);
	}
	double next(double d){
		return d+2;
	}
}
public class Sygnatury{
	public static void main(String[] args) {
		
		Syg s = new Syg();
		System.out.println(s.next(1));
		System.out.println(s.next((float)(1/2)));
		System.out.println(s.next(0.5));
		System.out.println(s.next(1 + 0.5));
	}

}
