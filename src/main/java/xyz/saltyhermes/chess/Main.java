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
    
        move.doMove(3, 59);
        printer.printWhiteSide();
        move.doMove(59, 58);
        printer.printWhiteSide();
        move.doMove(58, 23);
        printer.printWhiteSide();
        move.doMove(7, 15);
        printer.printWhiteSide();

    }
}