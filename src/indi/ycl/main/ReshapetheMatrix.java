package indi.ycl.main;

public class ReshapetheMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int[][] matrixReshape(int[][] nums, int r, int c) {
		int oldr=nums.length;
		int oldc=nums[0].length;
		if (nums == null)
			return null;
		if (oldr*oldc != r * c)
			return nums;
		int[][] newmatrix=new int[r][c];
		int m=0,n=0;
		for (int i = 0; i < oldr; i++) {
			for (int j = 0; j < oldc; j++) {
				newmatrix[m][n]=nums[i][j];
				 if(n<c-1){
					 n++;
				 }else{
					 n=0;
					 m++;
				 }
			}
		}
		return newmatrix;
//		更简单的遍历方式
//		 for (int i=0;i<r*c;i++) 
//		        res[i/c][i%c] = nums[i/m][i%m];

	}

}
