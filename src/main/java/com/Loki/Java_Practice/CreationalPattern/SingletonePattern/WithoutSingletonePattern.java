package com.Loki.Java_Practice.CreationalPattern.SingletonePattern;

class Settings{

    private String URL;
    private String apikey;

    public Settings(){
        URL = "https://drive.google.com/file/d/1mMD4NyH2psK4qeDhMA30U2wBottp8918/view";
        apikey = "GitHub: https://github.com/Manohar2503";
    }

    public String getUrl(){
        return URL;
    }

    public String getApikey(){
        return apikey;
    }
}

public class WithoutSingletonePattern {

        public static void main(String args[]){
            Settings setting1 = new Settings();
            Settings settingcopy = new Settings();
            System.out.println(setting1.getUrl());
            System.out.println(settingcopy.getApikey());
            System.out.println(settingcopy==setting1);
        }

}
