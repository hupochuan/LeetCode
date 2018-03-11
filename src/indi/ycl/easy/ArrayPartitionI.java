package indi.ycl.easy;

import com.sun.swing.internal.plaf.basic.resources.basic;

public class ArrayPartitionI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 1,4,3,2 };
		new ArrayPartitionI().arrayPairSum1(nums);

	}

	// ð������ʱ�ˣ���javaԭ����Array.sort��������
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

	// �ÿռ任ʱ��
	public int arrayPairSum1(int[] nums) {
		int sum = 0;
		int[] hash = new int[20001];// ǰ��һ��������м�0����20001
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
