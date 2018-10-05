package com.qa.logical.learning;

import java.util.Scanner;

public class Print_ReverseNumber_ForLoop {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number !!!");

		int num = sc.nextInt();

		for (int i = num; i >= 1; i--) {
			System.out.println(i);
		}

	}

}
