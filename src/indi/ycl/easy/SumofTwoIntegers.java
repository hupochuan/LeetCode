package indi.ycl.easy;

public class SumofTwoIntegers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new SumofTwoIntegers().getSum(-2, 1);

	}
   //计算机表示数字采用二进制补码
	//异或运算进行计算，与运算查看有哪些需要进位的位置
	public int getSum(int a, int b) {
//		System.out.println(Integer.toBinaryString(2));
//		System.out.println(Integer.toBinaryString(-4));
		if(a==0)
			return b;
		if(b==0)
			return a;
		while(b!=0){
			int tmp=a^b;
			
			b=(a&b)<<1;
			
			a=tmp;
			System.out.println(Integer.toBinaryString(a));
			System.out.println(Integer.toBinaryString(b));
		}
		System.out.println(a);
		return a;
		

	}

}
