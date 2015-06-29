package com.pranav;

public class BinarySearch {
	
	public static boolean search(int[] arr, int x){
		int l = 0, h = arr.length;
		
		while(l<h){
			int mid = (h+l)/2;
			if(x == arr[mid]){
				return true;
			}else if(arr[mid]>x){
				h=mid;
			}else{
				l=mid+1;
			}
		}
		return false;
		
	}
	
	public static void main(String[] args) {
		System.out.println(search(new int[]{4,6,8}, 4));
	}

}
