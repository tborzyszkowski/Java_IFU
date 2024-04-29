package _04_procedury;

class Euklides{
	static int euklides(int a, int b){
	  if(b == 0) return a;
	  else return euklides(b, a % b);
	}
	static int eu(int a, int b){
		while(a != b){
			if(a>b) a = a - b;
			else b = b - a;
		}
		return a;
	}
	public static void main(String args[]){
	    int a = 997, b = 123456;
	    //int a = 123456, b = 12345678;
	    System.out.println("Euklides("+a+", "+b+") = " + euklides(a,b));
	    System.out.println("Euklides("+a+", "+b+") = " + eu(a,b));
	}
}
