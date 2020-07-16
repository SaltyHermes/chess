package xyz.saltyhermes.chess.pieces;

import java.util.HashSet;

import xyz.saltyhermes.chess.board.Board;

public class Pawn extends Piece {

    public Pawn(char color, int coord, Board board) {
        super(color, coord, board);
        setWhiteVisual('♙');
        setBlackVisual('♟');
        setPieceVisual();
    }

    @Override
    public boolean isMoveLegal(int destination) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public HashSet<Integer> getLegalCoords() {
        // TODO Auto-generated method stub
        return null;
    }
}