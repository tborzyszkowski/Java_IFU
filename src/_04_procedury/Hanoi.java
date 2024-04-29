package _04_procedury;

class Hanoi {
	static long moves = 0;

	static void hanoi(int height,
	                  char fromPole, char toPole, char withPole) {
		if (height >= 1) {
			hanoi(height - 1, fromPole, withPole, toPole);
			//moveDisk(fromPole, toPole);
			moves++;
			hanoi(height - 1, withPole, toPole, fromPole);
		}
	}

	static void moveDisk(char fromPole, char toPole) {
		moves++;
		//System.out.print(fromPole);
		//System.out.print(toPole);
		//System.out.print(((moves % 20)==0) ? '\n' : ' ');
	}

	public static void main(String[] args) {
		long time1, time2;
		int TowerHeight = 30;
		char FromPole = 'A', ToPole = 'B', WithPole = 'X';

		time1 = System.currentTimeMillis();

		hanoi(TowerHeight, FromPole, ToPole, WithPole);

		time2 = System.currentTimeMillis();

		System.out.println();
		System.out.println(time2 - time1 + " msec execution time ");
		System.out.println(moves + " moves");
	}

}
