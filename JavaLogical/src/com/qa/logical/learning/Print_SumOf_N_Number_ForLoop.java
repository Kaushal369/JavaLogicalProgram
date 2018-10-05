package com.qa.logical.learning;

import java.util.Scanner;

public class Print_SumOf_N_Number_ForLoop {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number !!!");

		int num = sc.nextInt();

		int sum = 0;

		for (int i = 1; i <= num; i++) {
			sum = sum + i;
		}

		System.out.println(sum);
	}
}
