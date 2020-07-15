package xyz.saltyhermes.chess.pieces;

public final class King extends Piece {
    private boolean hasMoved;
    private int[] potentialMoves = {-9, -8, -7, -1, 1, 7, 8, 9};


    public King(char color, int coord) {
        super(color, coord);
        setPieceValue(0);
        setPieceType('k');
        setWhiteVisual('K');
        setBlackVisual('k');
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