//Problem 4. 
//a Java program to find all pairs of elements in an array whose sum is 
//equal to a specified number

package Private.Ltd;
import java.util.Scanner;
public class PairSumInArray {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the size of the array minimum 6 ");
		int n= sc.nextInt();
        int arr[]= new int[n];
        System.out.println("Enter the Element of array ");
        for(int i=0;i<n;i++) {
        	arr[i]=sc.nextInt();
        	}
        for(int i=0;i<n;i++) {
        	for(int j=i+1;j<n;j++) {
        		for(int k=j+1;k<n;k++ ) {
        			if(arr[i]==(arr[j]+arr[k])) {
        				System.out.println(arr[i]+"= "+arr[j]+"+ "+arr[k]);
        				}
        		}
        	}	
        }
	}
}
