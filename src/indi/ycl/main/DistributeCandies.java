package indi.ycl.main;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DistributeCandies {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] tmp = { 1, 1, 1, 1, 2, 2, 2, 3, 3, 3 };
		new DistributeCandies().distributeCandies(tmp);

	}

	// 超时了
	public int distributeCandies(int[] candies) {
		int kinds = 0;
		int length = candies.length;
		int result;
		List<Integer> kind = new ArrayList<Integer>();
		for (int i = 0; i < length; i++) {
			if (!kind.contains(candies[i])) {// 主要是这一步耗时，改为数组Hash
				kind.add(candies[i]);
				kinds++;
			}
		}
		if (kinds >= length / 2) {
			return length / 2;
		} else {
			return kinds;
		}

	}

	// 以空间换时间
	public int distributeCandies1(int[] candies) {
		int kinds = 0;
		int length = candies.length;
		int result;

		int[] nums = new int[200001];
		for (int i = 0; i < candies.length; i++) {
			int num = candies[i] + 100000;
			if (nums[num] == 0) {
				nums[num] = 1;
				kinds++;
			}
		}
		if (kinds >= length / 2) {
			return length / 2;
		} else {
			return kinds;
		}

	}

	public int distributeCandies2(int[] candies) {
		Set<Integer> kinds = new HashSet<>();
		for (int candy : candies)
			kinds.add(candy);
		return kinds.size() >= candies.length / 2 ? candies.length / 2 : kinds.size();
	}
	
	//以上三种方法思想都是一样的
	//问题在于结构体查询效率的问题，用List的contain方法速度慢，导致超时，
	//数组其实用了Hashmap的思想
	//set 集合 不包含重复元素，不考虑顺序，有着自己的存储结构，故速度超过List

}
