package com.Loki.Java_Practice.CreationalPattern.AbstractFactoryMethod.problem;


class MacOsButton{
    public void render(){
        System.out.println("Rendering MacOs button");
    }
}
class MacOsScroll{
    public void scroll(){
        System.out.println("Scrolling MacOs scroll");
    }
}

class WindowsButton{
    public void render(){
        System.out.println("Rendering Windows button");
    }
}
class WindowsScroll{
    public void scroll(){
        System.out.println("Scrolling Windows scroll");
    }
}

public class Application {
    public static void main(String[] args){
        WindowsButton button = new WindowsButton();
        WindowsScroll scroll = new WindowsScroll();
        button.render();
        scroll.scroll();
    }

}
