package com.pranav.linkedlist;

public class LinkedList {
	
	
	private Node head;
	
	public int size(){
		int length = 0;
		Node curNode = head;
		while(curNode!=null){
			length++;
			curNode = curNode.next;
		}
		return length;
	}
	
	public void insert(int data){
		Node newNode = new Node();
		newNode.data = data;
		newNode.next = head;
		head = newNode;
	}
	
	public int remove(int pos){
		if(head == null){
			return 0;
		}else{
			int i = 0;
			Node node = head;
			return 0;
		}
	}
	
	
	class Node{
		
		public int data;
		public Node next;
		
	}
	

}

