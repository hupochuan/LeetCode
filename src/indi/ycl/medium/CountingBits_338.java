package indi.ycl.medium;

public class CountingBits_338 {
	public int[] countBits(int num) {
		int[] re=new int[num+1];
		int cnt=0;
		int index=0;
		for (int i = 0; i < re.length; i++) {
			index=i;
			while(index>0){
				cnt+=index&1;
				index=index>>1;
			}
			re[i]=cnt;
		}
		return re;
	}
	public int[] countBits_A(int num) {
		int[] re=new int[num+1];
		
		for (int i = 0; i < num+1; i++) {
			re[i]=re[i>>1]+i&1;
		}
		return re;
	}

}
