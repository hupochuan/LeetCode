package indi.ycl.main;

public class IslandPerimeter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] grid={{1}};
		new IslandPerimeter().islandPerimeter(grid);

	}

	public int islandPerimeter(int[][] grid) {
		int peri=0;
		int r=grid.length;int c=grid[0].length;
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				int count=0;
				//计算行方向上边的条数
				if(grid[i][j]==1){
					if(i==0){
						count++;
						if(i+1<r&&grid[i+1][j]==0)
							count++;
						
					}
					if(i==r-1){
						count++;
						if(i-1>=0&&i-1<r&&grid[i-1][j]==0)
							count++;
					}
					if(i!=0&&i!=r-1){
						if(i-1<r&&grid[i-1][j]==0)
							count++;
						if(i+1<r&&grid[i+1][j]==0)
							count++;
						
					}
					
					if(j==0){
						count++;
						if(j+1<c&&grid[i][j+1]==0)
							count++;
						
					}
					if(j==c-1){
						count++;
						if(j-1>=0&&j-1<c&&grid[i][j-1]==0)
							count++;
					}
					if(j!=0&&j!=c-1){
						if(j-1<c&&grid[i][j-1]==0)
							count++;
						if(j+1<c&&grid[i][j+1]==0)
							count++;
						
					}
					
				}
	
				peri+=count;
				
					
			}
			
		}
		return peri;

	}
	public int islandPerimeter1(int[][] grid) {
        int islands = 0, neighbours = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 1) {
                    islands++; // count islands
                    if (i < grid.length - 1 && grid[i + 1][j] == 1) neighbours++; // count down neighbours
                    if (j < grid[i].length - 1 && grid[i][j + 1] == 1) neighbours++; // count right neighbours
                }
            }
        }

        return islands * 4 - neighbours * 2;
    }

}
