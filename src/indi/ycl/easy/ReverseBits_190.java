package indi.ycl.easy;

public class ReverseBits_190 {
	public int reverseBits(int n) {
		int num=0;
		for (int i = 0; i < 32; i++) {
			num+=n&1;
			n=n>>>1;
			if(i<31)
				num=1<<num;
		}
		
		return num;

	}

}
