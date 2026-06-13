package com.Loki.Java_Practice.BehaviouralPattern.TemplatePattern;

abstract class DataParser{
    public void parser(){
        openFile();
        parseData();
        closeFile();
    }
    protected void openFile(){
        System.out.println("Opening the File");
    }
    protected void closeFile(){
        System.out.println("Closeing the FIle");
    }

    protected abstract void parseData();
}

class CsvFile extends DataParser{

    @Override
    protected void parseData() {
        System.out.println("CSV parser initialized");
    }
}

class JsonFile extends DataParser{

    @Override
    protected void parseData() {
        System.out.println("Json parser initialized");
    }
}

public class WithTemplatePattern {

public static void main(String[] args){
    DataParser csv = new CsvFile();
    DataParser json = new JsonFile();
    csv.parser();
    json.parser();
}

}
