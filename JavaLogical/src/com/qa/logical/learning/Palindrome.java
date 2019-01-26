package com.qa.logical.learning;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Number !!!");
		
		int num = sc.nextInt();
		int t = num;
		int rev =0;
		
		while(num !=0)
		{
			rev = rev * 10 +(num %10);
			num = num /10;
		}
		
		if(rev == t)
		{
			System.out.println("The Given Number is Palindrome Number !!");
			
		}
		else
		{
			System.out.println("The Given Number is not Palindrome Number !!");
		}
	}

}
