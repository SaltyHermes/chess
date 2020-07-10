package xyz.saltyhermes.chess.pieces;

public class Queen extends Piece {
    
    private static char pieceType = 'q';

    private int[] potentialMoves = {-17, -15, -10, -8, 8, 10, 15, 17};

    public Queen(char color, int coord) {
        super(color, coord);
    }
}