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

          
            if(price>0) {	
                this.price=price; //checking price condition 
            }
            else {
                throw new InvalidBookException("negative price can not be accepted");				//Throws exception 
            }
            this.title=title;
            this.author=author;
        }
        catch(Exception e) {	                                          //handling the exception
            System.out.println(e);
        }
    }

 
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
    public String toString() {	                          //printing details 
        String s = "Book [bookID='" + bookID + "', title='" + title + "', author='" + author + "', category='" + category + "', price='" + price + "']";


        return s;
    }

    //creating custom exception class
    class InvalidBookException extends Exception {
 
        public InvalidBookException(String s) {    
            super(s);                                                 //calling  super class
        }
    }
 class BookStore {	//main class
    ArrayList<Book> bookList = new ArrayList<>(); 			//creating arrayList 

    //operation #1
    public void addBook(Book b) {					
        bookList.add(b);					
    }

    //operation #2
    public void xyz(String title) {			
        for (Book b : bookList) {
            if(title.contains(b.getTitle())) {		//condition
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
           if(author.contains(b.getAuthor())) {		//condition
               System.out.println(b);
                break;
            }else {
               System.out.println("not found");
                break;
            }
       }
   }

    //operation #4
    public void displayAll() {					// for displaying details 
        //traversing
        for(Book b : bookList) {				
            System.out.println(b);
        }
    }

	public void searchByTitle(String string) {
		// TODO Auto-generated method stub
		
	}

	
 }}
