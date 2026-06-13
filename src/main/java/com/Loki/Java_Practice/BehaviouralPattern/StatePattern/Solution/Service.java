package com.Loki.Java_Practice.BehaviouralPattern.StatePattern.Solution;

public class Service {
    private TranspotationMode mode;
    Service(TranspotationMode mode){
        this.mode = mode;
    }

    public void setMode1(TranspotationMode mode){
        this.mode = mode;
    }

    public String getdirections(){
        return mode.directions();
    }

    public int getEtA(){
        return mode.getETA();
    }

}
