package Library.com;

import java.util.ArrayList;
import java.util.Scanner;
public class Book {
	 //encapsulating all data members
    private String bookID, title, author, category;
    private float price;

    public Book(String bookID, String title, String author, String category, float price)  {//parameterized constructor

        //validations
        try {
            //conditon for bookID
            if((bookID.startsWith("B") && (bookID.length()==4))) {	//condition
                this.bookID=bookID;	//if condition meets
            }
			else {
                throw new InvalidBookException("book id should be start with 'B' and lenght of 4");		//throws exception
            }


            //conditon for category
            if((category.equalsIgnoreCase("Science")) || (category.equalsIgnoreCase("Fiction")) || (category.equalsIgnoreCase("Technology")) || (category.equalsIgnoreCase("Others"))) {	//conditon
                this.category=category;	//if condition meets
            }
            else {
                throw new InvalidBookException("category should be Science,Fiction,Technology and Others");	//throws exception
            }

            //conditon for price
            if(price>0) {	//conditon
                this.price=price; //if condition meets
            }
            else {
                throw new InvalidBookException("negative price can not be accepted");				//for throwing  exception
            }
            this.title=title;
            this.author=author;
        }
        catch(Exception e) {	//exception handling
            System.out.println(e);
        }
    }

    //getters for all private data members
    public String getBookID() {
        return bookID;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getCategory() {
        return category;
    }

    public float getPrice() {
        return price;
    }

    @Override
    public String toString() {	//for printing all details of Book objects
        String s = "Book [bookID='" + bookID + "', title='" + title + "', author='" + author + "', category='" + category + "', price='" + price + "']";


        return s;
    }}



    //creating exception classes
    class InvalidBookException extends Exception {
      //overloading InvalidBookException class
        public InvalidBookException(String s) {   
            super(s);                              //to call the  super class
        }
    }
 class BookStore {	//main class
    ArrayList<Book> bookList = new ArrayList<>(); 			//creating arrayList object to store book objects

    //operation #1
    public void addBook(Book b) {					//passing book object as argument
        bookList.add(b);					//adding new book object to bookList Collection
    }

    //operation #2
    public void xyz(String title) {			
        for (Book b : bookList) {
            if(title.contains(b.getTitle())) {		// checking conditions
                System.out.println(b);
                break;
            }else {
                System.out.println("not found");
                break;
            }
        }
    }

   // operation #3
    public void setAuthor(String author) {			
       for (Book b : bookList) {
           if(author.contains(b.getAuthor())) {		// checking conditions
               System.out.println(b);
                break;
            }else {
               System.out.println("not found");
                break;
            }
       }
   }

    //operation #4
    public void displayAll() {					
        //traversing
        for(Book b : bookList) {				
            System.out.println(b);
        }
    }
}
