package com.qa.logical.learning;

import java.util.Scanner;

public class ToCheckNumberEvenOrOddUseDoWhile {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number !!!");
 			int num = sc.nextInt();
 			
 			while(num!=-1)
 			{
 			if (num % 2 == 0) {
				System.out.println("Given number " + num + " is Even Number !!!");
			} else {
				System.out.println("Given number " + num + " is Odd Number !!!");
			}
 			System.out.println("Enter the number !!!");
 			num = sc.nextInt();
		} 
 			
	}
}
