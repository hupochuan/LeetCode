package indi.ycl.main;

public class NumberComplement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int findComplement(int num) {
		return num^(Integer.highestOneBit(num)<<1)-1;

	}
	public int findComplement1(int num){
		return (Integer.highestOneBit(num)<<1)-num;
	}

}
