package indi.ycl.easy;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class AllPathsFromSourcetoTarget_797 {
	
	public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		helper(graph,0,new ArrayList<Integer>(),list);
		return list;

	}

	public void helper(int[][] graph, int node,List<Integer> path,List<List<Integer>> list) {
		if(node==graph.length-1){
			list.add(new ArrayList<Integer>(path));
			return;
		}
		for (int nextNode : graph[node]) {
			
		}
	}

}
