package com.hainet;

import com.hainet.aggregate.BookShelf;
import com.hainet.element.Book;
import com.hainet.iterator.Iterator;

public class Main {
    public static void main(String... args) {

        BookShelf bookShelf = new BookShelf(3);

        // add
        bookShelf.add(new Book("1: Java"));
        bookShelf.add(new Book("2: Design Pattern"));
        bookShelf.add(new Book("3: Iterator"));

        // pop
        bookShelf.pop();

        Iterator it = bookShelf.iterator();

        // next
        while (it.hasNext()) {
            System.out.println(((Book) it.next()).getName());
        }

        // previous
        while (it.hasPrevious()) {
            System.out.println(((Book) it.previous()).getName());
        }
    }
}
