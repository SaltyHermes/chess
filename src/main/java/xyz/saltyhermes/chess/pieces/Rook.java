package xyz.saltyhermes.chess.pieces;

import java.util.HashSet;

import xyz.saltyhermes.chess.board.Board;

public class Rook extends Piece {

    private int[] potentialMoves = {-10, -1, 1, 10};

    public Rook(char color, int coord, Board board) {
        super(color, coord, board);
        setPieceValue(5);
        setWhiteVisual('♖');
        setBlackVisual('♜');
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