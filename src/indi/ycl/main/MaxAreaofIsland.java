package indi.ycl.main;

public class MaxAreaofIsland {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] tmp={{1,1,0,0,0},{1,1,0,0,0},{0,0,0,1,1},{0,0,0,1,1}};
		new MaxAreaofIsland().maxAreaOfIsland(tmp);

	}

	public int maxAreaOfIsland(int[][] grid) {
		int max=0;
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[0].length; j++) {
				if(grid[i][j]==1){
					max=Math.max(max,getArea(grid,i,j) );
				}
			}
		}
		return max;
		

	}
	public int getArea(int[][] grid,int i,int j){
		if(i>=0&&i<grid.length&&j>=0&&j<grid[0].length&&grid[i][j]==1){
				grid[i][j]=0;
				return 1+getArea(grid,i+1,j)+getArea(grid,i-1,j)+getArea(grid,i,j+1)+getArea(grid,i,j-1);
		}
		return 0;
		
	}

}
