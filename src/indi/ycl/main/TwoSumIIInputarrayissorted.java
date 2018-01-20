package indi.ycl.main;

public class TwoSumIIInputarrayissorted {
	//没有利用到已经排好序这一性质
	public int[] twoSum(int[] numbers, int target) {
		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers.length; j++) {
				if(i!=j&&numbers[i]+numbers[j]==target)
					return new int[]{i+1,j+1};
			}
		}
		return null;

	}
	//
	public int[] twoSum1(int[] numbers, int target) {
		int[] indice=new int[2];
		if(numbers==null||numbers.length==1) return indice;
		int left=0,right=numbers.length-1;
		while(left<right){
			int sum=numbers[left]+numbers[right];
			if(sum==target){
				return new int[]{left+1,right+1};
			}
			if(sum>target)
				right--;
			if(target>sum)
				left++;
		}
		
		return indice;

	}

}
