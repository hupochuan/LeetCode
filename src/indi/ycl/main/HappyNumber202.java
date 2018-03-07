package indi.ycl.main;
import java.util.HashSet;
import java.util.Set;

public class HappyNumber202 {
	public boolean isHappy(int n) {
		Set<Integer> set=new HashSet<Integer>();
		int sum=0,num;
		while(set.add(n)){
			sum=0;
			while(n>0){
				num=n%10;
				sum+=num*num;
				n/=10;	
			}
			if(sum==1)
				return true;
			else
				n=sum;	
		}		
        return false;
	}
	

}
