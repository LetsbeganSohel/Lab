package Collage.com;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Main {
Scanner sc= new Scanner (System.in);
void Login() throws Exception {
	System.out.println("Enter your valid Password");
	int n=sc.nextInt();
	Connection conn=Helper.con();
	Statement stmt=conn.createStatement();
	ResultSet rs=stmt.executeQuery("SELECT * FROM soheldb.cms;");
	if(rs.next()) {
		int pword=rs.getInt("pass_word");
		if(pword==n) {
			System.out.println("This is Your details");
			Addmission();
		}
		else {
			System.out.println("Your data is not found");
		}
	}	
}
void Addmission() throws Exception {
	System.out.println("Enter your 10th marks");
	int A=sc.nextInt();
	System.out.println("Enter your 12th marks");
	int A2=sc.nextInt();
	Connection conn=Helper.con();
		if(A >=70 && A2>=70) {
			System.out.println(" Create you profile ");
			Collectdata.Datacollect();
		}
		else{
			System.out.println(" You are not permissed to crewate your profile");
		}
		conn.close();
}
void Display() throws Exception {
	System.out.println("Enter your valid Password");
	int n=sc.nextInt();
	Connection conn=Helper.con();
	Statement stmt=conn.createStatement();
	ResultSet rs=stmt.executeQuery("SELECT * FROM soheldb.cms;");
	if(rs.next()) {
		int pword=rs.getInt("password");
		if(pword==n) {
			System.out.println("This is Your details");
			while(rs.next()) {
				System.out.println("Student name is :" +rs.getString(2)+"\n"+"10th mark is : "
			+rs.getInt(4)+"\n"+"12th mark is :" +rs.getInt(9)+"\n"+"Phone number is :" 
						+rs.getInt(5)+"Address is :" +rs.getString(6)+"Passing year is :"+rs.getInt(8)
						+"Course is " +rs.getString(7) );
				}
			}
		else {
			System.out.println("Please ! \n Enter a valid  password");
		}
}

		
