package com.pranav.linkedlist;

public class LinkedListTest {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		System.out.println(list.toString());
		list.add(1, 0);
		list.add(2, 0);
		list.add(3, 1);
		
		System.out.println(list.toString());
		
		list.add(4, 4);
		System.out.println(list.toString());
		System.out.println(list.size());
		list.remove(3);
		System.out.println(list);
		list.remove(1);
		list.remove(1);
		list.remove(0);
		list.remove(0);
		System.out.println(list.toString());
		list.add(4, 4);
		list.add(6, 7);
		list.add(8, 1);
		System.out.println(list.toString());
		
		System.out.println(list.get(2));
		System.out.println(list.get(-1));
	}
}
