//3 Write a Java program that accepts two integers from the user and then
//prints the sum, the difference, the product, the average, the distance (the
//difference between integer), the maximum (the larger of the two integers), the
//minimum (smaller of the two integers).



package com.company;
import java.util.Scanner;
public class thirdprogram {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("ente your 1st number");
		int a= sc.nextInt();
		
		System.out.println("ente your 2st number");
		int b= sc.nextInt();
	  int sum=a+b;
	  int multi= a*b;
	  int avg=(a+b)/2;
	  int dist=a-b;
	  System.out.println("sum=  "  +sum);
	  System.out.println("multiplication =  " +multi);
	  System.out.println("Distance =  "  +dist);
	  System.out.println("Average = "  +avg);
		

	}

}
