package com.qa.logical.learning;

import java.util.Scanner;

public class SwapNumberWithout3rdVariable {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the 1st number !!");
		
		int a = sc.nextInt();
		
		System.out.println("Enter the 2nd number !!!");
		
		int b = sc.nextInt();
		
		System.out.println("Before swapping the number !!!" + "a ="+ a +" b ="+ b);
		
		a =a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("Before swapping the number !!!" + "a ="+ a +" b ="+ b);

	}

}
