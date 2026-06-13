package com.Loki.Java_Practice.CreationalPattern.PrototypePattern.solution;

public class WithPrototypePattern {
    public static void main(String[] args){
        GameBoard gameBoard = new GameBoard();
        GamePiece gamePiecered = new GamePiece("red","1");
        GamePiece gamePieceblue = new GamePiece("blue", "2");
        gameBoard.addPieces(gamePieceblue);
        gameBoard.addPieces(gamePiecered);
        gameBoard.geteachpiece();


        // here if we want to copy the pieces we need to hard code it , it is defficult to add new one 
    }
}
