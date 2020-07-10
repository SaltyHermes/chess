package xyz.saltyhermes.chess.pieces;

public final class Knight extends Piece {

    // Here you can define how is a knight piece going to be printed on the terminal
    private static char whiteVisual = '\u265E';
    private static char blackVisual = '\u2658';

    private int[] potentialMoves = {-17, -15, -10, -8, 8, 10, 15, 17};

    public Knight(char color, int coord) {
        super(color, coord);
        if (getColor() == 'w') {
            this.pieceVisual = whiteVisual;
        } else {
            this.pieceVisual = blackVisual;
        }
    }

    public int[] getPotentialMoves() {
        return potentialMoves;
    }
}