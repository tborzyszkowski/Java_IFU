package _04_procedury;

import java.util.*;

class Osoba{
	private String imie;
	private String nazwisko;
	private int rok;
	
	void setImie(String im){
		imie = im;
	}
	void setNazwisko(String naz){
		nazwisko = naz;
	}
	void setRok(int r){
		rok = r;
	}
	String getImie(){
		return imie;
	}
	String getNazwisko(){
		return nazwisko;
	}
	int getRok(){
		return rok;
	}
	public String toString(){
		return "[" + imie + " " + nazwisko + " " + (2009 - rok)+ "]";
	}
}

public class NowaKlasa {

	public static void main(String[] args) {
		Osoba os = new Osoba();
		
		os.setImie("Ala");
		os.setNazwisko("Kowalska");
		os.setRok(1989);
		
		System.out.println("Imi� : "+os.getImie() + " Nazwisko : " + os.getNazwisko()+
				"Rok : " + os.getRok());
		System.out.println(os);
	}

}

