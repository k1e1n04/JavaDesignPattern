package ken.ishii.Iterator;

import java.util.Iterator;

import ken.ishii.Iterator.Aggregate.BookShelf;

public class Main {
    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf(4);
    
        bookShelf.appendBook(new Book("Git Hub"));
        bookShelf.appendBook(new Book("Qiita"));
        bookShelf.appendBook(new Book("Java"));
        bookShelf.appendBook(new Book("Iterator pattern"));
    
        Iterator iterator = bookShelf.iterator();
        while(iterator.hasNext()) {
            Book book = (Book)iterator.next();
            System.out.println(book.getName());
        }
    }
}