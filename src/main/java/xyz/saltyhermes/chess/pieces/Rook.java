package xyz.saltyhermes.chess.pieces;

public class Rook extends Piece {
    
    private static char pieceType = 'r';
    private int[] potentialMoves = {-17, -15, -10, -8, 8, 10, 15, 17};

    public Rook(char color, int coord) {
        super(color, coord);
    }
}