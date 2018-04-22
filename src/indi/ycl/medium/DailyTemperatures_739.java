package indi.ycl.medium;

import java.util.Stack;

public class DailyTemperatures_739 {
	//先来个最笨的方法
	public int[] dailyTemperatures_A(int[] temperatures) {
		int[] re=new int[temperatures.length];
		for (int i = 0; i < re.length; i++) {
			for (int j = i+1; j < re.length; j++) {
				if(temperatures[j]>temperatures[i]){
					re[i]=j-i;
					break;
				}

			}
		}
		return re;

	}
	//有没有更简单的方法 空间换时间？
	public int[] dailyTemperatures_B(int[] temperatures) {
		
		Stack<Integer> s=new Stack<Integer>();
		
		int[] re=new int[temperatures.length];
		
		for (int i = 0; i < temperatures.length; i++) {
		
				while(!s.empty()&&temperatures[s.peek()]<temperatures[i]){
					int idx=s.pop();
					re[idx]=i-idx;
				}
				
				s.push(i);
			
		}
		return re;
	}

}
