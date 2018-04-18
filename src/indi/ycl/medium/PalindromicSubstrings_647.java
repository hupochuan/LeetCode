package indi.ycl.medium;

public class PalindromicSubstrings_647 {
	public int countSubstrings(String s) {
		int cnt=0;
	
		for (int i = 0; i < s.length(); i++) {
			for (int j = i+1; j < s.length(); j++) {
				StringBuffer sb=new StringBuffer(s.substring(i, j+1));
				
				if(sb.toString().equals(sb.reverse().toString()))
					cnt++;
			}
		}
		
		return cnt+s.length();

	}

}
