package leedCode;

public class lc_190524 {

	public static void main(String[] args) {
		/**
		 * 给定两个二进制字符串，返回他们的和（用二进制表示）。
		 * 
		 * 输入为非空字符串且只包含数字 1 和 0
		 * 
		 * a = "1110", b = "1111" "10101"
		 */
		String a = "1110";
		String b = "1111";
		String count = addBinary(a, b);

		System.out.println(count);

	}

	public static String addBinary(String a, String b) {
		int m = a.length() - 1;
		int n = b.length() - 1;
		int count = 0;

		StringBuilder stringBuilder = new StringBuilder();

		while (count == 1 || m >= 0 || n >= 0) {
			if (m >= 0 && a.charAt(m--) == '1') {
				count++;
			}

			if (n >= 0 && b.charAt(n--) == '1') {
				count++;
			}

			stringBuilder.append(count % 2); // 1 0 1 0 1
			count /= 2;
		}

		return stringBuilder.reverse().toString();
	}

}
