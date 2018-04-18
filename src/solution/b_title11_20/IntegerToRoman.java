package solution.b_title11_20;

/**
 * 
 * Given an integer, convert it to a roman numeral. Input is guaranteed to be
 * within the range from 1 to 3999.
 * 
 * 差题~
 *
 */
public class IntegerToRoman {

	public static String intToRoman(int num) {
		String roman = "";

		String symbol[] = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };
		int value[] = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };

		for (int i = 0; num != 0; i++) {
			while (num >= value[i]) {
				num -= value[i];
				roman += symbol[i];
			}
		}

		return roman;
	}

	public static void main(String[] args) {
		System.out.println(intToRoman(1419));
	}

}
