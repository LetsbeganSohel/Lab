package Private.Ltd;
import java.util.Scanner;
//Question-8
//Write a Java program to find the number of even and odd integers in a given array of integers.
public class EvenAndOddInArray {
	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter the size of the Array");
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i =0; i<n;i++) {
			System.out.println("Enter the" +i +"th"+ "element of the array" );
			arr[i]=sc.nextInt();
			}
		System.out.print("The orginal Array is :"+"   ");
		for(int i=0;i<arr.length;i++) {
			System.out.print("   "+arr[i]);
		}
		System.out.println("");
		System.out.println(" The even number of the array is :");
		for(int j=0;j<arr.length;j++) {
			if(arr[j]%2==0) {
				System.out.print(" "+arr[j]);
			}
			
		}
		System.out.println("");
		System.out.println(" The odd number of the array is :");
		for(int j=0;j<arr.length;j++) {
			if(arr[j]%2!=0) {
				System.out.print(" "+arr[j]);
			}
			
		}
	}

}
