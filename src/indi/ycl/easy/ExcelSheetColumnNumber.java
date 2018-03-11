package indi.ycl.easy;

public class ExcelSheetColumnNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ExcelSheetColumnNumber().titleToNumber("AB");

	}
	
	public int titleToNumber(String s) {
		char[] chrs=s.toCharArray();
		int quan=1;
		int re=0;
		for (int i = chrs.length-1; i >= 0; i--) {
			re+=(chrs[i]-64)*quan;
			quan*=26;
		}
		System.out.println(re);
		return re;
		
	}

}
