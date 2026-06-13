package com.Loki.Java_Practice.BehaviouralPattern.MementoPattern;

public class EditorMemento {
    private final String content;

    EditorMemento(String content){
        this.content = content;
    }

    public String getContent(){
        return content;
    }
}

