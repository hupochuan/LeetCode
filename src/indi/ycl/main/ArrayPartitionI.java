package indi.ycl.main;

import com.sun.swing.internal.plaf.basic.resources.basic;

public class ArrayPartitionI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 1,4,3,2 };
		new ArrayPartitionI().arrayPairSum1(nums);

	}

	// 冒泡排序超时了，用java原生的Array.sort函数过了
	public int arrayPairSum(int[] nums) {

		for (int i = 0; i < nums.length - 1; i++) {
			for (int j = 0; j < nums.length - i - 1; j++) {
				if (nums[j] > nums[j + 1]) {
					int tmp = nums[j];
					nums[j] = nums[j + 1];
					nums[j + 1] = tmp;

				}

			}
		}

		int sum = 0;
		for (int i = 0; i < nums.length; i += 2) {
			sum += nums[i];

		}

		return sum;

	}

	// 用空间换时间
	public int arrayPairSum1(int[] nums) {
		int sum = 0;
		int[] hash = new int[20001];// 前后一万个数，中间0，共20001
		for (int i = 0; i < nums.length; i++) {
			hash[nums[i] + 10000]++;
		}
		boolean tag = true;
		for (int i = 0; i < hash.length; i++) {
			if (hash[i] > 0) {

				while (hash[i] > 0) {
					if (tag) {
						sum += i - 10000;
						
						tag = false;
					} else {
						tag = true;
						
					}
					hash[i]--;

				}
			}
		}
//		System.out.println(sum);
		return sum;

	}

}
