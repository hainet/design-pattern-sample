package com.hainet.iterator;

// Concrete Iterator Role
public class BookShelfIterator implements Iterator {
    private BookShelf bookShelf;
    private int index = 0;

    public BookShelfIterator(final BookShelf bookShelf) {
        this.bookShelf = bookShelf;
    }

    @Override
    public boolean hasNext() {
        return index < bookShelf.size();
    }

    @Override
    public Object next() {
        return bookShelf.get(index++);
    }

    @Override
    public boolean hasPrevious() {
        return index > 0;
    }

    @Override
    public Object previous() {
        return bookShelf.get(--index);
    }
}
