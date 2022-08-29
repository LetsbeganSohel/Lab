package com.company;

public class Usingmethod {
	int age;
	String name;
	int roll;
	void Input(int a, int b, String c) {
		this.age=a;
		this.name=c;
		this.roll=b;
	}
	void Display() {
		System.out.println(age +" "+ roll+" "+ name);
		
	}
}
 class ClassB{
	public static void main(String[] args) {
		 Usingmethod us=new  Usingmethod();
		 Usingmethod us1=new  Usingmethod();
		 us.Input(15, 4,"Rony");
		 us1.Input(15, 5,"Arun");
		 us.Display();
		 us1.Display();
		 
		 
		
		

	}

}
