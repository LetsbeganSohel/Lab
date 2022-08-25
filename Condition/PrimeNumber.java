package com.company;
import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your choise");
		int a=sc.nextInt();
		for(int i=2;i<=a;i++) {
			if(a%i==0) {
				System.out.println("It is not a Prime Number"  +a);
				break;
			}
			else {
				System.out.println("It is  a Prime Number" +a);
				break;
				
			}
		}
		
		

	}

}
