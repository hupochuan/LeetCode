package indi.ycl.easy;

public class SearchInsertPosition_35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int searchInsert(int[] nums, int target) {

		if (nums[nums.length - 1] < target)
			return nums.length;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == target)
				return i;
			if (nums[i] > target)
				return i;
		}

		return 0;
	}
	//另外还有
	public int searchInsert_A(int[] nums, int target) {
		int low=0,high=nums.length-1;
		
		while(low<high){
			int mid=(low+high)/2;
			if(nums[mid]==target) return mid;
			if(nums[mid]>target) high=mid-1;
			else low=mid+1;
		}
		
		return low;
	}

}
