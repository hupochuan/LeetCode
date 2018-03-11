package indi.ycl.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import com.sun.org.apache.bcel.internal.generic.SWAP;

public class IntersectionofTwoArraysII {
	//合并两个数组
	public int[] intersect(int[] nums1, int[] nums2) {
		List<Integer> l=new ArrayList<Integer>();
		Arrays.sort(nums1);
		Arrays.sort(nums2);
		int begin=0;
		for (int i = 0; i < nums1.length; i++) {
			for (int j = begin; j < nums2.length;j++) {
				if(nums1[i]==nums2[j]){
					l.add(nums1[i]);
					begin=j+1;
					break;
				}
				
			}
		}
		int[] re=new int[l.size()];
		for (int i = 0; i < l.size(); i++) {
			re[i]=l.get(i);
		}
		return re;
	}

}
