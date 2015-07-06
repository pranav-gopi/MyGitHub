package com.pranav.queue;

import com.pranav.linkedlist.LinkedList;

public class QueueUsingList implements Queue{

	private LinkedList list;
	
	public QueueUsingList() {
		list = new LinkedList();
	}
	
	@Override
	public void enqueue(int data) {
		list.add(data, Integer.MAX_VALUE);
	}

	@Override
	public Integer dequeue() {
		return list.remove(0);
	}

	@Override
	public Integer peek() {
		return list.get(0);
	}

	@Override
	public int size() {
		return list.size();
	}

	@Override
	public boolean isEmpty() {
		return list.size() == 0;
	}
	
	@Override
	public String toString() {
		return list.toString();
	}
}
