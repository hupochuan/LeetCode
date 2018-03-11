package indi.ycl.easy;

public class ValidAnagram {
	//超时了
	public boolean isAnagram(String s, String t) {
		if(s.length()!=t.length()) return false;
		for (int i = 0; i < s.length(); i++) {
			String tmp=t.replaceFirst(s.charAt(i)+"", "");
			if(tmp.length()==t.length())
				return false;
		}
		return true;
		
	}
	
	public boolean isAnagram1(String s, String t) {
		int[] cnt=new int[26];
	
		for (int i = 0; i < s.length(); i++) {
			cnt[s.charAt(i)-'a']++;
		}
		for (int i = 0; i < t.length(); i++) {
			cnt[t.charAt(i)-'a']--;
		}
		for (int i = 0; i < cnt.length; i++) {
			if(cnt[i]!=0)
				return false;
		}
		return true;
	}
	

}
