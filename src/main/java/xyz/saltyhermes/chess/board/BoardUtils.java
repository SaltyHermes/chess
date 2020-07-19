package xyz.saltyhermes.chess.board;

import xyz.saltyhermes.chess.pieces.Piece;

import java.util.HashSet;
import java.util.Set;
import java.util.ArrayList;
import java.util.Arrays;

public class BoardUtils {
    private Board board;
    private Integer restr[] = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10,
                            11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 
                            21, 30, 31, 40, 41, 50, 51, 60, 61, 70, 
                            71, 80, 81, 90, 91, 100, 101, 102, 103,
                            104, 105, 106, 107, 108, 109, 110, 111,
                            112, 113, 114, 115, 116, 117, 118, 119};
                            
    private Set<Integer> restrictedTiles = new HashSet<>(Arrays.asList(restr));
    private HashSet<Integer> allowedTiles;
    private HashSet<Integer> attackedByWhite;
    private HashSet<Integer> attackedByBlack;
    private ArrayList<Piece> whitePieces;
    private ArrayList<Piece> blackPieces;

    public BoardUtils(Board board) {
        this.board = board;

    }

    public boolean isTileRestricted(int coord) {
        return restrictedTiles.contains(coord);
    }


}