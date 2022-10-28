package Company.ExceptionHandling.com;
import java.util.Scanner;
public class ProductOfTwoNumber {

	public static void main(String[] args) {
	Scanner sc=new Scanner (System.in);
	System.out.println(" enter youe choise  as X");                 // taking user input  as X 
	int x= sc.nextInt();
	System.out.println(" enter youe choise  as Y");                     // taking user input  as Y
	int y= sc.nextInt();
	try {
		if(x<0  || y<0) {                                                                            // condition checking within a tryt block
			System.out.println("java.lang.ArithmeticException: x and y should not be zero" );
		}
	}
	catch(ArithmeticException e) {                                                   // for exception 
		System.out.println(e);
	}
	try {
		if(x<0 || y>0) {                                                                              // another condition checking 
			System.out.println("java.lang.ArithmeticException: x and y should not be zero");
		}
	}
	catch(ArithmeticException e) {                                                   // for exception 
		System.out.println(e);
	}
	if(x<0 && y<0) {                                                                             // if all condition satysfied then product will be there 
		System.out.println( " The product  is :  " +x*y);
	}
	}

}
