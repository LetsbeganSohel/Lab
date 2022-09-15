//3… Class A serves as a base class for the derived class B, which in turn 
//serves as a base class for the derived class C. (Which type Of Inheritance 
//explain with an example



package com.company;

class A{
	int a;
	int b;
	void add(int a, int b) {
	
	System.out.println(a+b);
	
}
	}
class B extends A{
	void add2(int a, int b) {
		System.out.println(a*b);
	}
}

public class MultiLevelInheritence extends B{

	public static void main(String[] args) {
		MultiLevelInheritence MC= new MultiLevelInheritence();
		MC.add(3,4);
		MC.add2(5,6);

	}

}
