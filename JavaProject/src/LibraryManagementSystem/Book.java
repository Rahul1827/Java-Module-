package LibraryManagementSystem;

public class Book {

private String title;
private String author;
private String category;
private boolean availability;


public Book() {
	// TODO Auto-generated constructor stub
	
	title=null;
	author=null;
	category= null;
	availability=true;
	
	
	
}


public Book(String title, String author, String category, boolean availability) {
	super();
	this.title = title;
	this.author = author;
	this.category = category;
	this.availability = availability;
}


public String getTitle() {
	return title;
}


public void setTitle(String title) {
	this.title = title;
}


public String getAuthor() {
	return author;
}


public void setAuthor(String author) {
	this.author = author;
}


public String getCategory() {
	return category;
}


public void setCategory(String category) {
	this.category = category;
}


public boolean isAvailability() {
	return availability;
}


public void setAvailability(boolean availability) {
	this.availability = availability;
}


@Override
public String toString() {
	return "Book [title=" + title + ", author=" + author + ", category=" + category + ", availability=" + availability
			+ "]";
}
	




}
