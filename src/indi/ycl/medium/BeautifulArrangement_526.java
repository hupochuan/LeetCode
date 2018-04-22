package indi.ycl.medium;

public class BeautifulArrangement_526 {
	int cnt=0;
	public int countArrangement(int N) {
		int[] tags=new int[N+1];
		helper(tags,1,N);
		return cnt;
	}
	public  void helper(int[] tags,int index,int N){
		for (int i = 0; i < tags.length; i++) {
			if(tags[i]!=1&&(i%index==0||index%i==0)){
				tags[i]=1;
				
				if(index==N+1){
					cnt++;
					return;
				}
				helper(tags,index+1,N);
			    tags[i]=0;
			}
		}
	}

}
