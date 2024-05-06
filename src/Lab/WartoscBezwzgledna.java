package Lab;

public class WartoscBezwzgledna {
	private int liczba = 0;

	WartoscBezwzgledna(int liczba) {
		this.setLiczba(liczba);
	}

	public int getLiczba() {
		return Math.abs(liczba);
	}

	public void setLiczba(int liczba) {
		if(WartoscBezwzgledna.validate(liczba))
			this.liczba = liczba;
	}
	public static boolean validate(int liczba){
		return liczba > -100 && liczba < 100;
	}

}
