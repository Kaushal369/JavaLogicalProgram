package com.qa.logical.learning;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number !!");
		
		int num = sc.nextInt();
		
		int i ;
		
		if(num ==  0)
		{
			System.out.println("Prime number start from number 2");
		}
		
		for(i = 2;i<num;i++)
		{
			if(num % i ==0)
			{
				System.out.println("The Given Number not prime Number !!!");
				break;
			}
		}
		if(num == i)
		{
			System.out.println("The given number is prime number !!");
		}
	}

}
