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
    public HashSet<Integer> getLegalCoords() {
        HashSet<Integer> legalCoords = new HashSet<Integer>();
        for (int i : potentialMoves) {
            if (isMovePseudolegal(getCoord() + i)) {
                legalCoords.add(getCoord() + i);
            }
        }
        return legalCoords;
    }

    


}