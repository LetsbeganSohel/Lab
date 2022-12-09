package Com.Bms.Main;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Collection;
import java.util.Scanner;

import Com.Bms.Helper;
import Com.Bms.Bms_loader.Bms_lodear;
import Com.Bms.*;
// to get data 
public class BMS_main {
	Scanner sc= new Scanner(System.in);
	long account_no;
	int pin;
	double balance;
	String account_holdername,ifsc_code,branch;
	
	// inserting Data
	public void inseret_data () throws Exception {
	System.out.println("Enter account_no");
	long account_no=sc.nextLong();
	System.out.println("Enter account_holdername");
	String account_holdername=sc.next();
	System.out.println("Enter Ifsc code");
	String ifsc_code=sc.next();
	System.out.println("enter branch name");
	String branch = sc.next();
	System.out.println("Enter your ammount");
	double balance=sc.nextDouble();
	System.out.println("Enter pin");
	int pin=sc.nextInt();
	Connection conn = Helper.con();
	PreparedStatement stmt=conn.prepareStatement("insert into soheldb.Bms values(?,?,?,?,?,?)");
	stmt.setLong(1, account_no);
	stmt.setString(2, account_holdername);
	stmt.setString(3,ifsc_code);
	stmt.setString(4,branch);
	stmt.setDouble(5,balance);
	stmt.setInt(6, pin);
	stmt.executeUpdate();
	//ResultSet rs=stmt.executeQuery("SELECT * FROM soheldb.bms;");
	System.out.println("Your account is created ");
	 conn.close();
}
	// Withdraw Amount
	
	 public void Withdrawl() throws Exception {
		 System.out.println("Enter ammount you want");
		 double bal=sc.nextDouble();
		 System.out.println("enter your pin");
		 int upin=sc.nextInt();
		 Connection conn=Helper.con();
		 Statement stmt=conn.createStatement();
		 ResultSet rs=stmt.executeQuery("select *from soheldb.bms where pin="+upin);
		 while(rs.next()) {
			 double Tbal=rs.getDouble("balance");
			 if(bal>Tbal || rs.getInt("pin")!=upin) {
				 System.out.println("You have  fatching some issue " );
				 }
			 else {
				System.out.println("You are withdrawing " +bal);
				Tbal=Tbal-bal;
				 System.out.println(" Your account balance is " + Tbal);
		 }
	 }
	 }
	 
	  // Diposite Amount
	 public void Deposit() throws Exception {
		 Connection conn=Helper.con();
		 Statement stmt=conn.createStatement();
		 System.out.println("Enter your account_number");
		 long Acc=sc.nextLong();
		 ResultSet rs=stmt.executeQuery("select *from soheldb.bms where account_no="+Acc);
		 while(rs.next()) {
				long acc=rs.getLong("account_no");
				if(acc== Acc) {
					 System.out.println("Enter Your ammount");
						double val = sc.nextDouble();
					double dip=rs.getDouble("balance");
					System.out.println("Your current balance is : " +(dip+val));
				}
				else {
					System.out.println("Choose correct account number");
				}
			 
	 }
	 }
	 // Close Account
	 public void CloseAccount() throws Exception {
		 Connection conn=Helper.con();
		 Statement stmt=conn.createStatement();
		 System.out.println("Enter your account_number");
		 long Acc=sc.nextLong();
		 ResultSet rs=stmt.executeQuery("SELECT * FROM soheldb.bms;");
		 if(rs.next()) {
			 long acc=rs.getLong("account_no");
			 if(acc==Acc) {
				 stmt.executeUpdate("delete from soheldb.bms where account_no="+account_no);
				 System.out.println("Your account is deleted");
			 }
				 else {
					 System.out.println("Sorry! \n  try again");
					 }
				 }
		 conn.close();
	 }
	 
	 
	 
	 // Showing Balance 
	 public void Display_details() throws Exception {
		 Connection conn=Helper.con();
		 Statement stmt=conn.createStatement();
		 System.out.println("Enter your account_number");
		 long Acc=sc.nextLong();
		 ResultSet rs=stmt.executeQuery("select *from soheldb.bms where account_no="+Acc);
		 while(rs.next()) {
			 long acc=rs.getLong("account_no");
			 if(acc==Acc) {
				 Bms_lodear.FetchData(acc);
				 }
			 else {
				 System.out.println("Enter correct Account number!!\nPlease try again");
				 inseret_data () ;
			 }
		 }
	 }

	 
	 
// creating Account 
public void Create_account() throws Exception {
	 Connection conn=Helper.con();
	 Statement stmt=conn.createStatement();
	 System.out.println("Enter your account_number");
	 long Acc=sc.nextLong();
	 ResultSet rs=stmt.executeQuery("SELECT * FROM soheldb.bms;");
	 while(rs.next()) {
		 long acc=rs.getLong("account_no");
		 if(acc==Acc) {
			 Bms_lodear.FetchData(Acc);
			 break;
			 }
		 else {
				 System.out.println("Create your account");
				 inseret_data ();
				 }	
}
	 conn.close();
}
}

