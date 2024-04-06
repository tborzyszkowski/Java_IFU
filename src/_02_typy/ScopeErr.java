package _02_typy;

class ScopeErr {
	public static void main(String[] args) {
		int x = 1;
		{   // tutaj zaczynamy nowy zakres
			//int x = 2;  // przesloniecie zmiennej x
			// BLAD: kompilator zglosi, ze zmienna x juz jest zdefiniowana
		}
	}
}
