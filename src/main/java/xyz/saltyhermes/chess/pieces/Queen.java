package xyz.saltyhermes.chess.pieces;

import xyz.saltyhermes.chess.board.Board;

public class Queen extends Piece {

    private int[] potentialMoves = {-9, -8, -7, -1, 1, 7, 8, 9};

    public Queen(char color, int coord, Board board) {
        super(color, coord, board);
        setWhiteVisual('♕');
        setBlackVisual('♛');
        setPieceVisual();
    }


    @Override
    public boolean isMoveLegal() {
        // TODO Auto-generated method stub
        return false;
    }
}