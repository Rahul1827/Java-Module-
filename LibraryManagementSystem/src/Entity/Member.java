package Entity;

import java.util.ArrayList;

public class Member {
	
	private String name;
	private String memberId;
	private ArrayList<Book> borrowedBooks;
	
	
	public Member(String name, String memberId) {
		super();
		this.name = name;
		this.memberId = memberId;
		this.borrowedBooks = borrowedBooks;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getMemberId() {
		return memberId;
	}


	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}


	public ArrayList<Book> getBorrowedBooks() {
		return borrowedBooks;
	}
	
	
	public void borrowBook(Book book)
	{
		if(book.isAvailability())
		{
			borrowedBooks.add(book);
			book.setAvailability(false);
			System.out.println(name+"Borrowed the book:"+book.getTitle());
		}
		
		else {
			
			System.out.println(book.getTitle()+" is not available");
		}
		
	}

	public void returnBook(Book book)
	{
		if(book.isAvailability())
		{
			borrowedBooks.contains(book);
			book.setAvailability(true);
			System.out.println(name+"Return the book:"+book.getTitle());
		}
		
		else {
			
			System.out.println(book.getTitle()+" is not available");
		}
		
	}

	
	
}


//name: String
//    memberId: String
//    borrowedBooks: ArrayList<Book>