package xyz.saltyhermes.chess.board;

import java.util.List;

public class BoardPrinter {
    private List<Tile> board;

    BoardPrinter(List<Tile> board) {
        this.board = board;
    }

    public void printBoard() {
        int count = 1;
        for (Tile tile : board) {
            if (tile.isEmpty()) {
                System.out.print(" ");
            } else {
                
            }
        }
    }
}