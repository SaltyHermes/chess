package xyz.saltyhermes.chess.pieces;

import java.util.HashSet;

import xyz.saltyhermes.chess.board.Board;

public final class Bishop extends Piece {
    private int[] potentialMoves = {-11, -9, 9, 11};

    public Bishop(char color, int coord, Board board) {
        super(color, coord, board);
        setWhiteVisual('♗');
        setBlackVisual('♝');
        setPieceVisual();
    }


    @Override
    public HashSet<Integer> getLegalCoords() {
        HashSet<Integer> legalCoords = new HashSet<Integer>();
        int simulatedCoord;
        for (int i : potentialMoves) {
            simulatedCoord = coord;
            boolean stop = false;
            while (isMovePseudolegal(simulatedCoord + i) && !stop) {
                simulatedCoord += i;
                legalCoords.add(simulatedCoord);
                if (isPieceHostile(simulatedCoord)) {
                    stop = true;
                }
            }
        }
        return legalCoords;
    }
}