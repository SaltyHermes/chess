package xyz.saltyhermes.chess.pieces;

public class PieceFactory {

    public PieceFactory(){
        
    }

    public Pawn createPawn(char color, int coord) {
        return new Pawn(color, coord);
    }

    public Knight createKnight(char color, int coord) {
        return new Knight(color, coord);
    }
}