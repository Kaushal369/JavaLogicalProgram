package com.qa.logical.learning;

import java.util.Random;
import java.util.Scanner;

public class GenerateRandomNumber {

	public static void main(String[] args) {
		
		System.out.println("--------------Print 5 random number from given numbers");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number");
		
		int num = sc.nextInt();
		
		Random d = new Random();
		
		
		for(int count = 1; count<=5;count++)
		{
			System.out.println("The random number between given" + num +" number " + d.nextInt(num));
		}

	}

}
