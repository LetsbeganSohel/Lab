//Write a Java program to convert minutes into a number of years and
//days.

package com.company;
import java.util.Scanner;
public class SecondProgram {

	public static void main(String[] args) {
	Scanner sc=new Scanner (System.in);
	System.out.println("Enter the number");
	int a =sc.nextInt();
	int b= (a%24)%365;
	int c=(a/24)/365;
	System.out.println("year is =" +c);
	System.out.println("time is " + b);

	}

}
