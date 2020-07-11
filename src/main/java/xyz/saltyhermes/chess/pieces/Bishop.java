package xyz.saltyhermes.chess.pieces;

public final class Bishop extends Piece {
    private int[] potentialMoves = {-63, -3};

    public Bishop(char color, int coord) {
        super(color, coord);
    }
}