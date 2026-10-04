package task1.entity;

import java.util.ArrayList;

//1. Create a Book class with bookId, bookName and authorName.
//Create parameterized constructor to initialize the object.
//Create an ArrayList of type Book and store all book objects into collections and display all book details.
public class Book {

    // Instance variables
    int BookId;
    String Bookname;
    String authorName;

    // Parameterized Constructor
    public Book(int bookId, String bookname, String authorName) {
        this.BookId = bookId;
        this.Bookname = bookname;
        this.authorName = authorName;
    }

    // Override toString() to print Book details
    @Override
    public String toString() {
        return "Book{" +
                "BookId=" + BookId +
                ", Bookname='" + Bookname + '\'' +
                ", authorName='" + authorName + '\'' +
                '}';
    }

    public static void main(String[] args) {

        ArrayList<Book> B1= new ArrayList<>();

        // Adding Book objects to the ArrayList
        B1.add(new Book(1,"Rich Dad Poor Dad","Robert T. Kiyosaki"));
        B1.add(new Book(1,"Atomic Habits","James Clear"));
        B1.add(new Book(3,"Wings of Fire","APJ Abdul Kalam"));



        // Displaying Book details using an enhanced for loop
        for(Book b1 :B1){
            System.out.println(b1);
        }

        System.out.println(B1);



    }
}
