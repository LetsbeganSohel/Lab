package Personal.practice;
import java.io.*;
import java.util.*;

public class ConerFileLineByline {
	public static void main(String[] args) throws FileNotFoundException {
	FileReader f= new FileReader("E:\\C file\\InputOutput\\Bf.txt");
	Scanner sc= new Scanner(f);
	String str;
	//BufferedReader b= new BufferedReader (f);
	//System.out.println("The length of the file is :" +b.length());
	while(sc.hasNext()) {
		str=sc.next();
		System.out.println(str);
	}
}
}
