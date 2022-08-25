package com.company;
import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your choise");
		int i=sc.nextInt();
		int sum=1;
		for(int j=1;j<=i;j++) {
          sum=sum*j;
		}
		System.out.println(sum);
		
	}

}
