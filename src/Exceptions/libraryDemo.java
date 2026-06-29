package Exceptions;

class Library{
    int availableBooks = 3;
    public void borrowBook(int booksRequested){
        try {
            int[] books = {101, 102, 103};
            System.out.println("BOOKS REQUESTED : " + books[booksRequested]);
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Exception occurred you requested a book that not occurred in library");
        } catch (NullPointerException e){
            System.out.println("Null pointer exception");
        } finally {
            System.out.println("Finally block");
        }

    }
}

public class libraryDemo {
    static void main(String[] args) {
        Library library = new Library();
        library.borrowBook(4);
    }
}
