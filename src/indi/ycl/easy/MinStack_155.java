package indi.ycl.easy;

import java.util.LinkedList;
import java.util.List;

public class MinStack_155 {
	List<Integer> list;
    public MinStack_155() {
        list=new LinkedList<Integer>();
    }

	public void push(int x) {
		list.add(x);
	}

	public void pop() {
		if(!list.isEmpty())
			list.remove(list.size()-1);
	}

	public int top() {
		if(!list.isEmpty())
			return list.get(list.size()-1);
		return 0;
	}

	public int getMin() {
		int min=Integer.MAX_VALUE;
		for (Integer in : list) {
			if(in<min)
				min=in;
		}
		return min;

	}

}
