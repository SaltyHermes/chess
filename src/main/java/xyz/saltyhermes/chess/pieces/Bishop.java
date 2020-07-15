package xyz.saltyhermes.chess.pieces;

public final class Bishop extends Piece {
    private int[] potentialMoves = {-63, -3};

    public Bishop(char color, int coord) {
        super(color, coord);
        setWhiteVisual('B');
        setBlackVisual('b');
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