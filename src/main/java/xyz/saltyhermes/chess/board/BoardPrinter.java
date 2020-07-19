package xyz.saltyhermes.chess.board;

import java.util.List;

public class BoardPrinter {

    private Board board;
    private BoardUtils utils;

    public BoardPrinter(Board board) {
        this.board = board;
        this.utils = board.getUtils();
    }

    public void printBlackSide() {
        int count = 0;
        for (Tile tile : board.getGameBoard()) {
            if (!utils.isTileRestricted(tile.getCoordinate())) {
                if (count == 8) {
                    System.out.println();
                    count = 0;
                }
                if (tile.isEmpty()) {
                    System.out.print(". ");
                } else {
                    System.out.print(tile.getPiece().getPieceVisual() + " ");
                }
                count++;
            }
        }
        System.out.println();
    }

    public void printWhiteSide() {
        //TODO: rewrite it accordingly to 10x12 board
        for (int i = 56; i > -1; i -= 8) {
            for (int j = 0; j < 8; j++) {
                if (board.getTile(i+j).isEmpty()) {
                    System.out.print(". ");
                } else {
                    System.out.print(board.getPiece(j+i).getPieceVisual() + " ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
}