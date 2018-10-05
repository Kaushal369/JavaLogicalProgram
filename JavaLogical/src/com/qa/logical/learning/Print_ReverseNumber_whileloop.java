package com.qa.logical.learning;

import java.util.Scanner;

public class Print_ReverseNumber_whileloop {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number !!!");

		int num = sc.nextInt();

		while (num != 0) {
			System.out.println(num);
			num--;
		}

	}

}
