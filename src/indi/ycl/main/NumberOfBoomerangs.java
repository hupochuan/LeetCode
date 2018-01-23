package indi.ycl.main;

import java.util.HashMap;
import java.util.Map;

public class NumberOfBoomerangs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
    //有几个问题：1.map的使用；2.注意题意
	public int numberOfBoomerangs(int[][] points) {
	       int re=0;
			Map<Integer,Integer> map=new HashMap<Integer, Integer>();
			for (int i = 0; i < points.length; i++) {
				for (int j = 0; j < points.length; j++) {
					if(i==j) continue;
					int dis=getDistance(points[i], points[j]);
					map.put(dis, map.getOrDefault(dis,0)+1);
					
				}
	            for (int val : map.values()) {
	                re+=val*(val-1);
	            }
	            map.clear();
			}
			
			
			return re;

		}
		public int getDistance(int[] point1,int[] point2){
			int dx=point1[0]-point2[0];
			int dy=point1[1]-point2[1];
			
			return dx*dx+dy*dy;
		
		}
	

}
