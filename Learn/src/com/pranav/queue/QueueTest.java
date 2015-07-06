package com.pranav.queue;

public class QueueTest {

	public static void main(String[] args) {
		//Queue q = new QueueUsingArray(3);
		Queue q = new QueueUsingList();
		//Empty
		System.out.println(q.size());
		System.out.println(q.isEmpty());
		System.out.println(q.peek());
		System.out.println(q.dequeue());
		System.out.println(q);
		
		q.enqueue(2);
		System.out.println(q.size());
		System.out.println(q.isEmpty());
		System.out.println(q.peek());
		System.out.println(q.dequeue());
		System.out.println(q);
		
		q.enqueue(3);
		q.enqueue(1);
		System.out.println(q);
		System.out.println(q.dequeue());
		System.out.println(q);
		
		q.enqueue(12);
		System.out.println(q);
		
		q.enqueue(22);
		System.out.println(q);
		
		q.enqueue(223);
		System.out.println(q);
		
		System.out.println(q.dequeue());
		System.out.println(q);
		

		System.out.println(q.dequeue());
		System.out.println(q);
		
		System.out.println(q.dequeue());
		System.out.println(q);
		
		
		System.out.println(q.dequeue());
		System.out.println(q);
		
		System.out.println(q.dequeue());
		System.out.println(q);
		
		
		
	}
}
