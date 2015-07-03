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
	
	public void insert(int data, int pos){
		int curPos = 0;
		Node curNode = head, temp = null;
		while(curPos<pos){
			curPos ++;
			temp = curNode;
			curNode = curNode.next;
		}
		
		Node newNode = new Node();
		newNode.data = data;
		newNode.next = curNode;
		
		if(pos == 0){
			head = newNode;
		}else{
			temp.next = newNode;
		}
		
	}
	
	public int remove(int pos){
		int val = 0;
		if(head == null){
			return val;
		}else if(pos == 0){
			val = head.data;
			head = head.next;
		}else{
			
			int curPos = 1;
			Node curNode = head;
			
			while(curPos < pos && curNode != null){
				curPos ++;
				curNode = curNode.next;
			}
			if(curNode != null){
				Node toRemove = curNode.next;
				if(toRemove != null){
					val = toRemove.data;
					curNode.next = toRemove.next;
				}
			}
		}
		return val;
	}
	
	
	public String toString(){
		StringBuffer buffer = new StringBuffer();
		buffer.append("[ ");
		Node node = head;
		while(true){
			buffer.append(node.data);
			node = node.next;
			if(node != null){
				buffer.append(", ");
			}else{
				break;
			}
		}
		buffer.append(" ]");
		return buffer.toString();
	}
	
	
	class Node{
		int data;
		Node next;
		
	}
	

}

