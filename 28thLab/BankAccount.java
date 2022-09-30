//Problem 2. 
//Banking Operations reate a class with customer private instance 
//variables as accountNumber,accountName,accountBalance and 
//create methods as
//1. create account => accnumber,accname,accbal
//2. setAmount=> add amount to accbal
//3. getAmount=>print accbal and name account
//4. withDrawAmount()=to withdraw amount from accBalance
//create a main class to use customer and create atleast two 
//customers

package Private.Ltd;
class Coustomer{
	private int accNum;
	private String accName;
	private double accBal;
	void createAccount(int accNum,String accName,double accBal) {
		
	}
	void setAmount(double accBal,int addamo) {
		System.out.println("Your account Balance is :" +"  "+ (accBal+addamo));	
	}
	void getAmount(double accBal,String accName) {
		System.out.println(accName +"  "+  "Your Account Balance is :"+"  "+accBal);
	}
	void withdraw(double accBal, int withdraw) {
		System.out.println("Your Withdreawl amount is :" +"  " +withdraw);
		System.out.println("Your Balance amount is :"+"  " +(accBal -withdraw));
	}
}
public class BankAccount {

	public static void main(String[] args) {
		 Coustomer Cu= new  Coustomer();
		 Cu.createAccount(4376543, "Sajid Hossain", 45342.75);
		 Cu.setAmount(45342.75, 5000);
		 Cu.getAmount(45342.75, "Sajid Hossain");
		 Cu.withdraw(45342.75, 10000);
		 Coustomer Cu2= new  Coustomer();
		 Cu2.createAccount(76542323, "Ritoban Chakraborty", 10034.75);
		 Cu2.setAmount(10034.75, 5000);
		 Cu2.getAmount(10034.75, "Ritoban Chakraborty");
		 Cu2.withdraw(10034.75, 10000);


	}

}
