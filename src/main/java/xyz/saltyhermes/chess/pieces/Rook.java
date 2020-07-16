package xyz.saltyhermes.chess.pieces;

import xyz.saltyhermes.chess.board.Board;

public class Rook extends Piece {
    
    private int[] potentialMoves = {-17, -15, -10, -8, 8, 10, 15, 17};

    public Rook(char color, int coord, Board board) {
        super(color, coord, board);
        setWhiteVisual('♖');
        setBlackVisual('♜');
        setPieceVisual();
    }


    @Override
    public boolean isMoveLegal() {
        // TODO Auto-generated method stub
        return false;
    }
}