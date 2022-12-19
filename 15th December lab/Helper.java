package Collage.com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Scanner;

public class Helper {
	static {                               
		 try {
		 	Class.forName("com.mysql.cj.jdbc.Driver");//registering my sql driver
	 }
		 catch(Exception e) {
			 e.printStackTrace();
			 }
		 }
	 public static Connection con() throws Exception{
		 return DriverManager.getConnection("jdbc:mysql://localhost:3306/soheldb","root","Sohel9733@");
		 // give connection 
	 }

	public static void main(String...args) throws Exception { 
		Scanner sc= new Scanner(System.in);
		 Main m1= new  Main();
		 StudentLogIn sl=new StudentLogIn();
		System.out.println("""          
				Press 1 for Login :
				Press 2 for Admission :
				Press 3 for Display Details :
				""");   
		int variable = sc.nextInt();
		System.out.println("-------------------------------");
		switch(variable) {                  // using switch case 
		case 1 :  
			sl.Login();                          // calling methode by the reference 
			break;
		case 2 :
			m1.Addmission();                      // calling methode by the reference 
		break;
		case 3 :
			m1.Display();             //  // calling methode by the reference 
			break;
			default :
				System.out.println("Take valid choise ");
				
		}		
}

	}
