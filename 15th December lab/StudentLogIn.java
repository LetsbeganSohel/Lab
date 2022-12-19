package Collage.com;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class StudentLogIn {
	Scanner sc=new Scanner(System.in);
	void Login() throws Exception {
		System.out.println("Enter your valid Password");
		String n=sc.next();
		Connection conn=Helper.con();
		Statement stmt=conn.createStatement();
		ResultSet rs=stmt.executeQuery("SELECT * FROM soheldb.cms;");
		if(rs.next()) {
			String pword=rs.getString("password");
			if(n.equals(pword)) {
				System.out.println("You Loged in Successfully");
				System.out.println("Enter your choise");
				System.out.println("""
						Press 1 for Update Values :           
						Press 2 for LogOut :
						Press 3 for Addmission:
						""");   
				int val=sc.nextInt();                                                                               
				switch(val) {
				case 1:
					Update();
					break;
				case 2:
					logOut() ;
					break;
				case 3:
					Main.Addmission();
					break;
				default:
						System.out.println("Enter a valid choise");
						break;
				}
			}
			else {
				System.out.println("Your data is not found");
			}
		}	
		
	}
	
	void logOut() throws Exception {
		Helper.main(null);
	}
	void Update() throws Exception {
		Connection conn=Helper.con();
		Statement stmt=conn.createStatement();
		System.out.println("Enter your choise");
		System.out.println("""
				Press 1 for UpdateAddress  :
				Press 2 for Update Phone Number :
	            Press 3 for Update Name   :
	            """);
		int value=sc.nextInt();
	switch(value) {
	case 1:
		System.out.println("Enter Your address");
		String Add=sc.next();
		System.out.println("Enter your Password");
		String n=sc.next();
		stmt.executeUpdate("update soheldb.cms set address='"+ Add  +"' where password="+n);
		System.out.println("Your Address updated successfully");
		break;
	case 2:
		System.out.println("Enter Your Phone Number ");
		String PNo=sc.next();
		System.out.println("Enter your Password");
		String n2=sc.next();
		stmt.executeUpdate("update soheldb.cms set phone='"+ PNo +"' where password="+n2);
		System.out.println("Your Phone Number updated successfully");
		break;
	case 3:
		System.out.println("Enter Your name ");
		String name2=sc.next();
		System.out.println("Enter your Password");
		String  n3=sc.next();
		stmt.executeUpdate("update soheldb.cms set name='"+ name2 +"' where password="+n3);
		System.out.println("Your Name updated successfully");
		break;
		default:
			System.out.println("Enter a valid Choise");
	}		
	}
}
