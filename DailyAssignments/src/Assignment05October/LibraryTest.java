package Assignment05October;
class Book {
    private String title;
    private String author;
    private String isbn;

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", isbn='" + isbn + '\'' +
                '}';
    }
}



 class Library {
    private Book[] books;
    private int count;

    public Library(int capacity) {
        books = new Book[capacity];
        count = 0;
    }

  
    public void addBook(Book book) {
        if (count < books.length) {
            books[count] = book;
            count++;
            System.out.println("Added: " + book);
        } else {
            System.out.println("Library is full. Cannot add more books.");
        }
    }

   
    public void removeBook(String isbn) {
        for (int i = 0; i < count; i++) {
            if (books[i].getIsbn().equals(isbn)) {
                System.out.println("Removed: " + books[i]);
               
                for (int j = i; j < count - 1; j++) {
                    books[j] = books[j + 1];
                }
                books[count - 1] = null; 
                count--;
                return;
            }
        }
        System.out.println("Book with ISBN " + isbn + " not found.");
    }

   
    public void displayBooks() {
        if (count == 0) {
            System.out.println("No books in the library.");
            return;
        }
        System.out.println("Books in the library:");
        for (int i = 0; i < count; i++) {
            System.out.println(books[i]);
        }
    }
}






public class LibraryTest {
    public static void main(String[] args) {
        Library library = new Library(10); 

        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "123456789");
        Book book2 = new Book("1984", "George Orwell", "987654321");
        Book book3 = new Book("To Kill a Mockingbird", "Harper Lee", "111111111");

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        library.displayBooks();

        library.removeBook("987654321");
        library.displayBooks();

        library.removeBook("000000000"); 
    }
}
