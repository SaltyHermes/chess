package xyz.saltyhermes.chess.pieces;

public abstract class Piece {

    private static char pieceType;
    private int coord;
    private char color;
    public char pieceVisual;
    
    public Piece(char color, int coord) {
        setColor(color);
        this.coord = coord;
    }

    private void setColor(char color) {
        switch(color) {
            case 'W':
                this.color = 'w';
                break;
            case 'w':
                this.color = 'w';
                break;
            case 'B':
                this.color = 'b';
                break;
            case 'b':
                this.color = 'b';
                break;
            default:
                System.out.println("Berhwegfhs"); //TODO: Make a custom exception
        }
    }

    public char getColor() {
        return color;
    }

    public char getPieceVisual() {
        return pieceVisual;
    }
}