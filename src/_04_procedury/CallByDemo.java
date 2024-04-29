package _04_procedury;

class CallBy {
	int a, b;

	CallBy(int i, int j) {
		a = i;
		b = j;
	}

	void ByValue(int i, int j) {
		i *= 2;
		j /= 2;
	}

	void ByRef(CallBy o) {
		o.a *= 2;
		o.b /= 2;
	}
}

public class CallByDemo {
	public static void main(String[] args) {
		CallBy ob = new CallBy(15, 20);
		int i = 5;
		int j = 10;

		System.out.println("Przed wywolaniem przez wartosc: ");
		System.out.println(" i = " + i + " j = " + j);
		ob.ByValue(i, j);
		System.out.println("Po wywolaniu przez wartosc: ");
		System.out.println(" i = " + i + " j = " + j + "\n");
		System.out.println("Przed wywolaniem przez zmienna: ");
		System.out.println(" a = " + ob.a + " b = " + ob.b);
		ob.ByRef(ob);
		System.out.println("Po wywolaniu przez zmienna: ");
		System.out.println(" a = " + ob.a + " b = " + ob.b + "\n");
	}
}
