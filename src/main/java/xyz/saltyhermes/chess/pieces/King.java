package xyz.saltyhermes.chess.pieces;

public final class King extends Piece {
    private boolean hasMoved;
    private int[] potentialMoves = {-9, -8, -7, -1, 1, 7, 8, 9};


    public King(char color, int coord) {
        super(color, coord);
        
    }


}