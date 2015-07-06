package com.pranav.queue;

public interface Queue {

	void enqueue(int data);
	
	Integer dequeue();
	
	Integer peek();
	
	int size();
	
	boolean isEmpty();
}
