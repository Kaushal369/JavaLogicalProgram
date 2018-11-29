package com.qa.logical.learning;

import java.util.Scanner;

public class ThreeLargestNumber {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter three number !!!");
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if(a>b && a>c)
		{
			System.out.println("The Greatest number is: " + a);
		}
		else
			if(b>a && b>c)
			{
				System.out.println("The Greatest number is: " + b);
			}
			else
				if(c>a && c>b)
				{
					System.out.println("The Greatest number is: " + c);
				}
				else
				      System.out.println("The numbers are not distinct.");
	}

}
