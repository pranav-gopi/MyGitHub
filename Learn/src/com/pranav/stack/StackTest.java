package com.pranav.stack;

public class StackTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Stack s = new StackUsingArray(2);
		Stack s = new StackUsingList(); 
		System.out.println(s);
		System.out.println(s.pop());
		s.push(32);
		s.push(12);
		System.out.println(s);
		s.push(21);
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s);
		s.push(12);
		System.out.println(s);
	}

}
