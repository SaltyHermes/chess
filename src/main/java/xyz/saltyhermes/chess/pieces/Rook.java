package xyz.saltyhermes.chess.pieces;

import java.util.HashSet;

import xyz.saltyhermes.chess.board.Board;

public class Rook extends Piece {

    private int[] potentialMoves = { -8, -1, 1, 8 };

    public Rook(char color, int coord, Board board) {
        super(color, coord, board);
        setWhiteVisual('♖');
        setBlackVisual('♜');
        setPieceVisual();
    }


    @Override
    public HashSet<Integer> getLegalCoords() {
        // TODO Auto-generated method stub
        return null;
    }
}