package com.qa.logical.learning;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ToCheckGivenNumberIs_Prefect_or_Not {

	public static void main(String[] args) {
		
		try
		{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number");
		 
		int num = sc.nextInt();
		
		int sum = 0;
		
		for(int i=1;i<num;i++)
		{
			if(num%i==0)
			{
				sum = sum +i;
			}
		}

		if(sum==num)
		{
			 System.out.println("Given number is Perfect");
		}
		else
		{
			 System.out.println("Given number is not Perfect");
		}
	}
	catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
