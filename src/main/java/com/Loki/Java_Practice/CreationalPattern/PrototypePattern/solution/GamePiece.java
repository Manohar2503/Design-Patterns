package com.Loki.Java_Practice.CreationalPattern.PrototypePattern.solution;

public class GamePiece {
    private String color;
    private String position;

    GamePiece(String color, String position){
        this.color=color;
        this.position = position;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "GamePiece{" +
                "color='" + color + '\'' +
                ", position='" + position + '\'' +
                '}';
    }
}
