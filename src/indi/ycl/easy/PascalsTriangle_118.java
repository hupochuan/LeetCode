package indi.ycl.easy;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle_118 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public List<List<Integer>> generate_A(int numRows) {
		if(numRows==0) return null;
		List<List<Integer>> list=new ArrayList<List<Integer>>();
		List<Integer> row1=new ArrayList<Integer>();row1.add(1);
        list.add(row1);
		
		for (int i = 1; i < numRows; i++) {
			List<Integer> row=new ArrayList<Integer>();
			List<Integer> preR=list.get(i-1);
			for (int j = 0; j<=i; j++) {
				if(j==0||j==i)
					row.add(1);
				else
					row.add(preR.get(j-1)+preR.get(i-1));
			}
		}
		return list;
	}
	
	public List<List<Integer>> generate_B(int numRows) {
		List<List<Integer>> list=new ArrayList<List<Integer>>();
		List<Integer> row=new ArrayList<Integer>();
		for (int i = 0; i < numRows; i++) {
			row.add(0, 1);
			for (int j = 1; j < row.size()-1; j++) {
				row.set(j, row.get(j)+row.get(j+1));
			}
			
			list.add(new ArrayList<Integer>(row));
			
		}
		return list;
	}

}
