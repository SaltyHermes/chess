package xyz.saltyhermes.chess;

import xyz.saltyhermes.chess.board.Board;
import xyz.saltyhermes.chess.board.BoardPrinter;
import xyz.saltyhermes.chess.board.BoardUtils;
import xyz.saltyhermes.chess.game.Mover;




public class Main {

    public static void main(String[] args) {
        Board board = new Board();
        BoardPrinter printer = new BoardPrinter(board);
        BoardUtils utils = new BoardUtils(board);
        Mover move = new Mover(board, 'w');
        move.doMove(1, 18);
        printer.printWhiteSide();
        move.doMove(2, 16);
        printer.printWhiteSide();

    }
}