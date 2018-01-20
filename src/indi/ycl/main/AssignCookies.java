package indi.ycl.main;

import java.util.Arrays;

public class AssignCookies {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int findContentChildren(int[] g, int[] s) {
		Arrays.sort(g);
		Arrays.sort(s);
	    int cnt=0;
	    int begin=0;
	    for (int i = 0; i < g.length; i++) {
	    	
			for (int j = begin; j < s.length; j++) {
				if(g[i]<=s[j]){
					cnt++;
					begin=j+1;
					break;
				}
			}
			if(begin>=s.length)
				return cnt;
		}
	    return cnt;

	}

}
