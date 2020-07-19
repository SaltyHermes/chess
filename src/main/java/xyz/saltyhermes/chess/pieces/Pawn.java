package xyz.saltyhermes.chess.pieces;

import java.util.HashSet;

import xyz.saltyhermes.chess.board.Board;

public class Pawn extends Piece {

    private int[] potentialAttacks = {9, 11};


    private boolean leftOriginalRank = false;

    public Pawn(char color, int coord, Board board) {
        super(color, coord, board);
        setPieceValue(1);
        setPieceType('p');
        setWhiteVisual('♙');
        setBlackVisual('♟');
        setPieceVisual();
    }

    public boolean isInOriginalRank() {

        //TODO: Finish writing this method you dumbfuck
        if (leftOriginalRank == true){
            return false;
        } else {
            return false; //FINISH IT HERE
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
        return legalCoords;
    }
}