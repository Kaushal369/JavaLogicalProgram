package com.qa.logical.learning;

import java.util.Scanner;

public class Print_1_To_N_Number_doWhileLoop {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number !!!");

		int num = sc.nextInt();

		int count = 1;

		do {
			System.out.println(count);
			count++;
		} while (count <= num);
	}

}
