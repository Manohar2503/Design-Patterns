package com.Loki.Java_Practice.BehaviouralPattern.MementoPattern;

// It is besically like a Undo method where we need our last saved code
public class TextEditor {

    private String content;

    public void write(String content){
        this.content = content;
    }

    public EditorMemento save(){
        return new EditorMemento(content);
    }

    public void restore(EditorMemento memento){
        content = memento.getContent();
    }

    public String getContent(){
        return content;
    }
}
