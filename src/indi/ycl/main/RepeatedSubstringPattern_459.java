package indi.ycl.main;

public class RepeatedSubstringPattern_459 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public boolean repeatedSubstringPattern(String s) {
		int l=s.length();
		for (int i = l/2; i >=1; i--) {
			if(l/i==0){
				int m=l/i;
				String subS=s.substring(0, i);
				StringBuffer copy=new StringBuffer(); 
				for (int j = 0; j < m; j++) {
					copy.append(subS);
				}
				if(copy.toString().equals(s))
					return true;
				
			}
		}
		return false;

	}
	public boolean repeatedSubstringPattern_A(String s) {
		if(s.length()==0||s.length()==1) return false;
		StringBuffer sb=new StringBuffer();
		sb.append(s);
		sb.append(s);
		return sb.substring(1, sb.length()-1).contains(s);
		
	}

}
