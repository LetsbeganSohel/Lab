package com.company;

class Copyconst{
	int age;
	String name;
	 Copyconst(int a , String s){
		 age=a;
		 name=s;
	 }
	 
	 void Show() {
		 System.out.println(age + name );
	 }
	 Copyconst(){}
	 
	
}
public class CopyconstNewWay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Copyconst c1 = new  Copyconst( 20, "Sohel");
		 Copyconst c2= new  Copyconst();
		 c2.age= c1.age;
		 c2.name=c1.name;
		 c1.Show();
		 c2.Show();

	}

}
