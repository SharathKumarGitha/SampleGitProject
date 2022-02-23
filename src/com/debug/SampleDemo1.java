package com.debug;

public class SampleDemo1 {

	public static void main(String[] args) {

		System.out.println("start");

		int a = 5;
		
		
		m1();

		a = a++ + ++a + a++ + a++;

		if (a > 50) {
			System.out.println("valid");
		} else {
			System.out.println("not valid");
		}

		System.out.println("completed.........");
	}
	
	
	public static void m1()
	{
		System.out.println("in m1 method-------------");
		
		int k=10;
		
		k= k++ + ++k + k++ + k++;
		
		
		System.out.println("value is----"+k);
		
		System.out.println("method completed-----");

	}

}
