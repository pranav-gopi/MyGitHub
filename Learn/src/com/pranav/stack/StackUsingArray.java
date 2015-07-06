package com.pranav.stack;

import java.util.Arrays;

public class StackUsingArray implements Stack{

	private Integer A[];
	private int length=-1;
	
	public StackUsingArray(int maxSize){
		A = new Integer[maxSize];
	}
	
	public void push(int data){
		if(length < A.length - 1){
			A[++length] = data;
		}else{
			System.out.println("Size limit");
		}
	}
	
	public int pop(){
		if(length >= 0){
			Integer temp = A[length];
			A[length--] = null;
			return temp;
		}else{
			System.out.println("Empty Stack");
			return 0;
		}
	}
	
	public int size(){
		return length+1;
	}
	
	public int top() {
		if(length >= 0){
			return A[length];
		}else{
			System.out.println("Empty Stack");
			return 0;
		}
		
	}
	
	@Override
	public String toString() {
		return Arrays.toString(A);
	}
}
