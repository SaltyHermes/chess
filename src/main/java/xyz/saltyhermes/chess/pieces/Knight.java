package xyz.saltyhermes.chess.pieces;

public final class Knight extends Piece {

    // Here you can define how is a knight piece going to be printed on the terminal
    

    private int[] potentialMoves = {-17, -15, -10, -8, 8, 10, 15, 17};

    public Knight(char color, int coord) {
        super(color, coord);
        setPieceValue(3);
        setPieceType('n');
        setPieceVisual(pieceVisual);
    }

    public int[] getPotentialMoves() {
        return potentialMoves;
    }
}