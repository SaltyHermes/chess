package xyz.saltyhermes.chess.game;

import xyz.saltyhermes.chess.board.Board;

public class Game {
    private ConditionWatcher watcher;
    private Board board;

    public Game() {
        watcher = new ConditionWatcher();
        board = new Board();
    }

    public void start() {
        
    }

}