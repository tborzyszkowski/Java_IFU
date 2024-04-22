package _02_typy;

// Obliczanie wartosci sredniej z tablicy elementow
class Average {
	public static void main(String[] args) {
		double[] nums = {10.1, 11.2, 12.3, 13.4, 14.5, 1000};
		double result = 0;
		int i;

		for (i = 0; i < nums.length; i++)
			result = result + nums[i];

		System.out.println("Wartosc srednia = " + result / nums.length);

		result = 0;
		for (var num : nums)
			result = result + num;

		System.out.println("Wartosc srednia = " + result / nums.length);
	}
}
