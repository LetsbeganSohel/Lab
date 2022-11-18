package Collection.com;
import java.util.*;
public class InsertAElementQ_5 {

	public static void main(String[] args) {
		LinkedList<Integer>In= new LinkedList<Integer>();// creating arraylist 
		In.add(23);        //adding element in array list 
		In.add(26);
		In.add(29);
		In.add(31);
		System.out.print("the linklist is :" +In);   // printing this arraylist 
		int i=21;
		In.addFirst(i);
		System.out.println();
		System.out.println(" After Inserting element :"  + In);// adding element in 1st position 

	}

}
