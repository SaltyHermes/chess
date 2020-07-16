package xyz.saltyhermes.chess.pieces;
import xyz.saltyhermes.chess.board.Board;

public final class Knight extends Piece {
    
    private int[] potentialMoves = {-17, -15, -10, -8, 8, 10, 15, 17};

    public Knight(char color, int coord, Board board) {
        super(color, coord, board);
        setPieceValue(3);
        setPieceType('n');
        setWhiteVisual('♘');
        setBlackVisual('♞');
        setPieceVisual();
        setPotentialMoves(potentialMoves);
    }


    @Override
    public boolean isMoveLegal() {
        // TODO Auto-generated method stub
        return false;
    }

}