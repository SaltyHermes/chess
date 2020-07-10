package xyz.saltyhermes.chess.pieces;

public final class Knight extends Piece {

    private int[] potentialMoves = {-17, -15, -10, -8, 8, 10, 15, 17};

    public Knight(char color, int coord) {
        super(color, coord);
    }

    public int[] getPotentialMoves() {
        return potentialMoves;
    }
}