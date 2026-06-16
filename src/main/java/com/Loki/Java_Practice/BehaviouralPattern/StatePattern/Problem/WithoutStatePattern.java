package com.Loki.Java_Practice.BehaviouralPattern.StatePattern.Problem;

enum TransportationMode{
    WALKING , CYCLING, CAR ,TRAIN;
}


public class WithoutStatePattern {
        private TransportationMode mode;

    WithoutStatePattern(TransportationMode mode){
        this.mode = mode;
    }

    public void setMode(TransportationMode mode){
        this.mode = mode;
    }

    public int getETA()  {
        switch(mode){
            case WALKING:
                System.out.println(" Walking ");
                return 10;
            case CYCLING:
                System.out.println(" CYCLING ");
                return 5;
            case CAR:
                System.out.println(" CAR ");
                return 4;
            case TRAIN:
                System.out.println(" TRAIN ");
                return 3;
            default:
                throw new IllegalArgumentException("Unknown Mode");
        }
    }

    public void getDirections() {

        switch(mode){
            case WALKING:
                System.out.println(" Walking Direction");
                break;
            case CYCLING:
                System.out.println(" CYCLING Direction");
                break;
            case CAR:
                System.out.println(" CAR Direction");
                break;
            case TRAIN:
                System.out.println(" TRAIN Direction");
                break;
            default:
                throw new IllegalArgumentException("Unknown Mode");
        }
    }

}
