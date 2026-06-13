package com.Loki.Java_Practice.BehaviouralPattern.MementoPattern;

import org.w3c.dom.Text;

import java.util.Stack;

public class HistoryOfContent {

    private Stack<EditorMemento> stack = new Stack<>();

    public void saveState(TextEditor textEditor){
        stack.push(textEditor.save());
    }

    public void undo(TextEditor textEditor){
        if(!stack.isEmpty()){
            stack.pop();
            textEditor.restore(stack.peek());
        }
    }

}
