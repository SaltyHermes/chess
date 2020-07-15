package xyz.saltyhermes.chess;

import xyz.saltyhermes.chess.board.Board;
import xyz.saltyhermes.chess.board.BoardPrinter;
import xyz.saltyhermes.chess.pieces.Piece;
import xyz.saltyhermes.chess.pieces.PieceFactory;



public class Main {

    public static void main(String[] args) {
        Board board = new Board();
        BoardPrinter printer = new BoardPrinter(board);
        printer.printBlackSide();
        printer.printWhiteSide();
    }
}