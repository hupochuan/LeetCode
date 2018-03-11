package indi.ycl.easy;

public class PowerofFour_342 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public boolean isPowerOfFour(int num) {
		if(num<=0) return false;
		int cntOne=0;
		int cntZero=0;
		while(num>0){
			if((num&1)==1)
				cntOne+=num&1;
			else
				cntZero+=num&0;
			num=num>>1;
		}
		if(cntOne==1&&cntZero%2==0)
			return true;
		else
			return false;

	}

}
