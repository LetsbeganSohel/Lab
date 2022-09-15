//2… In this example, you have a base class Teacher and a sub class ITTeacher. Since 
//class ITTeacher extends the designation and college properties and work () method from 
//base class, we need not to declare these properties and method in sub class.
//Here we have college Name, designation and work () method which are common to all the 
//teachers so we have declared them in the base class, this way the child classes like Math 
//Teacher, Music Teacher and PhysicsTeacher do not need to write this code and can be used 
//directly from base class.



package com.company;


class Teacher{
	String  Designation="Teacher";
		
	 String CollageName="CIT";
		
	String CollageProperties="Teaching";
	
	String Work= "Built Good Enggeener";
}
class ItTeacher extends Teacher{
	void Display() {
		System.out.println("Works properly");
}
}
	
public class Teachers15thSep {

	public static void main(String[] args) {
		ItTeacher It= new ItTeacher(); 
		System.out.println(It.Designation);
		System.out.println(It.CollageName);
		System.out.println(It.CollageProperties);
		System.out.println(It.Work);
		It.Display();
	}

}
