package com.qa.logical.learning;

import java.util.Scanner;

public class FactorialNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number !!!");
		int number =sc.nextInt();
		int fact = 1;
		
		for(int i =1;i<=number;i++)
		{
			fact =fact*i;
		}
		
		System.out.println("The Give number factorial:- " + fact);
	}

}
