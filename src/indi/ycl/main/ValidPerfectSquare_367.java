package indi.ycl.main;

public class ValidPerfectSquare_367 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public boolean isPerfectSquare(int num) {
		if(num<0) return false;
		int i=1;
		while(num>0){
			num-=i;
			i+=2;
		}
		return num==0;

	}

}
