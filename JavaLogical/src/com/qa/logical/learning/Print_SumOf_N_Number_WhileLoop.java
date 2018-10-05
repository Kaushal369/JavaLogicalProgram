package com.qa.logical.learning;

import java.util.Scanner;

public class Print_SumOf_N_Number_WhileLoop {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number !!!");

		int num = sc.nextInt();

		int sum = 0;

		int i = 1;

		while (i <= num) {
			sum = sum + num;
			num--;
		}

		System.out.println(sum);
	}
}
