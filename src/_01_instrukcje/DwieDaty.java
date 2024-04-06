package _01_instrukcje;

import javax.swing.JOptionPane;


public class DwieDaty {
	public static void main(String[] args) {
//		String w = JOptionPane.showInputDialog("d1_rok = " );
//		int d1_r = Integer.parseInt(w);
//		w = JOptionPane.showInputDialog("d1_miesiac = " );
//		int d1_m = Integer.parseInt(w);
//		w = JOptionPane.showInputDialog("d1_dzien = " );
//		int d1_d = Integer.parseInt(w);
//
//		w = JOptionPane.showInputDialog("d2_rok = " );
//		int d2_r = Integer.parseInt(w);
//		w = JOptionPane.showInputDialog("d2_miesiac = " );
//		int d2_m = Integer.parseInt(w);
//		w = JOptionPane.showInputDialog("d2_dzien = " );
//		int d2_d = Integer.parseInt(w);

		int d1_r = 1910;
		int d1_m = 3;
		int d1_d = 22;

		int d2_r = 1920;
		int d2_m = 4;
		int d2_d = 11;

		if(d1_r < d2_r)
			System.out.println("D1");
		else
			if(d1_r > d2_r)
				System.out.println("D2");
			else
				if (d1_m < d2_m)
					System.out.println("D1");
				else
					if(d1_m > d2_m)
						System.out.println("D2");
					else
						if (d1_d < d2_d)
							System.out.println("D1");
						else
							if(d1_d > d2_d)
								System.out.println("D2");
							else
								System.out.println("==");
	}
}
