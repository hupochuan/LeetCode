package indi.ycl.medium;

public class FriendCircles_547 {
	public int findCircleNum(int[][] M) {
		if(M.length==0) return 0;
		int ans=0;
		
		for (int i = 0; i < M.length; i++) {
			if(M[i][i]==0) continue;
			ans++;
			dfs(M,i);
		}
		return ans;

	}
	public void dfs(int[][] M,int cur){
		for (int i = 0; i < M.length; i++) {
			if(M[cur][i]==0) continue;
			M[cur][i]=M[i][cur]=0;
			dfs(M,i);
		}
	}

}
