package xyz.saltyhermes.chess.pieces;

import java.util.HashSet;

import xyz.saltyhermes.chess.board.Board;

public class Pawn extends Piece {

    private int[] potentialWhiteAttacks = {9, 11};
    private int[] potentialBlackAttacks = {-9, -11};
    private int[] potentialAttacks;
    private int smallPush = 10;
    private int bigPush = 20;


    public Pawn(char color, int coord, Board board) {
        super(color, coord, board);
        setPieceValue(1);
        setPieceType('p');
        setWhiteVisual('♙');
        setBlackVisual('♟');
        setPieceVisual();
        setMovesDirection();
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
        if (board.getTile(coord + smallPush).isEmpty() && !utils.isTileRestricted(coord + smallPush)) {
            legalCoords.add(coord + smallPush);
        }
        if (board.getTile(coord + bigPush).isEmpty() && isInOriginalRank() && !utils.isTileRestricted(coord + smallPush)) {
            legalCoords.add(coord + bigPush);
        }
        return legalCoords;
                
    }


    @Override
    public HashSet<Integer> getAttackedCoords() {
        HashSet<Integer> attackedCoords = new HashSet<Integer>();
        for(int i : potentialAttacks) {
            if (!utils.isTileRestricted(coord + i)) {
                attackedCoords.add(coord + i);
            }
        }
        return attackedCoords;
    }

    private boolean isCoordInRank(int coord, Integer[] rank) {
        for (int rankCoord : rank) {
            if (rankCoord == coord) return true;
        }
        return false;
    }

    private void setMovesDirection() {
        // Sets direction of potential moves according to its' color.
        switch(color) {
            case 'W':
                potentialAttacks = potentialWhiteAttacks;
                break;
            case 'B':
                potentialAttacks = potentialBlackAttacks;
                smallPush *= -1;
                bigPush *= -1;
                break;
            default:
                potentialAttacks = potentialWhiteAttacks;
                break;
        }
    }
}