package leedCode;

public class lc_190515 {

	public static void main(String[] args) {
		// 有两种特殊字符。第一种字符可以用一比特0来表示。第二种字符可以用两比特(10 或 11)来表示。
		// 现给一个由若干比特组成的字符串。问最后一个字符是否必定为一个一比特字符。给定的字符串总是由0结束。

	}

	public boolean isOneBitCharacter(int[] bits) {
		// 碰到 0 可以是第一种字符或者第二种字符
		// 碰到1肯定是第二种字符
		// [1,0,1,1,0,0]
		// 如果最后一个字符的前一个字符是0，肯定是一个比特字符。
		// 如果最后一个字符的前一个字符是1，循环bits。碰到1，index + 2，碰到0 index + 1，如果index
		if (bits.length == 1) {
			return true;
		}

		int beforeLast = bits[bits.length - 2];
		if (beforeLast == 0) {
			return true;
		}

		int index = 0;
		while (true) {
			if (index == bits.length - 1) {
				return true;
			}

			if (index > bits.length - 1) {
				return false;
			}

			if (bits[index] == 0) {
				index++;
			}

			if (bits[index] == 1) {
				index += 2;
			}
		}

	}

}
