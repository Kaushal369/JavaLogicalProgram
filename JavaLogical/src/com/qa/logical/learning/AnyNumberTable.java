package com.qa.logical.learning;
import java.util.Scanner;
public class AnyNumberTable {
  	public static void main(String[] args) {
 		Scanner sc = new Scanner(System.in);
 		System.out.println("Enter any number!!!");
 		int num = sc.nextInt();
 		if(num>0)
		{
			for(int i=1;i<=10;i++)
			{
				System.out.println(num+"*"+i+"="+num*i);
			}
		}
  		else
		{
			System.out.println("Please Enter Positive number !!!");
	 		System.out.println("Enter any number!!! ");
		}
	}
 }
//this is logical program created by kaushal
