package Private.Ltd;
import java.util.Scanner;
public class Specificvalue {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number of row");
		int n=sc.nextInt();
		int arr[]= new int[n];
		System.out.println("Enter the number of element");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("enter your choise");
		int val= sc.nextInt();
		for(int i=0;i<n;i++) {
			if(val==arr[i]) {
				System.out.println("yes   " + val +  " is present");
			}
		}
		for(int i=0;i<n;i++) {
			System.out.print(" "+arr[i]);
		}
	}

}
