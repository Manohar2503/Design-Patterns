package com.Loki.Java_Practice.BehaviouralPattern.Mediator;

import java.util.ArrayList;
import java.util.List;

interface  chatMediator{
    void sendmessage(String msg, ChatUser user);
    void addUser(ChatUser user);
}


class ChatRoom implements chatMediator{
    private List<ChatUser> users;
    ChatRoom(){
        users = new ArrayList<>();
    }
    @Override
    public void sendmessage(String msg, ChatUser user) {
        for(ChatUser chatUser:users){
            if(chatUser!=user){
                chatUser.receivemessage(msg,user);
            }
        }
    }

    @Override
    public void addUser(ChatUser user) {
        users.add(user);
    }
}


class ChatUser{
    private String name;
    private chatMediator chatMediator;
    ChatUser(String name,chatMediator mediator){
        this.name = name;
        this.chatMediator = mediator;
    }

    public void sendmessage(String msg){
        System.out.println("sending message "+msg);
        chatMediator.sendmessage(msg,this);
    }

    public String getName(){
        return this.name;
    }

    public void receivemessage(String msg, ChatUser sender){
        System.out.println("Message recieved : "+msg+" from "+sender.getName());
    }

}

public class WithMediatorClass {
    public static void main(String[] args){
        chatMediator mediator = new ChatRoom();
        ChatUser manu = new ChatUser("manu",mediator);
        ChatUser kodi = new ChatUser("kodi",mediator);
        ChatUser Bunty = new ChatUser("Bunty",mediator);
        mediator.addUser(manu);
        mediator.addUser(kodi);
        mediator.addUser(Bunty);
        kodi.sendmessage("Hello EveryOne");
    }
}
