package com.pranav.search.impl;

import static org.junit.Assert.*;

import org.junit.Test;

import com.pranav.search.Search;

public class BinarySearchTest {

	@Test
	public void test() {
		
		Search search = new BinarySearch();
		
		Integer[] array = {2,3,6,8,10,21,24,29,31,36,38,39};
		//A[] array = {new A(1), new A(3), new A(4), new A(12), new A(19)};
		System.out.println(search.search(array, 40));
		
	}
	public static class A implements Comparable<A>{

		int x;
		A(int x){
			this.x = x;
		}
		public int compareTo(A o) {
			return this.x - o.x;
		}
		@Override
		public String toString() {
			return "A [x=" + x + "]";
		}
		
	}
}
