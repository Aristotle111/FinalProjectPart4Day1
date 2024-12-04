/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package finalprojectpart4;
import java.util.ArrayList;
/**
 *
 * @author arist
 */
public class Library {
    private ArrayList<Book> books;
    
    public Library(){
        //what do you mean add 5 books??? default constructer should have no paramters??
        //this.books.ensureCapacity(5);
    }
    
    public Library(ArrayList<Book> books) {
        this.books = books;
    }
    
    public Library(Library library) {
        this.books = library.books;
    }
    
    public ArrayList<Book> searchBook(String keyword) {
        ArrayList<Book> keyBooks = new ArrayList<>();
        
        for(Book book : this.books) {
            if(book.getAuthor().contains(keyword) || book.getAuthor().contains(keyword)) {
                keyBooks.add(book);
            }         
        }
        return keyBooks;
    }
    
    public boolean equals(Library anotherLibrary) { 
        for(Book libraryBook : this.books) {
            boolean contains = true;
            for(Book anotherLibraryBook : anotherLibrary.books) {
                if(libraryBook.equals(anotherLibraryBook)) {
                    contains = true;
                    break;
                }
            }
            if(!contains) {
                return false;
            }
        }
        return true;
    }
}
