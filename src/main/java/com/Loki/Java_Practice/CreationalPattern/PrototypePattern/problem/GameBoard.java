package com.Loki.Java_Practice.CreationalPattern.PrototypePattern.problem;

import com.Loki.Java_Practice.CreationalPattern.PrototypePattern.solution.Prototype;

import java.util.ArrayList;
import java.util.List;

public class GameBoard implements Prototype<GameBoard> {
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

    @Override
    public GameBoard clone() {
        GameBoard newBoard = new GameBoard();
        for(GamePiece piece: list){
            newBoard.addPieces(piece.clone());
        }
        return newBoard;
    }

}
