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
        printer.printBlackSide();
        System.out.println(board.getPiece(24).getLegalCoords().toString());
    }
}