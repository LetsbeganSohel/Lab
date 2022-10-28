package Company.ExceptionHandling.com;
import java.util.Scanner;
public class AddPositiveNumber {
 private static final String Finally = null;
void addpositive(int a, int b) {                        // passing x and y in this constractor
	try {
		if(a<0 ||b<0) {                                              // checking values 
			System.out.println(" Non-positive");
		}
		else {
			System.out.println(" The sum is :"+ a+b);
		}
	}
	catch(Exception e) {                                             // exception occurs 
		System.out.println(e);
	}
finally {                                                                             // using finally block 
	System.out.println(" This is my programmer");
}
 }
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println(" enter youe choise  as X");                           // taking user input 
		int x= sc.nextInt();
		System.out.println(" enter youe choise  as Y");                        // taking user input 
		int y= sc.nextInt();
		AddPositiveNumber Ap= new AddPositiveNumber();           // creating object 
		Ap.addpositive(x, y);                                                                       // calling method 
	}

}
