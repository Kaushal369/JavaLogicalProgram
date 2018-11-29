package com.qa.logical.learning;

import java.util.Scanner;

public class OneToN_Number_Perfect_number {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to findout perfect number !!!");
		int number = sc.nextInt();
		for (int i = 2; i < number; i++) {
			if (isPerfectNumber(i)) {
				System.out.println("The perfect number between " + i);
			}
		}
	}

	public static boolean isPerfectNumber(int number) {
		int sum = 1;

		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				sum += i;
			}
		}
		return sum == number;
	}
}
