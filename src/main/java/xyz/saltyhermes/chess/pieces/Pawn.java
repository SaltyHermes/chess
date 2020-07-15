package xyz.saltyhermes.chess.pieces;

public class Pawn extends Piece {

    public Pawn(char color, int coord) {
        super(color, coord);
        setWhiteVisual('P');
        setBlackVisual('p');
        setPieceVisual();
    }

    @Override
    public void move() {
        // TODO Auto-generated method stub

    }

    @Override
    public boolean isMoveLegal() {
        // TODO Auto-generated method stub
        return false;
    }
}