package xyz.saltyhermes.chess.board;

import xyz.saltyhermes.chess.pieces.Piece;

import java.util.HashSet;
import java.util.ArrayList;

public class BoardUtils {
    private Board board;
    private HashSet<Integer> attackedByWhite;
    private HashSet<Integer> attackedByBlack;
    private ArrayList<Piece> whitePieces;
    private ArrayList<Piece> blackPieces;

    public BoardUtils(Board board) {
        this.board = board;
    }

}