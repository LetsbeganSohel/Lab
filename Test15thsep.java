//1… Write the following code:
//1. A class named Arithmetic with a method named add that takes integers as parameters and 
//returns an integer denoting their sum.
//2. A class named Adder that inherits from a superclass named Arithmetic

package com.company;

class Arithmetic{
	int add(int a, int b) {
		return a+b;
	}
}
class Adder extends Arithmetic{
	void Display() {
		System.out.println("Done it");
	}
}

public class Test15thsep {

	public static void main(String[] args) {
		 Arithmetic ad= new  Adder();
		  System.out.println( "the Answer is :"+" " +ad.add(7,3));
//        ad.Display();
	}

}
