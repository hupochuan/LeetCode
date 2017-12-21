package indi.ycl.main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BaseballGame {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] ops={"5","2","C","D","+"};
		new BaseballGame().calPoints(ops);

	}
    //栈操作 还有更简单的函数 removeLast()和 peekLast()
	public int calPoints(String[] ops) {
		int result=0;
		List<Integer> score=new ArrayList<Integer>();
		for (int i = 0; i < ops.length; i++) {
			String point=ops[i];
			if(point.equals("C")){
				result-=score.get(score.size()-1);
				score.remove(score.size()-1);
				
			}else if(point.equals("+")){	
				result+=score.get(score.size()-1)+score.get(score.size()-2);
				score.add(score.get(score.size()-1)+score.get(score.size()-2));
			
			}else if(point.equals("D")){
				result+=score.get(score.size()-1)*2;
				score.add(score.get(score.size()-1)*2);
				
			}else{	
				result+=Integer.valueOf(point);
				score.add(Integer.valueOf(point));
			
			
			}
		
		}
		
		return result;

	}

}
