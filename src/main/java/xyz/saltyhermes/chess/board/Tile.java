package xyz.saltyhermes.chess.board;
import xyz.saltyhermes.chess.pieces.*;

public class Tile {
    private int coordinate;
    private Piece piece;

    public Tile(int coordinate) {
        this.coordinate = coordinate;
    }

    public void putPiece(Piece piece) {
        this.piece = piece;
    }

    public void updatePieceCoord() {
        piece.setCoord(coordinate);
    }

    public boolean isEmpty(){
        return piece == null;
    }

    public void removePiece() {
        this.piece = null;
    }

    public Piece getPiece() {
        return piece;
    }

}