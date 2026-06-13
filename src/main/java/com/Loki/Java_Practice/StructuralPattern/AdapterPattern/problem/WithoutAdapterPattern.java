package com.Loki.Java_Practice.StructuralPattern.AdapterPattern.problem;

public class WithoutAdapterPattern {
    public static void main(String[] args){
        Notification email = new EmailNotification();
        email.send("manujinka22@gmail.com","asking for refferal","is ther eany openings in your company");
    }
}
