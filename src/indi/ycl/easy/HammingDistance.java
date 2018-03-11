package indi.ycl.easy;

import java.util.ArrayList;
import java.util.List;

public class HammingDistance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new HammingDistance().hammingDistance(1,4));
	}
    public int hammingDistance(int x, int y) {
    	int result=0;
    	List<Integer> list1=GetBits(x);
    	List<Integer> list2=GetBits(y);
    	for (int i = 0; i < 32; i++) {
			if(list1.get(i)!=list2.get(i)){
				result++;
			}
		}
    	
    	
        
        return result;
    }
    public List<Integer> GetBits(int num){
        List<Integer> result=new ArrayList<Integer>();
 
        while(num!=0){
        	
            result.add(num%2);
            num=num/2;
            
        }
        int gap=32-result.size();
        for (int i = 0; i < gap; i++) {
        	result.add(0);
			
		}
        return result;
        
    }

}
//����ⷨ��
//public class Solution {
//    public int hammingDistance(int x, int y) {
//        return Integer.bitCount(x ^ y);
//    }
//}
