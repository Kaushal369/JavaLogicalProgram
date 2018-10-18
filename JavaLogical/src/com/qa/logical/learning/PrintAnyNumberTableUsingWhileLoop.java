package com.qa.logical.learning;

import java.util.Scanner;

import javax.sound.midi.Synthesizer;

public class PrintAnyNumberTableUsingWhileLoop {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter any number !!!");

		int num = sc.nextInt();

		int count = 1;
		if (num >= 0) {

			while (count <= 10) {
				System.out.println(num + "*" + count + " = " + num * count);

				count++;
			}

		} else {
			System.out.println("Please Enter Positive number !!!");

			System.out.println("Enter any number!!! ");

		}

	}

}
