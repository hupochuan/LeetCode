package indi.ycl.easy;

public class FloodFill {
//傻逼了，不用标记矩阵就可以达成目标，增加了标记矩阵我是考虑了要替换的颜色与原来颜色相同的情况，实际上不用
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
    int[][] picture;
    int[][] tag;
    int color;
    int oldColor;
	public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
		if(image==null) return null;
		tag=new int[image.length][image[0].length];
		picture=image;
		color=newColor;
		oldColor=image[sr][sc];
		fill(sr,sc);
		return picture;
	}
	public void fill(int r,int c){
		if(r>=0&&r<picture.length&&c>=0&&c<picture[0].length&&tag[r][c]!=1){
			if(picture[r][c]==oldColor){
				picture[r][c]=color;
				tag[r][c]=1;
				fill(r-1,c);
				fill(r+1,c);
				fill(r,c-1);
				fill(r,c+1);
				
			}
		}
	
	}

}
