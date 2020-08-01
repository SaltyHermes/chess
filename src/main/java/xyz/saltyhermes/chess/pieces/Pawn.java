package xyz.saltyhermes.chess.pieces;

import java.util.HashSet;

import xyz.saltyhermes.chess.board.Board;

public class Pawn extends Piece {

    private int[] potentialAttacks = {9, 11};


    public Pawn(char color, int coord, Board board) {
        super(color, coord, board);
        setPieceValue(1);
        setPieceType('p');
        setWhiteVisual('♙');
        setBlackVisual('♟');
        setPieceVisual();
    }

    public boolean isInOriginalRank() {

            switch(this.color) {
                case 'W':
                    return isCoordInRank(coord, utils.getSecondRank());
                case 'B':
                    return isCoordInRank(coord, utils.getSeventhRank());
                default:
                    return false;
            }
        }



    @Override
    public HashSet<Integer> getLegalCoords() {
        HashSet<Integer> legalCoords = new HashSet<Integer>();
        for(int i : potentialAttacks) {
            if (isPieceHostile(coord + i)) {
                legalCoords.add(coord + i);
            }
        }
        if (board.getTile(coord + 10).isEmpty()) {
            legalCoords.add(coord + 10);
        }
        if (board.getTile(coord + 20).isEmpty() && isInOriginalRank()) {
            legalCoords.add(coord + 20);
        }
        return legalCoords;
    }

    private boolean isCoordInRank(int coord, Integer[] rank) {
        for (int rankCoord : rank) {
            if (rankCoord == coord) return true;
        }
        return false;
    }
}