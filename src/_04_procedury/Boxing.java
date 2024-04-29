package _04_procedury;

import org.omg.CORBA.*;

class Liczba{
	int i;
	Liczba(int a){
		i = a;
	}
	void setI(int a){
		i = a;
	}
	int getI(){
		return i;
	}
}
public class Boxing {
	static void op(int i){
		i++;
	}
	static void op(Integer i){
		i = new Integer(i.intValue()+1);
	}
	static void op(IntHolder i){
		i.value++;
	}
	static void op(Liczba i){
		i.setI(i.getI()+1);
	}
	
	public static void main(String[] args) {

		int i = 5;
		Integer II = new Integer(i);
		IntHolder III = new IntHolder(i);
		Liczba licz = new Liczba(i);
		op(i);
		op(II);
		op(III);
		op(licz);
		System.out.println("i = "+ i + "\nii = " + II + "\nIII = " + III.value+"\nlicz = "+ licz.getI());
	}

}
