package com.Loki.Java_Practice.CreationalPattern.AbstractFactoryMethod.solution;

interface button{
    void render();
}
interface scrollbar{
    void scroll();
}

class WindowsButton implements button{

    @Override
    public void render() {
        System.out.println("Rendering Windows button ");
    }
}

class WindowsScroller implements scrollbar{

    @Override
    public void scroll() {
        System.out.println("Scrolling windows button");
    }
}

class MacOsButton implements button{

    @Override
    public void render() {
        System.out.println("Rendering Macos button ");
    }
}

class MacOsScroller implements scrollbar{

    @Override
    public void scroll() {
        System.out.println("Scrolling Macos button");
    }
}

interface UIFactory{
    button butoon();
    scrollbar scroller();
}

class WindowsFactory implements UIFactory{


    @Override
    public button butoon() {
        return new WindowsButton();
    }

    @Override
    public scrollbar scroller() {
        return new WindowsScroller();
    }
}


class MacOsFactory implements UIFactory{


    @Override
    public button butoon() {
        return new MacOsButton();
    }

    @Override
    public scrollbar scroller() {
        return new MacOsScroller();
    }
}

public class Application {
    private button button;
    private scrollbar scrollbar;

    Application(UIFactory factory){
        this.button = factory.butoon();
        this.scrollbar = factory.scroller();
    }
    public void rendering(){
        button.render();
        scrollbar.scroll();
    }

    public static void main(String[] args){
            WindowsFactory windowsFactory = new WindowsFactory();
            Application app = new Application(new MacOsFactory());
            app.rendering();
    }
}
