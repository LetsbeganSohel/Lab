package IO.com;
import java.io.*;
public class Read3lines  {
	    public static void main(String [] args) throws IOException {
	        String line = null;
	        FileReader f= new FileReader("E:\\C file\\InputOutput\\Bf.txt");
	        BufferedReader Br = new BufferedReader(f);
	            int i = 0;
	                while(((line=Br.readLine()) != null) && i < 3) {
	                    System.out.println(line);
	                    i++;
	                }
	                Br.close();        
	        }
	    }
