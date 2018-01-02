package indi.ycl.main;

public class AddDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new AddDigits().addDigits1(38));

	}
//递归
	public int addDigits(int num) {
		int result=0;
		if(num<=9)
			return num;
		while(num!=0){
			result+=num%10;
			num/=10;
		}
		return addDigits(result);
	}
	//循环
	public int addDigits1(int num){
		int sum=0;
		while(true){
			while(num!=0){
				sum+=num%10;
				num/=10;
			}

			if(sum<=9)
				return sum;
			else{
				num=sum;
				sum=0;
			}
		}
	}
	
	

}
