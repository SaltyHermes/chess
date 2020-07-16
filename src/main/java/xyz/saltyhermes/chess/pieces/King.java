package xyz.saltyhermes.chess.pieces;

import java.util.HashSet;

import xyz.saltyhermes.chess.board.Board;

public final class King extends Piece {
    private boolean hasMoved;
    private int[] potentialMoves = { -9, -8, -7, -1, 1, 7, 8, 9 };

    public King(char color, int coord, Board board) {
        super(color, coord, board);
        setPieceValue(0);
        setPieceType('k');
        setWhiteVisual('♔');
        setBlackVisual('♚');
        setPieceVisual();
    }

    @Override
    public boolean isMoveLegal(int destination) {
        if (isPieceFriendly(destination)) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public HashSet<Integer> getLegalCoords() {
        // TODO Auto-generated method stub
        return null;
    }


}