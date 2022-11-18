package Collection.com;
import java.util.*;
public class ExtractQ_3 {

	public static void main(String[] args) {
	ArrayList<String>l1= new ArrayList<String>(); // creating arrayList 
	l1.add("Red");      // adding element in Arraylist
	l1.add("Blue");
	l1.add("Yellow");
	l1.add("Green");
	l1.add("White");
	System.out.print(l1.subList(2, 5)); // featching element as a sub-arraylist

	}

}
