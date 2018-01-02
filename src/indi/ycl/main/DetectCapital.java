package indi.ycl.main;

public class DetectCapital {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


	}

	public boolean detectCapitalUse(String word) {
		char[] chrs=word.toCharArray();
		if(chrs[0]>=97&&chrs[0]<=122){
			for (int i = 1; i < chrs.length; i++) {
				if(chrs[i]>=65&&chrs[i]<=90)
					return false;
			}
			return true;
		}
		if(chrs.length==1) return true;
		if(chrs[1]>=97&&chrs[1]<=122){
			for (int i = 1; i < chrs.length; i++) {
				if(chrs[i]>=65&&chrs[i]<=90)
					return false;
			}
			return true;
		}else{
			for (int i = 1; i < chrs.length; i++) {
				if(chrs[i]>=97&&chrs[i]<=122)
					return false;
			}
			return true;
		}
	
	}

}
