package xyz.saltyhermes.chess;

import xyz.saltyhermes.chess.pieces.Piece;
import xyz.saltyhermes.chess.pieces.PieceFactory;



public class Main {

    public static void main(String[] args) {
        PieceFactory factory = new PieceFactory();
        Piece a = factory.createPiece('W', 69, 'n');

        System.out.println(a.getPieceVisual());
    }
}