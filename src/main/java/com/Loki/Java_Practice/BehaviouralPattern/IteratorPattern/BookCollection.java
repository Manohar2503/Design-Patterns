package com.Loki.Java_Practice.BehaviouralPattern.IteratorPattern;

import java.util.ArrayList;
import java.util.List;

public class BookCollection {

    private List<Book> list = new ArrayList<>();

    public void setBook(Book book){
        list.add(book);
    }

    public List<Book> getBook(){
        return list;
    }
}
