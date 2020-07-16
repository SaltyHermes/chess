package xyz.saltyhermes.chess.pieces;

import xyz.saltyhermes.chess.board.Board;

public class Pawn extends Piece {

    public Pawn(char color, int coord, Board board) {
        super(color, coord, board);
        setWhiteVisual('♙');
        setBlackVisual('♟');
        setPieceVisual();
    }


    @Override
    public boolean isMoveLegal() {
        // TODO Auto-generated method stub
        return false;
    }
}