package indi.ycl.main;

public class FindtheDifference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new FindtheDifference().findTheDifference("abcd", "abcde");

	}

	public char findTheDifference(String s, String t) {
		for (int i = 0; i < s.length(); i++) {
			char chr=s.charAt(i);
			t=t.replaceFirst(chr+"", "");	
		}
		
	    return t.charAt(0);

	}

}
