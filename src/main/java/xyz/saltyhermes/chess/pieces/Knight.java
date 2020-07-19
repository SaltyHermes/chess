package xyz.saltyhermes.chess.pieces;

import java.util.HashSet;

import xyz.saltyhermes.chess.board.Board;

public final class Knight extends Piece {

    private int[] potentialMoves = { -21, -19, -12, -8, 8, 12, 19, 21 }; //TODO: verify if it's ok

    public Knight(char color, int coord, Board board) {
        super(color, coord, board);
        setPieceValue(3);
        setPieceType('n');
        setWhiteVisual('♘');
        setBlackVisual('♞');
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