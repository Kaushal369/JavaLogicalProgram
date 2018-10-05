package com.qa.logical.learning;

import java.util.Scanner;

public class Print_1_To_N_Number {

	public static void main(String[] args) {
	 
		Scanner sc = new Scanner(System.in); 
		
		System.out.println("Enter the number !!!");
		
		int num = sc.nextInt();
		
		for(int i=0;i<=num;i++)
		{
			System.out.println(i);
		}
		
	}

}
