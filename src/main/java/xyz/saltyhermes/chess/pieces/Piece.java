package xyz.saltyhermes.chess.pieces;

public abstract class Piece {
    private enum Color {
        WHITE,
        BLACK
    }
    public int location;
    public Color color;
    public int[] potentialMoves;
    
    public Piece(char color, int coord) {
        setColor(color);
        this.coord = coord;
        this.potentialMoves = {};
    }

    private void setColor(char color) {
        switch(color) {
            case 'W':
                this.color = WHITE;
                break;
            case 'w':
                this.color = WHITE;
                break;
            case 'B':
                this.color = BLACK;
                break;
            case 'b':
                this.color = BLACK;
                break;
            default:
                throw EOFException; //TODO: Make a custom exception
        }
    }
}