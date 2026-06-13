package com.Loki.Java_Practice.StructuralPattern.AdapterPattern.solution;

public class WithAdapterPattern {
    public static void main(String[] args){
        Notification email = new EmailNotification();
        email.send("manujinka22@gmail.com","asking for refferal","is ther eany openings in your company");

       // Notification emailfromAdapter = new SendGridAdapter(new SendGridService());
        Notification newnotification = new SendGridAdapter(new SendGridService());
        newnotification.send("customer@email.com","chceking adapter email version", " transfering the email");
    }
}
