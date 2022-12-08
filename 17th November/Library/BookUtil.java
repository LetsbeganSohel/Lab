package Library.com;

import java.util.Scanner;

public class BookUtil {
	public static void main(String[] args){									
        BookStore obj = new BookStore();	                // creating object							
        Scanner s  = new Scanner(System.in);			// taking user input					



        for(int i=1; i<=3; i++) {									
          

            System.out.println("For book-"+i);
            System.out.println("\n Enter bookID:");
            Scanner a = new Scanner(System.in);								//instantiating scanner object
            String bookID = a.nextLine();									//taking input for Bookid

            System.out.println("Enter title:");
            Scanner b  = new Scanner(System.in);	   // taking bookTitle							
            String title = b.nextLine();									

            System.out.println("Enter author:");
            Scanner c  = new Scanner(System.in);// taking bookAuthor name								
            String author = c.nextLine();									

            System.out.println("Enter category:");
            Scanner d  = new Scanner(System.in);	//taking catagory name							
            String category = d.nextLine();									

            System.out.println("Enter price:");
            Scanner scanPrice  = new Scanner(System.in);	// taking price							
            float price = scanPrice.nextFloat();									


            obj.addBook(new Book(bookID,title,author,category,price));						//adding Book instances into BookStore
            obj.displayAll();

            if(i!=4) {	
                continue;
            }
                                                           //closing all scanner input streams
            a.close();
            b.close();
            c.close();
           d.close();
            scanPrice.close();
        }	

        System.out.println("\nEnter title to search book: ");
        String a = s.nextLine();									//taking input for price
        System.out.println("\nSearched by title");
        obj.xyz("title: " +a);									//searching book by book title

        System.out.println("\nEnter author name to search book");
        String b = s.nextLine();									//taking input for price
        System.out.println("\nSearched by author");
      //  obj.searchByAuthor("Author "+ b );									//searching book by author name
obj.setAuthor("Author " +b);
        System.out.println("\nPrinting all books:");
        obj.displayAll(); 										//displaying all books with details

        s.close();
}
}
