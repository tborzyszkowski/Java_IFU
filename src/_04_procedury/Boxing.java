package _04_procedury;

class Liczba{
	private int liczba;
	Liczba(int liczba){
		setLiczba(liczba);
	}
	void setLiczba(int liczba){
		this.liczba = liczba;
	}
	int getLiczba(){
		return liczba;
	}
}
public class Boxing {
	static void op(int i){
		i++;
	}
	static void op(Integer i){
		i = i.intValue() + 1;
	}
	static void op(Liczba i){
		i.setLiczba(i.getLiczba()+1);
	}

	public static void main(String[] args) {

		int intLiczba = 5;
		Integer integerLiczba = intLiczba;
		Liczba liczba = new Liczba(intLiczba);
		op(intLiczba);
		op(integerLiczba);
		op(liczba);
		System.out.println("intLiczba = "+ intLiczba);
		System.out.println("integerLiczba = " + integerLiczba);
		System.out.println("liczba = "+ liczba.getLiczba());
	}

}
