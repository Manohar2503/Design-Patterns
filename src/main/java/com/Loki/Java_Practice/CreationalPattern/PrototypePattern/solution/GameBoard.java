package com.Loki.Java_Practice.CreationalPattern.PrototypePattern.solution;

import java.util.ArrayList;
import java.util.List;

public class GameBoard {
    List<GamePiece> list = new ArrayList<>();

    public void addPieces(GamePiece piece){
        list.add(piece);
    }

    public List<GamePiece> getPieces(){
        return list;
    }

    public void geteachpiece(){
        for(GamePiece piece:list){
            System.out.println(piece);
        }
    }
}
