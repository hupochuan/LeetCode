package indi.ycl.easy;

import java.util.ArrayList;
import java.util.List;

public class SelfDividingNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new SelfDividingNumbers().selfDividingNumbers(1, 22));

	}

	public List<Integer> selfDividingNumbers(int left, int right) {
		List<Integer> result=new ArrayList<Integer>();
		for (int i = left; i < right+1; i++) {
			int tmp=i;
			boolean tag=true;
			while(tmp!=0){
				int chushu=tmp%10;
				if(chushu==0||i%chushu!=0){
					tag=false;
					break;
					
				}
				tmp=tmp/10;
				
			}
			if(tag){
				result.add(i);
			}
			
			
		}
		return result;

	}
    
}
