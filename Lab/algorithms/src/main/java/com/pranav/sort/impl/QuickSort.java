package com.pranav.sort.impl;

import java.util.Arrays;

import com.pranav.sort.Sort;

public class QuickSort implements Sort {

	public <T extends Comparable<? super T>> void sort(T[] inputArray) {
		// TODO Auto-generated method stub

	}

	public void sort(int[] inputArray) {
		//sort(inputArray, 0,0,inputArray.length-1);
		sort(inputArray, 0, inputArray.length-1);

	}
	
	void swap(int[] input, int x, int y){
		if(x==y)
			return;
		int temp = input[x];
		input[x] = input[y];
		input[y]=temp;
	}
	
	
	public static void main(String[] args) {
		Sort s = new QuickSort();
		int[] x = {5,41,13,22,61,43,23,32,64,35};
		s.sort(x);
		System.out.println("result: "+Arrays.toString(x));
	}
	
	
	public void sort(int[] input, int lo, int hi){
		if(hi>lo){
			int pivot = partition(input, lo, hi);
			sort(input, lo, pivot-1);
			sort(input, pivot+1,hi);
		}
	}
	
	int partition(int[] input, int lo, int hi){
		
		int pivot = getPivot(lo, hi);
		
		int i=lo, j=hi;
		while(true){
			
			while(less(input[i],input[pivot])){
				if(i==hi)break;
				i++;
			}
			while(less(input[pivot],input[j])){
				if(j==lo)break;
				j--;
			}
			if(i>=j)break;
			swap(input, i, j);
		}
		if(j<pivot && i<pivot){
			swap(input, i, pivot);
			System.out.println("-->"+Arrays.toString(input)+" pivot:"+pivot+" i:"+i);
			return i;
		}else if(j>pivot && i > pivot){
			swap(input, j, pivot);
			System.out.println("-->"+Arrays.toString(input)+" pivot:"+pivot+" j:"+j);
			return j;
		}else{
			return pivot;
		}
	}
	
	boolean less(int x, int y){
		return x <= y;
	}
	
	int getPivot(int lo, int hi){
		return lo;
	}

}
