package Composition;

import java.util.ArrayList;
import java.util.List;

import javax.naming.AuthenticationException;

class Book
{
	
public String title;
public String author;

public Book(String title, String author) {
	super();
	this.title = title;
	this.author = author;
}



}

class Library
{
	
private final List<Book>books;

Library (List<Book>books)
{
this.books=books;	

}

public List<Book> getTotalBooksInLibrary()
{
	
return books;
}
}
public class CompositionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Book b1= new Book("Quantative Aptitude", "RS Agrawal");
		Book b2= new Book("NCRT", "RD Sharma");
		Book b3= new Book("Head First Java", "Kathy Ciera");
		Book b4= new Book("Data Structure", "Thomas H. Cormen");
		Book b5= new Book("Java for Dummies ", " Barry A. Burd");
		
		List<Book>books = new ArrayList<Book>();
		books.add(b1);
		books.add(b2);
		books.add(b3);
		books.add(b4);
		books.add(b5);
//		 Creating the library object with books collection
		
		Library library = new Library(books);
		
		List<Book> bks= library.getTotalBooksInLibrary();
		
		for(Book bk: bks)
			System.out.println("Title of the book is "+ bk.title +"Author of the book is "+bk.author);
		

	}

}
