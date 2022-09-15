//4…Consider a scenario where Bank is a class that provides functionality to get the rate 
//of interest. However, the rate of interest varies according to banks. For example, SBI, 
////ICICI and AXIS banks could provide 8%, 7%, and 9% rate of interest


package com.company;
class Axis extends Bank{
	 void getIntrest(int a) {
		 System.out.println("The intrest of Axis Bank  is :"+a+"%");
	 }
}
class Icici extends Bank{
	 void getIntrest(int a) {
		 System.out.println("The intrest   of Icici Bank is:"+a+"%");
	 }
}
class Sbi extends Bank{
	 void getIntrest(int a) {
		 System.out.println("The intrest  nof Sbi Bank is :" +a+"%");
	 }
}
public class Bank {

	public static void main(String[] args) {
		Axis a= new Axis();
		Icici i= new Icici();
		Sbi s= new Sbi();
		a.getIntrest(8);
		i.getIntrest(7);
		s.getIntrest(9);

	}

}
