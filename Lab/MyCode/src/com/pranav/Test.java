package com.pranav;



public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x1=10,x2=15;
		Integer x3 = x1^x2;
		System.out.println(x3);
		int x = Integer.toBinaryString(x3).length();
		
		int s = (int)Math.pow(2, x)-1;
		System.out.println(s);
		

	}

}
