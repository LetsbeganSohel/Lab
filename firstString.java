package Private.Ltd;

public class firstString {

	public static void main(String[] args) {
	 String St="Welcome to My new Profile";
	 String st2="Come and sit beside me";
	 System.out.println(St.length());
	 System.out.println(st2.length());
	 System.out.println(St.compareTo(st2));  //return positive number if, St>st1;
	 System.out.println(st2.compareTo(St));  // return negative number if, st1>St;
                                                                             // 0 if St==st1;
	
	System.out.println(St.concat(st2));            // join two string
	System.out.println(St.trim());                      // trim gaps before and after the string;
	System.out.println(st2.toLowerCase());
	System.out.println(St.toUpperCase());
	System.out.println(st2.replace('e','h'));                // replace alphabate
	System.out.println(St.contains("how are you"));  // returns false
	System.out.println(st2.contains("Name"));         // returns false
	System.out.println(st2.contains("me"));     // // returns true 
	String s1="hello"; 
	String s2="hello"; 
	String s3="hi";
	System.out.println(s1.equalsIgnoreCase(s2));   // returns true
	System.out.println(s1.equalsIgnoreCase(s3));   // returns false
	System.out.println(St.toCharArray());  //create string into array;
	char  ch[]=St.toCharArray();
	for(int i=0;i<ch.length;i++) {
		System.out.println(ch[i]);     //change string into array;
	}
	
	}

}
// "==" is address.
//"=" is equal;
// "equal" means checking contain;
//