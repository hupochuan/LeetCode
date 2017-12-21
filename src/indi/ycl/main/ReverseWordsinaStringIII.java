package indi.ycl.main;

public class ReverseWordsinaStringIII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println(new ReverseWordsinaStringIII().reverseWords(" Let's take LeetCode  contest "));
	}

	public String reverseWords(String s) {
		char[] result=s.toCharArray();
		int i=0;
		int l=s.length();
		
		while(i<l){
			if(result[i]==' '){
				
				i++;
				
			}else{
				int kongge=s.indexOf(" ",i)==-1?l-1:s.indexOf(" ",i)-1;
				int mid=(kongge-i)/2;
				//有reverse函数
				//字符串reverse简单方法：new StringBuilder(hi).reverse().toString()
				
				for (int j = 0; j <=mid ; j++) {
					char tmp=result[i+j];
					result[i+j]=result[kongge-j];
					result[kongge-j]=tmp;
					
				}
				i=kongge+1;
				
				
			}
		}
		
		return String.valueOf(result);

	}

}
