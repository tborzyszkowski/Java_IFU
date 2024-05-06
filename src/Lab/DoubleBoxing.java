package Lab;

public class DoubleBoxing {
	private double liczba;

	public DoubleBoxing(double liczba) {
		this.liczba = liczba;
	}

	public double getLiczba() {
		return liczba;
	}

	public void setLiczba(double liczba) {
		this.liczba = liczba;
	}
	public static void operationByReference(DoubleBoxing doubleBoxing){
		doubleBoxing.setLiczba(doubleBoxing.getLiczba() * 2);
	}
	public static void operationByValue(double doubleValue){
		doubleValue = doubleValue * 2;
	}
}
