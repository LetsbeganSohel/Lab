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
		long p_no=sc.nextLong();
		System.out.println("Your 10th percentage  in integer value");
		float m_marks=sc.nextFloat();
		System.out.println("Enter your 12Th class marks");
		float h_marks=sc.nextFloat();
		System.out.println("Enter your passing year");
		int p_year=sc.nextInt();
		System.out.println("Enter your valid Password, password should less or equal 6 , and should carry alphabates also");
		String n=sc.next();
		System.out.println("Enter the name of course you want to admitted");
		String cour=sc.next();
		PreparedStatement stmt=conn.prepareStatement("insert into soheldb.cms values(?,?,?,?,?,?,?,?,?)");
		int id=stmt.executeUpdate("update soheldb.cms set id=floor(100000+RAND()*(999999-100000+1));");
		stmt.setInt(1, id);
		stmt.setString(2, s);
		stmt.setString(3,n);
		stmt.setFloat(4,m_marks);
		stmt.setLong(5, p_no); 
		stmt.setString(6,add);
		stmt.setString(7,cour);
		stmt.setInt(8,p_year);
		stmt.setFloat(9, h_marks);
		stmt.executeUpdate("update soheldb.cms set id=floor(100000+RAND()*(999999-100000+1))");
		stmt.execute();
		System.out.println("Your data is stored suceccfully");
		conn.close();
		}
}
