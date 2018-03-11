package indi.ycl.easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MinimumIndexSumofTwoLists {
	public String[] findRestaurant(String[] list1, String[] list2) {
		List<String> re=new ArrayList<String>();
		int minIndex=Integer.MAX_VALUE;
		for (int i = 0; i < list1.length; i++) {
			for (int j = 0; j < list2.length; j++) {
				if(list1[i].equals(list2[j])){
					if(i+j<minIndex){
						re.clear();
						re.add(list1[i]);
						minIndex=i+j;
					}else if(i+j==minIndex){
						re.add(list1[i]);
					}
				}
					
			}
		}
		
		String[] tmp= new String[re.size()];
		return re.toArray(tmp);

	}
}
