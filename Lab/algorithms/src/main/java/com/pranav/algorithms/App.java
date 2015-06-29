package com.pranav.algorithms;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;

import sun.reflect.generics.tree.Tree;

import com.sun.org.apache.xalan.internal.xsltc.dom.MultiValuedNodeHeapIterator.HeapNode;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        /*System.out.printf("\n%80S\n", "Welcome To Algorithms" );
        int [] a = {1,2,3,4,5,6,7,8,9,10};
        int x=11;
        System.out.println(bSearch(a, x));*/
        
        Queue<Integer> q = new PriorityQueue<Integer>();
        System.out.println(q.size());
        q.add(2);
        q.add(5);
        q.add(7);
        q.add(3);
        q.add(1);
        
        System.out.println(q.toString());
        System.out.println(q.poll());
        System.out.println(q.toString());
        
        List q1= new ArrayList();
        Set<Integer> set = new HashSet<Integer>();
        Queue q12 = new PriorityQueue();
        Stack s = new Stack();
        Iterable aq = new Queue() {

			public int size() {
				// TODO Auto-generated method stub
				return 0;
			}

			public boolean isEmpty() {
				// TODO Auto-generated method stub
				return false;
			}

			public boolean contains(Object o) {
				// TODO Auto-generated method stub
				return false;
			}

			public Iterator iterator() {
				// TODO Auto-generated method stub
				return null;
			}

			public Object[] toArray() {
				// TODO Auto-generated method stub
				return null;
			}

			public Object[] toArray(Object[] a) {
				// TODO Auto-generated method stub
				return null;
			}

			public boolean remove(Object o) {
				// TODO Auto-generated method stub
				return false;
			}

			public boolean containsAll(Collection c) {
				// TODO Auto-generated method stub
				return false;
			}

			public boolean addAll(Collection c) {
				// TODO Auto-generated method stub
				return false;
			}

			public boolean removeAll(Collection c) {
				// TODO Auto-generated method stub
				return false;
			}

			public boolean retainAll(Collection c) {
				// TODO Auto-generated method stub
				return false;
			}

			public void clear() {
				// TODO Auto-generated method stub
				
			}

			public boolean add(Object e) {
				// TODO Auto-generated method stub
				return false;
			}

			public boolean offer(Object e) {
				// TODO Auto-generated method stub
				return false;
			}

			public Object remove() {
				// TODO Auto-generated method stub
				return null;
			}

			public Object poll() {
				// TODO Auto-generated method stub
				return null;
			}

			public Object element() {
				// TODO Auto-generated method stub
				return null;
			}

			public Object peek() {
				// TODO Auto-generated method stub
				return null;
			}
		};
        
    }
    
    class A implements Iterable<Integer>{

		public Iterator<Integer> iterator() {
			// TODO Auto-generated method stub
			Iterator<Integer> it = new Iterator<Integer>() {
				
				public void remove() {
					// TODO Auto-generated method stub
					
				}
				
				public Integer next() {
					// TODO Auto-generated method stub
					return null;
				}
				
				public boolean hasNext() {
					// TODO Auto-generated method stub
					return false;
				}
			};
			return null;
		}
    	
    }
    static int bSearch(int[] array, int x){
    	int l=0, h=array.length-1;
    	int mid=-1;
    	int cnt = 0;
    	while(h>=l){
    		++cnt;
    		mid = (l+h)/2;
    		if(array[mid] == x){
    			System.out.println("cnt:"+cnt);
    			return mid;
    		}else if(array[mid] > x){
    			h=mid-1;
    		}else{
    			l=mid+1;
    		}
    	}
    	System.out.println("cnt:"+cnt);
    	return -1;
    }
    
    
    
    
}
