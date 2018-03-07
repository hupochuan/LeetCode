
public class Base7_504 {
	public String convertToBase7(int num) {
		StringBuffer re=new StringBuffer();
		int sign=num>=0?1:-1;
		num=Math.abs(num);
		while(num>=0){
			re.append(num%7);
			num=num/7;
		}
		if(sign<0) 
			re.append('-');
		return re.reverse().toString();
		
	}

}
