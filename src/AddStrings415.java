import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class AddStrings415 {
	public String addStrings(String num1, String num2) {
		Stack<Integer> s=new Stack<Integer>();
		int i1=num1.length()-1;
		int i2=num2.length()-1;
		
		int jinwei=0;
		while(i1>=0||i2>=0){
			int sum;
			if(i1>=0&&i2>=0){
				sum=num1.charAt(i1)+num2.charAt(i2)-96+jinwei;
			}else if(i1>=0){
				sum=num1.charAt(i1)+jinwei-48;
			}else{
				sum=num2.charAt(i2)+jinwei-48;
			}
			
			jinwei=sum/10;
			s.add(sum%10);
			i1--;
			i2--;
			if(i1<0&&i2<0&&jinwei==1){
				s.add(1);
			}
		}
		String str="";
		while(!s.isEmpty()){
			str=str+s.pop();
		}
		return str;
		

	}
	public String addStrings2(String num1, String num2) {
		StringBuffer sum=new StringBuffer();
		int carry=0;
		for (int i = num1.length()-1,j=num2.length()-1; i >=0||j>=0||carry==1;i--,j-- ) {
			int x=i>=0?num1.charAt(i)-'0':0;
			int y=j>=0?num2.charAt(j)-'0':0;
			sum.append((x+y+carry)%10);
			carry=(x+y+carry)/10;
			
		}
		return sum.reverse().toString();
	}

}
