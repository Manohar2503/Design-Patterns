package com.Loki.Java_Practice.BehaviouralPattern.CommandPattern;

interface Command{
    void execute();
}


class BoldCommand implements Command{

    private TextEditorII editor;
    BoldCommand(TextEditorII editor){
        this.editor = editor;
    }

    @Override
    public void execute() {
        editor.boldText();
    }
}

class ItalicCommand implements Command{

    private TextEditorII editor;
    ItalicCommand(TextEditorII editor){
        this.editor = editor;
    }

    @Override
    public void execute() {
        editor.italicText();
    }
}

class Button{
    private Command command;
    public void setCommand(Command command){
        this.command = command;
    }
    public void click(){
        command.execute();
    }

}

class TextEditorII{
    public void boldText(){
        System.out.println("Text has been bolded");
    }
    public void italicText(){
        System.out.println("Text has been italic");
    }
}

public class WithCommandPattern {
public  static  void main(String[] args){

    TextEditorII editor2 = new TextEditorII();
    Button button = new Button();
    button.setCommand( new BoldCommand(editor2));
    button.setCommand((new ItalicCommand(editor2)));
    button.click();
}
}
