package com.Loki.Java_Practice.BehaviouralPattern.IteratorPattern;

import java.util.Iterator;

public class ClientV2 {
    public static void main(String[] args){
        BookCollection2 col = new BookCollection2();
        col.setBook(new Book("java book"));
        col.setBook(new Book("c book"));
        col.setBook(new Book("c++ book"));
        Iterator<Book> it= col.iterate();

        while(it.hasNext()){
            Book book = it.next();
            System.out.println("Book Title "+ book.getTitle());
        }
    }
}
