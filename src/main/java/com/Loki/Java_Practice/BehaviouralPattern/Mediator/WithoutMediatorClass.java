package com.Loki.Java_Practice.BehaviouralPattern.Mediator;


class User{
    private String name;
        User(String name){
            this.name = name;
        }
        public void sendmessage(String msg, User user){
            System.out.println("message send to "+ msg +" "+ user.getName());
        }
    public String getName(){
        return this.name;
    }

}

public class WithoutMediatorClass {
    public static void main(String[] args){
        User manu = new User("manu");
        User kodi = new User("kodi");
        User bunty = new User("Bunty");

        manu.sendmessage("Hello",kodi);
        manu.sendmessage("Hello",bunty);
    }
}
