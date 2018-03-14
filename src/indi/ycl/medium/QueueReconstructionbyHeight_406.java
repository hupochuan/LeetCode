package indi.ycl.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class QueueReconstructionbyHeight_406 {
	public int[][] reconstructQueue(int[][] people) {
		if(people==null||people.length==0||people[0].length==0) return new int[0][0];
		Arrays.sort(people, new Comparator<int[]>(){
			public int compare(int[] a,int[] b){ 
				if(a[0]==b[0]) return a[1]-b[1];//按第二元素升序排列；
				return b[0]-a[0];//按第一个元素降序排列
			}
		});
		
		List<int[]> list=new ArrayList<int[]>();
		
		for (int[] is : people) {
			list.add(is[1],is);
		}
		
		for (int i = 0; i < people.length; i++) {
			people[i]=list.get(i);
		}
		
		return people;

	}

}
