package com.pranav.sort.impl;

import java.util.Arrays;

import com.pranav.sort.Sort;

public class MergeSort<T extends Comparable<? super T>> implements Sort {
	
	private int[] input;
	private int[] tempArray;
	
	private T[] inputT;
	private T[] tempArrayT;
	
	public T[] sort(T[] inputArray) {
		this.inputT= inputArray;
		return inputArray;
//		this.inputT = inputArray;
//		tempArrayT = new T[inputArray.length];
//		return inputT;
	}
	
	protected  void sortT(int l,int h){
		if(h>l){
			int mid = (l+h)/2;
			sortT(l,mid);
			sortT(mid+1,h);
			mergeT(l,h,mid);
		}
	}
	
	protected  void mergeT(int l, int h, int mid){
		
	}

	public int[] sort(int[] inputArray) {
		this.input = inputArray;
		this.tempArray = new int[inputArray.length];
		sort(0, inputArray.length-1);
		this.input=null;
		this.tempArray=null;
		return this.input;
	}

	void sort(int l, int h){
		if(h > l){
		int mid = (l+h)/2;
		sort(l, mid);
		sort(mid+1, h);
		merge(l, h, mid);
		}
	}
	
	int[] merge(int l, int h, int mid){
		System.out.println("left: "+Arrays.toString(Arrays.copyOfRange(input, l, mid+1))+", right: "+Arrays.toString(Arrays.copyOfRange(input, mid+1, h+1))+" input:"+Arrays.toString(input));
		for(int i=l; i<=h;i++){
			tempArray[i]=input[i];
		}
		int j=mid+1, k=l;
		for(;l<=mid && j<=h;){
			if(tempArray[l] <= tempArray[j]){
				input[k++]=tempArray[l++];
			}else{
				input[k++]=tempArray[j++];
			}
		}
		for(;l<=mid;){
			input[k++]=tempArray[l++];
		}
		for(;j<=h;){
			input[k++]=tempArray[j++];
		}
		System.out.println("result: "+Arrays.toString(input));
		return input;
	}
	public static void main(String[] args) {
		Sort sort = new MergeSort();
		int[] a = {5,2,4,7,8,43,7,8,42,23,15,73,12};
		sort.sort(a);
	}
}
