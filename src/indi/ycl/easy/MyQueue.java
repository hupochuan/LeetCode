package indi.ycl.easy;

import java.util.Stack;

public class MyQueue {
	Stack<Integer> queue=new Stack<Integer>();

	public MyQueue() {
		

	}

	/** Push element x to the back of queue. */
	public void push(int x) {
		Stack<Integer> tmp=new Stack<Integer>();
		while(!queue.empty())
			tmp.add(queue.pop());
		queue.add(x);
		while(!tmp.empty()){
			queue.add(tmp.pop());
		}
	}

	/** Removes the element from in front of queue and returns that element. */
	public int pop() {
		return queue.pop();

	}

	/** Get the front element. */
	public int peek() {
		return queue.peek();

	}

	/** Returns whether the queue is empty. */
	public boolean empty() {
		return queue.empty();
	}

}
