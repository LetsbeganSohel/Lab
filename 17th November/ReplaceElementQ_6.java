package Collection.com;
import java.util.*;
public class ReplaceElementQ_6 {
	public static void main(String[] args) {
		LinkedList<String>L1=new LinkedList<>(); // creating arraylist 
		L1.add("Cow"); // adding element in arrayList 
		L1.add("Bull");
		L1.add("Cat");
		L1.add("Dog");
		L1.add("Tiger");
		System.out.println("The linklist is :"+L1); // printing the orginal arraylist 
		System.out.println(L1.set(3, "Lion")); // set "lion" in index at 3 
		System.out.println("After  replace :"+L1); //  printing  the arraylist 
	}

}
