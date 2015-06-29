package com.pranav.search;

public interface Search {

	<T extends Comparable<? super T>> boolean search(T[] objectArray, T searchObject);
	
}
