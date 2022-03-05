package com.hillel.classwork.lesson14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class ChessGame {

    static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {


        List<ChessItem> chessItems = new ArrayList<>();

        System.out.println("input check item name:");

        String input;
        //пока инпут не равно стоп. Будет пытатся создать айтем
        while (!(input = READER.readLine()).equals("stop")) {
            chessItems.add(createChessItem(input));
        }
        drawChessItems(chessItems);

        Drawable chessBoard = new ChessBoard();
        draw(chessBoard);

    }

    public static ChessItem createChessItem(String chessItemName) {
        switch (chessItemName){
            case "pawn":
                return new Pawn();
            case "king":
                return new King();
            case "queen":
                return new Queen();
                //throw new IllegalArgumentException("Unknown chess item" +  chessItemName); выведет на экран ошибку Unknown chess item
            default:
                throw new IllegalArgumentException("Unknown chess item" +  chessItemName);

        }
    }

    private static void draw(Drawable drawable){
        drawable.draw();
    }

    private static void drawChessItems(List<ChessItem> chessItems) {
        for (ChessItem chessItem : chessItems){

          /*  if(chessItem instanceof Drawable){
                Drawable drawableChessItem = (Drawable) chessItem;
            }*/
            draw(chessItem);
        }
    }
}
