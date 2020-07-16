package xyz.saltyhermes.chess.pieces;

import java.util.HashSet;

import xyz.saltyhermes.chess.board.Board;

public final class Knight extends Piece {

    private int[] potentialMoves = { -17, -15, -10, -8, 8, 10, 15, 17 };

    public Knight(char color, int coord, Board board) {
        super(color, coord, board);
        setPieceValue(3);
        setPieceType('n');
        setWhiteVisual('♘');
        setBlackVisual('♞');
        setPieceVisual();
    }

    @Override
    public boolean isMoveLegal(int destination) {
        if (isMoveOutOfRange(destination)) {
            return false;
        } else {
            if (!isPieceHostile(destination)) {
                return false;
            } else { 
                return true;
            }
        }
    }

    @Override
    public HashSet<Integer> getLegalCoords() {
        HashSet<Integer> legalCoords = new HashSet<Integer>();
        for (int i : potentialMoves) {
            if (isMoveLegal(getCoord() + i)) {
                legalCoords.add(getCoord() + 1);
            }
        }
        return legalCoords;
    }

}