//Problem 3. 
//Program to create library book Management system
//to store and display book details in library where you can 
//create two classes one is main another one is library, where you can 
//create two methods as addBook,dispanseBook and 
//bookId,bookName,bookAuthor as instance variables

package Private.Ltd;

class Library{
	 String bookid;
	 String bookname; 
	 String bookauthor;
	
	void Addbook(String bookid,String bookname,String bookauthor) {
		this.bookid=bookid;
		this.bookname=bookname;
		this.bookauthor=bookauthor;
		System.out.println("Your book is added:"+"  "+bookid+"     " +bookname+"     "+bookauthor);
	}
	void DispanseBook(String  bookid,String bookname,String bookauthor) {
		if((bookname==bookauthor)&&(bookid==bookname)) {
			System.out.println(" Book is Found!!!!");
		}
		else {
			System.out.println("Sorry !! Book is not found");
		}
	}
}
public class LibraryManagement {

	public static void main(String[] args) {
		Library Li= new Library();
		Li.Addbook("123E4", "Let us c", "Dennis Ritchie");
		Li.DispanseBook("123E4", "Let us c", "Dennis Ritchie");
	}

}
