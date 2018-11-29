package com.qa.logical.learning;

import java.util.Scanner;

public class TwoToTenNumberTable {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number !!");
	int number = sc.nextInt();
	
	for(int i=2;i<=number;i++)
	{
		for(int j= 1;j<=10;j++)
		{
			System.out.println(i+ " * " + j + " = " + i*j);
			
		}
		
		System.out.println("===============================");
	}
	
	}

}
