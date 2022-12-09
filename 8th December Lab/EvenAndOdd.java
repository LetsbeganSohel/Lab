package Practice.com;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class EvenAndOdd {
	static boolean value(int a) {
		if(a%2==0) {
			System.out.println("It is a even-number");
			return true;
		}
		else {
			System.out.println("It is a odd-number");
		return false;
		}
	}
}
 class Number2{
	 @Test
	void even() {
		assertEquals(true,EvenAndOdd.value(20));
	}
	 void odd() {
		 assertEquals(false,EvenAndOdd.value(31));
	 }
}
