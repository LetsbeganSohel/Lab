package Collection.com;
import java.util.*;
public class StoreNumbersQ_2 {
	 ArrayList<Integer> A1= new ArrayList<Integer>(); // creating 2 arrayList 
	 ArrayList<Integer> A2= new ArrayList<Integer>();
public ArrayList<Integer> storeEvenNumber(Integer N) { 
	 for(int i=0;i<N;i++) {
		 if(i%2==0) {                         // checking even 
				A1.add(i);
		 }
	 }
	return A1;
 }
 public ArrayList<Integer> printEvenNumber(){
	 for(int j=0;j<A1.size();j++) {                                // multipling with 2 
		 A2.add(A1.get(j)*2);
	 }
	return A2;
 }
 public Integer retrieveEvenNumber(Integer N) {
	 for(int i=0;i<A1.size();i++) {
		 if(N==A1.get(i)) {
			 return N;
		 }
		
	 }
	return 0; 
 }
 public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println(" Enter your choise");
		Integer N= sc.nextInt();                                           // user choise 
		StoreNumbersQ_2 S= new StoreNumbersQ_2();
		System.out.println(S.storeEvenNumber(N));   //calling function and printing 
		System.out.println(S.printEvenNumber());////calling function and printing 
		System.out.println(S.retrieveEvenNumber(N));//calling function and printing 
	}

}
