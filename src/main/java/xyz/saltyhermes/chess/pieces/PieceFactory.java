package xyz.saltyhermes.chess.pieces;

public static class PieceFactory {

    public PieceFactory() {

    }

    public Piece createPiece(char color, int coord, char type) {
        switch (type) {
            case 'P':
                return createPawn(color, coord);
            case 'p':
                return createPawn(color, coord);
            case 'N':
                return createKnight(color, coord);
            case 'n':
                return createKnight(color, coord);
            case 'B':
                return createBishop(color, coord);
            case 'b':
                return createBishop(color, coord);
            case 'R':
                return createRook(color, coord);
            case 'r':
                return createRook(color, coord);
            case 'Q':
                return createQueen(color, coord);
            case 'q':
                return createQueen(color, coord);
            case 'K':
                return createKing(color, coord);
            case 'k':
                return createKing(color, coord);
            default:
                return null;
        }
    }

    public Pawn createPawn(char color, int coord) {
        return new Pawn(color, coord);
    }

    public Knight createKnight(char color, int coord) {
        return new Knight(color, coord);
    }

    public Bishop createBishop(char color, int coord) {
        return new Bishop(color, coord);
    }

    public Rook createRook(char color, int coord) {
        return new Rook(color, coord);
    }

    public Queen createQueen(char color, int coord) {
        return new Queen(color, coord);
    }

    public King createKing(char color, int coord) {
        return new King(color, coord);
    }


}