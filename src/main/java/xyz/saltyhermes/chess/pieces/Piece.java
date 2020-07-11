package xyz.saltyhermes.chess.pieces;

public abstract class Piece {

    protected int coord;
    protected final char color;
    protected char pieceVisual;
    protected char pieceType;
    protected int pieceValue;


    protected Piece(char color, int coord) {
        color = setColor(color);
        this.color = color;
        this.coord = coord;
    }

    private char setColor(char color) {
        color = Character.toUpperCase(color);
        switch(color) {
            case 'W':
                return color;
            case 'B':
                return color;
            default:
                throw new RuntimeException("Color can only be set to 'w' or 'B'");
        }
    }

    public char getColor() {
        return color;
    }

    public char getPieceVisual() {
        return pieceVisual;
    }

    public char getPieceType() {
        return pieceType;
    }

    public int getPieceValue() {
        return pieceValue;
    }

    public int getCoord() {
        return coord;
    }

    public void setCoord(int coord) {
        this.coord = coord;
    }

    public void setPieceVisual(char pieceVisual) {
        this.pieceVisual = pieceVisual;
    }

    public void setPieceType(char pieceType) {
        this.pieceType = pieceType;
    }

    public void setPieceValue(int pieceValue) {
        this.pieceValue = pieceValue;
    }
}