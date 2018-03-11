package indi.ycl.easy;

public class JudgeRouteCircle657 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new JudgeRouteCircle657().judgeCircle("LL"));

	}

	public boolean judgeCircle(String moves) {
		int x=0,y=0;
		char[] command=moves.toCharArray();
		for (int i = 0; i < command.length; i++) {
			
			if(command[i]=='L'){
				x++;
				
			}else if(command[i]=='R'){
				x--;
				
			}else if(command[i]=='U'){
				y++;
				
			}else if(command[i]=='D'){
				y--;
				
			}else{
				return false;
			}
		}
		if(x==0&&y==0){
			return true;
			
		}else{
			return false;
		}

	}

}
