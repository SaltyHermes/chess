package xyz.saltyhermes.chess.pieces;

import xyz.saltyhermes.chess.board.Board;

public class PieceFactory {

    public PieceFactory() {

    }

    public Piece createPiece(char color, int coord, char type, Board board) {
        switch (type) {
            case 'P':
                return createPawn(color, coord, board);
            case 'p':
                return createPawn(color, coord, board);
            case 'N':
                return createKnight(color, coord, board);
            case 'n':
                return createKnight(color, coord, board);
            case 'B':
                return createBishop(color, coord, board);
            case 'b':
                return createBishop(color, coord, board);
            case 'R':
                return createRook(color, coord, board);
            case 'r':
                return createRook(color, coord, board);
            case 'Q':
                return createQueen(color, coord, board);
            case 'q':
                return createQueen(color, coord, board);
            case 'K':
                return createKing(color, coord, board);
            case 'k':
                return createKing(color, coord, board);
            default:
                return null;
        }
    }

    
    public Piece createPiece(int coord, char type, Board board) {
        if (Character.isUpperCase(type)) {
            return createPiece('W', coord, type, board);
        } else {
            return createPiece('B', coord, type, board);
        }
    }

    public Pawn createPawn(char color, int coord, Board board) {
        return new Pawn(color, coord, board);
    }

    public Knight createKnight(char color, int coord, Board board) {
        return new Knight(color, coord, board);
    }

    public Bishop createBishop(char color, int coord, Board board) {
        return new Bishop(color, coord, board);
    }

    public Rook createRook(char color, int coord, Board board) {
        return new Rook(color, coord, board);
    }

    public Queen createQueen(char color, int coord, Board board) {
        return new Queen(color, coord, board);
    }

    public King createKing(char color, int coord, Board board) {
        return new King(color, coord, board);
    }


}