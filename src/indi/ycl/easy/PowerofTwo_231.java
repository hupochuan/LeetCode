package indi.ycl.easy;

public class PowerofTwo_231 {
	public boolean isPowerOfTwo(int n) {
		if(n==1) return true;
		if(n<=0||n%2!=0) return false;
		while(n%2==0){
			n=n/2;
		}
		if(n==1) return true;
		else return false;

	}
	
	//这里涉及到数字的二进制表达，2的幂2,4,8转换为二进制以后开头均为1，之后跟若干1
	public boolean isPowerOfTwo_A(int n) {
		if(n<=0) return false;
		if((n&(n-1))==0) return true;
		else return false;
	}
	//另外也可以采用统计2进制1个数的方法
	public boolean isPowerOfTwo_B(int n) {
		if(n<=0) return false;
		int cnt=0;
		while(n>0){
			cnt+=n&1;
			n>>=1;
		}
		
		return cnt==1;
	}

}
