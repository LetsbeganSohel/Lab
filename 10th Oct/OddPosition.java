package Private.Ltd;
import java.util.Scanner;
public class OddPosition {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number of row");
		int n=sc.nextInt();
		int arr[]= new int[n];
		System.out.println("Enter the number of element");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++) {
				if((i+1)%2==0) {
					continue;
			}
			else {
				System.out.print(" The odds are :"+"    "+arr[i]);
			}
			
		}
	}

}
