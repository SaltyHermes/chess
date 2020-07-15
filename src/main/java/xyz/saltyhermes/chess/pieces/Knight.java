package xyz.saltyhermes.chess.pieces;

public final class Knight extends Piece {
    
    private int[] potentialMoves = {-17, -15, -10, -8, 8, 10, 15, 17};

    public Knight(char color, int coord) {
        super(color, coord);
        setPieceValue(3);
        setPieceType('n');
        setWhiteVisual('N');
        setBlackVisual('n');
        setPieceVisual();
        setPotentialMoves(potentialMoves);
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