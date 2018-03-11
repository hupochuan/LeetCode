package indi.ycl.easy;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

import javax.print.attribute.HashDocAttributeSet;

public class NextGreaterElementI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int[] nextGreaterElement(int[] nums1, int[] nums2) {
		int[] result=new int[nums1.length];
		for (int i = 0; i < nums1.length; i++) {
			boolean tag=false;
			int bigernum=-1;
			for (int j = 0; j < nums2.length; j++) {
				if(!tag){
					if(nums1[i]==nums2[j])
					tag=true;
				}
				if(tag){
					if(nums2[j]>nums1[i]){
						bigernum=nums2[j];
					    break;
					}
						
				}
				
			}
			result[i]=bigernum;
		}
		return result;

	}
	public int[] nextGreaterElement(int[] nums1, int[] nums2) {
		Map<Integer, Integer> map=new HashMap<Integer, Integer>();
		Stack<Integer> stack=new Stack<Integer>();
		for (int num : nums2) {
			while(!stack.isEmpty()&&stack.peek()<num)
				map.put(stack.pop(), num);
			stack.push(num);
		}
		for (int i = 0; i < nums1.length; i++) {
			nums1[i]=map.getOrDefault(nums1[i], -1);
		}
		return nums1;
		
		
	}
	

}
