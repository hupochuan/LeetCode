package indi.ycl.main;

public class RansomNote {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new RansomNote().canConstruct("aa", "aab"));

	}

	public boolean canConstruct(String ransomNote, String magazine) {
		
		for (int i = 0; i < ransomNote.length(); i++) {
			String tmp=magazine.replaceFirst(ransomNote.charAt(i)+"","");
			if(tmp.length()==magazine.length())
				return false;
			magazine=tmp;
		}
		return true;

	}

}
