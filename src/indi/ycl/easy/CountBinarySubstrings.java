package indi.ycl.easy;

import java.util.ArrayList;
import java.util.List;

public class CountBinarySubstrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new CountBinarySubstrings().countBinarySubstrings("010");

	}
//超时了
	public int countBinarySubstrings(String s) {
		char[] chrs = s.toCharArray();
		int result = 0;
		List<Character> stack = new ArrayList<Character>();
		for (char c : chrs) {

			if (!stack.isEmpty()) {
				int cnt = 1;
				Boolean isequal = true;
				Boolean issame = true;
				int l = stack.size() - 1;
				while (issame) {
					if (l >= 0 && stack.get(l--) == c)
						cnt++;
					else
						issame = false;
				}
				int begin = stack.size() - 2 * cnt + 1;
				int end = begin + cnt - 1;
				if (begin < 0) {
					isequal = false;
				} else {
					for (int i = begin; i <= end; i++) {
						if (stack.get(i) == c)
							isequal = false;
					}
				}
				if (isequal)
					result++;

			}

			stack.add(c);

		}
		
		return result;

	}
	public int countBinarySubstrings1(String s) {
		char[] chrs=s.toCharArray();
		int preLength=0,nowLength=1,res=0;
		for (int i = 1; i < chrs.length; i++) {
			if(chrs[i]==chrs[i-1]) nowLength++;
			else{
				preLength=nowLength;
				nowLength=1;
			}
			if(preLength>=nowLength) res++;
		}
		return res;
		
	}
	

}
