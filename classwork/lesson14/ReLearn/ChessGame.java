package com.hillel.classwork.lesson14.ReLearn;

import com.hillel.classwork.lesson5.RElern.HM8;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ChessGame {
    public static void main(String[] args) throws IOException {

        List<ChessItem> chessItems = new ArrayList<>();
        String input;
        while (!(input = HM8.READER.readLine()).equals("stop")) {
            chessItems.add(createChessItem(input));
        }
        drawChessItems(chessItems);

        Drawable chessBoard = new ChessBoard();
    }

    public static ChessItem createChessItem(String checkItemName) {

        switch (checkItemName) {
            case "pawn":
                return new Pawn();
            case "king":
                return new King();
            case "queen":
                return new Queen();
            default:
                throw new IllegalArgumentException("Unknown chess item name " + checkItemName);
        }
    }

    private static void draw(Drawable drawable){
        drawable.draw();
    }

    private static void drawChessItems(List<ChessItem> chessItems) {
        for (ChessItem chessItem : chessItems) {

            if (chessItem instanceof  Drawable){
                Drawable drawableChessItem = (Drawable) chessItem;
            }

            chessItem.draw();
        }
    }
}
