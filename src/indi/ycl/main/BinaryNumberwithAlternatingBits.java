package indi.ycl.main;

public class BinaryNumberwithAlternatingBits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new BinaryNumberwithAlternatingBits().hasAlternatingBits(1431655765));

	}

	public boolean hasAlternatingBits(long n) {
		return (n<<1^n)>>1==(Integer.highestOneBit((int) n)<<1)-1?true:false;

	}

}
