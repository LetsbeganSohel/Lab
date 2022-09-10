package com.company;

 class StaticVariable1 {
	 int roll;
	 String name;
	 float fees;
	 static String collage="CIT";
	 StaticVariable1(int a,  String c, float b){
		 this.roll=a;
		 this.fees=b;
		 this.name=c;
		 
	 }
	 void Display() {
		 System.out.println(roll +" " + name +" "+ fees +"  " + collage);
	 }
 
public class StaticVariable {

	public static void main(String[] args) {
		StaticVariable1 s1= new StaticVariable1(22, "Sohel", 50000);
		StaticVariable1 s2= new StaticVariable1(26, "Saad", 43000);
		s1.Display();
		s2.Display();

	}

}
}
