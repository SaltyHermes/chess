package xyz.saltyhermes.chess.pieces;

import java.util.HashSet;

import xyz.saltyhermes.chess.board.Board;

public class Queen extends Piece {

    private int[] potentialMoves = { -9, -8, -7, -1, 1, 7, 8, 9 };

    public Queen(char color, int coord, Board board) {
        super(color, coord, board);
        setPieceValue(8);
        setWhiteVisual('♕');
        setBlackVisual('♛');
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