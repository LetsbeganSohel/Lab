package com.company;

class Copyconst{
	int age;
	String name;
	 Copyconst(int a , String s){
		 age=a;
		 name=s;
	 }
//	 Copyconst(Copyconst c){
//		 age=c.age;
//		 name=c.name;
//	 }
	 void Show() {
		 System.out.println(age + name );
	 }
	 
	
}

public class Copycontract {

	public static void main(String[] args) {
		Copyconst v= new Copyconst(21, "Sohel");
		Copyconst v1= new Copyconst(20, "Saad");
		v.Show();
		v1.Show();

	}

}
