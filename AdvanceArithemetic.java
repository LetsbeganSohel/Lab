package com.company;
import java.util.Scanner;
public class AdvanceArithemetic {

	public static void main(String[] args) {
		 Scanner sc= new Scanner(System.in);
		  System.out.println("enter your Choise within 1000");
		  int a= sc.nextInt();
		MyCalcilator Mycal=new MyCalcilator();
		 Mycal.Ddivisor_sum(a) ;
		
	}

}

  class MyCalcilator{
	  public void Ddivisor_sum(int a) {
		  int sum=0;
		  if(a<1000) {
			for(int i=1;i<=a;i++) {
				if(a%i==0) {
				sum=sum +i;
			}
			}
		  }
	else {
				System.out.println("Enter a valid choise");
		  }
	  System.out.println(sum);
	  }
	  }
	
	
