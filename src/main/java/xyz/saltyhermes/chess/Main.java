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
        System.out.println(board.getPiece(31).getLegalCoords().toString());
        move.doMove(31, 41);
        printer.printBlackSide();
        System.out.println(board.getPiece(41).getLegalCoords().toString());
        move.doMove(82, 62);
        move.doMove(62, 52);
        System.out.println(board.getPiece(52).getLegalCoords().toString());
        printer.printBlackSide();
        move.doMove(52, 41);
        printer.printBlackSide();
        System.out.println(board.getPiece(41).getLegalCoords().toString());
        System.out.println(board.getPiece(21).getLegalCoords().toString());
        move.doMove(21, 41);
        printer.printBlackSide();
        System.out.println(board.getPiece(41).getLegalCoords().toString());
        move.doMove(41, 81);
        printer.printBlackSide();

    }
}