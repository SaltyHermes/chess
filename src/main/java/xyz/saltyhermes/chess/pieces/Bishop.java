package xyz.saltyhermes.chess.pieces;

import java.util.HashSet;

import xyz.saltyhermes.chess.board.Board;

public final class Bishop extends Piece {
    private int[] potentialMoves = { -9, -7, 7, 9 };

    public Bishop(char color, int coord, Board board) {
        super(color, coord, board);
        setWhiteVisual('♗');
        setBlackVisual('♝');
        setPieceVisual();
    }

    public boolean isMoveLegal(int destination) {
        // TODO: finish this plz

        if (isMoveOutOfRange(destination)) {
            return false;
        } else {
            return false;
        }

    }

    @Override
    public HashSet<Integer> getLegalCoords() {
        // TODO Auto-generated method stub
        return null;
    }
}