package com.qa.logical.learning;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
	

		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number !!!");
		
		int number = sc.nextInt();
		
		int t1 =0;
		int t2 =1;
		for(int i=1;i<=number;i++)
		{
			System.out.println(t1 + " ");
			
			int sum = t1+t2;
			t1=t2;
			t2=sum;
		}

	}

}
