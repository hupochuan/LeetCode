package indi.ycl.easy;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class JewelsandStones771 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
    // 用了Map进行的存储，看了别人的提交的代码，这个题目是要判断字符是否相同，利用了元组的特性
	 public int numJewelsInStones(String J, String S) {
		int cnt=0;
		Map<String,Integer> map=new HashMap<>();
		for (int i = 0; i < J.length(); i++) {
			map.put(J.charAt(i)+"", 0);
		}
		
		for (int i = 0; i < S.length(); i++) {
			if(map.containsKey(S.charAt(i)+"")){
				map.put(S.charAt(i)+"", map.get(S.charAt(i)+"")+1);
			}
		}
		
		for (Integer i:map.values()) {
			cnt+=i;
			
		}
		return cnt;
		
		
	}
	 public int numJewelsInStones1(String J, String S) {
			int cnt=0;
			Set set=new HashSet();
			for (int i = 0; i < J.length(); i++) {
				set.add(J.charAt(i));
			}
			
			for (int i = 0; i < S.length(); i++) {
				if(set.contains(S.charAt(i))){
					cnt++;
				}
			}
			
			return cnt;
			
			
    }

}
