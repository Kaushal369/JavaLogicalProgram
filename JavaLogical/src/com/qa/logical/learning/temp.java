package com.qa.logical.learning;

import java.util.Scanner;

public class temp {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number !!!");
		do {

			int num = sc.nextInt();

			if (num == -1)
				break;

			if (num % 2 == 0) {
				System.out.println("Given number " + num + " is Even Number !!!");
			} else {
				System.out.println("Given number " + num + " is Odd Number !!!");
			}
		} while (true);
	}

}