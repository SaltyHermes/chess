package xyz.saltyhermes.chess.pieces;
import xyz.saltyhermes.chess.board.Board;


public abstract class Piece {

    protected int coord;
    protected final char color;
    protected char pieceVisual;
    protected char whiteVisual;
    protected char blackVisual;
    protected char pieceType;
    protected int pieceValue;
    protected int[] potentialMoves;
    protected Board board;


    protected Piece(char color, int coord, Board board) {
        color = colorize(color);
        this.color = color;
        this.coord = coord;
        this.board = board;
    }

    public abstract boolean isMoveLegal();

    private char colorize(char color) {
        color = Character.toUpperCase(color);
        switch(color) {
            case 'W':
                return color;
            case 'B':
                return color;
            default:
                throw new RuntimeException("Color can only be set to 'W' or 'B'");
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

    public int[] getPotentialMoves() {
        return potentialMoves;
    }

    public void setCoord(int coord) {
        this.coord = coord;
    }

    protected void setPieceVisual() {
        switch(this.color) {
            case 'W':
                this.pieceVisual = whiteVisual;
                break;
            case 'B':
                this.pieceVisual = blackVisual;
                break;
        }
    }

    protected void setWhiteVisual(char whiteVisual) {
        this.whiteVisual = whiteVisual;
    }

    protected void setBlackVisual(char blackVisual) {
        this.blackVisual = blackVisual;
    }

    public void setPieceType(char pieceType) {
        this.pieceType = pieceType;
    }

    public void setPieceValue(int pieceValue) {
        this.pieceValue = pieceValue;
    }

    public void setPotentialMoves(int[] potentialMoves) {
        this.potentialMoves = potentialMoves;
    }
}