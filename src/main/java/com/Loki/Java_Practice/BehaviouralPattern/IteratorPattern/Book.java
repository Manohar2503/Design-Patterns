package com.Loki.Java_Practice.BehaviouralPattern.IteratorPattern;

public class Book {
    private String title;

    Book(String title){
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                '}';
    }
}
