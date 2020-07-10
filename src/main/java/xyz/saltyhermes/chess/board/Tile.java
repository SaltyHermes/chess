package xyz.saltyhermes.chess.board;

public class Tile {
    private int coordinate;
    private Piece piece;

    public Tile(int coordinate) {
        this.coordinate = coordinate;
    }

    public void spawnPiece(Piece piece) {
        this.piece = piece;
    }

    public boolean isEmpty(){
        return !piece;
    }

    public void removePiece() {
        this.piece = null;
    }

}