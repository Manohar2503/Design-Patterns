package com.Loki.Java_Practice.BehaviouralPattern.MementoPattern;

public class TextEditorMain {
    public static void main(String[] args){
        TextEditor textEditor = new TextEditor();
        textEditor.write("A");
        HistoryOfContent history = new HistoryOfContent();
        history.saveState(textEditor);
        textEditor.write("B");
        history.saveState(textEditor);
        textEditor.write("C");
        history.saveState(textEditor);
        // undo the last content
        history.undo(textEditor);
        history.undo(textEditor);
        System.out.println(textEditor.getContent());
    }
}
