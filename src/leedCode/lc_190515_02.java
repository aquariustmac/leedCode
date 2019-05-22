package leedCode;

import java.util.Arrays;

public class lc_190515_02 {

	public static void main(String[] args) {
		/**
		 * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
		 * 
		 * 你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素。
		 * 
		 * 
		 * 从小到大排序，如果最小加上最大的值小于target，就最小值下标 + 1。如果最小加上最大的值大于target，就最大值下标-1。直到最小下标等于最大下标
		 */
		int[] nums = { 3, 3 };

		int[] a = twoSum(nums, 6);

		System.out.println(Arrays.toString(a));
	}

	public static int[] twoSum(int[] nums, int target) {

		int[] a = new int[2];

		for (int i = 0; i < nums.length; i++) {
			int other = target - nums[i];

			for (int j = i + 1; j < nums.length; j++) {
				if (nums[j] == other) {
					a[0] = i;
					a[1] = j;

					break;
				}
			}

		}

		return a;
	}

}
