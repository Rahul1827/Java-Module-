package Services;

import java.util.HashMap;

import Entity.Book;
import Entity.Member;

public class Library {

	private HashMap<String, Book> books;
	private HashMap<String, Member> members;

	public Library() {
		// TODO Auto-generated constructor stub

		books = new HashMap<>();
		members = new HashMap<>();
	}

	public void addBook(Book book) {

		books.put(book.getTitle(), book);
		System.out.println("Book added Successfully" + book.getTitle());
	}

	public void removeBook(String title) {

		books.remove(title);
		System.out.println("Book added Successfully" + title);
	}

	public void removeMember(String memberId) {

		books.remove(memberId);
		System.out.println("member removed successfully...");
	}

	public Book searchBook(String title) {

		return books.get(title);

	}

	public void addMember(Member member) {

		members.putIfAbsent(member.getMemberId(), member);
		System.out.println("Member added Successfully" + member.getName());

	}

	public void displayAllBooks() {
		System.out.println("All Books in the Library:");
		for (Book book : books.values()) {
			System.out.println("Title: " + book.getTitle() + ", Author: " + book.getAuthor() + ", Available: "
					+ book.isAvailability());
		}
	}

	public void displayAllMembers() {
		System.out.println("All Members in the Library:");
		for (Member member : members.values()) {
			System.out.println("Member: " + member.getName() + ", Member ID: " + member.getMemberId());
		}
	}

	public void borrowBook(String memberId, String bookTitle) {
		Member member = members.get(memberId);
		Book book = books.get(bookTitle);
		if (member != null && book != null) {
			member.borrowBook(book);
		} else {
			System.out.println("Invalid member ID or book title.");
		}
	}

	public void returnBook(String memberId, String bookTitle) {
		Member member = members.get(memberId);
		Book book = books.get(bookTitle);
		if (member != null && book != null) {
			member.returnBook(book);
		} else {
			System.out.println("Invalid member ID or book title.");
		}
	}
}
