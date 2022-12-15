package Collage.com;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Collectdata {
	static Scanner sc= new Scanner(System.in);
	public  static void Datacollect() throws Exception {
		Connection conn=Helper.con();
		System.out.println("Enter Your name");
		String s=sc.next();
		System.out.println("Enter your address");
		String add=sc.next();
		System.out.println("Enter your phone number ");
		int p_no=sc.nextInt();
		System.out.println("Your 10th percentage  in integer value");
		int  m_marks=sc.nextInt();
		System.out.println("Enter your 12Th class marks");
		int h_marks=sc.nextInt();
		System.out.println("Enter your passing year");
		int p_year=sc.nextInt();
		System.out.println("Enter your valid Password, password should less or equal 6 , and should carry alphabates also");
		int n=sc.nextInt();
		System.out.println("Enter the name oif course you want to admitted");
		String cour=sc.next();
		PreparedStatement stmt=conn.prepareStatement("insert into CMS values(?,?,?,?,?,?,?);");
		stmt.setInt(2,n);
		stmt.setInt(3,m_marks);
		stmt.setInt(4, p_no);
		stmt.setString(5,add);
		stmt.setString(6,cour);
		stmt.setInt(7,p_year);
		stmt.setInt(8, h_marks);
		stmt.executeUpdate();
		conn.close();
		}
}
