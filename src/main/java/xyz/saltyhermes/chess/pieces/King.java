package xyz.saltyhermes.chess.pieces;

import xyz.saltyhermes.chess.board.Board;

public final class King extends Piece {
    private boolean hasMoved;
    private int[] potentialMoves = {-9, -8, -7, -1, 1, 7, 8, 9};


    public King(char color, int coord, Board board) {
        super(color, coord, board);
        setPieceValue(0);
        setPieceType('k');
        setWhiteVisual('♔');
        setBlackVisual('♚');
        setPieceVisual();
    }

    @Override
    public boolean isMoveLegal() {
        // TODO Auto-generated method stub
        return false;
    }


}