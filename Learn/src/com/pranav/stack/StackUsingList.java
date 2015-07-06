package com.pranav.stack;

import com.pranav.linkedlist.LinkedList;

public class StackUsingList implements Stack{

	private LinkedList list;
	
	public StackUsingList() {
		list = new LinkedList();
	}
	
	@Override
	public void push(int data) {
		list.add(data, 0);
	}

	@Override
	public int pop() {
		return list.remove(0);
	}

	@Override
	public int top() {
		return list.get(0);
	}

	@Override
	public int size() {
		return list.size();
	}

	@Override
	public String toString(){
		return list.toString();
	}
}
