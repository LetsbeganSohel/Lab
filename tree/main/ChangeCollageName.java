package com.company;
class ChangeCollageName1 {
	 int roll;
	 String name;
	 float fees;
	  static String collage="CIT";
	 ChangeCollageName1(int a,  String c, float b){
		 this.roll=a;
		 this.fees=b;
		 this.name=c;
		 
	 }
	 void Display() {
		 System.out.println(roll +" " + name +" "+ fees +"  " +collage);
	 }
	 static void Change() {
		 collage="IGNIOU";
	 }

public class ChangeCollageName {

	public static void main(String[] args) {
		ChangeCollageName1 s1= new ChangeCollageName1(22, "Sohel", 50000);
		ChangeCollageName1 s2= new ChangeCollageName1(26, "Saad", 43000);
		s1.Display();
		s2.Display();
		ChangeCollageName1.Change();



	}

}
}