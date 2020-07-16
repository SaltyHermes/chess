package xyz.saltyhermes.chess.pieces;

import xyz.saltyhermes.chess.board.Board;

public final class Bishop extends Piece {
    private int[] potentialMoves = {-9};

    public Bishop(char color, int coord, Board board) {
        super(color, coord, board);
        setWhiteVisual('♗');
        setBlackVisual('♝');
        setPieceVisual();
    }

    @Override
    public boolean isMoveLegal() {
        // TODO Auto-generated method stub
        return false;
    }
}