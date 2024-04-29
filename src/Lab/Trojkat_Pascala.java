package Lab;

public class Trojkat_Pascala {
	public static void main(String[] args) {
		int n = 5;
		int[][] trojkatPascala = new int[n][n];
		trojkatPascala[0] = new int[1];
		trojkatPascala[0][0] = 1;
		trojkatPascala[1] = new int[2];
		trojkatPascala[1][0] = 1;
		trojkatPascala[1][1] = 1;
		for (int i = 2; i < n; i++) {
			trojkatPascala[i] = new int[i + 1];
			trojkatPascala[i][0] = 1;
			trojkatPascala[i][i] = 1;
			for (int j = 1; j < i; j++) {
				trojkatPascala[i][j] = trojkatPascala[i - 1][j - 1] + trojkatPascala[i - 1][j];
			}
		}
		for (int i =0; i< trojkatPascala.length; i++) {
			for (int j = 0; j < trojkatPascala [i].length; j++) {

				System.out.print(trojkatPascala[i][j] + " ");
			}
			System.out.println();
		}
	}
}
