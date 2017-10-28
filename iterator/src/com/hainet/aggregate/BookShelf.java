package com.hainet.aggregate;

import com.hainet.element.Book;
import com.hainet.iterator.BookShelfIterator;
//import com.hainet.iterator.GenericIterator;
import com.hainet.iterator.Iterator;

// Concrete Aggregate Role
public class BookShelf implements Aggregate {

    private Book[] books;
    private int index = 0;

    public BookShelf(final int size) {
        this.books = new Book[size];
    }

    public int size() {
        return index;
    }

    public Book get(final int index) {
        return books[index];
    }

    public void add(final Book book) {
        books[index++] = book;
    }

    public void pop() {
        books[--index] = null;
    }

    @Override
    public Iterator iterator() {
        return new BookShelfIterator(this);
    }

//    @Override
//    public Iterator iterator() {
//        return new GenericIterator<>(this);
//    }
}
