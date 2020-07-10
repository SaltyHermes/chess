package xyz.saltyhermes.chess.game;

import xyz.saltyhermes.chess.board.*;

public class ConditionWatcher {

    private boolean isCheck;
    private boolean isMate;
    private boolean isStale;
    private boolean enPassant;
    private int enPassantCoord;
    private boolean hasWhiteKingMoved;
    private boolean hasBlackKingMoved;


    ConditionWatcher() {

    }

    public void doWatch(Board board) {

    }
}