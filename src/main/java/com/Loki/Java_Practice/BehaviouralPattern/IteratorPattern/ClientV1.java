package com.Loki.Java_Practice.BehaviouralPattern.IteratorPattern;

public class ClientV1 {

    public static void main(String[] args){
        BookCollection col = new BookCollection();
        col.setBook(new Book("java book"));
        col.setBook(new Book("c book"));
        col.setBook(new Book("c++ book"));

        for(int i=0;i<col.getBook().size();i++){
            System.out.println(col.getBook().get(i));
        }
    }
}
