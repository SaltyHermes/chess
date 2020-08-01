package xyz.saltyhermes.chess.board;

import xyz.saltyhermes.chess.pieces.Piece;

import java.util.HashSet;
import java.util.Set;
import java.util.ArrayList;
import java.util.Arrays;

public class BoardUtils {
    private Board board;

    private static Integer restr[] = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10,
                                      11, 12, 13, 14, 15, 16, 17, 18, 19, 
                                      20, 29, 30, 39, 40, 49, 50, 59, 60, 
                                      69, 70, 79, 80, 89, 90, 99, 100, 101, 
                                      102, 103, 104, 105, 106, 107, 108, 109,
                                      110, 111, 112, 113, 114, 115, 116, 117, 118, 119};

    private Set<Integer> restrictedTiles = new HashSet<>(Arrays.asList(restr));

    private static Integer firstRank[] =    {21, 22, 23, 24, 25, 26, 27, 28};
    private static Integer secondRank[] =   {31, 32, 33, 34, 35, 36, 37, 38};
    private static Integer seventhRank[] =  {81, 82, 83, 84, 85, 86, 87 ,88};
    private static Integer eightRank[] =    {91, 92, 93, 94, 95, 96, 97, 98};

    
    private HashSet<Integer> attackedByWhite = new HashSet<Integer>();
    private HashSet<Integer> attackedByBlack = new HashSet<Integer>();
    private ArrayList<Piece> whitePieces = new ArrayList<Piece>();
    private ArrayList<Piece> blackPieces = new ArrayList<Piece>();

    public BoardUtils(Board board) {
        this.board = board;
        update();
    }
    
    public void update() {
        updatePieceLists();
        updateAttackedSpaces();
    }

    private void updatePieceLists() {
        whitePieces.clear();
        blackPieces.clear();
        for (Tile tile : board.getGameBoard()) {
            if (!tile.isEmpty()) {
                switch(tile.getPiece().getColor()) {
                    case 'W':
                        whitePieces.add(tile.getPiece());
                        break;
                    case 'B':
                        blackPieces.add(tile.getPiece());
                        break;

                }
            }
        }
    }

    private void updateAttackedSpaces() {
        attackedByWhite.clear();
        attackedByBlack.clear();
        for (Piece piece : whitePieces) {
            if (piece.getPieceType() == 'p') {
                attackedByWhite.addAll(piece.getAttackedCoords());
            } else {
                attackedByWhite.addAll(piece.getLegalCoords());
            }
        }
        for (Piece piece : blackPieces) {
            if (piece.getPieceType() == 'p') {
                attackedByBlack.addAll(piece.getAttackedCoords());
            } else {
                attackedByBlack.addAll(piece.getLegalCoords());
            }
        }
    }

    public boolean isTileRestricted(int coord) {
        return restrictedTiles.contains(coord);
    }

    public static Integer[] getFirstRank() {
        return firstRank;
    }

    public static Integer[] getSecondRank() {
        return secondRank;
    }

    public static Integer[] getSeventhRank() {
        return seventhRank;
    }

    public static Integer[] getEightRank() {
        return eightRank;
    }

    public HashSet<Integer> getAttackedByWhite() {
        return attackedByWhite;
    }

    public HashSet<Integer> getAttackedByBlack() {
        return attackedByBlack;
    }

}