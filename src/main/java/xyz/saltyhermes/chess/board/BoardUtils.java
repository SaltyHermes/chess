package xyz.saltyhermes.chess.board;

import xyz.saltyhermes.chess.pieces.Piece;

import java.util.HashSet;
import java.util.Set;
import java.util.ArrayList;
import java.util.Arrays;

public class BoardUtils {
    private Board board;
    private Integer restr[] = {}; //TODO: fill in the restricted tiles pls
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