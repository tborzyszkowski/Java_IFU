package _04_procedury;

class Syg2 {
// dwie metody w tej samej przestrzeni nazw o r�nych sygnaturach
	int next(int i){
		return i+1;
	}
// druga taka sama w tej samej przestrzeni
//	int next(int i){
//		return i+1;
//	}
	double next(double d){
		return d+2;
	}
}

public class Sygnatury2{
	public static void main(String[] args) {
		
		Syg s = new Syg();
		System.out.println(s.next(1));
		System.out.println(s.next(1/2));
		System.out.println(s.next(0.5));
		System.out.println(s.next(1 + 0.5));
	}
}
