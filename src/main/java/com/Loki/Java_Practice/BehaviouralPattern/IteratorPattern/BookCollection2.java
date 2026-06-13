package com.Loki.Java_Practice.BehaviouralPattern.IteratorPattern;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BookCollection2 {
    private List<Book> list = new ArrayList<>();

    public void setBook(Book book){
        list.add(book);
    }

    public List<Book> getBook(){
        return list;
    }

    public Iterator<Book> iterate(){
        return new BookIterator(this.list);
    }


    private class BookIterator implements Iterator<Book>{
        private List<Book> list;
        int position=0;
        BookIterator(List<Book> lists){
            this.list =  lists;
        }


        @Override
        public boolean hasNext() {
            return position < list.size();
        }

        @Override
        public Book next() {
           return list.get(position++);
        }
    }
}
