package _04_procedury;

import java.util.*;

class Osoba{
	private String imie;
	private String nazwisko;
	private int rok;
	
	public void setImie(String imie){
		this.imie = imie;
	}
	public void setNazwisko(String nazwisko){
		this.nazwisko = nazwisko;
	}
	public void setRok(int rok){
		this.rok = rok;
	}
	public String getImie(){
		return imie;
	}
	public String getNazwisko(){
		return nazwisko;
	}
	public int getRok(){
		return rok;
	}
	public String toString(){
		return "[" + imie + " " + nazwisko + " " + (2024 - rok)+ "]";
	}
}

public class NowaKlasa {

	public static void main(String[] args) {
		Osoba os = new Osoba();
		
		os.setImie("Ala");
		os.setNazwisko("Kowalska");
		os.setRok(1989);
		
		System.out.println("Imie : "+os.getImie() + " Nazwisko : " + os.getNazwisko()+
				"Rok : " + os.getRok());
		System.out.println(os);
	}

}

