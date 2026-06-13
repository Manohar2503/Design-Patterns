package com.Loki.Java_Practice.StructuralPattern.AdapterPattern.solution;

public class SendGridService{
    public void sendEmail(String receipent, String title, String content){
        System.out.println("Sending email via SendGrid "+ receipent);
        System.out.println("Title "+ title);
        System.out.println("Content "+ content);
    }
}
