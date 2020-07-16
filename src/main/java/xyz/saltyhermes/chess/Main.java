package xyz.saltyhermes.chess;

import xyz.saltyhermes.chess.board.Board;
import xyz.saltyhermes.chess.board.BoardPrinter;




public class Main {

    public static void main(String[] args) {
        Board board = new Board();
        BoardPrinter printer = new BoardPrinter(board);
        printer.printBlackSide();
        System.out.println();
        printer.printWhiteSide();
    }
}