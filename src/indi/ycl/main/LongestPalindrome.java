package indi.ycl.main;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class LongestPalindrome {
	
	public int longestPalindrome(String s) {
		int re=0;
		Map<Character, Integer> map=new HashMap<Character, Integer>();
		for (int i = 0; i < s.length(); i++) {
			map.put(s.charAt(i), map.getOrDefault(s.charAt(i),0)+1);
		}
		
		for(int val:map.values()){
			if(val%2==0)
				re+=val;
			else
				re+=val-1;
		}
		if(re<s.length()) re++;
		return re;

	}
	//利用Palindrome性质
	public int longestPalindrome1(String s) {
		
		Set<Character> set=new HashSet<Character>();
		int cnt=0;
		for (int i = 0; i < s.length(); i++) {
			if(set.contains(s.charAt(i))){
				set.remove(s.charAt(i));
				cnt++;
			}else{
				set.add(s.charAt(i));
			}
		}
		
		if(!set.isEmpty())
			return 2*cnt+1;
		else
			return 2*cnt;
		
		
		
		
	}
	
	
	

}
