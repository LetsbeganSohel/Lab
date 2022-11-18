package Collection.com;
import java.util.*;
public class Compare2ArrayListQ_4 {

	public static void main(String[] args) {
		ArrayList<Integer>Al= new ArrayList<Integer>();// creating Arraylist 
		Al.add(20);  // adding element in arrayList
		Al.add(21);
		Al.add(24);
		Al.add(25);
		ArrayList<Integer>Al2= new ArrayList<Integer>();// create another Arraylist 
		Al2.add(10);
		Al2.add(21);
		Al2.add(14);
		Al2.add(15);
		for(int i=0;i<Al2.size();i++) {   // featching Array's element 
			if(Al.contains(Al2.get(i))) {  // compare both array's element 
				System.out.println("Yes");
			}
			else {
				System.out.println("No");
			}
		
		}
		}
		
	


}
