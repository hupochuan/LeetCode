package indi.ycl.main;

public class FirstUniqueCharacterinaString {
	// Given a string, find the first non-repeating character in it and return
	// it's index. If it doesn't exist, return -1.
	public int firstUniqChar(String s) {
		int[] freq=new int[26];
		for (int i = 0; i < s.length(); i++) {
			freq[s.charAt(i)-'a']++;
		}
		for (int i = 0; i < s.length(); i++) {
			if(freq[s.charAt(i)-'a']==1)
				return s.charAt(i);
		}
		return -1;

	}

}
