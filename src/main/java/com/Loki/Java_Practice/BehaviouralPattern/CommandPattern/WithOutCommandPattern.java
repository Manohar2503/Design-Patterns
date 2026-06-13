package com.Loki.Java_Practice.BehaviouralPattern.CommandPattern;

class TextEditor{
    public void boldbutton(){
        System.out.println("Bold button clicked");
    }

    public void elitebutton(){
        System.out.println("Elite button clicked");
    }

}

class BoldButton{
    private TextEditor editor;
    BoldButton(TextEditor editor){
        this.editor = editor;
    }

    public void onClick(){
        editor.boldbutton();
    }
}

class ELiteButton{
    private TextEditor editor;
    ELiteButton(TextEditor editor){
        this.editor = editor;
    }

    public void onClick(){
        editor.elitebutton();
    }
}
public class WithOutCommandPattern {

    public static void main(String[] args){

        TextEditor editor = new TextEditor();
        BoldButton bold = new BoldButton(editor);
        bold.onClick();
        ELiteButton elite = new ELiteButton(editor);
        elite.onClick();
    }


}
