package leedCode;

public class lc_190529 {

	public static void main(String[] args) {
		/**
		 * 给定一个非负整数 num，反复将各个位上的数字相加，直到结果为一位数。
		 * 
		 * 581 % 9
		 * 
		 * (5*100 + 8*10 + 1) = (5*99 + 5) + (8*9 + 8) + 1 => ((5*99 + 5) + (8*9 + 8) + 1) % 9 = (5 + 8 + 1) % 9 => ((1 + 4) % 9)%9
		 * 
		 */

		System.out.println(addDigits(0));
	}

	public static int addDigits(int num) {
		if (num == 0) {
			return 0;
		}

		num = num % 9;

		if (num == 0) {
			return 9;
		}

		return num;

	}

}
