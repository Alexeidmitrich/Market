package market;

import java.util.ArrayList;
import java.util.List;

public class Book extends  Literature{
    List<Book> bookList = new ArrayList<>();
    String nameAuthor;
    String familyAuthor;


    public Book(int title, int article, int cost, int numberPlace, String nameAuthor, String familyAuthor) {
        super(title, article, cost, numberPlace);
        this.nameAuthor = nameAuthor;
        this.familyAuthor = familyAuthor;
    }
    public void  putBook(Book book) {
        bookList.add(book);
    }

    public void printBook(){
        if (bookList.size() == 0) {
            System.out.println("Book " + article + " not found");
        } else {
            for (int i = 0; i < bookList.size(); i++) {
                Book book = bookList.get(i);
                book.printLiterature();

            }
        }
    }
}
