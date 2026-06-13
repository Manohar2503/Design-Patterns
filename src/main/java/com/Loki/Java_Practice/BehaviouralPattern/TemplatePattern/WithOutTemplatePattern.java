package com.Loki.Java_Practice.BehaviouralPattern.TemplatePattern;


class CSVFile{
    public void parser(){
        openfile();
        System.out.println("csv file opened");
        closefile();
    }
    public void openfile(){
        System.out.println("file opened");
    }
    public void closefile(){
        System.out.println("colse file");
    }
}

class JSONFile{
    public void parser(){
        openfile();
        System.out.println("json file opened");
        closefile();
    }
    public void openfile(){
        System.out.println("file opened");
    }
    public void closefile(){
        System.out.println("colse file");
    }
}

public class WithOutTemplatePattern {
    public static void main(String[] args){
        CSVFile csv = new CSVFile();
        csv.parser();
        JSONFile json = new JSONFile();
        json.parser();
    }
}