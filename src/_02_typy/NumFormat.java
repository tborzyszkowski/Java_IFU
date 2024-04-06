package _02_typy;

import java.text.NumberFormat;
import java.util.Locale;

public class NumFormat {

	public static void main(String[] args) {
		double pi = Math.PI;
		double x = 0.5;

		NumberFormat format = NumberFormat.getNumberInstance();
		// max po przecinku
		format.setMaximumFractionDigits(5);
		// max przed przecinkiem
		format.setMaximumIntegerDigits(3);
		// min po przecinku
		format.setMinimumFractionDigits(3);
		// min przed przecinkiem
		format.setMinimumIntegerDigits(2);

		System.out.println("PI = " + format.format(pi));
		System.out.println("x  = " + format.format(x));

		// currency 
		format = NumberFormat.getCurrencyInstance();
		// max po przecinku
		format.setMaximumFractionDigits(5);
		// max przed przecinkiem
		format.setMaximumIntegerDigits(3);
		// min po przecinku
		format.setMinimumFractionDigits(3);
		// min przed przecinkiem
		format.setMinimumIntegerDigits(2);

		System.out.println("PI = " + format.format(pi));
		System.out.println("x  = " + format.format(x));

		format = NumberFormat.getCurrencyInstance(Locale.US);
		// max po przecinku
		format.setMaximumFractionDigits(5);
		// max przed przecinkiem
		format.setMaximumIntegerDigits(3);
		// min po przecinku
		format.setMinimumFractionDigits(3);
		// min przed przecinkiem
		format.setMinimumIntegerDigits(2);

		System.out.println("PI = " + format.format(pi));
		System.out.println("x  = " + format.format(x));

		// procent
		format = NumberFormat.getPercentInstance();
		// max po przecinku
		format.setMaximumFractionDigits(5);
		// max przed przecinkiem
		format.setMaximumIntegerDigits(3);
		// min po przecinku
		format.setMinimumFractionDigits(3);
		// min przed przecinkiem
		format.setMinimumIntegerDigits(2);

		System.out.println("PI = " + format.format(pi));
		System.out.println("x  = " + format.format(x));
	}
}
