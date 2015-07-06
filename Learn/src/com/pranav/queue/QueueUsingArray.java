package com.pranav.queue;

import java.util.Arrays;

public class QueueUsingArray implements Queue{

	private Integer A[];
	private int head;
	private int length;
	
	public QueueUsingArray(int maxSize) {
		A = new Integer[maxSize];
		head  = 0;
		length = 0;
	}

	@Override
	public int size() {
		return this.length;
		//return (head - tail + A.length) % A.length + 1;
	}
	
	@Override
	public boolean isEmpty() {
		return this.length == 0;
	}

	@Override
	public String toString() {
		return Arrays.toString(this.A);
	}

	@Override
	public void enqueue(int data) {
		if(this.length < this.A.length){
			int i = (this.head + this.length) % this.A.length;
			A[i] = data;
			this.length++;
		}else{
			System.out.println("Max size");
		}
	}

	@Override
	public Integer dequeue() {
		if(!isEmpty()){
			int val = this.A[head];
			this.A[head++] = null;
			this.head %= this.A.length;
			length--;
			return val;
		}else{
			System.out.println("Empty Queue");
			return null;
		}
	}

	@Override
	public Integer peek() {
		if(!isEmpty()){
			return this.A[head];
		}else{
			System.out.println("Empty Queue");
			return null;
		}
	}
}
