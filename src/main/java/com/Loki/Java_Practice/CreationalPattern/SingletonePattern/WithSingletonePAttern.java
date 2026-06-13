package com.Loki.Java_Practice.CreationalPattern.SingletonePattern;

class SettingsI{
    private String URL;
    private String apikey;

    private static SettingsI instanse;

    private SettingsI(){
        URL = "https://drive.google.com/file/d/1mMD4NyH2psK4qeDhMA30U2wBottp8918/view";
        apikey = "GitHub: https://github.com/Manohar2503";
    }

    public String getUrl(){
        return URL;
    }

    public String getApikey(){
        return apikey;
    }

    public static SettingsI getInstance(){
        if(instanse == null){
            instanse = new SettingsI();
        }
        return instanse;
    }
}


public class WithSingletonePAttern {
    public static void main(String[] args){
            SettingsI settings1 = SettingsI.getInstance();
            SettingsI settingsIcopy = SettingsI.getInstance();
        System.out.println(settings1.getUrl());
        System.out.println(settingsIcopy.getApikey());
        System.out.println(settingsIcopy==settings1);
    }
}
