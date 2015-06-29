package com.pranav.search.impl;

import java.util.Arrays;

import com.pranav.search.Search;

public class BinarySearch implements Search {

	public <T extends Comparable<? super T>> boolean search(T[] objectArray, T searchObject) {
		return search(objectArray, searchObject, 0, objectArray.length-1);
	}

	protected <T extends Comparable<? super T>> boolean search(T[] objectArray, T searchObject, int leftIndex, int rightIndex){
		System.out.println(Arrays.toString(objectArray) + "--search:" + searchObject+" l:"+leftIndex+" r:"+rightIndex);
		if(rightIndex<leftIndex){
			return false;
		}
		int mid = (leftIndex + rightIndex) / 2;
		int comparisnResult = objectArray[mid].compareTo(searchObject);
		System.out.println("mid: "+mid+" com: "+comparisnResult);
		if(comparisnResult == 0){
			System.out.println(1);
			return true;
		}else if(comparisnResult>0){
			System.out.println(2);
			return search(objectArray, searchObject, leftIndex, mid-1);
		}else{
			System.out.println(3);
			return search(objectArray, searchObject, mid+1, rightIndex);
		}
	}


}
