package LibraryManagementSystem;

import java.util.ArrayList;

public class Member {
	
	private String name;
	static long id=1000;
	private String memberId; 
	private ArrayList<Book> borrowedBooks;
	
	
	public Member(String name) {
		super();
		this.name = name;
		this.memberId = "LIB"+  ++id;  //LIB10001
		borrowedBooks= new ArrayList<Book>();
		
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
	public ArrayList<Book> getBorrowedBooks() {
		return borrowedBooks;
	}
	
	public void borrowBook(Book book)
	{
		if(book.isAvailability())
				{
			
			borrowedBooks.add(book);
			book.setAvailability(false);
			System.out.println(this.name+ "borrowed book"+book.getTitle());
			
				}
		else {
			
			System.out.println("This book is not available.....");
			
		}
	}
	

	public void removeBook(Book book)
	{
		if(borrowedBooks.contains(book))
				{
			
			borrowedBooks.remove(book);
			book.setAvailability(true);
			System.out.println(this.name+ "returned book"+book.getTitle());
			
				}
		else {
			
			System.out.println("This book is not available.....");
			
		}
	}
	

}
